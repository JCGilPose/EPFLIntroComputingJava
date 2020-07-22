import java.util.Scanner;

class Parachutiste {

    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        double masse = 80.0;
        do {
            System.out.print("masse du parachutiste (>= 40) ? ");
            masse = clavier.nextDouble();
        } while (masse < 40.0);

        double h0 = 39000.0;
        do {
            System.out.print("hauteur de depart du parachutiste (>= 250) ? ");
            h0 = clavier.nextDouble();
        } while (h0 < 250.0);

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/
        final double g = 9.81;
        double v0 = 0.0;
        double t0 = 0.0;
        double vitesse = v0;
        double hauteur = h0;
        double accel = g;
        double surface = 2.0;
        double t = t0;

        int son = 0;
        int vmax = 0;
        int para = 0;
        double parat0 = 0;
        double parav0 = 0;
        double parah0 = 0;

        while (hauteur > 0) {
            System.out.printf("%.0f, %.4f, %.4f, %.5f\n",
                              t, hauteur, vitesse, accel);

            t += 1;
            double s = surface / masse;
            double q = Math.exp((-s) * (t - t0));
            vitesse = (g / s) * (1 - q) + v0 * q;
            hauteur = h0 - g / s * (t - t0) - (v0 -(g / s)) / s * (1 - q);
            accel = g - s * vitesse;

            if (vitesse > 343) {
                son += 1;
            }
            if (son == 1){
                System.out.println("## Felix depasse la vitesse du son");
            }

            if (accel < 0.5) {
                vmax += 1;
            }
            if (vmax == 1) {
                System.out.println("## Felix a atteint sa vitesse maximale");
            }

            if (hauteur < 2500) {
                para += 1;
                surface = 25.0;
            }

            if (para == 1) {
                System.out.println("## Felix ouvre son parachute");
                parat0 = t;
                parav0 = vitesse;
                parah0 = hauteur;
            }

            if (para >= 1) {
                t0 = parat0;
                v0 = parav0;
                h0 = parah0;
            }
        }

        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/
        clavier.close();
    }
}
