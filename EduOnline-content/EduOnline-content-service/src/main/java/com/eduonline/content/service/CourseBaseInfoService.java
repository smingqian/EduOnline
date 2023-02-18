package com.eduonline.content.service;

import com.eduonline.base.model.PageParams;
import com.eduonline.base.model.PageResult;
import com.eduonline.content.model.dto.QueryCourseParamsDto;
import com.eduonline.content.model.po.CourseBase;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author qsun
 * @version 1.0
 * @description TODO
 * @date 2/17/2023 10:21 PM
 */

/**
* @description 课程查询
* @param 分页参数 、 课程参数
* @return
* @author qsun
* @date 2/17/2023 10:25 PM
*/
@Service
public interface CourseBaseInfoService {
    PageResult<CourseBase> QueryCourseBaseList (PageParams pageParams, @RequestBody QueryCourseParamsDto queryCourseParamsDto);


}
