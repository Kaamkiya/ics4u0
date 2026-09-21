public class StringClass {
    public static void main(String[] args) {
        // String methods are immutable
        // String variables are not primitive types
        String name1 = "blue";
        String name2 = new String("blue");
        System.out.println(name1==name2);
        // Use equals method to compare two objects
        System.out.println(name1.equals(name2));

        String s1 = "purple";
        String s2 = "purple";
        System.out.println(s1==s2);

        String c1 = "Ontario";
        String c2 = "ontario";
        System.out.println(c1.equalsIgnoreCase(c2));

        String q = "Northern Secondary School";
        System.out.println(q.substring(0, 8)); // Northern
        System.out.println(q.substring(9)); // Secondary School
        System.out.println(q.substring(0,10)+q.substring(19,20)); // Northern SS
    }
}
