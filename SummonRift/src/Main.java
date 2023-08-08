import Entities.Figure;
import Entities.Team;
import Service.ServiceFigure;
import Service.ServiceTeam;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ServiceTeam serviceTeam = new ServiceTeam();
        ArrayList<Team> teams =new ArrayList<>();
        for (int i =0; i<2; i++){
            System.out.println("mời bạn nhập tên team "+(i+1));
            ServiceFigure serviceFigure = new ServiceFigure();
            ArrayList<Figure> figures = new ArrayList<>();
            Team team = serviceTeam.team(scanner,serviceFigure,figures);
            teams.add(team);
            System.out.println("----------------------");
        }
        System.out.println(teams);
    }
}