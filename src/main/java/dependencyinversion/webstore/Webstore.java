package dependencyinversion.webstore;

// high level module
public class Webstore {
    private PaymentController paymentController;

    public Webstore() {
        this.paymentController = new PaymentController();
        paymentController.setPaymentMethod(new Paypal());
    }

    public void purchaseItem() {
        this.paymentController.pay();
    }
}
