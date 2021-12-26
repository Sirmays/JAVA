public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();

        new Thread(() -> printer.PrintA()).start();
        new Thread(() -> printer.PrintB()).start();
        new Thread(() -> printer.PrintC()).start();

        System.out.println("GitTest");

    }


}
