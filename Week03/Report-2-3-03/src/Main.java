//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    String school;
    String name;
    int age;
    char gender;
    double height;
    float weight;

    school = "경복대학교";
    name = "Yimon";
    age = 23;
    gender = '여';
    height = 152;
    weight = 40f;

    System.out.printf("*********************\n");
    System.out.printf("학교 : %s\n", school);
    System.out.printf("이름 : %s\n", name);
    System.out.printf("나이 : %d\n", age);
    System.out.printf("성별 : %c(여)\n", gender);
    System.out.printf("신장 : %.1f Cm\n", height);
    System.out.printf("체중 : %.1f Kg\n", weight);
    System.out.printf("*********************\n");
}
