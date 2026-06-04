package com.example.music_backend.dto;

public class SongRequest {

    private String title;

    private String artist;

    private String songUrl;

    private Long playlistId;

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getSongUrl() {
        return songUrl;
    }

    public Long getPlaylistId() {
        return playlistId;
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

    public void setPlaylistId(Long playlistId) {
        this.playlistId = playlistId;
    }
}
