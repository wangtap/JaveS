public class CompareTo {
    public static void main(String[] args) {
        String s1="abc";

        String s2="/bcda";

        String s3="abcde";

        String s4="?ahgrhrhyrtbcde";

        String  s5="1kawejrioawe";
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s1.compareTo(s4));
        System.out.println(s1.compareTo(s5));
        System.out.println(s4.compareTo(s2));
    }
}
