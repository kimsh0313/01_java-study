package section02.string;

public class Practice2 {
    public static void main(String[] args) {
        String shopCsv = "1,맘스쿡,광주광역시 동구 동계천로143,062-233-1233,향토맛집,2022-01-11\n"
                + "2,옛날밥상,광주광역시 남구 용대로119번길 6,062-653-7337,향토맛집,2022-01-11\n"
                + "3,송정떡갈비,광주광역시 광산구 광산로29번길 1,062-944-1439,향토맛집,2022-01-11\n"
                + "4,홍춘이,광주광역시 북구 무등로180번길 9-18,062-521-7733,향토맛집,2022-01-11\n"
                + "5,종가집떡갈비,광주광역시 광산구 상무대로 226,062-943-8282,향토맛집,2022-01-11\n"
                + "6,광신보리밥,광주광역시 북구 두리봉길 2-1(두암동),062-264-1811,향토맛집,2022-01-11\n"
                + "7,조선옥,광주광역시 남구 효덕로 103,062-654-3322,한상맛집,2022-01-11\n"
                + "8,송원회관,광주광역시 북구 경양로135번길 29(신안동),062-529-3250,한상맛집,2022-01-11\n"
                + "9,만선당어부의밥상,광주광역시 광산구 수완로11번길 3,062-955-5595,한상맛집,2022-01-11\n"
                + "10,백년미가(유촌점),광주광역시 서구 유덕로28번길 18,062-946-3392,한상맛집,2022-01-11";

        String[] shopData = shopCsv.split("\n");

        Shop[] shop = new Shop[shopData.length];

        for (int i = 0; i < shopData.length; i++) {
            String[] data = shopData[i].split(",");
            int shopId = Integer.parseInt(data[0]);
            String shopName = data[1];
            String shopAddress = data[2];
            String shopPhone = data[3];
            String shopCategory = data[4];
            String shopCreateDate = data[5];
            shop[i] = new Shop(shopId, shopName, shopAddress, shopPhone, shopCategory, shopCreateDate);
        }

        for (int i = 0; i < shop.length; i++) {
            System.out.println(shop[i]);
        }
    }
}
