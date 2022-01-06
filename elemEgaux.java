import java.util.ArrayList;

public class elemEgaux {
    public static void main(String[] args) {
        ArrayList tab1 = new ArrayList();
        ArrayList tab2 = new ArrayList();

        tab1.add(1);
        tab1.add(7);
        tab1.add(2);

        tab2.add(1);
        tab2.add(7);
        tab2.add(4);
        tab2.add(3);

        tab1.forEach((n)-> System.out.println(tab2.contains(n) ? n : ""));
    }
}
