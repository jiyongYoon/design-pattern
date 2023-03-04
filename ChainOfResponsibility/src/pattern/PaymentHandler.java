package pattern;

public abstract class PaymentHandler {
    protected PaymentHandler nextHandler = null;

    public PaymentHandler setNext(PaymentHandler handler) {
        this.nextHandler = handler;
        return handler;
    }

    protected abstract void process(Pay payReq);

    protected void run(Pay payReq) {
        process(payReq);
        if (nextHandler != null) {
           nextHandler.run(payReq);
        }
    }
}
