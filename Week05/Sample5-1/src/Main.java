//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner keyboard = new Scanner(System.in);

    int width;
    int height;
    char type;
    int area;

    System.out.print("사각형의 가로 길이 입력(예 5) : ");
    width = keyboard.nextInt();
    System.out.print("사각형의 세로 길이 입력(예 5) : ");
    height = keyboard.nextInt();

    type = (width == height) ? '정' : '직';
    area = width * height;

    System.out.printf("***%c사각형 넓이 *****\n", type);
    System.out.printf("\t\t가로 길이 : %d cm\n", width);
    System.out.printf("\t\t가로 길이 : %d cm\n", height);
    System.out.printf("\t\t넓    이 : %d \u33a0\n", area);

    }

