public class TestDate {
    public static void main(String[] args) {
        
        Date date = new Date(15, 3, 2020);

        System.out.println("");
       
        System.out.println("initial Date: " + date.toString());

        
        date.setYear(2021);
        date.setMonth(4);
        date.setDay(16);

        System.out.println("");
        System.out.println("Date After Update: " + date.toString());
    }
}