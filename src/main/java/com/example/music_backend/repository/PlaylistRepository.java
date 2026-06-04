package com.example.music_backend.repository;

import com.example.music_backend.entity.Playlist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaylistRepository
        extends JpaRepository<Playlist, Long> {
}
