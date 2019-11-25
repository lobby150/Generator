package app;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /*
        // podmiot - 25, czyj - 25, czynnosci - 50, skladniki - ok. 100
        List<String> podmiot = new ArrayList<String>();
        List<String> czynnosci = new ArrayList<String>();
        List<String> skladniki = new ArrayList<String>();
        List<String> przydawka = new ArrayList<String>();

        try
        {
            File plik_podmiot = new File("C:\\Users\\rejwe\\OneDrive\\Desktop\\semestr 4\\bazy_danyych_projekt\\Generator\\podmiot");
            File plik_przydawka = new File("C:\\Users\\rejwe\\OneDrive\\Desktop\\semestr 4\\bazy_danyych_projekt\\Generator\\przydawka");
            File plik_skladniki = new File("C:\\Users\\rejwe\\OneDrive\\Desktop\\semestr 4\\bazy_danyych_projekt\\Generator\\skladniki");
            File plik_czynnosci = new File("C:\\Users\\rejwe\\OneDrive\\Desktop\\semestr 4\\bazy_danyych_projekt\\Generator\\czynnosci");

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

            sc = new Scanner(plik_czynnosci);
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

            // EWENTUALNIE tak można: =============== (zamiast Arraylisty)
            sc = new Scanner(plik_przydawka);
            String[] przyd = new String[25];
            int i = 0;
            while (sc.hasNext())
            {
                przyd[i] = sc.next();
                System.out.println("Element " + i + ": " + przyd[i]);
                i++;
            }
            // =======================================
        }
        catch (FileNotFoundException e)
        {
            System.err.println("Brak pliku, zla sciezka");
            e.printStackTrace();
        }

        // wyświetlenie list:
        for (String s : podmiot)
        {
            System.out.println("Kolejny element: " + s);
        }
        for (String s : przydawka)
        {
            System.out.println("Kolejny element: " + s);
        }
        for (String s : skladniki) {
            System.out.println("Kolejny element: " + s);
        }
        for (String s : czynnosci)
        {
            System.out.println("Kolejny element: " + s);
        }

        // randomowo wybierac indeks z listy/tablicyStringów(?) podmiotów i łączyć z szuflowaną przydawką - jednak nie
        List<String> nazwa_przepisu = new ArrayList<String>();

        int j = 0;
        for (int i = 0; i<10;)
        {
            Iterator<String> podmiotIterator = podmiot.iterator();
            Iterator<String> przydawkaIterator = przydawka.iterator();

            Collections.shuffle(podmiot);
            Collections.shuffle(przydawka);
            while (podmiotIterator.hasNext())
            {
                StringBuilder listaPomocnicza = new StringBuilder(podmiotIterator.next() + " ");
                listaPomocnicza.append(przydawkaIterator.next());
                String temp = listaPomocnicza.toString();
                nazwa_przepisu.add(temp);
                Collections.shuffle(przydawka);
                j++;
            }
            i++;
            System.out.println("LISTA Z NAZWAMI PRZEPISOW:");
            for (String s : nazwa_przepisu)
            {
                System.out.println("Kolejny Element: " + s + " j = " + j + " i = " + i);
            }
        }

         */
        Generator generator = new Generator();
        ArrayList<Recipe> recipes;
        recipes = generator.get100Recipes();
        for(Recipe s : recipes)
        {
         s.getRecipe(s);
        }



    }
}