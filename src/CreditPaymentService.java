public class CreditPaymentService {
    public int calculate(double creditRub, double periodMo, double ratePc) {
        double monthlyRate = ratePc / 12 / 100;
        double payment = creditRub * monthlyRate * (Math.pow(1 + monthlyRate, periodMo) / (Math.pow(1 + monthlyRate, periodMo) - 1));
        return (int) payment;
    }
}
