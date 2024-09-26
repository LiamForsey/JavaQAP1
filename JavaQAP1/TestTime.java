public class TestTime {
    public static void main(String[] args) {
        Time t1 = new Time(22, 7, 12);
        Time t2 = new Time(17, 20, 10);

        System.out.println("");
        System.out.println("Start Times:");
        System.out.println("Time 1: " + t1);
        System.out.println("Time 2: " + t2);

        t1.nextSecond();
        t2.previousSecond();

        System.out.println("\nNew Times for Time 1 & 2:");
        System.out.println("Time 1: " + t1);
        System.out.println("Time 2: " + t2);
    }
   
}

