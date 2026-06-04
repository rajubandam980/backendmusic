package com.example.music_backend.controller;

import com.example.music_backend.entity.Playlist;
import com.example.music_backend.service.PlaylistService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/playlists")
@CrossOrigin(origins = "http://localhost:4200")
public class PlaylistController {

    private final PlaylistService service;

    public PlaylistController(
            PlaylistService service) {
        this.service = service;
    }

    @GetMapping
    public List<Playlist> getAll() {

        return service.getAllPlaylists();
    }

    @PostMapping
    public Playlist create(
            @RequestBody Playlist playlist) {

        return service.createPlaylist(
                playlist);
    }

    @DeleteMapping("/{id}")
    public void delete(
            @PathVariable Long id) {

        service.deletePlaylist(id);
    }
}