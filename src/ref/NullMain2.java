package ref;

public class NullMain2 {
    public static void main(String[] args) {
        //Data data = null; //nullPointerException 발생
        Data data = new Data();
        data.value = 10;
    }
}
