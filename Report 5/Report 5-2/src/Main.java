//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner keyboard = new Scanner(System.in);
    int score;
    char letter;
    String sign;
    String grade;

    System.out.printf("당신의 JAVA 점수 입력 : ");
    score = keyboard.nextInt();

    if (score < 60) {
        grade = "F";
    } else {
        letter = (char)('A' + (99 - score) / 10);        // ASCII 코드 이용
        sign = (score % 10 >= 5 || score == 100) ? "+" : "0";
        grade = letter + sign;
    }

    System.out.printf("입력 점수 : %d\n", score);
    System.out.printf("학점 : %s\n", grade);
}

