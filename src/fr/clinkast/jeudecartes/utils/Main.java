package fr.clinkast.jeudecartes.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static <T> List<T> tirageAleatoire(List<T> list, int totalItems) {
        if (list == null || list.size() == 0) {
            return new ArrayList<T>();
        }
        Random rand = new Random();
        List<T> newList = new ArrayList<>();
        for (int i = 0; i < totalItems; i++) {
            int randomIndex = rand.nextInt(list.size());
            newList.add(list.get(randomIndex));
            list.remove(randomIndex);
        }
        return newList;
    }


}

