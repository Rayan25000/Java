public class DVD extends Article {
    float duree;
    Realisateur realisateur;

    public DVD(String reference, String designation, int prix, float duree, Realisateur realisateur) {
        super(reference, designation, prix);
        this.duree = duree;
        this.realisateur = realisateur;
    }

    public String getType(){
        String type = "DVD";
        return type;
    }



    @Override
    public String toString() {
        return "DVD{" +
                "duree=" + duree +
                ", realisateur=" + realisateur +
                ", reference='" + reference + '\'' +
                ", designation='" + designation + '\'' +
                ", prix=" + prix +
                '}';
    }



}
