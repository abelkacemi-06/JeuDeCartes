package fr.clinkast.jeudecartes.comparateur;

import fr.clinkast.jeudecartes.modele.Carte;
import fr.clinkast.jeudecartes.modele.Numero;

import java.util.Comparator;
import java.util.List;

public class NumeroComparateur implements Comparator<Carte> {


    private List<Numero> numeros;

    public NumeroComparateur(List<Numero> numeros) {
        this.numeros = numeros;
    }

    public List<Numero> getNumeros() {
        return numeros;
    }

    public void setNumeros(List<Numero> numeros) {
        this.numeros = numeros;
    }

    @Override
    public int compare(Carte carte1, Carte carte2) {
        return Integer.compare(getNumeros().indexOf(carte1.getNumero()), getNumeros().indexOf(carte2.getNumero()));
    }


}
