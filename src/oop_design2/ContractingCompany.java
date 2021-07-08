package oop_design2;

public class ContractingCompany implements TaxablePayee {

    private String name;

    private Integer bankAccount;

    private Double currentBalance;

    private Double allowance;


    public ContractingCompany(String name, Integer bankAccount, Double allowance) {
        this.name = name;
        this.bankAccount = bankAccount;
        this.allowance = allowance;
        currentBalance = 0.0;
    }

    public String name() {
        return name;
    }

    public Double grossPayment() {
        return doPayment();
    }

    public Integer bankAccount() {
        return bankAccount;
    }

    public Double allowance() {
        return allowance;
    }

    private Double doPayment() {
        Double balance = currentBalance;
        currentBalance = 0.0;
        return balance;

    }

    public void payForServices(Double amount) {
        currentBalance += amount;
    }
}
