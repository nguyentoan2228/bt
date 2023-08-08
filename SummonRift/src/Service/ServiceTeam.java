package Service;

import Entities.Figure;
import Entities.Team;

import java.util.ArrayList;
import java.util.Scanner;

public class ServiceTeam {
    public Team team(Scanner scanner, ServiceFigure serviceFigure, ArrayList<Figure> figures){
        System.out.println("mời bạn nhập ten team: ");
        String teamName = scanner.nextLine();
        for (int i = 0; i<3; i++){
            System.out.println("tuong thứ" +(i+1));
            Figure figure = serviceFigure.figure(scanner);
            figures.add(figure);
        }
        Team team = new Team(teamName,figures);
        return team;
    }
}
