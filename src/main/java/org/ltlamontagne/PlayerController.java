package org.ltlamontagne;


import org.ltlamontagne.repository.PlayerRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PlayerController {


    private PlayerRepository repository;

    public PlayerController(PlayerRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/players")
    public List<Player> getAllPlayers(){
        return repository.findAll();
    }

    @PostMapping("/players")
    public ResponseEntity<String> addPlayer(@RequestBody Player player){
        repository.save(player);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }



}
