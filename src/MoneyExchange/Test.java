package MoneyExchange;

public class Test {
    public static void main(String[] args) {
        MoneyExchange money = new MoneyExchange();
        ForeignExchangeToLocal foreignMoney = new ForeignExchangeToLocal();

        //System.out.println(foreignMoney.ExchangeMXNtoUSD(20 )+ " USD");
        //System.out.println(money.ConvertirPesosADolares(100));
        //System.out.println(money.ExchangeUSDtoMXN(1) + " MXN");
        System.out.println(foreignMoney.ExchangeMXNtoEURO(100));
    }
    /* USD X
    * EURO X
    * Japanese Yen
    * AUD
    * CAD
    * CHF
    * CNH
    * HKD
    * NZD
    * */
}
