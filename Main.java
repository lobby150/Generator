package app;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static void main(String[] args) {


        Generator generator = new Generator();
        ArrayList<Recipe> recipes;
        recipes = generator.get100Recipes();
        for(Recipe s : recipes)
        {
            s.getRecipe(s);
        }

    }
}