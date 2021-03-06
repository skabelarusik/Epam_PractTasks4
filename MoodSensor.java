package PractTasks5;
import java.util.Random;

/* Напишите программу «Mood Sensor» (эмулировать датчика настроения), кото-
*  рая «залазит» в душу пользователя и определяет его настроение в текущий
*
*  момент времени. Приложение будет генерировать случайное число, в зави-
*  симости от значения которого на экран выводится одно из псевдографических
*  «лиц», которое и будет отображать настроение пользователя. */

public class MoodSensor {
    public static void main(String[] args) {
      chooseMood.choose();
    }
}

class chooseMood{

    public static void choose(){
        Random random = new Random();
        int a = random.nextInt(5);

        String mood = selectMood(a);

        System.out.println("Guys mood is " + mood);
    }

    private static String selectMood(int a){
        String mood = null;

        switch (a){
            case 0 : mood = "Happy"; break;
            case 1 : mood = "Unhappy"; break;
            case 2 : mood = "Angry"; break;
            case 3 : mood = "Miss"; break;
            case 4 : mood = "Sad"; break;
            case 5 : mood = "Worry";
        }

        return mood;
    }


}
