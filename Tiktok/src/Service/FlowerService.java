package Service;

import Entities.Flower;

import java.util.Scanner;

public class FlowerService {
    public Flower inputFlower(Scanner scanner){
        System.out.println("mời bạn nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("mời bạn nhập email: ");
        String email = scanner.nextLine();
        System.out.println("mời bạn nhập lượt like: ");
        int numberOfLike = Integer.parseInt(scanner.nextLine());
        return new Flower(name,email,numberOfLike);
    }
}
