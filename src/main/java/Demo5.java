public class Demo5 {

    public static void main(String[] args) {
        // 北京 id 1
        System.out.println(onAirDisabled("1"));
        // 天津 id 37
        System.out.println(onAirDisabled("37"));
    }

    private static boolean onAirDisabled(String cityId) {
        return getOnAirDisableCities().contains(cityId);
    }

    private static String getOnAirDisableCities() {
        return "37";  // 天津
    }
}