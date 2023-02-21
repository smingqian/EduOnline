package com.eduonline.content.service;

import com.eduonline.base.model.PageParams;
import com.eduonline.base.model.PageResult;
import com.eduonline.content.mapper.CourseBaseMapper;
import com.eduonline.content.model.dto.QueryCourseParamsDto;
import com.eduonline.content.model.po.CourseBase;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EduOnlineContentServiceApplicationTests {

    @Autowired
    CourseBaseMapper courseBaseMapper;

    @Autowired
    CourseBaseInfoService courseBaseInfoService;

    @Test
    void testCourseBaseMapper() {
        CourseBase courseBase = courseBaseMapper.selectById(2);
        System.out.println(courseBase);
    }

    @Test
    void testQueryCourseBaseList() {
        QueryCourseParamsDto queryCourseParamsDto = new QueryCourseParamsDto();
        queryCourseParamsDto.setCourseName("测试课程01");
//        queryCourseParamsDto.setAuditStatus("203002");
//        queryCourseParamsDto.setPublishStatus();
        PageResult<CourseBase> courseBasePageResult = courseBaseInfoService.queryCourseBaseList(new PageParams(1, 10), queryCourseParamsDto);
        System.out.println(courseBasePageResult);
    }

}
