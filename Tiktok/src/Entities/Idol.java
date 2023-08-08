package Entities;

import java.util.ArrayList;

public class Idol extends Member{
    private ArrayList<Flower> flowers;
    private String group;
    private static int auId;
    private int id;

    public Idol(String name, String email, ArrayList<Flower> flowers, String group) {
        super(name, email);
        this.flowers = flowers;
        this.group = group;
        this.id = ++auId;
    }

    public ArrayList<Flower> getFlowers() {
        return flowers;
    }

    public void setFlowers(ArrayList<Flower> flowers) {
        this.flowers = flowers;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public static int getAuId() {
        return auId;
    }

    public static void setAuId(int auId) {
        Idol.auId = auId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "id: " + id + super.toString() + flowers +", group: "+group +"\n";
    }


}

