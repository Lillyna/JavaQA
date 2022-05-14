package homework1;

public enum Difficulty {
    LOW(5),
    MEDIUM(10),
    HIGH(15),
    CHUCK_NORRIS(100500);
    private final int level;

    Difficulty(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }
}
