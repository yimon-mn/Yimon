//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner keyboard = new Scanner(System.in);
    int num1;
    int num2;
    int sum;

    System.out.printf("첫번째 숫자를 입력하세요 ");
    num1 = keyboard.nextInt();

    System.out.printf("두번째 숫자를 입력하세요 ");
    num2 = keyboard.nextInt();

    sum = num1 + num2;

    System.out.printf("%d + %d = %d\n", num1, num2, sum);
}
