package com.rest;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/1.0/user")

public class UserAPIController {

//    @GetMapping()
//    public String greeting() {
//        return "Hello from API";
//    }
//    @Autowired
//    private JwtService jwtService;
//
//    @Autowired
//    private UserServices userServices;

    /* ---------------- GET ALL USER ------------------------ */
//    @RequestMapping(value = "/users", method = RequestMethod.GET)
//    public ResponseEntity<List<User>> getAllUser() {
//        return new ResponseEntity<List<User>>(userServices.findAll(), HttpStatus.OK);
//    }

    /* ---------------- GET USER BY ID ------------------------ */
//    @RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
//    public ResponseEntity<Object> getUserById(@PathVariable int id) {
//        User user = userServices.findById(id);
//        if (user != null) {
//            return new ResponseEntity<Object>(user, HttpStatus.OK);
//        }
//        return new ResponseEntity<Object>("Not Found User", HttpStatus.NO_CONTENT);
//    }

    /* ---------------- CREATE NEW USER ------------------------ */
//    @RequestMapping(value = "/users", method = RequestMethod.POST)
//    public ResponseEntity<String> createUser(@RequestBody User user) {
//        if (userServices.add(user)) {
//            return new ResponseEntity<String>("Created!", HttpStatus.CREATED);
//        } else {
//            return new ResponseEntity<String>("User Existed!", HttpStatus.BAD_REQUEST);
//        }
//    }

    /* ---------------- DELETE USER ------------------------ */
//    @RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
//    public ResponseEntity<String> deleteUserById(@PathVariable int id) {
//        userServices.delete(id);
//        return new ResponseEntity<String>("Deleted!", HttpStatus.OK);
//    }
}