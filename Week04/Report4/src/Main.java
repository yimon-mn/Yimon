//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner keyboard = new Scanner(System.in);
    double total;
    double amount;
    double tax;

    System.out.printf("판매금액을 입력하세요 : ");
    total = keyboard.nextDouble();

    amount = total / 1.1;
    tax = total - amount;

    System.out.printf("금액 : %.0f원\n", amount);
    System.out.printf("세금 : %.0f원\n", tax);
}

