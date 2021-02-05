package HumanCatAndRobot.Entities;

import HumanCatAndRobot.Entities.Opportunitieable;

public class Robot implements Opportunitieable {
    private int robotRun;
    private int robotJump;

    public Robot(int robotRun, int robotJump) {
        this.robotRun = robotRun;
        this.robotJump = robotJump;
    }


    @Override
    public boolean jump(int dist) {
        if(dist <= robotJump) {
            System.out.println("Робот успешно преодолевает высоту " + dist + " м.");
            return true;
        } else {
            System.out.println("Робот не смог преодолеть высоту" + dist + "м.");
            return false;
        }
    }

    @Override
    public boolean run(int dist){
        if (dist <= robotRun) {
            System.out.println("Робот успешно пробежать дистанцию " + dist + " км.");
            return true;
        } else {
            System.out.println("Роботу не удаёться пробежать" + dist + " км.");
            return false;
        }
    }
}
