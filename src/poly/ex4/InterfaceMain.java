package poly.ex4;

import poly.ex3.AbstractAnimal;

public class InterfaceMain {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Caw caw = new Caw();
        Cat cat = new Cat();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);

    }

    public static void soundAnimal(interfaceAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

}