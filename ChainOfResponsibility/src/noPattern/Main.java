package noPattern;

public class Main {

    public static void main(String[] args) {
        Pay creditReq = new Pay(PayType.CreditCard, 10000);
        Pay cashReq = new Pay(PayType.Cash, 3500);
        Pay debitReq = new Pay(PayType.DebitCard, 80000);
        Pay coupangReq = new Pay(PayType.CoupangCard, 94200);

        PaymentService paymentService = new PaymentService();

        System.out.println("credit------------------");
        paymentService.process(creditReq);
        System.out.println("cash------------------");
        paymentService.process(cashReq);
        System.out.println("debit------------------");
        paymentService.process(debitReq);
        System.out.println("coupang------------------");
        paymentService.process(coupangReq);

    }
}
