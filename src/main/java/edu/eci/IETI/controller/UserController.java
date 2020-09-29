package edu.eci.IETI.controller;

import edu.eci.IETI.Service.UserService;
import edu.eci.IETI.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Diego23p
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {
    
    @Autowired
    @Qualifier("UserService")
    UserService userService;
    
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> getAll() {
        try {
            return new ResponseEntity<>(userService.getAll(), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            return new ResponseEntity<>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    @RequestMapping(method = RequestMethod.GET, value="/getById/{id}")
    public ResponseEntity<?> getById(@PathVariable(name="id") String id) {
        try {
            return new ResponseEntity<>(userService.getById(id), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            return new ResponseEntity<>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> create(@RequestBody User user) {
        try {
            return new ResponseEntity<>(userService.create(user), HttpStatus.CREATED);
        } catch (Exception ex) {
            return new ResponseEntity<>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<?> update(@RequestBody User user) {
        try {
            return new ResponseEntity<>(userService.update(user), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            return new ResponseEntity<>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    @RequestMapping(method = RequestMethod.DELETE, value="/removeById/{id}")
    public ResponseEntity<?> remove(@PathVariable(name="id") String id) {
        try {
            userService.remove(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception ex) {
            return new ResponseEntity<>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
  
}
