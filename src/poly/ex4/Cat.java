package poly.ex4;

public class Cat implements interfaceAnimal{
    @Override
    public void sound() {
        System.out.println("냐옹");
    }

    @Override
    public void move() {
        System.out.println("냥이 이동");
    }
}