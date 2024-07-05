package oop1.ex2;

public class Account {
    int balance; //잔액

    //입금 메서드
    void deposit(int amount) {
        balance += amount;
    }

    void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("잔액부족");
        }
    }
}
