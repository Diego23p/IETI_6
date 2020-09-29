package edu.eci.IETI.Service.impl;

import edu.eci.IETI.Service.UserService;
import edu.eci.IETI.model.User;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

/**
 *
 * @author Diego23p
 */
@Service("UserService")
public class UserServiceImpl implements UserService {

    @Override
    public List<User> getAll() {
        
        User user1 = new User("vivi@mail","viviana","1234");
        User user2 = new User("omar@mail","Omar","1234");
        
        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        
        return users;
    }

    @Override
    public User getById(String userId) {
        
        User user1 = new User(userId+"@mail",userId,"1234");
        return user1;
        
    }

    @Override
    public User create(User user) {
        
        //User user1 = new User("Crear loguin","Daniel","daniel@mail","Done",new Date());
        return user;
        
    }

    @Override
    public User update(User user) {
        
        //User user1 = new User("Crear controller","camila","camila@mail","Donae",new Date());
        return user;
        
    }

    @Override
    public void remove(String userId) {
        
    }
    
}
