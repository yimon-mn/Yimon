//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner keyboard = new Scanner(System.in);
    double weight;
    double moon;

    System.out.printf("몸무게(kg)를 입력하세요 : ");
    weight = keyboard.nextDouble();

    moon = weight * 0.165;

    System.out.printf("지구에서의 몸무게 : %.1f kg\n", weight);
    System.out.printf("달에서의 몸무게 : %.1f kg\n", moon);
}
