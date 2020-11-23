package basic_level;

public class UseEqual {
    public static void main(String[] args) {
        String a = "Hello World";
        String b = new String("Hello World");
        System.out.println(a == b); // 동일한 "객체"가 아니기 때문에 false!
        System.out.println(a.equals(b)); // 두개의 값은 일치하기 때문에 true.
    }
}
