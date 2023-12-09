import java.util.Scanner;

public class Review01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("税抜金額を入力してください: ");
        int price = sc.nextInt();
        System.out.print("消費税率を入力してください: ");
        double taxRate = sc.nextDouble();
        double tax = price * taxRate / 100;
        double taxIncludedPrice = price + tax;
        System.out.println(price+"円の商品の"+"税込金額は "+(int)taxIncludedPrice+"円(消費税は" + (int)tax+"円)です。");
    }

    public static double tax(int price,double taxRate) {
        return taxRate * taxRate / 100;
    }
}
