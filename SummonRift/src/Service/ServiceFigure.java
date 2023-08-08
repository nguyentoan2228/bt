package Service;
import Entities.Figure;
import java.util.ArrayList;
import java.util.Scanner;

public  class ServiceFigure {
    public Figure figure(Scanner scanner) {
        System.out.println("mời baạn nhập tên");
        String name = scanner.nextLine();
        System.out.println("mời bạn nhập vị tri: ");
        String position = scanner.nextLine();
        return new Figure(name, position);
    }
}