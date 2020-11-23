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
        //배열과 반복문.
        String[] nameGroup = {"노지환", "박소민"};

        for(int j = 0 ; j<nameGroup.length; j++){
            System.out.println(nameGroup[j]);
        }

        //for-each
        String[] members = new String[3];
        members[0] = "노지환";
        members[1] = "박소민";
        //for-each구문을 썼을 때, stu로 null값이 들어감.
        //지금 배운 배열은 미리 만들어놓은 값으로 정해져서 고정되어 있다.
        //이런 것들을 해결하고, 자원을 아끼기 위해 java의 collection을 사용함.
        for(String stu : members){
            System.out.println(stu + "이 공부하고 있습니다!");
        }
    }
}
