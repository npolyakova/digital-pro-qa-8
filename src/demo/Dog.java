package demo;

public class Dog extends Animal implements Behavior {

    public void bark() {
        System.out.println("Гав-гав");
    }

    @Override
    public void eat() {
        System.out.println("Собака ест");
    }

    @Override
    public void sleep() {
        System.out.println("Собака спит");
    }

    @Override
    public boolean clean() {
        System.out.println("Собака вымыта");
        return true;
    }

}
