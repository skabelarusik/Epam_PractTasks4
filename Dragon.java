package PractTasks5;

public class Dragon {
    public static void main(String[] args) {
        System.out.println(CountHead.countHeads(9999));
    }
}

class CountHead{
    private static final int FIRST_PERIOD = 200;
    private static final int SECOND_PERIOD = 100;
    private static final int FIRST_PERIOD_HEADS = 3;
    private static final int SECOND_PERIOD_HEADS = 2;
    private static final int THIRD_PERIOD_HEADS = 1;
    private static final int START_HEADS = 3;

    public static int countHeads(int a){
        int heads = -1;


        if(a > 0){
            if(a <= FIRST_PERIOD){
                heads = START_HEADS + a * FIRST_PERIOD_HEADS;
            } else{
                if(a <= SECOND_PERIOD + FIRST_PERIOD){
                    heads = START_HEADS + FIRST_PERIOD_HEADS * FIRST_PERIOD + SECOND_PERIOD_HEADS * (a - FIRST_PERIOD);
                } else{
                    heads = START_HEADS + FIRST_PERIOD * FIRST_PERIOD_HEADS + SECOND_PERIOD_HEADS * SECOND_PERIOD +
                            THIRD_PERIOD_HEADS * (a - FIRST_PERIOD - SECOND_PERIOD);
                }
            }
        }

        return heads;
    }
}
