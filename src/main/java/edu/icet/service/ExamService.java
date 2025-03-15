package edu.icet.service;

import edu.icet.dto.Exam;
import org.springframework.stereotype.Service;

import java.util.List;
public interface ExamService {
    void CreateExame(Exam exam);
    Exam getExameByCoursId(Integer integer);
    List<Exam>getAll();
    Boolean deleteExamById(Integer id);
    void deleteExamByCourdeId(Integer integer);

}
