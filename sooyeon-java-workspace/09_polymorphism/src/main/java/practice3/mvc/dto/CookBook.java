package practice3.mvc.dto;

public class CookBook extends Book {
    private boolean coupon;

    public CookBook() {
    }

    public CookBook(String title, String author, String publisher, boolean coupon) {
        super(title, author, publisher);
        this.coupon = coupon;
    }

    /**
     * 쿠폰을 내부에서 직접 정용하게? 아니면 유무확인ㅁ나하고 ?외부에?
     *
     * @return
     */

    public void updateUserCoupon(Member member) {
        if (coupon) {
            member.updateCouponCount(1);
        }
    }

    @Override
    public String toString() {
        return "CookBook{" +
                super.toString() +
                "coupon=" + coupon +
                '}';
    }

}
