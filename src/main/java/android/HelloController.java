package android;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
@RequiredArgsConstructor
public class HelloController {

    private final Data data;
    @GetMapping("/hello")
    public String hello(Model model,
                        @RequestParam(value = "name", required = false) String name) {
        model.addAttribute("greeting", "안녕하세요, " + name);
        System.out.println("hello");
        return "hello";
    }

    @GetMapping("/testJson")
    public @ResponseBody ResponseEntity<Data> testJson(){
        data.setDateTime(String.valueOf(new Date()));
        data.setAndroidID("minjung010620");
        return ResponseEntity.ok(data);
    }
}