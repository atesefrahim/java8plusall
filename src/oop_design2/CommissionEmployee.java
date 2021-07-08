package oop_design2;

public class CommissionEmployee extends Employee {


    private Double grossCommission = 0.0;


    private static final Double bonusMultiplier = 1.5;

    public CommissionEmployee(String name, Integer bankAccount, Double grossWage, Double allowance){
        super(name, bankAccount, grossWage, allowance);
    }


    public Double grossPayment(){
        return grossWage + doCurrentBonus() + doCurrentCommission();
    }

    private Double doCurrentCommission() {

        Double commision = grossCommission;
        grossCommission = 0.0;
        return commision;

    }

    public void giveCommision(Double amount){
        grossCommission += amount;
    }

    public void giveBonus(Double percentage) {

        currentBonus += grossWage * (percentage/100.0) * bonusMultiplier;
    }

    public static void display() {
        System.out.println("Static or class method asdada Base");
    }

}
