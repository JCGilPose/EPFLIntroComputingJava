import java.util.Scanner;

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

        // le budget de vos vacances de rêves.
        double budget;
        Scanner clavier = new Scanner(System.in);

        System.out.println("Donnez le budget de vos vacances : ");
        budget = clavier.nextDouble();

        // ce qui resterait dans la tirelire après les
        // vacances
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


class Tirelire {
    private double montant;

    public double getMontant() {
        return montant;
    }

    public void afficher() {
        if (getMontant() <= 0.0) {
            System.out.println("Vous etes sans le sou.");
        }
        else {
            System.out.print("Vous avez : " + getMontant());
            System.out.println(" euros dans votre tirelire.");
        }
    }

    public void secouer() {
        if (getMontant() > 0.0) {
            System.out.println("Bing bing");
        }
    }

    public void remplir(double ajout) {
        if (ajout > 0.0) {
            montant += ajout;
        }
    }

    public void vider() {
        montant = 0.0;
    }

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

    public double calculerSolde(double budget) {
        if (budget <= 0.0) {
            return getMontant();
        }
        else {
            return getMontant() - budget;
        }
    }
}
