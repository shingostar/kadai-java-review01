
public class Review01 {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ

        int prices = getPrices(1500);
        int taxin = getTaxin(1500,1500,0.1);
        int taxes = getTaxes(1500,0.1);
        System.out.println(prices+"円の商品の税込価格は"+taxin+"円(消費税は"+taxes+"円)です。");

}

    private static int getPrices(int i) {
        // 商品の価格
        int result = i ;
        return result;
    }
    private static int getTaxin(int i,int j,double d) {
        //税込額の計算
        int result = (int) (i + (j * d));
        return result;
    }
    private static int getTaxes(int i,double d) {
        // 消費税額の計算
        int result = (int) (i * d);
        return result;
   }

}
