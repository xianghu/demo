public class Demo1 {

    public static void main(String[] args) {
        Long rideId1 = getRideIdFromDB();
        Long rideId2 = getRideIdFromCache();

        if (rideId1 == rideId2) {
            System.out.println("Surprice!");
        } else {
            System.out.println("Oops!");
        }
    }

    private static long getRideIdFromDB() {
        return 128;
    }

    private static long getRideIdFromCache() {
        return 128;
    }
}