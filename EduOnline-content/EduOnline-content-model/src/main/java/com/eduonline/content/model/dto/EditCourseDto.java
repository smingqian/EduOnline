package com.eduonline.content.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author qsun
 * @version 1.0
 * @description TODO
 * @date 2/21/2023 4:32 PM
 */
@Data
@ApiModel(value="EditCourseDto", description="修改课程基本信息")
public class EditCourseDto extends AddCourseDto{
    @ApiModelProperty(value = "课程名称",required = true)
    private Long id;
}
