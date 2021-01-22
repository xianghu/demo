public class Demo2 {

    public static void main(String[] args) {
        int distance = 12000;

        System.out.println("2 person: " + getSuggestPrice(distance, 2));
        System.out.println("3 person: " + getSuggestPrice(distance, 3));
    }

    /**
     *
     * @param distance distance in meter
     * @param personNum
     * @return
     */
    private static double getSuggestPrice(int distance, int personNum) {
        double rate = 1.0;
        if (personNum >= 3) {
            rate = 1.2;
        }

        return  (1.0 * distance/1000.0) * rate;
    }
}