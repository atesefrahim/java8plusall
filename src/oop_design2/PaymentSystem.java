package oop_design2;

import java.util.ArrayList;
import java.util.List;

public class PaymentSystem {

    private List<Payee> payees;
    private Double taxRate = 0.2;

    public PaymentSystem() {
        payees = new ArrayList<>();
    }

    public void addPayee(Payee payee) {
        if (!payees.contains(payee)) {
            payees.add(payee);
        }
    }

    public void processPayments() {
        for (Payee payee : payees) {
            Double grossPayment = payee.grossPayment();
            Double tax = 0.0;

            if (payee instanceof TaxablePayee) {
                Double taxableIncome = grossPayment - ((TaxablePayee) payee).allowance();
                tax = taxableIncome * taxRate;
            }
            Double netPayment = grossPayment - tax;


            System.out.println("paying to " + payee.name() + " client");

            System.out.println("\t transferred to \t" + payee.bankAccount() + " account");

            System.out.println("\t gross amount of payment \t " + grossPayment);

            System.out.println("\t tax amount \t " + tax);

            System.out.println("\t net payment \t " + netPayment);


        }
    }
}
