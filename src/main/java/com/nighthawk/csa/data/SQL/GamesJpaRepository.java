package com.nighthawk.csa.data.SQL;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface GamesJpaRepository extends JpaRepository<Game, Long> {
    List<Game> RatingandNameofGame(String name, int rating);
}
