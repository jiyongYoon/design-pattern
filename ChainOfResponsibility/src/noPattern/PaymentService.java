package noPattern;

public class PaymentService {
    public void process(Pay payReq) {
        PayType curPayType = payReq.getPayType();
        if (curPayType.equals(PayType.Cash)) {
            System.out.println(payReq.getAmount() + "이 Cash로 결제되었습니다.");
        } else if (curPayType.equals(PayType.CreditCard)) {
            System.out.println(payReq.getAmount() + "이 CreditCard로 결제되었습니다.");
        } else if (curPayType.equals(PayType.DebitCard)) {
            System.out.println(payReq.getAmount() + "이 DebitCard로 결제되었습니다.");
        } else if (curPayType.equals(PayType.CoupangCard)) {
            System.out.println(payReq.getAmount() + "이 CoupangCard로 결제되었습니다.");
            System.out.println(payReq.getAmount() * 0.1 + "이 할인되었습니다.");
        }
    }
}
