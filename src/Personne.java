public class Personne {
    String nom;
    String dateNaissance;


    public Personne(String nom, String dateNaissance) {
        this.nom = nom;
        this.dateNaissance = dateNaissance;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", dateNaissance='" + dateNaissance + '\'' +
                '}';
    }
}
