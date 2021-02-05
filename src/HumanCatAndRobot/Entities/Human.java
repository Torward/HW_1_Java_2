package HumanCatAndRobot.Entities;

import HumanCatAndRobot.Entities.Opportunitieable;

public class Human implements Opportunitieable {
    private int humanRun;
    private int humanJump;

    public Human(int humanRun, int humanJump) {
        this.humanRun = humanRun;
        this.humanJump = humanJump;
    }

    @Override
    public boolean jump(int dist) {
        if (dist <= humanJump) {
            System.out.println("Человек прыгает на " + dist + " м.");
            return true;
        } else {
            System.out.println("Человек не смог перепрыгнуть припятствие высотой "+ dist + " м.");
            return false;
        }
    }

    @Override
    public boolean run(int dist) {
        if (dist <= humanRun) {
            System.out.println("Человек прыгает на " + dist + " м.");
            return true;
        } else {
            System.out.println("Человек не смог перепрыгнуть припятствие высотой "+ dist + " м.");
            return false;
        }
    }
}