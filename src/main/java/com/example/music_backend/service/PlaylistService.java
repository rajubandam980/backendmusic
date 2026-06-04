package com.example.music_backend.service;

import com.example.music_backend.entity.Playlist;
import com.example.music_backend.repository.PlaylistRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaylistService {

    private final PlaylistRepository repository;

    public PlaylistService(
            PlaylistRepository repository) {
        this.repository = repository;
    }

    public Playlist createPlaylist(
            Playlist playlist) {

        return repository.save(playlist);
    }

    public List<Playlist> getAllPlaylists() {

        return repository.findAll();
    }

    public void deletePlaylist(Long id) {

        repository.deleteById(id);
    }
}
