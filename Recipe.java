package app;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Recipe {
    public String name;
    public boolean isVege;
    public String description;
    public Recipe()
    {
        this.name = createName();
        this.description=createDescription();
        if(description.contains("kurczaka"))
        {
            this.isVege=false;
        }
        else
            this.isVege=true;
    }

    public boolean isVege() {
        return isVege;
    }

    public void setVege(boolean vege) {
        isVege = vege;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public void getRecipe(Recipe recipe)
    {
        if(recipe.isVege==true)
        {
            System.out.println("Wegetarianska potrawa o nazwie: " + recipe.getName() + ", przepis: " + recipe.getDescription() + "\n");
        }
        else
            System.out.println("Miesna potrawa o nazwie: " + recipe.getName() + ", przepis: " + recipe.getDescription() + "\n");
    }
    public String createName()
    {
        String name = "";
        List<String> podmiot = new ArrayList<String>();
        List<String> przydawka = new ArrayList<String>();
        try
        {
            File plik_podmiot = new File("C:\\Users\\rejwe\\OneDrive\\Desktop\\semestr 4\\bazy_danyych_projekt\\Generator\\podmiot");
            File plik_przydawka = new File("C:\\Users\\rejwe\\OneDrive\\Desktop\\semestr 4\\bazy_danyych_projekt\\Generator\\przydawka");


            Scanner sc = new Scanner(plik_podmiot);
            while (sc.hasNext())
            {
                podmiot.add(sc.next());
            }
            sc.close();

            sc = new Scanner(plik_przydawka);
            while (sc.hasNext())
            {
                przydawka.add(sc.next());
            }
            sc.close();
        }
        catch (FileNotFoundException e)
        {
            System.err.println("Brak pliku, zla sciezka");
            e.printStackTrace();
        }
        Collections.shuffle(podmiot);
        Collections.shuffle(przydawka);
        name = name + podmiot.get(0) + " " + przydawka.get(0);
        return name;
    }
    public String createDescription()
    {
        String description="";
        List<String> czynnosci = new ArrayList<String>();
        List<String> skladniki = new ArrayList<String>();
        try
        {

            File plik_skladniki = new File("C:\\Users\\rejwe\\OneDrive\\Desktop\\semestr 4\\bazy_danyych_projekt\\Generator\\skladniki");
            File plik_czynnosci = new File("C:\\Users\\rejwe\\OneDrive\\Desktop\\semestr 4\\bazy_danyych_projekt\\Generator\\czynnosci");


            Scanner sc = new Scanner(plik_czynnosci);
            while (sc.hasNext())
            {
                czynnosci.add(sc.next());
            }
            sc.close();

            sc = new Scanner(plik_skladniki);
            while (sc.hasNext())
            {
                skladniki.add(sc.next());
            }
            sc.close();



        }
        catch (FileNotFoundException e)
        {
            System.err.println("Brak pliku, zla sciezka");
            e.printStackTrace();
        }

        for(int i = 0;i<100;i++)
        {
            Collections.shuffle(czynnosci);
            Collections.shuffle(skladniki);
            description = description + czynnosci.get(0) + " " + skladniki.get(0) + ". ";
        }

        return description;

    }
}
