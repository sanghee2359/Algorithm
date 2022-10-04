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
        int refund = 25400;
        System.out.printf("5만원 권 %d개 나머지 : %d원\n", refund/50000, refund%50000);
        refund = refund % 50000;
        System.out.printf("1만원 권 %d개 나머지 : %d원\n", refund/10000, refund);
        refund = refund % 10000;
        System.out.printf("5천원 권 %d개 나머지 : %d원\n", refund/5000, refund);
        refund = refund % 5000;
        System.out.printf("1천원 권 %d개 나머지 : %d원\n", refund/1000, refund);
        refund = refund % 1000;
        System.out.printf("500원 권 %d개 나머지 : %d원\n", refund/500,refund);
        refund = refund % 500;
        System.out.printf("100원 권 %d개 나머지 : %d원\n", refund/100,refund);
        refund = refund % 100;
        System.out.printf("50원 권 %d개 나머지 : %d원\n", refund/50,refund);

    }
}
