package class1.ex;

public class MovieReviewMain1 {
    public static void main(String[] args) {
        MovieReview inception = new MovieReview();
        inception.title = "인셉션";
        inception.review = "인생은 무한루프";

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "어바웃타임";
        aboutTime.review = "인생 시간 영화 ";

        MovieReview[] movieReviews = {inception, aboutTime};

        for (MovieReview a : movieReviews) {
            System.out.println("영화제목: " + a.title + " 리뷰: " + a.review);
        }
    }
}
