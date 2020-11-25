package Object_Oriented;

//overriding & overloading
//Calculator class에서의 overloading
class riddingCalculator extends Calculator{

    public void sum(){
        System.out.println("실행 결과는 " + (this.left + this.right) + "입니다.");
    }

    public void sum(int third){
        System.out.println("실행 결과는 " + (this.left + this.right + third) + "입니다. ");
    }
}

public class object05 {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        riddingCalculator r = new riddingCalculator();
        c.setOprands(10, 20);
        r.setOprands(20, 30);
        c.sum();
        r.sum();
        r.sum(40);
    }
}
