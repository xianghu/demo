import java.math.BigDecimal;

public class Demo4 {

    public static void main(String[] args) {
        System.out.println("北京: " + getReviewAward("北京"));
        System.out.println("上海: " + getReviewAward("上海"));
        System.out.println("天津: " + getReviewAward("天津"));
    }

    private static BigDecimal getReviewAward(String city) {
        BigDecimal award = new BigDecimal(0);

        switch (city) {
            case "北京":
                award = new BigDecimal(3);
            case "上海":
                award = new BigDecimal(4);
            case "天津":
                award = new BigDecimal(5);
        }

        return award;
    }
}