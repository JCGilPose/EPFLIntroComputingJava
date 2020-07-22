public class ImcJuan {
    public static void main(String[] args) {
        Patient quidam = new Patient();
        quidam.init(74.5, 1.75);
        quidam.afficher();
        System.out.println("IMC : " + quidam.imc());
        quidam.init( -2.0, 4.5);
        quidam.afficher();
    }
}


class Patient {
    private double masse;
    private double hauteur;

    public void init(double unPoids, double uneTaille) {
        if ((unPoids > 0.0) && (uneTaille > 0.0)) {
            masse = unPoids;
            hauteur = uneTaille;
        }
        else {
            masse = 0.0;
            hauteur = 0.0;
        }
    }

    public void afficher() {
        System.out.printf("Patient : %.1f kg pour %.1f m\n", poids(), taille());
    }

    public double poids() {
        return masse;
    }

    public double taille() {
        return hauteur;
    }

    public double imc() {
        if (taille() == 0.0) {
            return 0.0;
        }
        else {
            return poids() / (taille() * taille());
        }
    }
}
