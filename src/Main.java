public class Main {
    public static void main(String[] args) {
        CreditPaymentService creditPaymentService = new CreditPaymentService();

        int monthlyPaymentCreditTerm_1Year = (int) (creditPaymentService.calculate(1_000_000, 12));
        System.out.println(monthlyPaymentCreditTerm_1Year);

        int monthlyPaymentCreditTerm_2Year = (int) (creditPaymentService.calculate(1_000_000, 24));
        System.out.println(monthlyPaymentCreditTerm_2Year);

        int monthlyPaymentCreditTerm_3Year = (int) (creditPaymentService.calculate(1_000_000, 36));
        System.out.println(monthlyPaymentCreditTerm_3Year);

    }
}
