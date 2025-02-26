package section02.string;

public class Shop {
    private int id;
    private String name;
    private String address;
    private String phone;
    private String category;
    private String createdAt;

    public Shop() {
    }

    public Shop(int id, String name, String address, String phone, String category, String createdAt) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.category = category;
        this.createdAt = createdAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", category='" + category + '\'' +
                ", createdAt='" + createdAt + '\'' +
                '}';
    }
}
