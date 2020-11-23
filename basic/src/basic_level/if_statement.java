package basic_level;

import java.util.Scanner;

public class if_statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.println("누구야 너!");
        name = sc.next();

        if(name.equals("노지환")){
            System.out.println("로그인.");
        }
        else{
            System.out.println("추방");
        }
    }
}
