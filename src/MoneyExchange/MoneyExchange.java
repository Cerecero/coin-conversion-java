package MoneyExchange;

public class MoneyExchange {

    public double ExchangeUSDtoMXN(double input) { /*Make it return void...maybe*/
        double exchangeRateUSD = 0.054;
        double dolarAmount = input / exchangeRateUSD;
        dolarAmount = (double) Math.round(dolarAmount * 100d)/100;
        return dolarAmount;
        /*Here goes the message to show the user the result*/
    }
    public double ExchangeEUROtoMXN(double input){
        double exchangeRateEURO = 0.050;
        double EUROamount = input / exchangeRateEURO;
        EUROamount = (double) Math.round(EUROamount * 100d)/100;
        return EUROamount;
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
