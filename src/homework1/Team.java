package homework1;

import java.util.ArrayList;
import java.util.Arrays;

public class Team {
    private final String name;
    private final TeamMember[] members;

    public Team(String name, TeamMember[] members) {
        this.name = name;
        this.members = members;
    }

    /**
     * Метод для вывода информации о членах команды, прошедших дистанцию.
     *
     * @param passed: массив участников
     */
    public void printContestResults(ArrayList<TeamMember> passed) {
        for (TeamMember teamMember : passed) {
            System.out.println(String.format("%s прошел дистанцию", teamMember.toString()));
        }

    }

    /**
     * Метод вывода информации обо всех членах команды.
     *
     * @return название команды, имена участников
     */
    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", members=" + Arrays.toString(members) +
                '}';
    }

    public TeamMember[] getMembers() {
        return members;
    }
}
