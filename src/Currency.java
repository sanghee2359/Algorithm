import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //int money = sc.nextInt();
        int curr1 = 50000;
        int curr2 = 10000;
        int curr3 = 5000;
        int curr4 = 1000;
        int curr5 = 500;
        // raw 익히지 않은 코딩
        int refund = 25000;
        System.out.printf("5만원 권 %d장 나머지 : %d원\n", refund/curr1, refund%curr1);
        System.out.printf("1만원 권 %d장 나머지 : %d원\n", refund/curr2, refund%curr2);
        System.out.printf("5천원 권 %d장 나머지 : %d원\n", refund/curr3, refund%curr3);
        System.out.printf("1천원 권 %d장 나머지 : %d원\n", refund/curr4, refund%curr4);
        System.out.printf("500원 권 %d장 나머지 : %d원\n", refund/curr5,refund%curr5);

    }
}
