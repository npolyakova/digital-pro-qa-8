package demo;

public class Main {

    public static void main(String[] args) {
        Human human = new Human();
        human.age = 24;
        human.name = "Илья";
        System.out.println("Имя: " + human.name + "\nВозраст: " + human.age);
        human.eat();
        human.sleep();

        Dog dog = new Dog();
        dog.name = "Шарик";
        System.out.println("\nИмя собаки: " + dog.name);
        dog.bark();
        dog.eat();
        dog.sleep();
        dog.bite();
        dog.clean();

        Doctors doctor = new Doctors();
        doctor.age = 45;
        doctor.name = "Дмитрий";
        System.out.println("\nИмя: " + doctor.name + "\nВозраст: " + doctor.age);
        doctor.eat();
        doctor.sleep();

        Tools tool = new Tools();
        System.out.println();
        tool.clean();
        tool.bite();
    }
}
