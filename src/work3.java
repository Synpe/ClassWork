void main() {
    Scanner keyboard = new Scanner(System.in);
    int apple;
    int pear;
    int payment;
    int price;
    final int APPLE = 500;
    final int PEAR = 600;

    System.out.printf("사과 구입 개수 : ");
    apple = keyboard.nextInt();
    System.out.printf("배 구입 개수 : ");
    pear = keyboard.nextInt();
    System.out.printf("지불 금액 입력: ");
    payment = keyboard.nextInt();

    price = apple * APPLE + pear * PEAR;
    String result = price >= price ? String.format("거스름 돈 : %,d 원\n", payment - price) : "금액 부족";
    System.out.printf("구입 금액 : %,d 원\n", price);
    System.out.printf("지불 금액 : %,d 원\n", payment);
    System.out.println("result");
}