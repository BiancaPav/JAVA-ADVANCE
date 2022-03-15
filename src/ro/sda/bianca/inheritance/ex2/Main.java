package ro.sda.bianca.inheritance.ex2;

//Create classes Dog and Cat.
//	a) Move common methods and fields to the class Animal.
//	b) Create method „yieldVoice”.

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Cat(5, 7);
        Animal animal2 = new Dog(4, 14);
        animal1.yieldVoice();
        animal2.yieldVoice(); //aici apelam metoda
    }
}
