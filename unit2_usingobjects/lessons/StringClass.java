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

        // Concatenation
        String n1 = "3";
        String n2 = "4";
        String n3 = n1.concat(n2);

        // Converting String to integer
        int t = Integer.parseInt(n3);
        System.out.println(t+10); // 44

        // indexOf method
        System.out.println("computer".indexOf('t')); // 5
        System.out.println("computer".indexOf("put")); // 3
        System.out.println("length".length()); // 6

        // contains method
        System.out.println("java and python exercises".contains("java")); // true

        // Capitalization
        System.out.println("OOPSIES I CAPS LOCKED THIS".toLowerCase());
        System.out.println("i forgot to capitalize this".toUpperCase());

        // Integer to String
        String s = String.valueOf(45);
        System.out.println(s+5); // 455

        // replace method
        System.out.println("kava".replace("k", "j"));

        // compare
        String b1 = "Drew";
        String b2 = "Blew";
        System.out.println(b1.compareTo(b2)); // -9 (negative number means correct alphabetical order)
        System.out.println(b2.compareTo(b1)); // 9 (positive number means incorrect alphabetical order)
        System.out.println(b1.compareTo(b1)); // 0
    }
}
