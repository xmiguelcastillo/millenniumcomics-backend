package com.xmiguel.millenniumcomics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:5173")
@RestController
public class MillenniumController {
        private final ComicService comicService;
        @Autowired
        public MillenniumController(ComicService comicService) {
        this.comicService = comicService;
        }
    /**
     * Create a track
     * @param trackRequest
     * @return
     */
    @PostMapping("/post/comic")
    public ResponseEntity<Comic> createTrack(@RequestBody ComicRequest comicRequest) {
        Comic newComic = comicService.createComic(comicRequest);
        return ResponseEntity.status(201).body(newComic);
    }

    @GetMapping()
    public  ResponseEntity<List<Comic>> getAllComics(){
        return ResponseEntity.ok(comicService.getAllComics());
    }

    @GetMapping("/test-db")
    public ResponseEntity<String> testDB() {
        try {
            comicService.getAllComics();
            return ResponseEntity.ok("Connected");
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body("Not connected: " + e.getMessage());
        }
    }

}
