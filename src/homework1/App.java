package homework1;

import java.util.ArrayList;

import static homework1.Difficulty.*;

public class App {
    public static void main(String[] args) {

        // Создаем полосу препятствий
        Course c = new Course(new Barrier[]{
                new Barrier(LOW),
                new Barrier(MEDIUM),
                new Barrier(HIGH),
                new Barrier(CHUCK_NORRIS)
        });

        // Создаем команду
        Team team = new Team("Dream Team",
                new TeamMember[]{
                        new TeamMember("Martin", LOW),
                        new TeamMember("Justin", HIGH),
                        new TeamMember("Kate", MEDIUM),
                        new TeamMember("Chuck", CHUCK_NORRIS),
                });

        // Просим команду пройти полосу
        ArrayList<TeamMember> passed = c.doIt(team);

        // Показываем результаты
        team.printContestResults(passed);
    }
}
