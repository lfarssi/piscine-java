public class StringConcat {
    public static String concat(String a, String b) {
        return (a==null) ? b: (b==null)? a : a + b;
    }
}
