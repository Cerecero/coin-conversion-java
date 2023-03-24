package MoneyExchange;

public class ForeignExchangeToLocal {
    public double ExchangeMXNtoUSD(double input) { /*Make it return void...maybe*/
        double exchangeRateUSD = 0.054;
        double USDamount = input * exchangeRateUSD;
        USDamount = (double) Math.round(USDamount * 100d)/100;
        return USDamount;
        /*Here goes the message to show the user the result*/
    }
    public double ExchangeMXNtoEURO(double input) {
        double exchangeRateEURO = 0.050;
        double EUROamount = input * exchangeRateEURO;
        EUROamount = (double) Math.round(EUROamount * 100d)/100;
        return EUROamount;
    }
    public double ExchangeMXNtoYEN(double input) {
        double exchangeRateYEN = 7.08;
        double YENamount = input * exchangeRateYEN;
        YENamount = (double) Math.round(YENamount * 100d)/100;
        return YENamount;
    }
    public double ExchangeMXNtoAUD(double input) {
        double exchangeRateAUD = 0.081;
        double AUDamount = input * exchangeRateAUD;
        AUDamount = (double) Math.round(AUDamount * 100d)/100;
        return AUDamount;
    }
    public double ExchangeMXNtoCAD(double input) {
        double exchangeRateCAD = 0.074;
        double CADamount = input * exchangeRateCAD;
        CADamount = (double) Math.round(CADamount * 100d)/100;
        return CADamount;
    }
}
