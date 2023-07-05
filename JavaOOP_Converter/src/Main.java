public class Main {
    public static void main(String[] args) {
        Converter converter1 = new Converter(1000, Currency.EUR);
        System.out.println("Amount in EUR is: " + converter1.exchangeCurrency());
        converter1.setCurrency(Currency.USD);
        System.out.println("Amount in USD is:  " + converter1.exchangeCurrency());
        converter1.setCurrency(Currency.AUD);
        System.out.println("Amount in AUD is: " +converter1.exchangeCurrency());
        converter1.setCurrency(Currency.CAD);
        System.out.println("Amount in CAD is: " + converter1.exchangeCurrency());
        converter1.setCurrency(Currency.RUB);
        System.out.println("Amount in RUB is: " + converter1.exchangeCurrency());
        converter1.setCurrency(Currency.GBP);
        System.out.println("Amount in GBP is: " + converter1.exchangeCurrency());
    }
}