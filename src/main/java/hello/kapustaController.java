package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class kapustaController {

    @RequestMapping("/kapusta")
    public String greeting(@RequestParam(value = "name", required = false, defaultValue = "Zenek") String name, Model model) {
        model.addAttribute("name", name);
        return "kapusta";
    }
}