package zoo;

public abstract class Human {

    //Может быть голодным и покусанным

    //4) Обедает
    //5) Следит за белками
    //6) должен наложить себе повязку

    boolean hungry; //false

    boolean hurt; //false

    String profession;

    abstract void lunch();

    void watch(Squirrels squirrel) {
        if (squirrel.cage == "вне вольера") {
            System.out.println("Белка поймана");
            squirrel.cage = "в вольере";
        } else {
            System.out.println("Белка на месте");
        }
    }

    abstract void makeBandage();

}
