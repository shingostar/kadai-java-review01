public class Review01 {
    public static void main(String[] args) {
        int price = 1500;
        double taxRate = 10;
        double tax = tax(price,taxRate);
        double taxIncludedPrice = price + tax;
        System.out.println(price+"円の商品の"+"税込金額は "+(int)taxIncludedPrice+"円(消費税は" + (int)tax+"円)です。");
    }

    public static double tax(int price,double taxRate) {
        return price * taxRate / 100;
    }
}