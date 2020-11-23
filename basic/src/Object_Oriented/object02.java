package Object_Oriented;
//class method와 class 변수에 대한 부분.
//어디서 활용이 될까? 아직은 잘 모르겠다.
// -> 아 static변수 같은 경우는 instance가 선언될 때,
// 그 갯수만큼 생성되는 게 아니라 한번 생성되고 끝임.
// ex-> 100개의 인스턴스 생성한다고 100개의 class에 맞는 static변수 생성 x
// 그저 한개만 생성
// -> 자원을 효율적으로 활용 가능.

//class method는 instance member에 접근 불가.
//->class가 만들어질 땐, instance는 없었기 때문에 접근이 불가능.
//instance 는 어디든 가능.
//instance 변수 == Non-static Field
//class 변수 == Static Field

class Calculator2 {
    static int value;
    public static void sum(int left, int right){
        System.out.println(left+right);
    }

    public static void avg(int left, int right){
        System.out.println((left+right)/2);
    }
}
public class object02 {

    public static void main(String[] args) {
        System.out.println(v2.vase);
        System.out.println(Calculator2.value);
        Calculator2.value = 3;
        System.out.println(Calculator2.value);
        Calculator2.sum(3, 5);
        Calculator2.avg(3, 5);
    }
}
