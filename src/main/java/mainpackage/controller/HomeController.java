package mainpackage.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping(value = "/home")
    public ResponseEntity<String> hi(){
        return new ResponseEntity<>("Hi, Welcome to Home Page!",HttpStatus.OK);
    }
}
