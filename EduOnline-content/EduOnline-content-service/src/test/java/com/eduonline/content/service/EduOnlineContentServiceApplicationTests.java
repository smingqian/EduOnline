package com.eduonline.content.service;

import com.eduonline.content.mapper.CourseBaseMapper;
import com.eduonline.content.model.po.CourseBase;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EduOnlineContentServiceApplicationTests {

    @Autowired
    CourseBaseMapper courseBaseMapper;
    @Test
    void testCourseBaseMapper(){
        CourseBase courseBase = courseBaseMapper.selectById(2);
        System.out.println(courseBase);
    }

}
