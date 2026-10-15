//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner keyboard = new Scanner(System.in);
    int width, length, height;
    int vol;

    System.out.printf("직육면체 가로 세로 높이 입력 : ");
    width = keyboard.nextInt();
    length = keyboard.nextInt();
    height = keyboard.nextInt();

    vol = width * length * height;

    System.out.printf("직육면체 가로 : %d㎝\n", width);
    System.out.printf("직육면체 세로 : %d㎝\n", length);
    System.out.printf("직육면체 높이 : %d㎝\n", height);
    System.out.printf("직육면체 부피 : %d㎤\n", vol);
}