package org.ltlamontagne.repository;


import org.ltlamontagne.Player;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PlayerRepository extends MongoRepository<Player, String> {
}
