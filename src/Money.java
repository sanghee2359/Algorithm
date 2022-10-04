import java.util.Scanner;
class Unit {
    private int money;
    private int result;
    int[] unit = {50000,10000,5000,1000,500,100,50,10};

    // 생성자
    public Unit(int money) {
        this.money = money;
    }
    public void calc() {
        for(int x: unit){
            if(money > x) {
                result = money/x;
                money= money%x;
                System.out.println(x+"원?"+result+"개");

            }else{
                result = 0;
                System.out.println(x + "원?"+result+"개");
            }
        }
    }
}
public class Money {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("금액을 넣으세요:");
        int money = sc.nextInt();
        Unit m = new Unit(money);
        m.calc();
    }
}