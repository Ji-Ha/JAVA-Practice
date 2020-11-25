package Object_Oriented;
//member에서는
//private, default, protected, public
//private는 class와 package가 같아야 사용가능.
//default는 같은 package에만 있다면 사용 가능.
//protected는 다른 package에 있더라도 상속관계라면 사용 가능.
//public은 어디서나 접근이 가능.

//class의 접근 제어자는?
//default와 public으로만 구성되어 있다.
//default는 같은 package 내에서만 사용이 가능한 반면,
//public은 다른 package에서도 사용이 가능하다.

//default.
class Caculator3{
    private int left, right;

    //생성자
    Caculator3(){
        //
    }

    Caculator3(int left, int right){
        this.left=left;
        this.right=right;
    }

    private int sum(){
        return this.left + this.right;
    }


}

public class object06 {

}
