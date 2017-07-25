package linkstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/link/")
public class LinkController {

    @RequestMapping("")
    @ResponseBody
    public List<String> getLinks(){
        return Arrays.asList("http://youtube.com");
    }
}
