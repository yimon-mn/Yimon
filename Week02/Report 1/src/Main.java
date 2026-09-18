//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner keyboard = new Scanner(System.in);
    int age;
    double weight;
    float height;

    System.out.printf("당신의 나이는 ? ");
    age = keyboard.nextInt();
    System.out.printf("당신의  몸무게는 ? ");
    weight = keyboard.nextDouble();
    System.out.printf("당신의  키는 ? ");
    height = keyboard.nextFloat();


    System.out.printf("당신의 나이는 %d살 입니다.\n", age);
    System.out.printf("당신의 몸무게는 %.1f kg 입니다.\n", weight);
    System.out.printf("당신의 키는 %.1f Cm 입니다.\n", height);

}
