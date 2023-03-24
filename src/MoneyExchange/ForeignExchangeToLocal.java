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
    public double ExchangeMXNtoYEN(double input) {
        double exchangeRateYEN = 7.08;
        double YENAmount = input * exchangeRateYEN;
        YENAmount = (double) Math.round(YENAmount * 100d)/100;
        return YENAmount;
    }
    public double ExchangeMXNtoAUD(double input) {
        double exchangeRateAUD = 0.081;
        double AUDAmount = input * exchangeRateAUD;
        AUDAmount = (double) Math.round(AUDAmount * 100d)/100;
        return AUDAmount;
    }
}
