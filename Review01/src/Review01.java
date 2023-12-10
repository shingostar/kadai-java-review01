public class Review01 {
    public static void main(String[] args) {
        int price = 1500;
        int taxRate = 10;
        int numbers = 100;
        int tax = tax(price,taxRate,numbers);
        int taxIncludedPrice = price + tax;
        System.out.println(price + "円の商品の" + "税込金額は " + taxIncludedPrice + "円(消費税は" + tax + "円)です。");
    }

    private static int tax(int price, int taxRate, int numbers) {
        return price * taxRate / numbers;
    }
}