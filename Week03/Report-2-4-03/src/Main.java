//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner keyboard = new Scanner(System.in);
    String school;
    String name;
    int age;
    char gender;
    double height;
    float weight;

    System.out.printf("학교 : ");
    school = keyboard.next();
    System.out.printf("이름 : ");
    name = keyboard.next();
    System.out.printf("나이 : ");
    age = keyboard.nextInt();
    System.out.printf("성별(남/여) : ");
    gender = keyboard.next().charAt(0);
    System.out.printf("신장 : ");
    height = keyboard.nextDouble();
    System.out.printf("체중 : ");
    weight = keyboard.nextFloat();

    System.out.printf("*********************\n");
    System.out.printf("학교 : %s\n", school);
    System.out.printf("이름 : %s\n", name);
    System.out.printf("나이 : %d\n", age);
    System.out.printf("성별 : %c\n", gender);
    System.out.printf("신장 : %.1f Cm\n", height);
    System.out.printf("체중 : %.1f Kg\n", weight);
    System.out.printf("*********************\n");
}
