class MostFrequent {

    public static void main(String[] args) {
        int[] tab1 = {2, 7, 5, 6, 7, 1, 6, 2, 1, 7, 6};
        int taille = tab1.length;

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/
        int fois = 0;
        int plusFrequent = 0;
        int plusFois = 0;

        for (int i = 0; i < taille; i++) {
            for (int j = 0; j < taille; j++) {
                if (tab1[i] == tab1[j]) {
                    fois++;
                }
            }
            if (fois > plusFois) {
                    plusFois = fois;
                    plusFrequent = tab1[i];
                }
            fois = 0;
        }

        System.out.print("Le nombre le plus frequent dans le tableau est le : ");
        System.out.println(plusFrequent + " (" + plusFois + " x)");

        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/

    }
}
