package book;

import review.Review;

import java.util.ArrayList;

public class Book {
    private final int id;
    private final String name;
    private final String author;
    private ArrayList<Review> reviews = new ArrayList<>();

    public Book(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public void addReview(Review review) {
        reviews.add(review);
    }

    public String toString() {
        return String.format("Id - [%d], name - [%s], author - [%s], review - [%s]",
                id, name, author, reviews);
    }
}
