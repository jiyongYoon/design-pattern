package pattern;

public class CreditCardHandler extends PaymentHandler {

    @Override
    protected void process(Pay payReq) {
        if (payReq.getPayType().equals(PayType.CreditCard)) {
            System.out.println(payReq.getAmount() + "이 CreditCard로 결제되었습니다.");
        } else {
            System.out.println("이 요청은 CreditCard 결제 요청이 아닙니다.");
        }
    }
}
