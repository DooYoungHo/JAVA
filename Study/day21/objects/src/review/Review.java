package review;

public class Review {
    private int id;
    private String impression;
    private int rating;

    public Review(int id, String impression, int rating) {
        this.id = id;
        this.impression = impression;
        this.rating = rating;
    }

    public String toString() {
        return id + " " + impression + " " + rating;
    }
}
