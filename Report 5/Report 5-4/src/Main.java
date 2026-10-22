//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner keyboard = new Scanner(System.in);
    int price;
    boolean member;
    boolean freeShipping;

    System.out.printf("구매 금액을 입력하세요 : ");
    price = keyboard.nextInt();
    System.out.printf("멤버십 회원입니까? (true/false) : ");
    member = keyboard.nextBoolean();

    if (price < 0) {
        System.out.printf("오류 : 구매 금액은 음수일 수 없습니다.\n");
    } else {
        freeShipping = (price >= 50000) || (member && price >= 30000);
        if (freeShipping) {
            System.out.printf("무료배송 입니다.\n");
        } else {
            System.out.printf("배송비가 있습니다.\n");
        }
    }
}
