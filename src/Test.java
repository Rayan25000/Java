import java.util.ArrayList;
import java.util.Scanner;

public class Test {

    static Scanner sc = new Scanner(System.in);

    public static void compteJusqua(int n){
        for(int i = 0; i <= n ; i++){
            System.out.println(i);
        }
    }

    public static int maxBetweenTwoNumbers(int n, int m){
        if(n < m)
            return m;
        return n;
    }

    public static String majeuOrMineur(int age){
        if(age < 18 )
            return "mineur";
        return "majeur";
    }

    public static String ageToCategory(int age){
        if(age>=6 && age<=7){
            return "Poussin";
        } else if(age>=8 && age<=9){
            return "Pupille";
        } else if(age>=10 && age<=11){
            return "Minime";
        } else if(age > 12 ){
            return "Cadet";
        } else {
            return "no specified";
        }
    }

    public static boolean reponseOk(int n){
        if(n >= 1 && n <= 3)
            return true;
        return false;
    }

    public static int factorielle(int n){
        if(n==0) return 1;
        else return n = n * factorielle(n-1);
    }

    public static void nombrePair(int n){
        System.out.println("nombres pairs jusqu'a " + n);
        for(int i = 0 ; i < n ; i++){
            if(i%2 == 0){
                System.out.println(i);
            }
        }
    }

    public static void putIntoTab(int[] tab){
        System.out.println("entrez 10 chiffres pour remplir le tab :");
        int moy =0;
        for(int i = 0; i < 10 ; i++ ) {
            int in = sc.nextInt();
            tab[i] = in;
            moy+= in;
        }
        System.out.println("moyenne : " + moy/10);

    }

    public static void triInsertion(int[] tab){
        int i, j, k;
        for (i = 1; i < tab.length; i++) {
            k = tab[i];
            j = i;
            while ((j >= 1) && (tab[j - 1] > k)) {
                tab[j]  = tab[j - 1] ;
                j = j - 1;
            }
            tab[j] = k;
        }
    }


    /**
     * @param args bbbbbb
     */
    public static void main(String[] args) {
        System.out.println("hé hé");
        compteJusqua(10);

        //exercice 1
        System.out.println("veuillez indiquer votre nom : ");

        String nom =  sc.next();
        System.out.println("Bonjour " + nom);

        //exercice 2
        System.out.println(maxBetweenTwoNumbers(5,9));
        System.out.println(maxBetweenTwoNumbers(14,9));

        //exercice 3
        System.out.println(majeuOrMineur(17));
        System.out.println(majeuOrMineur(21));

        //exercice 4
        System.out.println(ageToCategory(6));
        System.out.println(ageToCategory(13));
        System.out.println(ageToCategory(2));

        //exercice 5
        System.out.println(reponseOk(5));
        System.out.println(reponseOk(2));

        //exercice 6
        System.out.println(factorielle(5));

        //exercice 7
        nombrePair(10);

        //exercice 8 & 9
        int[] tab = new int[10];
        putIntoTab(tab);
        for (int e : tab){
            System.out.println(e);
        }

        //exercice 10
        triInsertion(tab);
        System.out.println("tri par insertion : ");
        for (int e : tab){
            System.out.println(e);
        }
        
        //exercice LIVRE DVD
        Realisateur realisateur = new Realisateur("real", "01/07/2000");
        Realisateur realisateur2 = new Realisateur("real2", "01/07/2000");
        Auteur auteur = new Auteur("aut", "05/07/2000");
        Auteur auteur2 = new Auteur("aut2", "05/07/2000");
        DVD dvd = new DVD("refdvd", "desidvd", 15, 12.5F,realisateur);
        DVD dvd2 = new DVD("refdvd2", "desidvd2", 15, 12.5F,realisateur);
        Livre livre2 = new Livre("ref51","des214",15,1554,100,auteur);
        Livre livre = new Livre("ref512","des2142",15,1554,100,auteur);

        ArrayList<Article> listArticle = new ArrayList<>();
        System.out.println(realisateur);
        System.out.println(auteur);
        System.out.println(dvd);
        System.out.println(livre);

        listArticle.add(dvd);
        listArticle.add(dvd2);
        listArticle.add(livre);
        listArticle.add(livre2);

        System.out.println("liste article : ");
        System.out.println(listArticle);

        ArrayList<Article> listReal = new ArrayList<>();
        ArrayList<Article> listAuteur = new ArrayList<>();

        for(Article e: listArticle){
            if(e.getType().equals("DVD")){
                listReal.add(e);
            } else if (e.getType().equals("Livre")){
                listAuteur.add(e);
            }
        }

        System.out.println("liste real :");
        System.out.println(listReal);
        System.out.println("liste auteur :");
        System.out.println(listAuteur);







    }

}
