package Kiosk;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu[] menu = new Menu[6]; //객체 배열 선언
        Order order = new Order();

        for (int i = 0; i < menu.length; i++) { //객체 배열 초기화
            menu[i] = new Menu();
        }

        menu[0].setName("Burgers         ");
        menu[0].setDescription("앵거스 비프 통살을 다져만든 버거");
        menu[1].setName("Forzen Custard  ");
        menu[1].setDescription("매장에서 신선하게 만드는 아이스크림");
        menu[2].setName("Drinks          ");
        menu[2].setDescription("매장에서 직접 만드는 음료");
        menu[3].setName("Beer            ");
        menu[3].setDescription("뉴욕 브루클린 브루어리에서 양조한 맥주");
        menu[4].setName("Order       ");
        menu[4].setDescription("장바구니를 확인 후 주문합니다");
        menu[5].setName("Cancel      ");
        menu[5].setDescription("진행중인 주문을 취소합니다");

        while (true) {
            showMenu(menu, order);
        }
    }

    public static void showMenu(Menu[] menu, Order order) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\"SHACKSHACK BURGER 에 오신걸 환영합니다.\"");
        System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.\n");

        System.out.println("[ SHAKESHACK MENU ]");
        System.out.println("1. " + menu[0].getName() + "|" + menu[0].getDescription());
        System.out.println("2. " + menu[1].getName() + "|" + menu[1].getDescription());
        System.out.println("3. " + menu[2].getName() + "|" + menu[2].getDescription());
        System.out.println("4. " + menu[3].getName() + "|" + menu[3].getDescription());

        System.out.println("\n[ ORDER MENU ]");
        System.out.println("5. " + menu[4].getName() + "|" + menu[4].getDescription());
        System.out.println("6. " + menu[5].getName() + "|" + menu[5].getDescription());
        System.out.println("메뉴 선택 : ");
        int select = sc.nextInt();
        sc.nextLine();

        switch (select) {
            case 1:
                showBurgersMenu(order);
                break;
            case 2:
                showForzenCustardMenu(order);
                break;
            case 3:
                showDrinksMenu(order);
                break;
            case 4:
                showBeerMenu(order);
                break;
            case 5:
                showOrderMenu(order);
                break;
            case 6:
                orderCancel(order);
                break;
            default:
                System.out.println("입력 오류");
                break;
        }
    }

    public static void showBurgersMenu(Order order) {
        Scanner sc = new Scanner(System.in);
        Product[] burgers = new Product[5];
        for (int i = 0; i < burgers.length; i++) {
            burgers[i] = new Product();
        }
        burgers[0].setName("ShackBurger   ");
        burgers[0].setPrice(6.9);
        burgers[0].setDescription("토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        burgers[1].setName("SmokeShack    ");
        burgers[1].setPrice(8.9);
        burgers[1].setDescription("베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        burgers[2].setName("Shroom Burger ");
        burgers[2].setPrice(9.4);
        burgers[2].setDescription("몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거");
        burgers[3].setName("Cheeseburger  ");
        burgers[3].setPrice(6.9);
        burgers[3].setDescription("포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        burgers[4].setName("Hamburger     ");
        burgers[4].setPrice(5.4);
        burgers[4].setDescription("비프패티를 기반으로 야채가 들어간 기본버거");

        System.out.println("\"SHACKSHACK BURGER 에 오신걸 환영합니다.\"");
        System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.\n");
        System.out.println("[ SHAKESHACK MENU ]");
        for (int i = 0; i < burgers.length; i++) {
            System.out.println((i + 1) + ". " + burgers[i].getName() + "| W " + burgers[i].getPrice() + " |" + burgers[i].getDescription());
        }
        int select = sc.nextInt();
        sc.nextLine();
        int burgersSelect = select - 1;

        System.out.println("\"" + burgers[burgersSelect].getName() + "| W " + burgers[burgersSelect].getPrice() + " | " + burgers[burgersSelect].getDescription() + "\"");
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1. 확인        2. 취소");

        select = sc.nextInt();
        sc.nextLine();

        if (select == 1) {
            order.addOrder(burgers[burgersSelect]);
            System.out.println(burgers[burgersSelect].getName() + " 가 장바구니에 추가되었습니다.\n");
        } else if (select == 2) {
            System.out.println("장바구니 추가가 취소되었습니다.\n");
        } else System.out.println("입력 오류\n");
    }

    public static void showForzenCustardMenu(Order order) {
        Scanner sc = new Scanner(System.in);
        Product[] forzenCustard = new Product[4];
        for (int i = 0; i < forzenCustard.length; i++) {
            forzenCustard[i] = new Product();
        }
        forzenCustard[0].setName("CoffeeShake      ");
        forzenCustard[0].setPrice(6.5);
        forzenCustard[0].setDescription("로컬 로스팅 브랜드 앤트러사이트와 협업한 기간 한정 콜라보레이션 커피 쉐이크");
        forzenCustard[1].setName("ClassicShakes    ");
        forzenCustard[1].setPrice(6.5);
        forzenCustard[1].setDescription("쫀득하고 진한 커스터드가 들어간 클래식 쉐이크");
        forzenCustard[2].setName("Floats           ");
        forzenCustard[2].setPrice(6.5);
        forzenCustard[2].setDescription("부드러운 바닐라 커스터드와 톡톡 터지는 탄산이 만나 탄생한 색다른 음료");
        forzenCustard[3].setName("Cup&Cones        ");
        forzenCustard[3].setPrice(5.4);
        forzenCustard[3].setDescription("매일 점포에서 신선하게 제조하는 쫀득하고 진한 아이스크림");

        System.out.println("\"SHACKSHACK BURGER 에 오신걸 환영합니다.\"");
        System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.\n");
        System.out.println("[ SHAKESHACK MENU ]");
        for (int i = 0; i < forzenCustard.length; i++) {
            System.out.println((i + 1) + ". " + forzenCustard[i].getName() + "| W " + forzenCustard[i].getPrice() + " |" + forzenCustard[i].getDescription());
        }
        int select = sc.nextInt();
        sc.nextLine();
        int forzenCustardSelect = select - 1;

        System.out.println("\"" + forzenCustard[forzenCustardSelect].getName() + "| W " + forzenCustard[forzenCustardSelect].getPrice() + " | " + forzenCustard[forzenCustardSelect].getDescription() + "\"");
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1. 확인        2. 취소");

        select = sc.nextInt();
        sc.nextLine();

        if (select == 1) {
            order.addOrder(forzenCustard[forzenCustardSelect]);
            System.out.println(forzenCustard[forzenCustardSelect].getName() + " 가 장바구니에 추가되었습니다.\n");
        } else if (select == 2) {
            System.out.println("장바구니 추가가 취소되었습니다.\n");
        } else System.out.println("입력 오류\n");
    }

    public static void showDrinksMenu(Order order) {
        Scanner sc = new Scanner(System.in);
        Product[] drinks = new Product[8];
        for (int i = 0; i < drinks.length; i++) {
            drinks[i] = new Product();
        }
        drinks[0].setName("RaspberryLemonade ");
        drinks[0].setPrice(4.8);
        drinks[0].setDescription("쉐이크쉑 시그니처 레몬에이드에 상큼 달콤한 라즈베리가 더해진 시즌 한정 레몬에이드");
        drinks[1].setName("Lemonade          ");
        drinks[1].setPrice(4.3);
        drinks[1].setDescription("매장에서 직접 만드는 상큼한 레몬에이드");
        drinks[2].setName("FreshBrewedIcedTea");
        drinks[2].setPrice(3.5);
        drinks[2].setDescription("직접 유기농 홍차를 우려낸 아이스 티");
        drinks[3].setName("Fifty/Fifty       ");
        drinks[3].setPrice(3.8);
        drinks[3].setDescription("레몬에이드와 유기농 홍차를 우려낸 아이스 티가 만나 탄생한 쉐이크쉑의 시그니처 음료");
        drinks[4].setName("FountainSoda      ");
        drinks[4].setPrice(2.9);
        drinks[4].setDescription("코카콜라, 코카콜라 제로, 스프라이트, 환타 오렌지, 환타 그레이프, 환타 파인애플");
        drinks[5].setName("AbitaRootBeer     ");
        drinks[5].setPrice(4.8);
        drinks[5].setDescription("청량감 있는 독특한 미국식 무알콜 탄산음료");
        drinks[6].setName("HotTea            ");
        drinks[6].setPrice(3.4);
        drinks[6].setDescription("보성 유기농 찻잎을 우려낸 녹차, 홍차, 페퍼민트 & 레몬그라스");
        drinks[7].setName("Coffee            ");
        drinks[7].setPrice(3.0);
        drinks[7].setDescription("쉑 블렌드 원두를 사용한 밸런스 좋은 드립 커피");

        System.out.println("\"SHACKSHACK BURGER 에 오신걸 환영합니다.\"");
        System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.\n");
        System.out.println("[ SHAKESHACK MENU ]");
        for (int i = 0; i < drinks.length; i++) {
            System.out.println((i + 1) + ". " + drinks[i].getName() + "| W " + drinks[i].getPrice() + " |" + drinks[i].getDescription());
        }
        int select = sc.nextInt();
        sc.nextLine();
        int drinksSelect = select - 1;

        System.out.println("\"" + drinks[drinksSelect].getName() + "| W " + drinks[drinksSelect].getPrice() + " | " + drinks[drinksSelect].getDescription() + "\"");
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1. 확인        2. 취소");

        select = sc.nextInt();
        sc.nextLine();

        if (select == 1) {
            order.addOrder(drinks[drinksSelect]);
            System.out.println(drinks[drinksSelect].getName() + " 가 장바구니에 추가되었습니다.\n");
        } else if (select == 2) {
            System.out.println("장바구니 추가가 취소되었습니다.\n");
        } else System.out.println("입력 오류\n");
    }

    public static void showBeerMenu(Order order) {
        Scanner sc = new Scanner(System.in);
        Product[] beer = new Product[2];
        for (int i = 0; i < beer.length; i++) {
            beer[i] = new Product();
        }
        beer[0].setName("ShackMeisterAle   ");
        beer[0].setPrice(9.8);
        beer[0].setDescription("쉐이크쉑 버거를위해 뉴욕 브루클린 브루어리에서 특별히 양조한 에일 맥주");
        beer[1].setName("MagpieBrewingCo.  ");
        beer[1].setPrice(6.8);
        beer[1].setDescription("제주도 브루어리에서 전량 생산되는 맥파이 맥주");

        System.out.println("\"SHACKSHACK BURGER 에 오신걸 환영합니다.\"");
        System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.\n");
        System.out.println("[ SHAKESHACK MENU ]");
        for (int i = 0; i < beer.length; i++) {
            System.out.println((i + 1) + ". " + beer[i].getName() + "| W " + beer[i].getPrice() + " |" + beer[i].getDescription());
        }
        int select = sc.nextInt();
        sc.nextLine();
        int beerSelect = select - 1;

        System.out.println("\"" + beer[beerSelect].getName() + "| W " + beer[beerSelect].getPrice() + " | " + beer[beerSelect].getDescription() + "\"");
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1. 확인        2. 취소");

        select = sc.nextInt();
        sc.nextLine();

        if (select == 1) {
            order.addOrder(beer[beerSelect]);
            System.out.println(beer[beerSelect].getName() + " 가 장바구니에 추가되었습니다.\n");
        } else if (select == 2) {
            System.out.println("장바구니 추가가 취소되었습니다.\n");
        } else System.out.println("입력 오류\n");
    }

    public static void showOrderMenu(Order order) {
        Scanner sc = new Scanner(System.in);
        System.out.println("아래와 같이 주문 하시겠습니까?\n");
        System.out.println("[ Orders ]");

        List<Product> temp = order.getTemp();
        for (int i = 0; i < temp.size(); i++) {
            Product product = temp.get(i);
            System.out.println(product.getName() + "| W " + product.getPrice() + " | " + product.getDescription());
        }
        System.out.println("\n[ Total ]");
        System.out.printf("W ");
        System.out.printf("%.1f", order.CalcTotalPrice());
        System.out.println();

        order.setTotalPrice(0);

        System.out.println("1. 주문      2. 메뉴판");
        int select = sc.nextInt();
        sc.nextLine();

        if (select == 1) {
            orderComplete(order);
        } else if (select == 2) {
            System.out.println("메뉴판으로 돌아갑니다.\n");
        } else {
            System.out.println("입력 오류");
            System.out.println("메뉴판으로 돌아갑니다.\n");
        }
    }

    public static void orderComplete(Order order) {
        int orderNumber = order.getOrderNumber();
        System.out.println("주문이 완료되었습니다!\n");
        System.out.println("대기번호는 [" + orderNumber + "] 번 입니다.");
        System.out.println("(3초후 메뉴판으로 돌아갑니다.)\n");

        order.clearTemp();
        order.setOrderNumber(orderNumber + 1);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public static void orderCancel(Order order) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n진행하던 주문을 취소하시겠습니까?");
        System.out.println("1. 확인        2. 취소");
        int select = sc.nextInt();
        sc.nextLine();
        if (select == 1) {
            order.clearTemp();
            System.out.println("진행하던 주문이 취소되었습니다.\n");
        } else if (select == 2) {
            System.out.println("메뉴판으로 돌아갑니다.\n");
        } else {
            System.out.println("입력 오류");
            System.out.println("메뉴판으로 돌아갑니다.\n");
        }
    }
}