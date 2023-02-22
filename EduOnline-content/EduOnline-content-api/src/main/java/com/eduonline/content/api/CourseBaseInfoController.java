package com.eduonline.content.api;

import com.eduonline.base.exception.ValidationGroups;
import com.eduonline.base.model.PageParams;
import com.eduonline.base.model.PageResult;
import com.eduonline.content.model.dto.AddCourseDto;
import com.eduonline.content.model.dto.CourseBaseInfoDto;
import com.eduonline.content.model.dto.EditCourseDto;
import com.eduonline.content.model.dto.QueryCourseParamsDto;
import com.eduonline.content.model.po.CourseBase;
import com.eduonline.content.service.CourseBaseInfoService;
import com.eduonline.content.service.CourseCategoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * @author qsun
 * @version 1.0
 * @description TODO
 * @date 2/17/2023 8:24 PM
 */
@Api(value = "课程管理相关接口", tags = "课程管理")
@RestController
public class CourseBaseInfoController {

    @Autowired
    CourseBaseInfoService courseBaseInfoService;

    @ApiOperation("课程查询")
    @PostMapping("/course/list")
    public PageResult<CourseBase> list(PageParams pageParams, @RequestBody QueryCourseParamsDto queryCourseParamsDto) {
        PageResult<CourseBase> courseBasePageResult = courseBaseInfoService.queryCourseBaseList(pageParams, queryCourseParamsDto);
        return courseBasePageResult;
    }


    @ApiOperation("新增课程基础信息")
    @PostMapping("/course")
    public CourseBaseInfoDto createCourseBase(@RequestBody @Validated({ValidationGroups.Insert.class}) AddCourseDto addCourseDto) {
        //机构id，由于认证系统没有上线暂时硬编码
        Long companyId = 22L;
        return courseBaseInfoService.createCourseBase(companyId, addCourseDto);
    }

    @ApiOperation("根据课程id查询课程基础信息")
    @GetMapping("/course/{courseId}")
    public CourseBaseInfoDto getCourseBaseById(@PathVariable Long courseId){
        return courseBaseInfoService.getCourseBaseInfo(courseId);
    }
    @ApiOperation("修改课程基础信息")
    @PutMapping("/course")
    public CourseBaseInfoDto modifyCourseBaseInfo(@RequestBody @Validated EditCourseDto editCourseDto){

        Long companyId = 1232141425L;
        return courseBaseInfoService.updateCourseBase(companyId,editCourseDto);
    }

}
