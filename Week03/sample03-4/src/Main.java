//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner keyboard =  new Scanner(System.in);
    int base;
    int rectangular_area;
    double radius;
    double circle_area;
    final double PI = 3.141592;
    double area;

    System.out.print("정사각형의 한변의 길이 입력(예 5): ");
    base = keyboard.nextInt();

    rectangular_area = base * base;
    radius = base / 2.0;
    circle_area = PI * radius * radius;
    area = rectangular_area - circle_area;

    System.out.printf("한변의 길이가 %,d Cm인 정사각형의 면적 = %,d \u33A0\n", base, rectangular_area);
    System.out.printf("이 정사가형 내부 원의 반지름 : %.2f Cm, 면적 : %,.2f \u33A0\n", radius, circle_area);
    System.out.printf("구하려는 면적 : %,.2f\u33A0\n", area);
}
