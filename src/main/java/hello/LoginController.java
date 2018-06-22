package hello;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @PostMapping(value= "/publico/v1/login/", produces="application/json", consumes="application/json")
    public ResponseEntity<String> buscaPorId(@RequestBody Usuario usuario) {
        
        
		return ResponseEntity.status(HttpStatus.OK).body("{'token':'abcdefghij1234567890'}");
    }
    
    @GetMapping(value= "/publico/v1/login/{token}", produces="application/json")
    @ResponseBody
    public ResponseEntity<String> buscaPorId(@PathVariable(value="token") String token) {
        
		return ResponseEntity.ok("{'valido':'true'}");
    }

}
