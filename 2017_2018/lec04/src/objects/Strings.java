package objects;

public class Strings {

    public static boolean palindrom(String s){
        return s.equals(new StringBuilder(s).reverse().toString());
    }

    public static void main(String[] args) {
        String a = "Ala ma kota";
        String b = new String("Ala ma kota");
        String c = "Ala ma kota";

        System.out.println(a == b);
        System.out.println(a == c);

        a += " i psa";

        System.out.println(a.length());
        System.out.println(a.charAt(2));
        System.out.println(a.equals("Tr"));
        System.out.println(a.startsWith("Ala"));
        System.out.println(a.endsWith("kota"));
        System.out.println(a.replace('a', 'w'));
        System.out.println(a.toUpperCase());
        System.out.println(a.toLowerCase());

        System.out.println(palindrom("kajak"));
        System.out.println(palindrom("kawa"));
    }
}
