public class Main {
    public static void main(String[] args) {
        System.out.println("\"SHAKESHACK BURGER 에 오신걸 환영합니다.\"");
        System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.");
        System.out.println();
        System.out.println("[ SHAKESHACK MENU ]");

        Menu menu1 = new Menu("Burgers", "앵거스 비프 통살을 다져만든 버거");
        Menu menu2 = new Menu("Forzen Custard", "매장에서 신선하게 만드는 아이스크림");
        Menu menu3 = new Menu("Drinks", "매장에서 직접 만드는 음료");
        Menu menu4 = new Menu("Beer", "뉴욕 브루클린 브루어리에서 양조한 맥주");


    }
}