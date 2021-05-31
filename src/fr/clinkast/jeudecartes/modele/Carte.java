package fr.clinkast.jeudecartes.modele;

public class Carte {

    private Couleur couleur;
    private Numero numero;

    public Carte(Couleur couleur, Numero numero) {
        this.couleur = couleur;
        this.numero = numero;
    }

    public Couleur getCouleur() {
        return couleur;
    }

    public void setCouleur(Couleur couleur) {
        this.couleur = couleur;
    }

    public Numero getNumero() {
        return numero;
    }

    public void setNumero(Numero numero) {
        this.numero = numero;
    }
}
