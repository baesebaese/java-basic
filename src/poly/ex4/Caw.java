package poly.ex4;

public class Caw implements interfaceAnimal{
    @Override
    public void sound() {
        System.out.println("음메");
    }

    @Override
    public void move() {
        System.out.println("집으로 이동");
    }
}