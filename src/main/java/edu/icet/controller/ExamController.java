package edu.icet.controller;

import edu.icet.dto.Exam;
import edu.icet.service.ExamService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/exame")
@RequiredArgsConstructor
@CrossOrigin
public class ExamController {

    final ExamService service ;

    @PostMapping("/create-exame")
    public void createExame(@RequestBody Exam exam){
      service.CreateExame(exam);
    }

    @GetMapping("/get-exame")
    public void getExame(@RequestBody Integer integer){
      service.getExameByCoursId(integer);
    }

    @GetMapping("/getAll")
    public List<Exam>getAll(){
        return service.getAll();
    }

    @DeleteMapping("delete/{id}")
    public Boolean deleteExame(@PathVariable("id") Integer id){
      return service.deleteExamById(id);
    }

}
