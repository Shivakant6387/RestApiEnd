package com.example.RestAPIStartDay2.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestEndPoint {
    @RequestMapping("/course")
public Course getEndPoint(@RequestParam(value = "name",defaultValue = " Spring Boot",required = false)String name,
                          @RequestParam(value = "chapCount",defaultValue = "3",required = false)int chapterCount){
    return new Course(name,chapterCount);
}
}
