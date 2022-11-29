public class Livre extends Article {
    int ISBN;
    int nbPages;
    Auteur auteur;

    public Livre(String reference, String designation, int prix, int ISBN, int nbPages, Auteur auteur) {
        super(reference, designation, prix);
        this.ISBN = ISBN;
        this.nbPages = nbPages;
        this.auteur = auteur;
    }

    public String getType(){
        String type = "Livre";
        return type;
    }

    @Override
    public String toString() {
        return "Livre{" +
                "ISBN=" + ISBN +
                ", nbPages=" + nbPages +
                ", auteur='" + auteur + '\'' +
                ", reference='" + reference + '\'' +
                ", designation='" + designation + '\'' +
                ", prix=" + prix +
                '}';
    }



}
