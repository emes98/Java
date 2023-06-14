import java.sql.Array;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        int[] tab1 = { 1, 5, 7, 3, 4 };

        System.out.println(tab1.length);

        int sum = 0;

        for (int x : tab1) {
            sum += x;
        }

        System.out.println(sum);

        ArrayList<String> lista = new ArrayList<>();

        lista.add("One");

        System.out.println(lista.get(0));

        lista.add("Two");
        lista.add("Three");
        lista.add("Four");

        lista.add(4, "Five");

        System.out.println(lista);
        System.out.println(lista.size());

        ArrayList<String> kopia = new ArrayList<>();

        kopia.addAll(lista);
        kopia.set(4, "oops");
        kopia.remove(3);

        boolean containsFour = kopia.contains("Four");

        System.out.println("Lista 'kopia': " + kopia);
        System.out.println("");

        System.out.println("Czy lista zawiera 'Four' ? " + containsFour);
        System.out.println("");

        ArrayList<Integer> num = new ArrayList<>();

        for (int x : tab1) {
            num.add(x);
        }

        num.set(0, 6);

        System.out.println("Lista 'num': " + num);
        System.out.println("");

        ArrayList<Object> obiekty = new ArrayList<>();

        obiekty.add("Test");
        obiekty.add(5);
        obiekty.add(true);

        System.out.println("Lista 'obiekty': " + obiekty);

        String tekst = (String) obiekty.get(0);
        int liczba = (int) obiekty.get(1);

        System.out.println(tekst);

    }
}
