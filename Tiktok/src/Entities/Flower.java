package Entities;

public class Flower extends Member{
    private int numberOfLike;
    private static int auId;
    private int id;


    public Flower(String name, String email, int numberOfLike) {
        super(name, email);
        this.numberOfLike = numberOfLike;
        this.id = ++auId;
    }

    public int getNumberOfLike() {
        return numberOfLike;
    }

    public void setNumberOfLike(int numberOfLike) {
        this.numberOfLike = numberOfLike;
    }

    public static int getAuId() {
        return auId;
    }

    public static void setAuId(int auId) {
        Flower.auId = auId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "flower: "+ " id: " + id + super.toString() + ", lượt like: " + numberOfLike;
    }

}
