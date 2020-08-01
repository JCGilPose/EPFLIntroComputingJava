import java.util.Scanner;

/* This program creates a piggy bank, manipulates the money within,
   and determines whether we have the budget for a holiday for example ---
   Simulation d'une tirelire dans laquelle on stocke et retire
   de l’argent que l’on souhaite utiliser pour payer
   un certain budget (de vacances, par exemple). */
public class TestTirelireJuan {

    public static void main(String[] args) {

        Tirelire piggy = new Tirelire();

        piggy.vider();
        piggy.secouer();
        piggy.afficher();

        piggy.puiser(20.0);
        piggy.secouer();
        piggy.afficher();

        piggy.remplir(550.0);
        piggy.secouer();
        piggy.afficher();

        piggy.puiser(10.0);
        piggy.puiser(5.0);
        piggy.afficher();

        System.out.println();

        // The budget for your dream holiday ---
        // le budget de vos vacances de rêves.
        double budget;
        Scanner clavier = new Scanner(System.in);

        System.out.println("Donnez le budget de vos vacances : ");
        budget = clavier.nextDouble();

        // What would be left after the holidays ---
        // ce qui resterait dans la tirelire après les vacances
        double solde = piggy.calculerSolde(budget);

        if (solde >= 0) {
            System.out.println("Vous etes assez riche pour partir en vacances !");
            System.out.print(" il vous restera " + solde + " euros");
            System.out.print(" a la rentree \n");
            piggy.puiser(budget);
        }
        else {
            System.out.print("Il vous manque " + (-solde) + " euros");
            System.out.print(" pour partir en vacances !\n");
        }
        clavier.close();
    }
}


// The actual piggy bank
class Tirelire {
    private double montant;

    public double getMontant() {
        return montant;
    }

    // prints out content
    public void afficher() {
        if (getMontant() <= 0.0) {
            System.out.println("Vous etes sans le sou.");
        }
        else {
            System.out.print("Vous avez : " + getMontant());
            System.out.println(" euros dans votre tirelire.");
        }
    }

    // shakes the piggy bank
    public void secouer() {
        if (getMontant() > 0.0) {
            System.out.println("Bing bing");
        }
    }

    // fills the piggy bank
    public void remplir(double ajout) {
        if (ajout > 0.0) {
            montant += ajout;
        }
    }

    // empties the piggy bank
    public void vider() {
        montant = 0.0;
    }

    // withdraws money
    public void puiser(double retrait) {
        if (retrait > 0.0) {
            if (retrait > getMontant()) {
                vider();
            }
            else {
                montant -= retrait;
            }
        }
    }

    // checks what would be left after potential expenditure
    public double calculerSolde(double budget) {
        if (budget <= 0.0) {
            return getMontant();
        }
        else {
            return getMontant() - budget;
        }
    }
}
