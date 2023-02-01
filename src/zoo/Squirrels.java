package zoo;

import java.util.Objects;

public class Squirrels extends Animal {

    public Squirrels(String name) {
        super(name);
    }

    public void goOut() {
        if (Objects.equals(this.name, "Стрелка")) {
            cage = "вне вольера";
            System.out.println("Стрелка сбежала");
        }
    }
}
