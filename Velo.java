import java.util.Scanner;

/* Le but de cet exercice est de permettre
   à un service de location de vélos (online,
   tournant 24 heures sur 24) de facturer ses clients. */

public class Velo {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.print("Donnez l'heure de début de la location (un entier) : ");
        int debut = clavier.nextInt();
        System.out.print("Donnez l'heure de fin de la location (un entier) : ");
        int fin = clavier.nextInt();

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/

        // Calcul et enregistrement de la durée
        int duree = (fin - debut);
        // Contrôle que les valeurs entrées ont du sens
        if ((debut < 0) || (debut > 24) || (fin < 0) || (fin > 24))
        {
            System.out.println("Les heures doivent être comprises entre 0 et 24 !");
        }
        else if (debut == fin)
        {
            System.out.println("Bizarre, vous n'avez pas loué votre vélo bien longtemps !");
        }
        else if (debut > fin)
        {
            System.out.println("Bizarre, le début de la location est après la fin ...");
        }
        else if (duree > 0.0)
        {
          /* Les valeurs entrées sonts valides.
             Calcul du prix de la location selon les différents tarifs horaires
             définis comme suit :
             — 1 franc par heure si le vélo est loué entre 0h et 7h ou entre 17h et 24h ;
             — 2 francs par heure si le vélo est loué entre 7h et 17h. */
            int tarif1 = 0; // tarif1 : 1 franc par heure
            int tarif2 = 0; // tarif2 : 2 francs par heure
            double montant = 0; // Représentera le total à payer
            if (fin < 8)
            {
                montant = duree;
                System.out.println("Vous avez loué votre vélo pendant");
                System.out.println(duree + " heure(s) au tarif horaire de 1.0 franc(s)");
                System.out.print("Le montant total à payer est de ");
                System.out.println(montant + " franc(s).");
            }
            else if (fin < 18)
            {
                if (debut >= 7)
                {
                    montant = (duree * 2);
                    System.out.println("Vous avez loué votre vélo pendant");
                    System.out.println(duree + " heure(s) au tarif horaire de 2.0 franc(s)");
                    System.out.print("Le montant total à payer est de ");
                    System.out.println(montant + " franc(s).");
                }
                else
                {
                    tarif2 = (fin - 7);
                    tarif1 = (duree - tarif2);
                    System.out.println("Vous avez loué votre vélo pendant");
                    System.out.println(tarif1 + " heure(s) au tarif horaire de 1.0 franc(s)");
                    System.out.println(tarif2 + " heure(s) au tarif horaire de 2.0 franc(s)");
                    montant = (tarif2 * 2) + tarif1;
                    System.out.print("Le montant total à payer est de ");
                    System.out.println(montant + " franc(s).");
                }
            }
            else if (fin >= 18)
            {
                if (debut >= 17)
                {
                    montant = duree;
                    System.out.println("Vous avez loué votre vélo pendant");
                    System.out.println(duree + " heure(s) au tarif horaire de 1.0 franc(s)");
                    System.out.print("Le montant total à payer est de ");
                    System.out.println(montant + " franc(s).");
                }
                else if (debut >= 7)
                {
                    tarif1 = (fin - 17);
                    tarif2 = (duree - tarif1);
                    System.out.println("Vous avez loué votre vélo pendant");
                    System.out.println(tarif1 + " heure(s) au tarif horaire de 1.0 franc(s)");
                    System.out.println(tarif2 + " heure(s) au tarif horaire de 2.0 franc(s)");
                    montant = (tarif2 * 2) + tarif1;
                    System.out.print("Le montant total à payer est de ");
                    System.out.println(montant + " franc(s).");
                }
                else if (debut < 7)
                {
                    tarif1 = ((fin - 17) + (7 - debut));
                    tarif2 = duree - tarif1;
                    System.out.println("Vous avez loué votre vélo pendant");
                    System.out.println(tarif1 + " heure(s) au tarif horaire de 1.0 franc(s)");
                    System.out.println(tarif2 + " heure(s) au tarif horaire de 2.0 franc(s)");
                    montant = (tarif2 * 2) + tarif1;
                    System.out.print("Le montant total à payer est de ");
                    System.out.println(montant + " franc(s).");
                }
            }
        }

        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/

        clavier.close();
    }
}
