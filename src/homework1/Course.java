package homework1;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private final Barrier[] barriers;

    public Course(Barrier[] barriers) {
        this.barriers = barriers;
    }

    /**
     * Метод, который будет просить команду пройти всю полосу.
     *
     * @param team команда
     */
    public ArrayList<TeamMember> doIt(Team team) {
        ArrayList<TeamMember> passed = new ArrayList<>(List.of(team.getMembers()));
        for (TeamMember teamMember : team.getMembers()) {
            for (Barrier barrier : barriers) {
                if (!teamMember.tryBarrier(barrier)) {
                    passed.remove(teamMember);
                    break;
                }
            }

        }
        return passed;
    }
}
