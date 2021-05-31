import fr.clinkast.jeudecartes.comparateur.CouleurComparateur;
import fr.clinkast.jeudecartes.comparateur.NumeroComparateur;
import fr.clinkast.jeudecartes.modele.Carte;
import fr.clinkast.jeudecartes.modele.Couleur;
import fr.clinkast.jeudecartes.modele.Numero;
import fr.clinkast.jeudecartes.utils.Main;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Jouer {


    public static final int NB_COULEURS = 4;
    public static final int NB_NUMEROS = 13;
    public static final int NB_CARTES_TIREES = 10;

    public static void main(String[] args) {


        EnumSet<Couleur> couleurs = EnumSet.allOf(Couleur.class);
        EnumSet<Numero> numeros = EnumSet.allOf(Numero.class);
        List<Carte> cartes = new ArrayList<>();

        couleurs.forEach(couleur -> {
            numeros.forEach(numero -> cartes.add(new Carte(couleur, numero)));
        });


        System.out.println("-------------------------cartes tirees---------------------------------");

        List<Carte> cartesTirees = Main.tirageAleatoire(cartes, NB_CARTES_TIREES);
        cartesTirees.forEach(carte -> System.out.print(carte.getNumero() + " " + carte.getCouleur() + "  |"));


        List<Couleur> couleursAleatoires = Main.tirageAleatoire(couleurs.stream().collect(Collectors.toList()), NB_COULEURS);
        List<Numero> numerosAleatoires = Main.tirageAleatoire(numeros.stream().collect(Collectors.toList()), NB_NUMEROS);


        System.out.println("\n---------------------------couleurs aleatoires-------------------------------");
        couleursAleatoires.forEach(couleur -> System.out.print(couleur + "  |"));

        System.out.println("\n---------------------------tri cartes par couleur-------------------------------");
        cartesTirees.sort(new CouleurComparateur(couleursAleatoires));
        cartesTirees.forEach(carte -> System.out.print(carte.getNumero() + " " + carte.getCouleur() + "  |"));


        System.out.println("\n---------------------------numeros aleatoires -------------------------------");
        numerosAleatoires.forEach(numero -> System.out.print(numero + "  |"));

        System.out.println("\n---------------------------tri cartes par numeros-------------------------------");
        cartesTirees.sort((new NumeroComparateur(numerosAleatoires)));
        cartesTirees.forEach(carte -> System.out.print(carte.getNumero() + " " + carte.getCouleur() + "  |"));


        System.out.println("\n---------------------------tri par couleur et numero -------------------------------");
        cartesTirees.sort((new CouleurComparateur((couleursAleatoires))).thenComparing(new NumeroComparateur(numerosAleatoires)));
        cartesTirees.forEach(carte -> System.out.print(carte.getNumero() + " " + carte.getCouleur() + "  |"));

    }
}
