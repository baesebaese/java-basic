package access.ex;

public class MaxCounter {
    private int count =0;
    private int max;


    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment() {
        if(!isValidCount()) {
            System.out.println("최대갓을 초과할 수 없습니다. ");
            return;
        }

        count++;
    }

    private boolean isValidCount() {
        return count < max;
    }

    public int getCount() {
        return count;
    }

}
