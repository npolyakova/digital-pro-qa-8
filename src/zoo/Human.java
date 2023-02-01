package zoo;

import java.util.Objects;

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
        if (Objects.equals(squirrel.cage, "вне вольера")) {
            System.out.println(this.profession + " поймал белку");
            squirrel.cage = "в вольере";
        } else {
            System.out.println(this.profession + " убедился, что белка Стрелка на месте");
        }
    }

    abstract void makeBandage();

}
