package fr.clinkast.jeudecartes.comparateur;

import fr.clinkast.jeudecartes.modele.Carte;
import fr.clinkast.jeudecartes.modele.Couleur;

import java.util.Comparator;
import java.util.List;

public class CouleurComparateur implements Comparator<Carte> {

    private List<Couleur> couleurs;

    public List<Couleur> getCouleurs() {
        return couleurs;
    }

    public CouleurComparateur(List<Couleur> couleurs) {
        this.couleurs = couleurs;
    }

    public void setCouleurs(List<Couleur> couleurs) {
        this.couleurs = couleurs;
    }

    @Override
    public int compare(Carte carte1, Carte carte2) {
        return Integer.compare(getCouleurs().indexOf(carte1.getCouleur()), getCouleurs().indexOf(carte2.getCouleur()));
    }


}
