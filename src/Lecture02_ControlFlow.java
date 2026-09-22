public class Lecture02_ControlFlow {

    public static void main(String[] args) {
        int month = 5;
        String season = switch (month) {
            case 1, 2, 3 -> "spring";
            case 4, 5, 6 -> "summer";
            case 7, 8, 9 -> "fall";
            case 10, 11, 12 -> "winter";
            default -> "else";

    }



        }
        //explain back priompt
        //okay so the do while loop executes the first itieration whther the condition is flase or true it doesnt care so thats wehat gurantess that there will always be an iteration done
    }
}
