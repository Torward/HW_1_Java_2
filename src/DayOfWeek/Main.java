package DayOfWeek;

import static DayOfWeek.DayOfWeek.MONDAY;
import static DayOfWeek.DayOfWeek.SATURDAY;

public class Main {
    public static void main(String[] args) {
        //DayOfWeek d = SATURDAY;
         //System.out.println(d.getWorkingHours());
         for(DayOfWeek d: DayOfWeek.values()){
            if(!d.isWorkingDay()){
                System.out.println("Сегодня выходной!");
            }else {
                System.out.println("Сегодня " + d + ", рабочих часов до конца недели осталось " + d.getWorkingHours() );
            }
        }
    }
    }
