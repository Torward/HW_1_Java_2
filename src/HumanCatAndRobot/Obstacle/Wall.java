package HumanCatAndRobot.Obstacle;

import HumanCatAndRobot.Entities.Opportunitieable;

public class Wall implements Obstacleable {
    private int height;

    public Wall(int high) {
        this.height = high;
    }

    @Override
    public boolean obstacle(Opportunitieable c) {
        return c.jump(height);
    }



}
