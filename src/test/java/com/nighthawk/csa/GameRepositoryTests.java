package com.nighthawk.csa;

import com.nighthawk.csa.user.GameRepository;
import com.nighthawk.csa.user.Games;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;
import org.assertj.core.api.Assertions;

import java.util.Optional;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class GameRepositoryTests {

    @Autowired private GameRepository repo;

    @Test
    public void testAddNew(){
        Games games=new Games();
        games.setName("BTD 5");
        games.setRating(1);
        Games savedGame = repo.save(games);

    }
    @Test
    public void testListAll()
    {
        Iterable<Games> gamers = repo.findAll();
        Assertions.assertThat(gamers).hasSizeGreaterThan(0);

        for(Games games: gamers)
        {
            System.out.println(games);
        }
    }

    @Test
    public void testUpdate()
    {
        Integer gameId=1;
        Optional<Games> optionalGame=repo.findById(gameId);
        Games games= optionalGame.get();
        games.setRating(4);


    }
}

