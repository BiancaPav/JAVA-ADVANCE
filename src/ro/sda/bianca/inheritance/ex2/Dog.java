package ro.sda.bianca.inheritance.ex2;

public class Dog extends Animal{
    public Dog(int age, double weight){
        super(age, weight);
    }

    @Override
    public void yieldVoice() {
        System.out.println("Ham");
    }
}
