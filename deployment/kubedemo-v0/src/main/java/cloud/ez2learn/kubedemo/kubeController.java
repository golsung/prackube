package cloud.ez2learn.kubedemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class kubeController {
    @GetMapping("/")
    public String hello() {
        return "Hello version 0";
    }
}
