//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner keyboard = new Scanner(System.in);
    double celsius;
    double fahrenheit;

    System.out.printf("섭씨 온도를 입력하세요 : ");
    celsius = keyboard.nextDouble();

    fahrenheit = celsius * 9 / 5 + 32;

    System.out.printf("섭씨 %.1f도는 화씨 %.1f도 입니다.\n", celsius, fahrenheit);
}
