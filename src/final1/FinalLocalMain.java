package final1;

public class FinalLocalMain {
    public static void main(String[] args) {
        //final 지역변수
        final int data1;
        data1 = 10; // 최소 한번만 할당 가능
       // data2 = 20;

        final int data2  = 10;
        // data2 = 20;
    }

    static void method(final int parameter) {
        // 파라미터의 값을 바꿀 수 없다.
        //parameter = 20;
    }
}