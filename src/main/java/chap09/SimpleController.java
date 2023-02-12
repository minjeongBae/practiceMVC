package chap09;

import android.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class SimpleController {

    @GetMapping("/simple_restController")
    public Object restController(){
        android.Data data = new Data();
        data.setAndroidID("ID");
        data.setDateTime(String.valueOf(new Date()));
        return data;
    }


    //private final android.Data data;
    @GetMapping("/simple1")
    public @ResponseBody Object simeple1(){
        android.Data data = new Data();
        data.setAndroidID("ID");
        data.setDateTime(String.valueOf(new Date()));
        System.out.println(data.androidID+data);
        return data;
    }

//    @GetMapping("/simple2")
//    public @ResponseBody ResponseEntity<android.Data> simeple2(){
//        data.setAndroidID("ID");
//        data.setDateTime(String.valueOf(new Date()));
//        return ResponseEntity.ok(data);
//    }

    @GetMapping("/simple")
    public String simple(){
        return "simple";
    }
}
