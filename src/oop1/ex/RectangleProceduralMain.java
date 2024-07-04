package oop1.ex;

public class RectangleProceduralMain {
    public static void main(String[] args) {
        int width = 5;
        int height = 8;

    }

    static int calculateArea(int width, int height){
        return width * height;
    }

    static int calulaterArea(int width, int height) {
        return 2 *(width + height);
    }

    static boolean isSquare(int width, int height) {
        return width == height;
    }
}
