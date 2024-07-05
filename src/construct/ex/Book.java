package construct.ex;

public class Book {
    String title; // 제목
    String author; // 저자
    int page; // 페이지 수

    // TODO : 코드를 완성하세요.

    Book() {
        this("","",0);
    }

    Book(String title, String author) {
        this(title, author, 700);
    }

    Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }

    void displayInfo() {
        System.out.println("title = "+ this.title + ", author = "+ this.author + ", page = "+ this.page);
    }

}
