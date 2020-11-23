package Object_Oriented;

public class object01 {
    //객체지향이라는 뜻은
    //쉽게 변수와 메소드를 그룹화 한것.
    //상태 + 행위 == 로직 == 객체
    //변수 + 메소드 == 객체

    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();

        c1.sum();
        Calculator.base = 10;
        c1.sum();

        Calculator c2 = new Calculator();
        c2.setOprands(20, 40);
        c2.sum();
        c2.avg();
    }
}
