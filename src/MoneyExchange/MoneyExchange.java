package MoneyExchange;

public class MoneyExchange {

    public double ExchangeDollarsToPeso(double input) { /*Make it return void...maybe*/
        double exchangeRateUSD = 0.054;
        double dolarAmount = input * exchangeRateUSD;
        dolarAmount = (double) Math.round(dolarAmount * 100d)/100;
        return dolarAmount;
        /*Here goes the message to show the user the result*/
    }

}
