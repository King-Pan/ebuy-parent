package club.javalearn.ebuy.product.web;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class IndexController {



    @RequestMapping("/home")
    public String home(){
        return  "Hello product";
    }
}
