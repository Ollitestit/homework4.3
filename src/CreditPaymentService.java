public class CreditPaymentService {
    public int calculate(double credit_rub, double period_mo, double rate_pc) {
        double r = rate_pc / 12 / 100;
        double rp = Math.pow(1 + r, period_mo);
        double payment = credit_rub * r * (rp / (rp - 1));
        return (int) payment;
    }
}
