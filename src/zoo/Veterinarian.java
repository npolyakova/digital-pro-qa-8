package zoo;

//1) Обходит каждое животное и проверяет его здоровье
//2) Помещает в карантин, изолируя от других животных
//3) возвращает животное в обычный вольер

public class Veterinarian extends Human {

    @Override
    void lunch() {
        if (hungry) {
            System.out.println("Ветеринар пообедал");
            hungry = false;
        } else {
            System.out.println("Ветеринар ещё не голоден");
        }
    }
    @Override
    void makeBandage() {
        if (hurt) {
            System.out.println("Ветеринар наложил себе повязку");
            hurt = false;
        } else {
            System.out.println("Ветеринара не кусали");
        }
    }

    public void checkHealth(Animal animal) {
        if (!animal.healthy) {
            animal.cage = "";
            System.out.println("");
        }
        if (animal.cage == "" && animal.healthy) {
            animal.cage = "";
            System.out.println("");
        }
    }

    public Veterinarian() {
        profession = "Ветеринар";
    }
}
