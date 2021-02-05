package HumanCatAndRobot.Obstacle;

import HumanCatAndRobot.Entities.Opportunitieable;

@FunctionalInterface
public interface Obstacleable {
    boolean obstacle(Opportunitieable c);
}
