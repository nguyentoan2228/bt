package Service;

import Entities.Flower;
import Entities.Idol;

import java.util.ArrayList;
import java.util.Scanner;

public class IdolService {
    public Idol inputIdol(Scanner scanner, FlowerService flowerService, ArrayList<Flower> flowers){
        System.out.println("mời bạn nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("mời bạn nhập email: ");
        String email = scanner.nextLine();
        System.out.println("mời bạn nhập số lượng người flower: ");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n ; i++){
            Flower flower = flowerService.inputFlower(scanner);
            flowers.add(flower);
        }
        System.out.println("mời bạn nhập group: ");
        String group = scanner.nextLine();
        Idol idol = new Idol(name,email,flowers,group);
        return idol;
    }
}
