package CollectionFramework;
import java.util.*;

public class ArrayListAllMethods {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        // add
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println(list);
        list.add(1, "X");
        System.out.println(list);

        // addAll
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("D");
        list2.add("E");
        System.out.println(list2);
        list.addAll(list2);
        System.out.println(list);
        list.addAll(2, list2);
        System.out.println(list);

        // get
        System.out.println(list.get(0));

        // set
        list.set(0, "Z");
        System.out.println(list);

        // contains
        System.out.println(list.contains("B"));

        // indexOf & lastIndexOf
        list.add("B");
        System.out.println(list);
        System.out.println(list.indexOf("B"));
        System.out.println(list.lastIndexOf("B"));

        // remove
        list.remove("C");
        System.out.println(list);
        list.remove(0);
        System.out.println(list);

        // size & isEmpty
        System.out.println(list.size());
        System.out.println(list.isEmpty());

        // iterator
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // listIterator
        ListIterator<String> lit = list.listIterator();
        while (lit.hasNext()) {
            System.out.println(lit.next());
        }

        // subList
        System.out.println(list.subList(0, 2));

        // toArray
        Object[] arr = list.toArray();
        System.out.println(list);

        // replaceAll
        list.replaceAll(s -> s.toLowerCase());
        System.out.println(list);

        // sort
        Collections.sort(list);
        System.out.println(list);

        // clone
        ArrayList<String> copy = (ArrayList<String>) list.clone();
        System.out.println(copy);

        // equals & hashCode
        System.out.println(list.equals(copy));
        System.out.println(list.hashCode());

        // clear
        list.clear();
        System.out.println(list);
    }
}