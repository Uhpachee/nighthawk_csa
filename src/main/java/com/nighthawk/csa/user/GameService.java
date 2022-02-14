package com.nighthawk.csa.user;

import com.nighthawk.csa.user.GameRepository;
import com.nighthawk.csa.user.Games;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
public class GameService {
    @Autowired private GameRepository repo;
    public List<Games> listAll()
    {
        return (List<Games>) repo.findAll();
    }
    public void save(Games games)
    {
        repo.save(games);
    }
    public Games get(Integer Id) throws UserNotFoundException
    {
        Optional<Games> result = repo.findById(Id);
        if(result.isPresent())
        {
            return result.get();
        }
        throw new UserNotFoundException("Could Not Find Any Games with ID"+Id);
    }
    public void delete(Integer Id) {
        repo.deleteById(Id);
    }

}
