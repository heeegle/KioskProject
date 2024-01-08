// 부모
public class Menu {
    String menuName; // 메뉴 이름
    String menuDesc; // 메뉴 설명

    public String getMenuName() {
        return menuName;
    }
    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }
    public String getMenuDesc() {
        return menuDesc;
    }
    public void setMenuDesc(String menuDesc) {
        this.menuDesc = menuDesc;
    }
    public Menu(String menuName, String menuDesc) {
        this.menuName = menuName;
        this.menuDesc = menuDesc;
    }
}








