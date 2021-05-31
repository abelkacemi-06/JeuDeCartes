package fr.clinkast.jeudecartes.modele;

public enum Numero {

    AS(1),
    DEUX(2),
    TROIS(3),
    QUATRE(4),
    CINQ(5),
    SIX(6),
    SEPT(7),
    HUIT(8),
    NEUF(9),
    DIX(10),
    VALLET(11),
    DAME(12),
    ROI(13);


    private int numero;

    private Numero(int numero) {
        this.numero = numero;
    }
}
