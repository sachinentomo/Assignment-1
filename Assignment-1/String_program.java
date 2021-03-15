public class String_program {
    public static void main(String[] args) {
        String s1="entomo";
        String s2="kpisoft";
        System.out.println("charAt()"+ s1.charAt(0));
        System.out.println("Comparing object using equals()"+s1.equalsIgnoreCase(s2));
        System.out.println("Comparing objects using compareTo()"+s1.compareToIgnoreCase(s2));
        System.out.println("startsWith()"+s1.startsWith("ent"));
        System.out.println("endsWith()"+s1.endsWith("mo"));
        System.out.println("hashCode()"+s1.hashCode());
        String s="Indiaismycountry";
        System.out.print(s.substring(2,10));
        System.out.println("toUpperCase()"+s2.toUpperCase());
        System.out.println("toUpperCase()"+s2.toLowerCase());

    }
}
