package pattern;

public class CoupangDiscardHandler extends PaymentHandler {

    @Override
    protected void process(Pay payReq) {
        if (payReq.getPayType().equals(PayType.CoupangCard)) {
            System.out.println(payReq.getAmount() + "이 CoupangCard로 결제되었습니다.");
            System.out.println(payReq.getAmount() * 0.1 + "이 할인되었습니다.");
        } else {
            System.out.println("이 요청은 CoupangCard 결제 요청이 아닙니다.");
        }
    }
}
