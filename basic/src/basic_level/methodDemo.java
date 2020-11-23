package basic_level;

public class methodDemo {
    //코드의 재활용이 가능한 것. == method
    public static int gauss(int init, int limit){
        int sum = 0;
        for(int i = init; i<=limit;i++) {
            System.out.println(i);
            sum+=i;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(gauss(1, 10));
    }
}
