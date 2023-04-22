package ch.fhnw.securitytest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/securitytest")
public class MyController {

    @GetMapping("/view")
    public ResponseEntity<String> showContent() {
        return new ResponseEntity<>("Everyone can view this content.", HttpStatus.OK);
    }
    
    @GetMapping("/safe")
public ResponseEntity<String> showSafeContent() {
return new ResponseEntity<>("Only a token bearer can view this content", HttpStatus.OK);
}

}
