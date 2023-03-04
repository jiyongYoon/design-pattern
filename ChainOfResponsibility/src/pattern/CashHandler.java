package pattern;

public class CashHandler extends PaymentHandler {

    @Override
    protected void process(Pay payReq) {
        if (payReq.getPayType().equals(PayType.Cash)) {
            System.out.println(payReq.getAmount() + "이 Cash로 결제되었습니다.");
        } else {
            System.out.println("이 요청은 Cash 결제 요청이 아닙니다.");
        }
    }
}
