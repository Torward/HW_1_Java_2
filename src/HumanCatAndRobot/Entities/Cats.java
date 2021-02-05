package HumanCatAndRobot.Entities;

import HumanCatAndRobot.Entities.Opportunitieable;

public class Cats implements Opportunitieable {
    private int catRun;
    private int catJump;

    public Cats(int catRun, int catJump) {
        this.catRun = catRun;
        this.catJump = catJump;
    }


    @Override
    public boolean jump(int dist) {
        if (dist <= catJump) {
            System.out.println("Кот прыгает на " + dist + " м.");
            return true;
        } else {
            System.out.println("Кот не смог перепрыгнуть припятствие высотой "+ dist + " м.");
            return false;
        }
    }

    @Override
    public boolean run(int dist) {
        if (dist <= catRun) {
            System.out.println("Кот прробежал дистанцию " + dist + " км.");
            return true;
        }else {
            System.out.println("Кот не смог пробежать дистанцию длинной" + dist + " км.");
            return false;
        }
    }
}
