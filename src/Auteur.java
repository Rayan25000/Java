public class Auteur extends Personne{
    public Auteur(String nom, String dateNaissance) {
        super(nom, dateNaissance);
    }

    @Override
    public String toString() {
        return "Auteur{" +
                "nom='" + nom + '\'' +
                ", dateNaissance='" + dateNaissance + '\'' +
                '}';
    }
}
