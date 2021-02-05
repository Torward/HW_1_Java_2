package HumanCatAndRobot.Obstacle;

import HumanCatAndRobot.Entities.Opportunitieable;

public class Treadmill implements Obstacleable {
    private  int dist;
    public Treadmill(int dist) {
        this.dist = dist;
    }

    @Override
    public boolean obstacle(Opportunitieable c) {
        return c.run(dist);
    }
}

