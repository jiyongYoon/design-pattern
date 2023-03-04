package pattern;

public class DebitCardHandler extends PaymentHandler {

    @Override
    protected void process(Pay payReq) {
        if (payReq.getPayType().equals(PayType.DebitCard)) {
            System.out.println(payReq.getAmount() + "이 DebitCard로 결제되었습니다.");
        } else {
            System.out.println("이 요청은 DebitCard 결제 요청이 아닙니다.");
        }
    }
}
