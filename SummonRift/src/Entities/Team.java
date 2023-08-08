package Entities;

import java.util.ArrayList;

public class Team {
    private String teamName;
    private ArrayList<Figure> figures;

    public Team(String teamName, ArrayList<Figure> figures) {
        this.teamName = teamName;
        this.figures = figures;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public ArrayList<Figure> getFigures() {
        return figures;
    }

    public void setFigures(ArrayList<Figure> figures) {
        this.figures = figures;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Team: ").append(teamName).append("\n");
        sb.append("Danh sách tướng:\n");
        for (Figure figure : figures) {
            sb.append("Tên tướng: ").append(figure.getName()).append(", Vị trí: ").append(figure.getPosition()).append("\n");
        }
        return sb.toString();
    }
}
