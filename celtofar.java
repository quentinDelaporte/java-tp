import java.util.Scanner;

public class celtofar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int deg = scanner.nextInt();

        System.out.println(celtofar(deg));
    }
    
    public static float celtofar(int cel){
        return (cel * 9/5) + 32;
    }
    
}