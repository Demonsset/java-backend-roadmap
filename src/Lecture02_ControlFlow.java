public class Lecture02_ControlFlow {

    public static void main(String[] args) {
        int month = 5;
        String season = switch (month) {
            case 1, 2, 3 -> "spring";
            case 4, 5, 6 -> "summer";
            case 7, 8, 9 -> "fall";
            case 10, 11, 12 -> "winter";
            default -> "else";


        };
        //②Parsons
        int day = 2;
        String name = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            default -> "else";
        };
// Faded Build
        int day2 = 2;
        switch (day2) {
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
            default:
                System.out.println("Other");
        }
        ;
//Buggy Code Hunt
//okay so for the output it will be 2 and 3 cuz the student missed the break in case 2 and it would start from case 2 alll the way till case 3
        //cold build
        int day3 = 4;
        String result = switch (day3) {
            case 1, 2, 3, 4, 5 -> "weekday";
            case 6, 7 -> "weekend";
            default -> "else";

        };
        System.out.println(result);
        //⑥ Explain-Back Prompt
        //okay so first of all the arrow is less sytax required so it would decrease the eror percentage that could happen (talking here about th break syntax) and secondly its more elegant and has clearer visibilty which increases the clean code %
        for(int i=10;i>0;i--){
            System.out.println(i);
        }
        int u = 10;
        while(u>0){
            System.out.println(u);
u--;
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        for (int i = 0; i <= 10; i++) {
            if (i % 2 != 0){
                continue;
            }
            System.out.println(i);
        }
        //int i = 0;
        //while (i < 5) {
        //    System.out.println(i);
        //}
        //this one right here has nopt stopping condition so it w8ill js keep prionting 0 till infinity cuz nothing is gonnna make the conditiuoon false so we need to change then i value
        //cold build
        int []students={23,54,60,100};
        for(int scores :students){
            if(scores>=60){
                System.out.println("pass");}
                else{
                    System.out.println("fail");
                }

        }
        //explain back priompt
        //okay so the do while loop executes the first itieration whther the condition is flase or true it doesnt care so thats wehat gurantess that there will always be an iteration done
    }
}
