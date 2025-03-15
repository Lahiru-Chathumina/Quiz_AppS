package edu.icet.service.impl;

import edu.icet.dto.Exam;
import edu.icet.service.ExamService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ExameServiceimpl implements ExamService {
    @Override
    public void CreateExame(Exam exam) {

    }

    @Override
    public Exam getExameByCoursId(Integer integer) {
        return null;
    }

    @Override
    public List<Exam> getAll() {
        return List.of();
    }

    @Override
    public Boolean deleteExamById(Integer id) {

        return null;
    }

    @Override
    public void deleteExamByCourdeId(Integer integer) {

    }
}
