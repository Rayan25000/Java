public class Voiture {
    private int vitesse;
    private int direction;

    public Voiture(){
        this.vitesse = 0;
        this.direction = 0;
    }

    public Voiture(int vitesse, int direction) {
        this.vitesse = vitesse;
        this.direction = direction;
    }

    public void freine(int n){
        vitesse-= n;
    }
    public void setDirection(int n){
        direction = n;
    }

    public int getVitesse() {
        return vitesse;
    }

    public void setVitesse(int vitesse) {
        this.vitesse = vitesse;
    }

    public int getDirection() {
        return direction;
    }
}
