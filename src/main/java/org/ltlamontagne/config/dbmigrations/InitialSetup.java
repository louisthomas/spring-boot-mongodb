package org.ltlamontagne.config.dbmigrations;


import com.github.mongobee.changeset.ChangeLog;
import com.github.mongobee.changeset.ChangeSet;
import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DB;
import com.mongodb.DBCollection;

@ChangeLog(order = "001")
public class InitialSetup {

    @ChangeSet(order = "01", author = "initator", id = "01-addPlayers")
    public void addPlayers(DB db) {
        DBCollection playerCollection = db.getCollection("players");
        playerCollection.insert(BasicDBObjectBuilder.start()
                .add("_id", "player-0")
                .add("first_name", "Eric")
                .add("last_name", "Lindros")
                .get());

        playerCollection.insert(BasicDBObjectBuilder.start()
                .add("_id", "player-1")
                .add("first_name", "Pat")
                .add("last_name", "Lafontaine")
                .get());
    }

}
