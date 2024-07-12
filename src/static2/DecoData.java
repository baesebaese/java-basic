package static2;

public class DecoData {

    private int instanceValue;
    private static int staticValue;

    public static void statcCall() {
        staticValue++; // 정적 변수 접근
        staticMethod(); // 정적 메서드 접근

       // instaceValue++;// 인스턴스 변수 접근
       // instanceMethod();

    }

    public void instanceCall() {
        staticValue++; // 정적 변수 접근
        staticMethod(); // 정적 메서드 접근

        instanceValue++;
        instanceMethod();
    }

    private void instanceMethod() {
        System.out.println("instasValue= " + instanceValue);
    }

    private static void staticMethod() {
        System.out.println("staticValue= " + staticValue);
    }

}