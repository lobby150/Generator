package app;
import java.lang.reflect.Array;
import java.util.ArrayList;
public class Generator {
    public ArrayList<Recipe> get100Recipes()
    {
        int z =0;
        ArrayList<Recipe> recipes = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();
        for(int i=0;i<100;i++)
        {
            Recipe recipe = new Recipe();
            names.add(recipe.getName());
            for(String nazwa: names) { //sprawdzam czy podana nazwa juz istnieje, jesli tak to usuwam i generuje nowa
                if (names.contains(nazwa))
                    z++;
                if (z == 1) {
                    z=0;
                }
                else if (z>1)
                {
                    recipes.remove(recipe);
                    z=0;
                    i--;
                }
            }
            recipes.add(recipe);
        }
        return recipes;
    }

}
