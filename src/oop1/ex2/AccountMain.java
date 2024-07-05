package oop1.ex2;

public class AccountMain {

    public static void main(String[] args) {
        Account account = new Account();

        // 10000원 입금
        account.deposit(10000);

        //9000원 출금
        account.withdraw(9000);
        //2000원 출금
        //잔액부족 시 메시지 출력
        account.withdraw(2000);

        System.out.println("잔고: " + account.balance);
    }
}
