package CollectionFramework;
import java.util.*;

public class HashSetAllMethods {
    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<>();
        System.out.println("Initial : " + hs);

        // add
        hs.add("A");
        hs.add("B");
        hs.add("C");
        hs.add(null);
        System.out.println("After add : " + hs);

        // duplicate
        hs.add("A");
        System.out.println("After duplicate A : " + hs);

        // addAll
        HashSet<String> hs2 = new HashSet<>();
        hs2.add("D");
        hs2.add("E");
        hs.addAll(hs2);
        System.out.println("After addAll : " + hs);

        // contains
        System.out.println("contains A : " + hs.contains("A"));
        System.out.println("contains Z : " + hs.contains("Z"));

        // size
        System.out.println("size : " + hs.size());

        // isEmpty
        System.out.println("isEmpty : " + hs.isEmpty());

        // remove
        hs.remove("B");
        System.out.println("After remove B : " + hs);

        // removeIf
        hs.removeIf(s -> s != null && s.startsWith("C"));
        System.out.println("After removeIf(C*) : " + hs);

        // retainAll
        hs.retainAll(hs2);
        System.out.println("After retainAll hs2 : " + hs);

        // equals
        System.out.println("equals hs2 : " + hs.equals(hs2));

        // hashCode
        System.out.println("hashCode : " + hs.hashCode());

        // iterator
        System.out.print("Iterator : ");
        Iterator<String> it = hs.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // spliterator
        Spliterator<String> sp = hs.spliterator();
        System.out.print("Spliterator : ");
        sp.forEachRemaining(e -> System.out.print(e + " "));
        System.out.println();

        // toArray
        Object[] arr = hs.toArray();
        System.out.println("toArray : " + Arrays.toString(arr));

        // clear
        hs.clear();
        System.out.println("After clear : " + hs);
    }
}
