package com.demo.student.teacher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.JstlUtils;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/teacher")
public class TeacherController {

    private final TeacherService teacherService;

    @Autowired
    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @GetMapping
    public List<Teacher> getTeacherList(){
       return teacherService.getTeacher();
    }


    @PostMapping
    public void registerNewTeacher(@RequestBody Teacher teacher){
        teacherService.addNewTeacher(teacher);
    }

    @DeleteMapping(path = "{teacherId}")
    public void deleteTeacher(@PathVariable("teacherId") Long teacherId){
        teacherService.deleteTeacher(teacherId);
    }

    @PutMapping(path ="{teacherId}")
    public void updateTeacher(@PathVariable("teacherId") Long teacherId,@RequestParam(required = false) Long cui,@RequestParam(required = false) String name,@RequestParam(required = false) String email ){
        teacherService.updateTeacher(teacherId,cui,name,email);
    }


}
