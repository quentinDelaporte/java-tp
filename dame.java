import java.util.Scanner;

public class dame {
    public static void main(String[] args) {
        int max = 10;
        int nextPosCol;
        int nextPosLigne;
        Scanner scanner = new Scanner(System.in);
        System.out.println("ligne");
        int posligne = scanner.nextInt();
        System.out.println("col");
        int poscol = scanner.nextInt();
        System.out.println("Mouv (0 -> HG, 1 -> HD, 2 -> BG, 3 -> BD");
        int direction = scanner.nextInt();
        switch (direction) {
            case 0:
                nextPosLigne = posligne -1;
                nextPosCol = poscol +1;
                break;
        case 1:
                nextPosLigne = posligne +1;
                nextPosCol = poscol  +1;
                break;
        case 2:
                nextPosLigne = posligne -1;
                nextPosCol = poscol  -1;
                break;
        case 3:
                nextPosLigne = posligne +1;
                nextPosCol = poscol  -1;
                break;
        default:
                nextPosLigne = posligne;
                nextPosCol = poscol;
                break;
        }
        if(nextPosLigne >= 1 && nextPosLigne<=10 && nextPosCol >= 1 && nextPosCol<=10)
            System.out.println("Valide");
        else 
            System.out.println("Invalide");
       
    }}
