package ro.sda.bianca.generics.ex1;

public class Car implements Comparable<Car>{
    private String name;
    private int fullSpeed;

    public Car(String name, int fullSpeed) {
        this.name = name;
        this.fullSpeed = fullSpeed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFullSpeed() {
        return fullSpeed;
    }

    public void setFullSpeed(int fullSpeed) {
        this.fullSpeed = fullSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", fullSpeed=" + fullSpeed +
                '}';
    }

    @Override
    public int compareTo(Car o) {
        return Integer.compare(this.getFullSpeed(), o.getFullSpeed());
    }
}
