package Object_Oriented;
//생성자 및 super의 사용.
//super를 사용하면 코드가 좀 더 간결해진다!
//상속을 사용할 때는 생성자에서 꼬일 수 있을 가능성이 높을 거 같다.
//미리 구조를 적어놓고 시작하는 게 best일듯...?
class ConstructableCalculator extends Calculator{
    ConstructableCalculator(int left, int right){
        this.left = left;
        this.right = right;
    }
}

class superCalculator extends ConstructableCalculator{
    superCalculator(int left, int right){
        super(left, right);
    }
}

public class object04 {
    public static void main(String[] args) {
        ConstructableCalculator c = new ConstructableCalculator(10, 20);
        superCalculator s = new superCalculator(20, 30);
        c.sum();
        s.sum();
    }
}
