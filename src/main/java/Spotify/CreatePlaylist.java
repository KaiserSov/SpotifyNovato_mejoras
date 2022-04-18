package Spotify;

import java.util.LinkedList;
import java.util.Scanner;

public class CreatePlaylist extends Song{
    public CreatePlaylist(String title, Integer id, Integer year, Integer duration, String genre, String mask, String description) {
        super(title, id, year, duration, genre, mask, description);

        LinkedList createPlaylist = new LinkedList();
        Scanner songs = new Scanner(System.in);
        String addSongs = songs.nextLine();

        createPlaylist.add(addSongs);
        createPlaylist.add(addSongs);


        System.out.println("Tu playlist es: "+createPlaylist.get(1) + "ahora reproducela");

    }

    public void create(){
        System.out.println("Agregaste canciones");
    }


}
