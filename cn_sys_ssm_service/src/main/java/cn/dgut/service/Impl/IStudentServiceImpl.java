package cn.dgut.service.Impl;

import cn.dgut.dao.StudentDao;
import cn.dgut.domain.Student;
import cn.dgut.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("studentService")
public class IStudentServiceImpl implements IStudentService {
    @Autowired
    private StudentDao studentDao;
    @Override
    public List<Student> findAll() {
        return studentDao.findAll();
    }
}
