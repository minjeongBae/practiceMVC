package chap09;

import com.sun.org.apache.xpath.internal.operations.Bool;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;

@Controller
public class WelcomeController {
    @RequestMapping("/welcome")
    public String welcome(){
        return "welcome";
    }

    @PostMapping("/step2")
    public String nextStep(Model m, @RequestParam(value = "id") String paramId,
                           @RequestParam(value = "text") String paramText,
                           @RequestParam(value = "check") String paramCheck){
        System.out.println("/step2"+paramId+paramText+paramCheck);

        m.addAttribute("id",paramId);
        m.addAttribute("text",paramText);
        m.addAttribute("check",paramCheck);
        return "step2";
    }


    @PostMapping("/step2-1")
    public String nextStep1(Model m, HttpServletRequest rq){
        System.out.println("/step2-1");
        m.addAttribute(rq.getParameter("num"));
        return "step2-1";
    }
    @GetMapping("/step2-1")
    public String redirect(){
        return "redirect:/welcome";
    }

    @GetMapping("/step2-2")
    public String nextStep2(Model m,HttpServletRequest rq){
        System.out.println("/step2-2");
        String paramString = rq.getParameter("stepString");
        System.out.println(paramString);
        m.addAttribute("stepString",paramString);
        return "step2-2";
    }
}
