package Object_Oriented;
//상속에 대한 개념.
//기존에 있던 class를 재사용할 때,
//또 다른 method를 추가하여 사용할 때 유용.
class SubstractionableCalculator extends Calculator{
    public void substract(){
        System.out.println(this.left - this. right);
    }
}

class MultiplicationableCalculator extends SubstractionableCalculator{
    public void multiple(){
        System.out.println(this.left * this.right);
    }
}
public class object03 {
    public static void main(String[] args) {
        SubstractionableCalculator c1 = new SubstractionableCalculator();
        MultiplicationableCalculator m1 = new MultiplicationableCalculator();
        m1.setOprands(10, 20);
        m1.substract();
        m1.multiple();

    }
}
