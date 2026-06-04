package com.example.music_backend.controller;

import com.example.music_backend.dto.SongRequest;
import com.example.music_backend.entity.Song;
import com.example.music_backend.service.SongService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/songs")
public class SongController {

    private final SongService service;

    public SongController(
            SongService service) {

        this.service = service;
    }

    @PostMapping
    public Song createSong(
            @RequestBody SongRequest request) {

        return service.createSong(request);
    }

    @GetMapping("/playlist/{playlistId}")
    public List<Song> getSongs(
            @PathVariable Long playlistId) {

        return service.getSongsByPlaylist(
                playlistId);
    }
    @GetMapping()
    public List<Song> getAllSongs(){
        return service.getALlSongs();

    }

    @DeleteMapping("/{id}")
    public void deleteSong(
            @PathVariable Long id) {

        service.deleteSong(id);
    }
}
