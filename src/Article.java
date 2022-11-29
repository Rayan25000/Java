public class Article {
    String reference;
    String designation;
    int prix;



    public Article(String reference, String designation, int prix) {
        this.reference = reference;
        this.designation = designation;
        this.prix = prix;
    }

    public String getType(){
        String type = "Article";
        return type;
    }

    @Override
    public String toString() {
        return "Article{" +
                "reference='" + reference + '\'' +
                ", designation='" + designation + '\'' +
                ", prix=" + prix +
                '}';
    }


}
