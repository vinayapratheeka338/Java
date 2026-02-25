package MustKnow;
public class StringBuilderAllMethods {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java");
 
        sb.append(" Programming");
        System.out.println(sb);

        sb.insert(4, " Language");
        System.out.println(sb);

        sb.delete(4, 13);
        System.out.println(sb);

        sb.deleteCharAt(3);
        System.out.println(sb);

        System.out.println("Length: " + sb.length());

        sb.setLength(4);
        System.out.println("SetLength: " + sb);

        sb.append(" World");
        System.out.println("Substring: " + sb.substring(5));

        sb.replace(0, 4, "Python");
        System.out.println(sb);

        sb.ensureCapacity(50);
        System.out.println("Capacity: " + sb.capacity());

        System.out.println("CharAt 1: " + sb.charAt(1));

        sb.setCharAt(1, 'Y');
        System.out.println("SetCharAt: " + sb);

        System.out.println("IndexOf 'World': " + sb.indexOf("World"));

        sb.reverse();
        System.out.println("Reverse: " + sb);

        System.out.println("ToString: " + sb.toString());
    }
}
