package zoo;

public class Main {

    public static void main(String[] args) {
        Veterinarian veterinarian = new Veterinarian();
        Zookeeper zookeeper = new Zookeeper();

//        veterinarian.lunch();
//        zookeeper.lunch();
//
//        veterinarian.hungry = true;
//        veterinarian.lunch();
//
//        zookeeper.hurt = true;
//        zookeeper.makeBandage();

        Cats lion = new Cats();
        Cats tiger = new Cats();
        Hypo hypo = new Hypo();
        Squirrels squirrelS = new Squirrels();
        Squirrels squirrelL = new Squirrels();

//        System.out.println(zookeeper.hurt);
//        lion.bite(zookeeper);
//        System.out.println(zookeeper.hurt);

        squirrelL.goOut();
        veterinarian.watch(squirrelL);

    }
}
