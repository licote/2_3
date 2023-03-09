import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj liczbę 1: ");
    int a = scanner.nextInt();
    System.out.println("Podaj liczbę 2: ");
    int b = scanner.nextInt();
    System.out.println("Suma: " + (a + b));
  }
}
