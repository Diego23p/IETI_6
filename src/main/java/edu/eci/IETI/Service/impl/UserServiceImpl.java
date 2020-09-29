package edu.eci.IETI.Service.impl;

import edu.eci.IETI.Service.UserService;
import edu.eci.IETI.model.User;
import java.util.ArrayList;
import java.util.Date;
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
        
        User user1 = new User("Hacer BackEnd","Viviana","vivi@mail","Ready",new Date());
        User user2 = new User("Hacer FrontEnd","Omar","omar@mail","InProgress",new Date());
        
        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        
        return users;
    }

    @Override
    public User getById(String userId) {
        
        User user1 = new User("Instalar Docker",userId,userId+".com","InProgress",new Date());
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
