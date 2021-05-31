package fr.clinkast.jeudecartes.modele;

public enum Couleur {

    PIQUE(1),
    TREFLE(2),
    CARREAU(3),
    COEUR(4);

    private int ordre;

    private Couleur(int ordre) {
        this.ordre = ordre;
    }

    public int getOrdre() {
        return ordre;
    }

    public void setOrdre(int ordre) {
        this.ordre = ordre;
    }
}
