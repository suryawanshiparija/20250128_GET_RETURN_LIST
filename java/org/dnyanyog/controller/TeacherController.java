package org.dnyanyog.controller;

import java.util.List;

import org.dnyanyog.service.TeacherService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/teacher")
public class TeacherController {
    private final TeacherService teacherService = new TeacherService();

    @GetMapping("/name/{ID}")
    public String getTeacherName(@PathVariable String ID) {
        return teacherService.getTeach_Name(ID);
    }

    @GetMapping("/email/{ID}")
    public List<String> getTeacherEmail(@PathVariable String ID) {
        return teacherService.getTeach_Email(ID);
    }

    @GetMapping("/mobile/{ID}")
    public String getTeacherMobile(@PathVariable String ID) {
        return teacherService.getTeach_Mob(ID);
    }
}
