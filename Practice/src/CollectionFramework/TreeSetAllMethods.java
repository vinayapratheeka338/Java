package CollectionFramework;
import java.util.*;

public class TreeSetAllMethods {
    public static void main(String[] args) {

        TreeSet<Integer> ts = new TreeSet<>();
        System.out.println("Initial : " + ts);

        // add
        ts.add(30);
        ts.add(10);
        ts.add(20);
        ts.add(40);
        System.out.println("After add : " + ts);

        // duplicate
        ts.add(20);
        System.out.println("After duplicate 20 : " + ts);

        // first & last
        System.out.println("first : " + ts.first());
        System.out.println("last : " + ts.last());

        // headSet
        System.out.println("headSet(30) : " + ts.headSet(30));

        // tailSet
        System.out.println("tailSet(20) : " + ts.tailSet(20));

        // subSet
        System.out.println("subSet(10,40) : " + ts.subSet(10, 40));

        // lower
        System.out.println("lower(20) : " + ts.lower(20));

        // floor
        System.out.println("floor(20) : " + ts.floor(20));

        // ceiling
        System.out.println("ceiling(25) : " + ts.ceiling(25));

        // higher
        System.out.println("higher(20) : " + ts.higher(20));

        // pollFirst
        System.out.println("pollFirst : " + ts.pollFirst());
        System.out.println("After pollFirst : " + ts);

        // pollLast
        System.out.println("pollLast : " + ts.pollLast());
        System.out.println("After pollLast : " + ts);

        // contains
        System.out.println("contains 30 : " + ts.contains(30));

        // descendingSet
        System.out.println("descendingSet : " + ts.descendingSet());

        // descendingIterator
        System.out.print("descendingIterator : ");
        Iterator<Integer> dit = ts.descendingIterator();
        while (dit.hasNext()) {
            System.out.print(dit.next() + " ");
        }
        System.out.println();

        // iterator
        System.out.print("iterator : ");
        Iterator<Integer> it = ts.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // navigableSet
        NavigableSet<Integer> ns = ts.descendingSet();
        System.out.println("NavigableSet view : " + ns);

        // comparator
        System.out.println("Comparator : " + ts.comparator()); // null = natural order

        // size
        System.out.println("size : " + ts.size());

        // isEmpty
        System.out.println("isEmpty : " + ts.isEmpty());

        // equals
        TreeSet<Integer> ts2 = new TreeSet<>(ts);
        System.out.println("equals ts2 : " + ts.equals(ts2));

        // hashCode
        System.out.println("hashCode : " + ts.hashCode());

        // clear
        ts.clear();
        System.out.println("After clear : " + ts);
    }
}