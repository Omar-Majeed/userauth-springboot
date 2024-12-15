package user;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    public List<User> getUsers(){
        return List.of(new User(1L,"momar","momar@gmail.com","12345","manager",true),
                new User(2L,"dad","dad@gmail.com","12345","manager",true));
    }

}
