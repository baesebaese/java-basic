package poly.ex4;

public class Dog implements interfaceAnimal {

    @Override
    public void sound() {
        System.out.println("멍멍");
    }

    @Override
    public void move() {
        System.out.println("댕댕이 이동");
    }
}