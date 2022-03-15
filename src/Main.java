import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner pobieranie = new Scanner(System.in);
        System.out.println("Podaj liczbę do sprawdzenia");
        int a = pobieranie.nextInt();
        boolean pierwsza=true;
        for(int i=2; i<=Math.sqrt(a); i++)
        {
            if(a%i==0)
            {
              pierwsza=false;
            }
        }
        if(pierwsza==true)
        {
           System.out.println("Liczba " + a + " jest pierwsza");
        }
        else
        {
            System.out.println("Liczba " + a + " nie jest pierwsza");
        }

    }
}