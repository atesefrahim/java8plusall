package oop_design2;

public class SalaryEmployee extends Employee {


    public SalaryEmployee(String name, int bankAccount, Double grossWage, Double allowance) {
        super(name, bankAccount, grossWage, allowance);
    }

    public Double grossPayment() {
        return grossWage + doCurrentBonus();
    }

    public void giveBonus(Double percentage) {
        currentBonus += grossWage * (percentage / 100.0);

    }


}
