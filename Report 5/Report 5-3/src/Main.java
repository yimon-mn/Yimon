//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    int total = 54321;
    int hour, remain, minute, second;

    hour = total / 3600;
    remain = total % 3600;
    minute = remain / 60;
    second = remain % 60;

    System.out.printf("%d 초 = %d 시간 %d 분 %d 초\n", total, hour, minute, second);
}

