package chapter03.exam04;

public class test {

    public static void main(String[] args) {
        char alpha = 'e';  // alpha는 'e'로 주어짐

        // 첫 번째 반복문: 'a'부터 alpha까지 반복
        for (int i = 0; i <= alpha - 'a'; i++) {
            // 두 번째 반복문: 'a'부터 alpha - i까지 출력
            for (int j = 0; j <= alpha - i - 'a'; j++) {
                System.out.print((char) ('a' + j) + " ");
            }
            System.out.println();  // 한 줄이 끝나면 줄바꿈
        }
    }
}
