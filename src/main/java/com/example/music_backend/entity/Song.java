package com.example.music_backend.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "songs")
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String artist;

    private String songUrl;

    @ManyToOne
    @JoinColumn(name = "playlist_id")
    private Playlist playlist;

    public Song() {
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getSongUrl() {
        return songUrl;
    }

    public Playlist getPlaylist() {
        return playlist;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setSongUrl(String songUrl) {
        this.songUrl = songUrl;
    }

    public void setPlaylist(Playlist playlist) {
        this.playlist = playlist;
    }
}
