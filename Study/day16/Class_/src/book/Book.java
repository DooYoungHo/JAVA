package book;

public class Book {
    // Create a new class called Book
    // Create three instances
    // Art of computer programming - instance
    // Effective Java - instance
    // Clean Code - instance

    private String name;
    private int numOfCopies;

    // 기본 생성자
    public Book() {

    }

    // 조건 생성자
    public Book(String bookName) {
        this.name = bookName;
    }

    // Setter
    public void setNumOfCopies(int copy) {
        if (copy >0)
            this.numOfCopies = copy;
    }

    // Getter
    public int getNumOfCopies() {
        return numOfCopies;
    }

    public void increaseNumOfCopies(int increaseNum) {
        setNumOfCopies(increaseNum + numOfCopies);
    }

    public void decreaseNumOfCopies(int decreaseNum) {
        setNumOfCopies(numOfCopies - decreaseNum);
    }
}
