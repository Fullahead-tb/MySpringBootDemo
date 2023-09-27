import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping
@Grab("org.webjars:jquery:3.4.1")
@Grab("org.springframework.boot:spring-boot-starter-thymeleaf:2.1.8.RELEASE")

@Controller
class HelloCli {

    @RequestMapping("/")
     String home(Model model){

        model.addAttribute("name","Hello World!");

        return  "welcome"
    }
}

