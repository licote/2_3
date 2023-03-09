import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner skaner = new Scanner(System.in);
    System.out.println("podaj liczbę a:");
    int a = skaner.nextInt();
    System.out.println("podaj liczbę b:");
    int b = skaner.nextInt();
    int wynik = a + b;
    System.out.println("Wynik: " + wynik);    
  }
}
