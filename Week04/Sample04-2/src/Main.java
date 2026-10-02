//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    int max = Integer.MAX_VALUE;

    long a = max + 1; //Overflow
    long b = max + 1L; // long형 연산
    System.out.printf("max = %,d , a = %,d\n, b = %,d\n", max, a, b);

}
