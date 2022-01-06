import java.util.ArrayList;
import java.util.Scanner;

public class saisieTableau {
    public static void main(String[] args) {
        ArrayList tab = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        int deg=0;
        while (deg != -1){
            deg = scanner.nextInt();
            if(deg != -1)
                tab.add(deg);
        }
        tab.forEach((n)-> System.out.println(n));
    }
}
