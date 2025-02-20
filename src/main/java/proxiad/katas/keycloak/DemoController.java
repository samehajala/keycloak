package proxiad.katas.keycloak;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api/v1/demo")
@EnableMethodSecurity
public class DemoController {
   
    @GetMapping()
    @PreAuthorize("hasRole('client_msatek')")
    public String hello(){
        return "Hello " ; 
    }

    @GetMapping("/helloSiSameh")
    @PreAuthorize("hasRole('client_mahboul')")
    public String helloSiSameh(){
        return "Hello si ajala sameh raak mobde3 badi3 lbad3aaawi" ; 
    }
}
