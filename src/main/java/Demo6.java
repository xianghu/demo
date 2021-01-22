import java.util.Date;

public class Demo6 {

    public static void main(String[] args) {
        Date replyTime = new Date();
        System.out.println("reply time: " + replyTime.toString());

        setExpireTime(replyTime);
        System.out.println("reply time: " + replyTime.toString());
    }

    private static void setExpireTime(Date date) {
        // order expire in 30 min
        date.setMinutes(date.getMinutes() + 30);
        // do something
    }
}