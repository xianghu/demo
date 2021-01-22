import org.joda.time.DateTime;

public class Demo7 {

    public static void main(String[] args) {
        DateTime replyTime = new DateTime();
        System.out.println("reply time: " + replyTime.toString());

        setExpireTimeJoda(replyTime);
        System.out.println("reply time: " + replyTime.toString());
    }

    private static void setExpireTimeJoda(DateTime datetime) {
        // order expire in 30 min
        datetime = datetime.plusMinutes(30);
        // do something
    }
}