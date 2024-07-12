package static2.ex2;

public class MathArrayUtils {

    private MathArrayUtils() {
        //인스턴스 생성을 막기 위함
    }

    public static int sum(int[] values) {
        int result = 0;
        for (int value : values) {
            result += value;
        }

        return result;
    }

    public static double average(int[] values) {
        return (double) sum(values)/values.length;
    }

    public static int min(int[] values) {
        int result = values[0];
        for (int value : values) {
            if (value < result) {
                result = value;
            }
        }

        return result;
    }

    public static int max(int[] values) {
        int result = values[0];
        for (int value : values) {
            if (value > result) {
                result = value;
            }
        }

        return result;
    }

}