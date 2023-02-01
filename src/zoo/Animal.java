package zoo;

public class Animal {

    //Кусаются и могут болеть
    boolean healthy;

    String name;

    String cage = "в вольере";

    public void bite(Human human) {
        human.hurt = true;
        System.out.println("Животное покусало " + human.profession);
    }

    public Animal(String name) {
        this.name = name;
    }
}
