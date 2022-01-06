import java.util.ArrayList;

public class arraylistAjouterElem {
    public static void main(String[] args) {
        ArrayList tab = new ArrayList();

        tab.add(1);
        tab.add(5);
        tab.add(4);
        
        tab.forEach((n)-> System.out.println(n));

        tab.add(1);

        tab.forEach((n)-> System.out.println(n));

    }
}
