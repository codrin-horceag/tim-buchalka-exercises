package LinkedListChallenge;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
//    private ArrayList<Song> songs;
    private SongList songList;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
//        this.songs = new ArrayList<Song>();
        this.songList = new SongList();

    }

    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }

    public void addSong(String songTitle, double duration){
        this.songList.add(new Song(songTitle, duration));
        System.out.println("Added " + songTitle + " to album " + getName() + " by " + getArtist());
    }

    private class SongList{
        private ArrayList<Song> songs;

        public SongList() {
            this.songs = new ArrayList<Song>();
        }

        public boolean add(Song song){
            if(songs.contains(song)){
                return false;
            } else {
                songs.add(song);
                return true;
            }
        }

        private Song findSong(String songTitle){
            for(Song mySong: this.songs){
                if(mySong.getTitle().equals(songTitle)){
                    return mySong;
                }
            }
            return null;
        }

        private Song findSong(int trackNumber){
            int index = trackNumber - 1;
            if((index >= 0) && (index < songs.size())){
                return songs.get(index);
            }
            return null;
        }
    }


    public boolean addToPlaylist(int trackNumber, LinkedList<Song> playlist){
        int index = trackNumber - 1;
        if(this.songList.findSong(trackNumber) != null){
            playlist.add(this.songList.findSong(trackNumber));
            return true;
        } else {
            System.out.println(getName() + " does not have a track " + trackNumber);
            return false;
        }
    }

    public boolean addToPlaylist(String trackName, LinkedList<Song> playlist){
        if(this.songList.findSong(trackName) != null){
            playlist.add(this.songList.findSong(trackName));
            return true;
        } else {
            System.out.println("Song " + trackName + " isn't in the " + getName() + " album!");
            return false;
        }
    }

    public SongList getSongList() {
        return songList;
    }
}
