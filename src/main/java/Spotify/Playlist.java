package Spotify;

import java.util.LinkedList;
import java.util.Scanner;

import static Spotify.Main.filterDuration;

public class Playlist {
    public static void main(String[] args) {
        System.out.println("---------Crea tu playlist---------");
        System.out.println(" ");

        System.out.println("Puedes escoger una de nuestras playlist diseñadas justo para ti o la puedes hacer tu mismo");
        System.out.println("-----------------------------");
        System.out.println("|      Crear     |   1      |");
        System.out.println("|      Escoger   |   2      |");
        System.out.println("-----------------------------");
        System.out.println(" ");

        Scanner opcion = new Scanner(System.in);
        Integer num = Integer.valueOf(opcion.nextLine());

        switch (num){
            case 1:
                System.out.println("Nombra tu playlist:");
                Scanner namePlaylist = new Scanner(System.in);
                String name = namePlaylist.nextLine();
                System.out.println(" ");

                System.out.println("Tu playlist debe tener mínimo 1 canción");
                System.out.print("Nombre: ");

                LinkedList createPlaylist = new LinkedList();
                Scanner songs = new Scanner(System.in);
                String addSongs = songs.nextLine();

                createPlaylist.add(addSongs);


                System.out.println(createPlaylist.get(0) +", Se agregó a: " + name+ " ¡ahora reproducela!");
                System.out.println("");

                System.out.println("--------------------------------------------------------");
                System.out.println("         Para añadir más canciones pulsa 3");
                System.out.println("--------------------------------------------------------");
                Integer opc = Integer.valueOf(opcion.nextLine());

                while (opc == 3) {
                    System.out.println("Escribe tu nueva canción:");

                    Scanner newS = new Scanner(System.in);
                    String addnew = newS.nextLine();

                    createPlaylist.add(addnew);

                    System.out.println(" ");
                    System.out.println("Buscando...");
                    System.out.println("Buscando...");
                    System.out.println(" ");
                    System.out.println(addnew+", Se agregó a tu playlist");
                    break;
                }
                break;

            case 2:
                System.out.println(" ");
                System.out.println("¡Esta es la playlist que los creadores hicimos para ti!");
                System.out.println("                 ¡Reproducela ahora!");
                System.out.println("--------------------------------------------------------");
                System.out.println(" ");
                filterDuration();
                System.out.println(" ");
                System.out.println("--------------------------------------------------------");
                System.out.println(" ");

            default:
                System.out.println("Okay >_<");
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("¡Hasta la próxima!");
        System.out.println("--------------------------------------------------------");

    }
}
