public class Realisateur extends Personne {


    public Realisateur(String nom, String dateNaissance) {
        super(nom, dateNaissance);
    }

    @Override
    public String toString() {
        return "Realisateur{" +
                "nom='" + nom + '\'' +
                ", dateNaissance='" + dateNaissance + '\'' +
                '}';
    }




}
