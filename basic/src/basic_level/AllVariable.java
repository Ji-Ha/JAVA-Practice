package basic_level;

public class AllVariable {
    public static void main(String[] args) {
        int a;
        double b;
        String first, second;
        first = "고독하구만";
        second = "feat.머쉬베놈 - ";
        a= 3;
        b= 3.7;

        System.out.println(a+b);
        System.out.println(first);
        System.out.println(second + first );

        //중복의 제거 -> 가독성 상승, 유지보수 상승, 버그 발생도 낮춰줌.
        // -> 프리코스 전에 여러 블로그를 보았는데, 숫자가 아닌 변수를 사용하는 걸 습관으로 기르고 있었음.
        // 그 이유가 바로 가독성과 유지보수 때문이었구나...!
        // ex
        System.out.println(100 + 10);
        System.out.println((100 +10)/10);
        System.out.println(((100 +10)/10) - 10);
        System.out.println((((100 +10)/10) - 10) * 10);

        int hun = 100;
        int ten = 10;
        //깔끔-
        System.out.println(hun + ten);
        System.out.println((hun +ten)/ten);
        System.out.println(((hun +ten)/ten) - ten);
        System.out.println((((hun +ten)/ten) - ten) * ten);


    }
}
