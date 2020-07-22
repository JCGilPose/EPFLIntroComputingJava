import java.util.Scanner;

/* Le programme offre une sélection de six champignons,
   puis pose une série de questions pour déterminer
   le champignon que les utilisateurs ont choisi. */

public class Champi
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // La liste des champignons
        System.out.println("Pensez a un champignon : ");
        System.out.println("amanite tue mouches, pied bleu, girolle,");
        System.out.println("cèpe de Bordeaux, coprin chevelu ou agaric jaunissant.");

        // Première question
        System.out.print("Est-ce que votre champignon a un anneau");
        System.out.print(" (true : oui, false : non) ? ");
        boolean oui = scanner.nextBoolean();

        if (oui)
        {
            // Deuxième question
            System.out.print("Est-ce que votre champignon vit en forêt");
            System.out.print(" (true : oui, false : non) ? ");
            oui = scanner.nextBoolean();
            if (oui)
            {
                // Première solution
                System.out.print("==> Le champignon auquel vous pensez est ");
                System.out.print("l'amanite tue-mouches");
            }
            else
            {
                // Troisième question
                System.out.print("Est-ce que votre champignon a un chapeau convexe"
                System.out.print(" (true : oui, false : non) ? ");
                oui = scanner.nextBoolean();
                if (oui)
                {
                    // Deuxième solution
                    System.out.print("==> Le champignon auquel vous pensez est ");
                    System.out.print("l'agaric jaunissant");
                }
                else
                {
                    // Troisième solution
                    System.out.print("==> Le champignon auquel vous pensez est ");
                    System.out.print("le coprin chevelu");
                }
            }
        }
        else
        {
            // Quatrième question
            System.out.print("Est-ce que votre champignon a des lamelles");
            System.out.print(" (true : oui, false : non) ? ");
            oui = scanner.nextBoolean();
            if (oui)
            {
                // Cinquième question
                System.out.print("Est-ce que votre champignon a un chapeau convexe");
                System.out.print(" (true : oui, false : non) ? ");
                oui = scanner.nextBoolean();
                if (oui)
                {
                    // Quatrième solution
                    System.out.print("==> Le champignon auquel vous pensez est ");
                    System.out.print("le pied bleu");
                }
                else
                {
                    // Cinquième solution
                    System.out.print("==> Le champignon auquel vous pensez est ");
                    System.out.print("la girolle");
                }
            }
            else
            {
                // Sixième et dernière solution
                System.out.print("==> Le champignon auquel vous pensez est ");
                System.out.print("le cèpe de Bordeaux");
            }
        }
    }
}
