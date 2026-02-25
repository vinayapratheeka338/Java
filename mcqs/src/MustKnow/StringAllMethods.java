package MustKnow;
public class StringAllMethods {
    public static void main(String[] args) {

        String s = "  Java Programming Java  ";

        System.out.println("EqualsIgnoreCase: " +
                s.trim().equalsIgnoreCase("java programming java"));

        System.out.println("CompareTo: " +
                "Java".compareTo("Python"));

        System.out.println("LastIndexOf Java: " +
                s.lastIndexOf("Java"));

        System.out.println("Concat: " +
                "Hello".concat(" World"));

        System.out.println("Contains: " +
                s.contains("Programming"));

        System.out.println("StartsWith: " +
                s.trim().startsWith("Java"));

        System.out.println("EndsWith: " +
                s.trim().endsWith("Java"));

        System.out.println("Replace: " +
                s.replace("Java", "Python"));

        System.out.println("ReplaceAll: " +
                s.replaceAll("\\s+", " ").trim());

        System.out.println("Join: " +
                String.join("-", "A", "B", "C"));

        System.out.println("Matches digits: " +
                "12345".matches("\\d+"));

        System.out.println("ToLowerCase: " +
                s.toLowerCase());

        System.out.println("IsBlank: " +
                "   ".isBlank());

        System.out.println("IsEmpty: " +
                "".isEmpty());
    }
}
