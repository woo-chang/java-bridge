package bridge.model;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private final List<Direction> directions = new ArrayList<>();
    private int attempt = 1;

    public void attempt() {
        attempt += 1;
    }

    public void move(Direction direction) {
        directions.add(direction);
    }

    public int getAttempt() {
        return attempt;
    }

    public List<Direction> getDirections() {
        return new ArrayList<>(directions);
    }

}