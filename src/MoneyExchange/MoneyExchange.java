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
    public double ExchangeYENtoMXN(double input){
        double exchangeRateYEN = 7.08;
        double YENamount = input / exchangeRateYEN;
        YENamount = (double) Math.round(YENamount * 100d)/100;
        return YENamount;
    }
    public double ExchangeAUDtoMXN(double input){
        double exchangeRateAUD = 0.081;
        double AUDamount = input / exchangeRateAUD;
        AUDamount = (double) Math.round(AUDamount * 100d)/100;
        return AUDamount;
    }
    public double ExchangeCADtoMXN(double input){
        double exchangeRateCAD = 0.074;
        double CADamount = input / exchangeRateCAD;
        CADamount = (double) Math.round(CADamount * 100d)/100;
        return CADamount;
    }
    public double ExchangeCHFtoMXN(double input){
        double exchangeRateCHF = 0.050;
        double CHFamount = input / exchangeRateCHF;
        CHFamount = (double) Math.round(CHFamount * 100d)/100;
        return CHFamount;
    }
    public double ExchangeCNHtoMXN(double input){
        double exchangeRateCNH = 0.37;
        double CNHamount = input / exchangeRateCNH;
        CNHamount = (double) Math.round(CNHamount * 100d)/100;
        return CNHamount;
    }
    public double ExchangeHKDtoMXN(double input){
        double exchangeRateHKD = 0.43;
        double HKDamount = input / exchangeRateHKD;
        HKDamount = (double) Math.round(HKDamount * 100d)/100;
        return HKDamount;
    }
    public double ExchangeNZDtoMXN(double input){
        double exchangeRateNZD = 0.087;
        double NZDamount = input / exchangeRateNZD;
        NZDamount = (double) Math.round(NZDamount * 100d)/100;
        return NZDamount;
    }
}
