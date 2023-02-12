package android;

import org.springframework.stereotype.Controller;
import com.google.gson.JsonObject;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
public class TestController {
    @GetMapping("/android-test")
    public String android(@RequestParam(value = "androidID", required = false) String androidID) {
        System.out.println("android-test");
        Date dateTime = new Date();
        JsonObject jo = new JsonObject();
        jo.addProperty("androidID",androidID);
        jo.addProperty("dateTime",dateTime.toString());

        System.out.println(jo.getClass().getName());

        return jo.toString();
    }

}
