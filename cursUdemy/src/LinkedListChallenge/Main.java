package LinkedListChallenge;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {
        Album album = new Album("Nevermind", "Nirvana");
        album.addSong("Smells Like Teen Spirit", 5.50);
        album.addSong("In Bloom", 3.50);
        album.addSong("Come As You Are", 4.20);
        album.addSong("Breed", 3.19);
        album.addSong("Lithium", 4.01);
        album.addSong("Polly", 3.57);
        album.addSong("Territorial Pissings", 2.30);
        album.addSong("Drain You", 3.14);
        album.addSong("Lounge Act", 2.59);
        album.addSong("Stay Away", 2.47);
        album.addSong("Lounge Act", 3.10);
        album.addSong("Something In The Way", 5.20);
        album.addSong("Endless Nameless", 1.51);
        albums.add(album);

        Album secondAlbum = new Album("Dirt", "Alice In Chains");
        secondAlbum.addSong("Them Bones", 3.14);
        secondAlbum.addSong("Dam That River", 4.20);
        secondAlbum.addSong("Rain When I Die", 3.11);
        secondAlbum.addSong("Down In A Hole", 6.15);
        secondAlbum.addSong("Sickman", 4.57);
        secondAlbum.addSong("Rooster", 5.01);
        secondAlbum.addSong("Junkhead", 3.47);
        secondAlbum.addSong("Dirt", 3.51);
        secondAlbum.addSong("God Smack", 2.50);
        secondAlbum.addSong("Iron Gland", 3.14);
        secondAlbum.addSong("Hate To Feel", 3.46);
        secondAlbum.addSong("Angry Chair", 5.23);
        secondAlbum.addSong("Would?", 3.59);
        albums.add(secondAlbum);

        LinkedList<Song> myPlaylist = new LinkedList<Song>();
        albums.get(0).addToPlaylist("Come As You Are", myPlaylist);
        albums.get(0).addToPlaylist("Smells Like Teen Spirit", myPlaylist);
        albums.get(0).addToPlaylist("Heart Shaped Box", myPlaylist);
        albums.get(1).addToPlaylist(13,myPlaylist);
        albums.get(1).addToPlaylist(21, myPlaylist);
        albums.get(0).addToPlaylist(5, myPlaylist);
        printList(myPlaylist);
        play(myPlaylist);

    }

    private static void play(LinkedList<Song> playlist){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        printMenu();
        ListIterator<Song> listIterator = playlist.listIterator();
        if(playlist.size() == 0){
            System.out.println("No songs in playlist!");
            return;
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
        }

        while(!quit){
            int action = Integer.valueOf(scanner.next());
            switch(action){
                case 0:
                    System.out.println("Playlist complete!");
                    quit = true;
                    break;
                case 1:
                    if(!forward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        forward = true;
                    }
                    
                    if(listIterator.hasNext()){
                        System.out.println("Now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("We have reached the end of the playlist");
                        forward = false;
                    }
                    break;
                case 2:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        forward = false;
                    }

                    if(listIterator.hasPrevious()){
                        System.out.println("Now playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("We have reached the beginning of the playlist!");
                        forward = true;
                    }
                    break;
                case 3:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            System.out.println("Now replaying " + listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("We are at the start of the list.");
                        }
                    } else {
                        if(listIterator.hasNext()){
                            System.out.println("Now replaying " + listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("We are at the end of the list.");
                        }
                    }
                    break;
                case 4:
                    printList(playlist);
                    break;
                case 5:
                    printMenu();
                    break;
            }
            System.out.println("Pick option!");
        }

    }

    private static void printMenu(){
        System.out.println("0 - Stop listening to playlist");
        System.out.println("1 - Listen to the next song!");
        System.out.println("2 - Listen to previous song!");
        System.out.println("3 - Replay current song!");
        System.out.println("4 - View songs currently in playlist");
        System.out.println("5 - Print menu");
    }

    private static void printList(LinkedList<Song> playlist){
        ListIterator iterator = playlist.listIterator();
        System.out.println("=============================");
        System.out.println("Playlist: ");
        while(iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
        System.out.println("=============================");
    }
}
