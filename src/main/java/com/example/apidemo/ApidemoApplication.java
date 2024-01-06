package com.example.apidemo;

import cn.hutool.http.HttpUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ApidemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApidemoApplication.class, args);
    }

    @GetMapping("/happy_new_year")
    public String happyNewYear() {
        try {
            return HttpUtil.get("https://api.8uid.cn/api/xnzf.php?type=text");
        } catch (Exception e) {
            return "Happy New Year!";
        }
    }

}
