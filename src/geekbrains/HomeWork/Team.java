package geekbrains.HomeWork;

import java.util.Arrays;

public class Team {

    private String teamName;
    private String []teamPersonalName;
    public int score;


    public Team (String teamName, String []teamPersonalName) {
        this.teamName = teamName;
        this.teamPersonalName = teamPersonalName;
    }


    public String[] getTeamPersonalName() {
        return teamPersonalName;
    }

    public void teamMember(){
        System.out.println(Arrays.toString(teamPersonalName));
    }

    public void result (String []course){
        for (int i = 0; i < teamPersonalName.length; i++){
            score= 0;
            for (int j = 0; j < course.length; j++){
                    score++;
            }
            if (score == course.length)
            System.out.println("участник по имени " + teamPersonalName[i] + " из команды '" + teamName + "' полностью прошёл дистанцию, пройдя " + score + " припятствий(я)");
        }
    }



}
