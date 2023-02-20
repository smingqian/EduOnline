package com.eduonline.content.model.dto;

import com.eduonline.content.model.po.CourseCategory;
import lombok.Data;

import java.util.List;

/**
 * @author qsun
 * @version 1.0
 * @description TODO
 * @date 2/20/2023 10:57 AM
 */
@Data
public class CourseCategoryTreeDto extends CourseCategory {
    List childrenTreeNodes;
}
