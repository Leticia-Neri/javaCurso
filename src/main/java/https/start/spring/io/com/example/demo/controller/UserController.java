package https.start.spring.io.com.example.demo.controller;

import https.start.spring.io.com.example.demo.model.UserRest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
public class UserController {

    @GetMapping()
    public String getUser(@RequestParam(value = "page", defaultValue = "1") int page, @RequestParam(value = "limit") int limit ){
        return "get user was called with page " + page + " and limit " + limit;
    }

    @GetMapping(path="/{userId}")
    public UserRest getUser(@PathVariable String userId){

        UserRest returnValue = new UserRest();
        returnValue.setEmail("teste@test.com");
        returnValue.setFirstName("Leticia");
        returnValue.setLastName("Lima");

        return returnValue;
    }

    @PostMapping
    public String createUser(){
        return "create user was called";
    }

    @PutMapping
    public String updateUser(){
        return "update was called";
    }

    @DeleteMapping
    public String deleteUser(){
        return "delete was called";
    }
}
