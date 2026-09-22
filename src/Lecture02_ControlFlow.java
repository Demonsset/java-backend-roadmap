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