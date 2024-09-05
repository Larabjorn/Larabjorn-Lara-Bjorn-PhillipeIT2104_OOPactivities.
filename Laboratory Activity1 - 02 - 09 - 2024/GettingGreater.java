import java.util.Scanner;
public class Gfg { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
        
        char a;
        char b;
        
        System.out.println("Getiing the Greater Value");
        System.out.print("Enter first character: \n");
        a = scanner.next().charAt(0);
        
        System.out.print("Enter second character: \n");
        b = scanner.next().charAt(0);


        int asciiA = (int) a;
        int asciiB = (int) b;
        

        char maxChar = (char) Math.max(asciiA, asciiB);
        
            System.out.println("\n--------------------------------------------------");
        System.out.println("The character with the higher ASCII value is: " + maxChar);
            System.out.println("--------------------------------------------------");
        
        System.out.println("Showing the ASCII Codes");    
        System.out.println("" + a + " : " + asciiA );
        System.out.println("" + b + " : " + asciiB );

        scanner.close();
    } 
}
