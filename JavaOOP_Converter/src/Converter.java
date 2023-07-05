public class Converter {
    private int amountInRsd;
    private Currency currency;
    public Converter(int amountInRsd, Currency currency){
        this.amountInRsd = amountInRsd;
        this.currency=currency;
    }

    public void setAmountInRsd(int amountInRsd) {
        this.amountInRsd = amountInRsd;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
    public double exchangeCurrency() {
        double conversion;
        switch(currency) {
            case EUR:
                return amountInRsd / 117.63;
            case USD:
                return amountInRsd/ 109.1;
            case AUD:
                return amountInRsd / 71.98;
            case CAD:
                return amountInRsd / 80.8;
            case RUB:
                return amountInRsd / 1.36;
            case GBP:
                return amountInRsd/ 135.64;
            default:
                System.out.println("Unknown currency! ");
                return 0.0;
        }}

    @Override
    public String toString() {
        return "Converter{" +
                "amountInRsd=" + amountInRsd +
                ", currency=" + currency +
                '}';
    }
}
