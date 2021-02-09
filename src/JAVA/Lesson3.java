import java.util.Random;
import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {
        guessNumber();
    }

    public static void guessNumber() {
        Random rand = new Random();
        int x = rand.nextInt(10);

        System.out.println("Угадайте целое число от 0 до 9:");
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (i <= 3) {
            int y = sc.nextInt();
            if (x == y) {
                System.out.println("Вы угадали!");
                System.out.println(" ");
                break;
            }
            if (x < y) {
                System.out.println("Загаданное число меньше");
            }
            if (x > y) {
                System.out.println("Загаданное число больше");
            }
            i++;
            if (i == 3) {
                System.out.println(("Было всего 3 попытки, Вы проиграли"));
                System.out.println(" ");
                break;
            }
        }
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            Scanner newgame = new Scanner(System.in);
            int j = newgame.nextInt();
            if (j==1) {
                guessNumber();
            }
            else {
                System.out.println("До свидания!");
            }
        }
}






