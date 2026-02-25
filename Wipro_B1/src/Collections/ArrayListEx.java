package Collections;
import java.util.*;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names=new ArrayList<>();
		//ArrayList<String> name= new ArrayList<>();
		//ArrayList<String> name1= new ArrayList();
		List<String> list2 = new ArrayList<>();
				list2.add("Surya");
				list2.add("Lakshmi");
				names.add("Renu ");
				names.add("Sai");
				names.add("Renu");
				names.add(0, "Vinaya");
				names.addAll(1,list2);
				names.addAll(0, names);
				names.addFirst("Pratheeka");
				names.addLast("Gita");
				//names.clear();
				names.contains("Sai");
				names.containsAll(list2);
				names.equals("Hari");
				//names.forEach(null);//Iterable
				names.get(3);
				names.getClass();//Obj
				names.getFirst();
				names.getLast();
				names.hashCode();
				names.indexOf("Gita");
				names.isEmpty();
				names.iterator();
				names.lastIndexOf("Sai");
				names.listIterator();
				names.listIterator(3);
				//names.notify(); // Obj
				//names.notifyAll(); // Obj
				//names.parallelStream();//Collection
				names.remove(5);
				names.remove("Sita");
				names.removeAll(list2);
				names.removeFirst();
				//names.removeIf(null);//Collection
				names.removeLast();
				//names.replaceAll(null);
				names.retainAll(list2);
				names.reversed();
				names.set(1, "Vasu");
				names.size();
				names.sort(null);
				names.spliterator();
				names.stream();//Collection
				names.subList(0, 0);
				names.toArray();
				//names.toArray(null);//Collection
				//names.toArray(null);
				names.toString();//Obj
				//names.wait();//Obj
				//names.wait(10);//Obj
				//names.wait(120, 2);//Obj
				
				
				System.out.println(names);

	}

}
