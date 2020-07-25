public class CreditPaymentService {
    public double calculate(int creditAmount, int creditTerm) {

        double annualLoanRate = 9.99;
        double monthlyLoanRate = annualLoanRate / 100 / 12;
        int a = 1;
        double monthlyPayment;
        monthlyPayment = creditAmount * (monthlyLoanRate + monthlyLoanRate / (Math.pow((a + monthlyLoanRate), creditTerm) - a));

        return monthlyPayment;

    }

}
