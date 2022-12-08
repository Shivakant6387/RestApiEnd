package com.example.RestAPIStartDay2.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class RestEndPoint {
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
