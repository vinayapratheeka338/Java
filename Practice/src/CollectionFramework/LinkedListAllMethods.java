package CollectionFramework;
import java.util.*;

public class LinkedListAllMethods {
    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();
        LinkedList<String> list2 = new LinkedList<>();

        // add()
        list2.add("Surya");
        list2.add("Lakshmi");
        System.out.println("list2 after add: " + list2);

        names.add("Renu");
        names.add("Sai");
        names.add("Renu");
        System.out.println("names after add: " + names);

        // add(index, element)
        names.add(0, "Vinaya");
        System.out.println("after add(index): " + names);

        // addAll(index, collection)
        names.addAll(1, list2);
        System.out.println("after addAll(index, list2): " + names);

        // addAll(collection)
        names.addAll(names);
        System.out.println("after addAll(names): " + names);

        // addFirst()
        names.addFirst("Pratheeka");
        System.out.println("after addFirst: " + names);

        // addLast()
        names.addLast("Gita");
        System.out.println("after addLast: " + names);

        // contains()
        System.out.println("contains Sai? " + names.contains("Sai"));

        // containsAll()
        System.out.println("containsAll list2? " + names.containsAll(list2));

        // equals()
        System.out.println("equals Hari? " + names.equals("Hari"));

        // get(index)
        System.out.println("get(3): " + names.get(3));

        // getFirst()
        System.out.println("getFirst(): " + names.getFirst());

        // getLast()
        System.out.println("getLast(): " + names.getLast());

        // hashCode()
        System.out.println("hashCode(): " + names.hashCode());

        // indexOf()
        System.out.println("indexOf Gita: " + names.indexOf("Gita"));

        // isEmpty()
        System.out.println("isEmpty(): " + names.isEmpty());

        // iterator()
        System.out.print("iterator(): ");
        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // lastIndexOf()
        System.out.println("lastIndexOf Sai: " + names.lastIndexOf("Sai"));

        // listIterator()
        System.out.print("listIterator(): ");
        ListIterator<String> li = names.listIterator();
        while (li.hasNext()) {
            System.out.print(li.next() + " ");
        }
        System.out.println();

        // listIterator(index)
        System.out.print("listIterator(3): ");
        ListIterator<String> li2 = names.listIterator(3);
        while (li2.hasNext()) {
            System.out.print(li2.next() + " ");
        }
        System.out.println();

        // remove(index)
        names.remove(5);
        System.out.println("after remove(5): " + names);

        // remove(object)
        names.remove("Renu"); // no effect
        System.out.println("after remove(\"Renu\"): " + names);

        // removeAll()
        names.removeAll(list2);
        System.out.println("after removeAll(list2): " + names);

        // removeFirst()
        names.removeFirst();
        System.out.println("after removeFirst: " + names);

        // removeLast()
        names.removeLast();
        System.out.println("after removeLast: " + names);

        // retainAll()
        names.retainAll(list2);
        System.out.println("after retainAll(list2): " + names);

        // set()
        if (!names.isEmpty()) {
            names.set(0, "Vasu");
        }
        System.out.println("after set: " + names);

        // size()
        System.out.println("size(): " + names.size());

        // sort()
        names.sort(null);
        System.out.println("after sort(): " + names);

        // spliterator()
        System.out.print("spliterator(): ");
        Spliterator<String> sp = names.spliterator();
        sp.forEachRemaining(s -> System.out.print(s + " "));
        System.out.println();

        // stream()
        System.out.print("stream(): ");
        names.stream().forEach(s -> System.out.print(s + " "));
        System.out.println();

        // subList()
        System.out.println("subList(0, size): " + names.subList(0, names.size()));

        // toArray()
        Object[] arr = names.toArray();
        System.out.println("toArray(): " + Arrays.toString(arr));

        // toString()
        System.out.println("toString(): " + names.toString());

        // clear()
        names.clear();
        System.out.println("after clear(): " + names);
    }
}