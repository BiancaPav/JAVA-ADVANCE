package ro.sda.bianca.abstractclass.ex1;

public abstract class Bank {
    public static final double TAX_VALUE = 0.15; //pt a defini o constanta folosim static si final

    public abstract double getBalance(); //metoda abstracta

    public double getBalanceAfterTaxes(){
        double balance = getBalance();
        double tax = balance * TAX_VALUE;
        double newBalance = balance - tax;
        return newBalance;
    }



}
