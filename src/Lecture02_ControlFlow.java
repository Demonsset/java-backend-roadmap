public class Lecture02_ControlFlow {
    public static void main(String[] args) {
int x=3;
switch (x){
    case 1: {
        System.out.println("Summer");
        break;
    }
    case 2: {
        System.out.println("Winter");
        break;
    }
    case 3: {
        System.out.println("Autumn");
    }
    case 4: {
        System.out.println("spring");
        break;
    }
}

        int count = 1;
        while (count <= 5) {
            System.out.println(count);
        count++;
        }
        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }


        //int attempts = 0;
        //do {
        //    attempts++;
        //    System.out.println("Attempt " + attempts);
        //} while (attempts < 0); so here the devolper didnt pay close attention that the do while executes the first iteeration whther or not the condition is met so it will print attempt 1  and stop


        String [] names={"Ahmed","Heas","kitagaw","demonsset"};
for(String name:names){
    switch(name.length()){
        case 5,7-> System.out.println("medium");
        case 1,2,3,4-> System.out.println("short");
        default-> System.out.println("long");
    }
}












    }
}