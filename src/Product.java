// 자식
public class Product extends Menu {
    int price; // 가격
    public Product(String menuName, String menuDesc, int price) {
        super(menuName, menuDesc);
        this.price = price;
    }
}