package pattern;

import java.util.ArrayList;

public class CoupangPaymentService {
    ArrayList<PaymentHandler> coupangPaymentServiceChain = new ArrayList<>();

    protected void addHandler(PaymentHandler handler) {
        coupangPaymentServiceChain.add(handler);
    }

    public CoupangPaymentService() {
        this.coupangPaymentServiceChain.add(new CoupangDiscardHandler());
        this.coupangPaymentServiceChain.add(new CashHandler());
        this.coupangPaymentServiceChain.add(new CreditCardHandler());
        this.coupangPaymentServiceChain.add(new DebitCardHandler());
    }

    protected void process(Pay payReq) {
        for (PaymentHandler paymentHandler : coupangPaymentServiceChain) {
            paymentHandler.run(payReq);
        }
    }
}
