package pattern;

public class Main {
    public static void main(String[] args) {
        CashHandler cashHandler = new CashHandler();
        CreditCardHandler creditCardHandler = new CreditCardHandler();
        DebitCardHandler debitCardHandler = new DebitCardHandler();

        cashHandler.setNext(creditCardHandler).setNext(debitCardHandler);

        Pay creditReq = new Pay(PayType.CreditCard, 10000);
        Pay cashReq = new Pay(PayType.Cash, 3500);
        Pay debitReq = new Pay(PayType.DebitCard, 80000);
        Pay coupangReq = new Pay(PayType.CoupangCard, 94200);

        System.out.println("credit------------------");
        cashHandler.run(creditReq);
        System.out.println("cash------------------");
        cashHandler.run(cashReq);
        System.out.println("debit------------------");
        cashHandler.run(debitReq);

        System.out.println("coupangService------------------");
        CoupangPaymentService coupangPaymentService = new CoupangPaymentService();
        System.out.println("debit------------------");
        coupangPaymentService.process(debitReq);
        System.out.println("coupang------------------");
        coupangPaymentService.process(coupangReq);

    }
}
