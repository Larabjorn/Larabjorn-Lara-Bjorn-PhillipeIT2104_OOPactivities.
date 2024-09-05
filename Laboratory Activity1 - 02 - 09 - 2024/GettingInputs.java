import java.util.Scanner;

public class Musictrack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int year;
        String genre;
        String album;
        String title;
        String artist;
        

        System.out.print("Enter the year: \n");
        year = scanner.nextInt ();
        scanner.nextLine ();

        System.out.print("Enter the genre: \n");
        genre = scanner.nextLine ();

        System.out.print("Enter the album: \n");
        album = scanner.nextLine ();

        System.out.print("Enter the song title: \n");
        title = scanner.nextLine ();
        
        System.out.print("Enter the artist: \n");
        artist = scanner.nextLine ();
        
            System.out.println("\n---------------------------");
        System.out.println("\nSONG DETAILS");
            System.out.println("\n---------------------------");
        
        System.out.println("\nYear Released: " + year);
        System.out.println("\nGenre: " + genre);
        System.out.println("\nAlbum: " + album);
        System.out.println("\nTitle: \"" + title + "\"");
        System.out.println("\nArtist: " + artist);
        
        scanner.close();

    }
}
