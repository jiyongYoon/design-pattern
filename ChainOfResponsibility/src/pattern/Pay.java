package pattern;

public class Pay {
    private PayType payType;
    private int amount;

    public Pay(PayType payType, int amount) {
        this.payType = payType;
        this.amount = amount;
    }

    public PayType getPayType() {
        return payType;
    }

    public int getAmount() {
        return amount;
    }
}
