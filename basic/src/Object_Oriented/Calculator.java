package Object_Oriented;

public class Calculator {
    static int base = 0;
    int left, right, third;

    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }

    public void setOprands(int left, int right, int third){
        this.left = left;
        this.right = right;
        this.third = third;
    }

    public void sum(){
        System.out.println(this.left + this.right+base);
    }

    public void avg(){
        System.out.println((this.left+this.right)/2);
    }
}

class v2 {
    static int vase = 0;
}