package demo;

public class Tools implements Behavior {

    @Override
    public boolean clean() {
        System.out.println("Вымыт(а)");
        return true;
    }
}
