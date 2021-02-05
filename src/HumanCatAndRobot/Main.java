package HumanCatAndRobot;
import HumanCatAndRobot.Entities.Cats;
import HumanCatAndRobot.Entities.Human;
import HumanCatAndRobot.Entities.Opportunitieable;
import HumanCatAndRobot.Entities.Robot;
import HumanCatAndRobot.Obstacle.Obstacleable;
import HumanCatAndRobot.Obstacle.Treadmill;
import HumanCatAndRobot.Obstacle.Wall;

public class Main {
    public static void main(String[] args) {
        Opportunitieable[] opportunitieables = {
                new Human(42, 2),
                new Cats(58, 3),
                new Robot(200, 4)
        };
        Obstacleable[] obstacleables = {
                new Wall(3),
                new Treadmill(52)
        };
        for(Opportunitieable op: opportunitieables){
            for (Obstacleable ob: obstacleables){
                if(!ob.obstacle(op)){
                    break;
                }


            }
        }
    }

}
