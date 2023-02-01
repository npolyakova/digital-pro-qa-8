package zoo;

public class Main {

    public static void main(String[] args) {
        Veterinarian veterinarian = new Veterinarian();
        Zookeeper zookeeper = new Zookeeper();

        Cats lion = new Cats("Кузя");
        Cats tiger = new Cats("Жора");
        Hypo hypo = new Hypo("Дося");
        Squirrels squirrelS = new Squirrels("Стрелка");
        Squirrels squirrelL = new Squirrels("Ловкач");

        veterinarian.lunch();
        zookeeper.lunch();

        veterinarian.checkHealth(tiger);
        veterinarian.checkHealth(squirrelS);

        veterinarian.hungry = true;
        veterinarian.lunch();

        lion.bite(zookeeper);
        zookeeper.makeBandage();

        zookeeper.changeWater(hypo);

        squirrelL.goOut();
        veterinarian.watch(squirrelL);
    }
}
