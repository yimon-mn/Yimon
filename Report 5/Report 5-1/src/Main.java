//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner keyboard = new Scanner(System.in);
    int a, b, c;

    System.out.printf("정수 3개를 입력하세요 : ");
    a = keyboard.nextInt();
    b = keyboard.nextInt();
    c = keyboard.nextInt();

    if (a > 0 && b > 0 && c > 0) {
        System.out.printf("모두 양수\n");
    } else if (a < 0 || b < 0 || c < 0) {
        System.out.printf("음수 포함\n");
    } else if (a == 0 && b == 0 && c == 0) {
        System.out.printf("모두 0\n");
    } else {
        System.out.printf("0 포함\n");
    }
}
