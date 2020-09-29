package edu.eci.IETI.Service;

import edu.eci.IETI.model.User;
import java.util.List;

/**
 *
 * @author Diego23p
 */
public interface UserService {
    
    List<User> getAll();
    
    User getById(String userId);
    
    User create(User user);
    
    User update(User user);
    
    void remove(String userId);
}