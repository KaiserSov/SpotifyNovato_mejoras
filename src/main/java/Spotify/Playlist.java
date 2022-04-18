package Spotify;

import java.util.LinkedList;
import java.util.Scanner;

import static Spotify.Main.filterDuration;

public class Playlist {
    public static void playlist(String[] args) {
        System.out.println("---------Crea tu playlist---------");
        System.out.println(" ");

        System.out.println("Puedes escoger una de nuestras playlist diseñadas justo para ti o la puedes diseñar tu mismo");
        System.out.println("Crear    |   1");
        System.out.println("Escoger  |   2");
        System.out.println(" ");

        Scanner opcion = new Scanner(System.in);
        Integer num = Integer.valueOf(opcion.nextLine());

        switch (num){
            case 1:
                System.out.println("Nombra tu playlist");
                Scanner namePlaylist = new Scanner(System.in);
                String name = namePlaylist.nextLine();
                System.out.println(" ");

                System.out.println("Tu playlist debe tener mínimo 2 canciones");
                LinkedList createPlaylist = new LinkedList();
                Scanner songs = new Scanner(System.in);
                String addSongs = songs.nextLine();

                createPlaylist.add(0,addSongs);
                createPlaylist.add(1,addSongs);


                System.out.println(name + createPlaylist.get(1) + " ahora reproducela");
                System.out.println("Para añadir más canciones pulsa la letra m");
                break;

            case 2:
                System.out.println(" ");
                System.out.println("¡Esta es la playlist que los creadores hicieron para ti!");
                System.out.println("                 ¡Reproducela ahora!");
                System.out.println("--------------------------------------------------------");
                System.out.println(" ");
                filterDuration();
        }

    }
}
