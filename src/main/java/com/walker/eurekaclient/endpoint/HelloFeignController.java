package com.walker.eurekaclient.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class HelloFeignController {

    @Autowired
    private HelloFeignService helloFeignService;

    @GetMapping("/search/github")
    public String searchGithubRepo(@RequestParam("query") String queryStr) {
        return helloFeignService.searchRepo(queryStr);
    }

    @GetMapping("/add")
    public String add(int a, int b, HttpServletRequest request) {
        return "From port: " + request.getServerPort() + ", result: " + (a+b);
    }
}
