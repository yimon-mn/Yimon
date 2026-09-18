//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner keyboard = new Scanner(System.in);
    int radius;
    double side;
    double boxArea;
    double circleArea;
    double area;

    System.out.printf("원의 반지름 입력 : ");
    radius = keyboard.nextInt();

    side = radius * 2;
    boxArea = side * side;
    circleArea = 3.141592 * radius * radius;
    area = boxArea - circleArea;

    System.out.printf("원의 반지름: %d \n", radius);
    System.out.printf("정사각형 면적: %.2f \u33A0\n", boxArea);
    System.out.printf("원의 면적: %.2f \u33A0\n", circleArea);
    System.out.printf("구하는 면적: %.2f \u33A0\n", area);
}