package zoo;

//1) Кормит всех животных
//2) Вычесывает кошачьих
//3) Меняет бегемоту воду

public class Zookeeper extends Human {
    @Override
    void lunch() {
        if (hungry) {
            System.out.println("Смотритель пообедал");
            hungry = false;
        } else {
            System.out.println("Смотритель ещё не голоден");
        }
    }

    @Override
    void makeBandage() {
        if (hurt) {
            System.out.println("Смотритель наложил себе повязку");
            hurt = false;
        } else {
            System.out.println("Смотрителя не кусали");
        }
    }

    public Zookeeper() {
        profession = "Смотритель";
    }
}
