package statements;

public class loop_statement {
    public static void main(String[] args) {
        for(int i = 0; i< 10; i++) {
            if(i == 2) {
                System.out.println("저는 2월에 생일이에요");
                continue; // 이 이후를 생략한 채로 다음으로 넘어감.
            }
            System.out.println("루프문에는 이렇게 " + i);
        }

        int i = 0;
        while( i < 10) {
            i++;
            if(i == 6){
                System.out.println("6일이 생일이죠");
                break;
            }
            System.out.println("또는 이렇게 " + i);
        }

        
    }
}
