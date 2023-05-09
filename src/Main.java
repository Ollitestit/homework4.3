public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int credit = 1_000_000;
        int period;
        double rate = 9.99;
        System.out.println("Срок кредита - 1 год");
        System.out.println("Ежемесячный платеж = " + service.calculate(credit, period = 12, rate) + " руб.");
        System.out.println();
        System.out.println("Срок кредита - 2 года");
        System.out.println("Ежемесячный платеж = " + service.calculate(credit, period = 24, rate) + " руб.");
        System.out.println();
        System.out.println("Срок кредита - 3 года");
        System.out.println("Ежемесячный платеж = " + service.calculate(credit, period = 36, rate) + " руб.");
    }
}