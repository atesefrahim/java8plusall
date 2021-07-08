package oop_design2;

public class PaymentApplication {

    public static void main(String[] args) {

        PaymentSystem paymentSystem = new PaymentSystem();

        CommissionEmployee ibrahimAtes = new CommissionEmployee("ibrahim", 6623023, 123.4, 100.0);

        paymentSystem.addPayee(ibrahimAtes);

        ContractingCompany microsoft = new ContractingCompany("microsoft", 213, 100.0);

        paymentSystem.addPayee(microsoft);


        ibrahimAtes.giveCommision(23.0);
        ibrahimAtes.giveCommision(45.0);
        ibrahimAtes.giveCommision(66.0);

        ibrahimAtes.giveBonus(5.0);

        microsoft.payForServices(600.0);

        paymentSystem.processPayments();
    }

}
