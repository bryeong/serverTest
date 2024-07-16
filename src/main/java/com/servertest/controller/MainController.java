package com.servertest.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;

@Controller
public class MainController {
    RestTemplate restTemplate = new RestTemplate();

    /*************로그인************/
    @GetMapping("/")
    public String startLogin() {
        return "login";
    }

    @PostMapping("/start")
    public String startPage(String id){
        if(id.equals("admin")){
            return "redirect:/admin";
        }
        return "redirect:/user";

    }


    /*************유저페이지로 이동************/

    @GetMapping("/user")
    public String get_user(Model model) {
        String url = "https://api.odcloud.kr/api/15109950/v1/uddi:1f78fe49-78b4-4784-a5f0-e2c8a60515b4?page=2&perPage=10&serviceKey=WX/qIsVj4inhHOXPUgOGfxI7MQh1LIHyhfli2ch1DGUWsG37xoDDh724K5F05MzVG2OQJuigRzUq63r/nTMfRg==";

        ResponseEntity<Map> response = restTemplate.getForEntity(url, Map.class);
        Map responseMap = response.getBody();
        List dataLists = (List) responseMap.get("data");

        for (Object datalist : dataLists) {
            Map d = (Map) datalist;
            System.out.println(d);
            String 가맹점명 = (String)d.get("가맹점명");
            System.out.println(가맹점명);
        }
        model.addAttribute("dataList", dataLists);

        return "/user";
    }

    @GetMapping("/admin")
    public String get_admin() {

        return "/admin";
    }
}
