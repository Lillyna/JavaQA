package homework1;

public class TeamMember {

    private final String name;
    private final Difficulty maxDifficulty;

    public TeamMember(String name, Difficulty difficulty) {
        this.name = name;
        this.maxDifficulty = difficulty;
    }

    @Override
    public String toString() {
        return name;
    }

    public boolean tryBarrier(Barrier barrier) {
        return this.maxDifficulty.getLevel() >= barrier.getDifficulty().getLevel();
    }
}
