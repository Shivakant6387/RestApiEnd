package com.example.RestAPIStartDay2.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class RestEndPoint {

    @Value("${default.course.name}")
    private String CName;
    @Value("${default.course.chapterCount}")
    private int chaptersCount;
    @RequestMapping("/DefaultCourse")
    public Course getDefaultCourse(@RequestParam(value = "name",defaultValue = " Spring Boot",required = false)String name,
                              @RequestParam(value = "chapCount",defaultValue = "3",required = false)int chapterCount){
        return new Course(CName,chaptersCount);
    }
    @RequestMapping("/course")
public Course getEndPoint(@RequestParam(value = "name",defaultValue = " Spring Boot",required = false)String name,
                          @RequestParam(value = "chapCount",defaultValue = "3",required = false)int chapterCount){
    return new Course(name,chapterCount);
}
@RequestMapping(method = RequestMethod.POST,value = "/register/course")
public String saveCourse(@RequestBody Course course){
        return "Your course named"+course.getName()+"with"+course.getChapterCount()+"chapter saved successfully";
}
}
