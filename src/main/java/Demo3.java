import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo3 {

    public static void main(String[] args) {
        String moneyString = getPriceTextFromUI();
        BigDecimal money;

        try {
            money = new BigDecimal(moneyString);
        } catch (Exception e) {
            money = new BigDecimal(0);
        }

        System.out.println("money string: " + moneyString);
        System.out.println("money: " + money);
    }

    private static String getPriceTextFromUI() {
        BigDecimal money = new BigDecimal("12.3");
        // wrong: depends on system locale
        String moneyString = NumberFormat.getCurrencyInstance().format(money);

//        String moneyString = NumberFormat.getCurrencyInstance(Locale.CHINA).format(money);
        return filter(moneyString);
    }

    /**
     * filter out currency symbol
     *
     * @param string money string
     * @return
     */
    private static String filter(String string) {
        String patternStr = "[1-9]";
        Pattern pattern = Pattern.compile(patternStr);
        Matcher matcher = pattern.matcher(string);
        int index = 0;
        if (matcher.find()) {
            index = matcher.start();
        }

        return string.substring(index);
    }
}