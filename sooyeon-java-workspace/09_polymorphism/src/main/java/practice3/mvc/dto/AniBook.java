package practice3.mvc.dto;

public class AniBook extends Book {
    private int accessAge;

    public AniBook() {
    }

    public AniBook(String title, String author, String publisher, int accessAge) {
        super(title, author, publisher);
        this.accessAge = accessAge;
    }

    public boolean canRent(Member member) {
        return member.isRentalAvailableAge(accessAge);
    }

    @Override
    public String toString() {
        return "AniBook{" +
                super.toString() +
                "accessAge=" + accessAge +
                '}';
    }

}
