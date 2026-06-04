package com.example.music_backend.service;

import com.example.music_backend.dto.SongRequest;
import com.example.music_backend.entity.Playlist;
import com.example.music_backend.entity.Song;
import com.example.music_backend.repository.PlaylistRepository;
import com.example.music_backend.repository.SongRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongService {

    private final SongRepository songRepository;

    private final PlaylistRepository playlistRepository;

    public SongService(
            SongRepository songRepository,
            PlaylistRepository playlistRepository) {

        this.songRepository = songRepository;
        this.playlistRepository = playlistRepository;
    }

    public Song createSong(
            SongRequest request) {

        Playlist playlist =
                playlistRepository
                        .findById(request.getPlaylistId())
                        .orElseThrow(() ->
                                new RuntimeException("Playlist not found with id: " + request.getPlaylistId())
                        );

        Song song = new Song();

        song.setTitle(request.getTitle());
        song.setArtist(request.getArtist());
        song.setSongUrl(request.getSongUrl());
        song.setPlaylist(playlist);

        return songRepository.save(song);
    }

    public List<Song> getSongsByPlaylist(
            Long playlistId) {

        return songRepository
                .findByPlaylistId(playlistId);
    }

    public void deleteSong(Long id) {

        songRepository.deleteById(id);
    }
    public List<Song> getALlSongs(){
        return songRepository.findAll();
    }
}
