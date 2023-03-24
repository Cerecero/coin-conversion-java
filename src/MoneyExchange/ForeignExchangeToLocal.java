package MoneyExchange;

public class ForeignExchangeToLocal {
    public double ExchangeMXNtoUSD(double input) { /*Make it return void...maybe*/
        double exchangeRateUSD = 0.054;
        double dolarAmount = input * exchangeRateUSD;
        dolarAmount = (double) Math.round(dolarAmount * 100d)/100;
        return dolarAmount;
        /*Here goes the message to show the user the result*/
    }
    public double ExchangeMXNtoEURO(double input) {
        double exchangeRateEURO = 0.050;
        double EUROAmount = input * exchangeRateEURO;
        EUROAmount = (double) Math.round(EUROAmount * 100d)/100;
        return EUROAmount;
    }
}
