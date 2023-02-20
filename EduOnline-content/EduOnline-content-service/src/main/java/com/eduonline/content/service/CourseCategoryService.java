package com.eduonline.content.service;

import com.eduonline.content.model.dto.CourseCategoryTreeDto;

import java.util.List;

/**
 * @author qsun
 * @version 1.0
 * @description TODO
 * @date 2/20/2023 11:19 AM
 */
public interface CourseCategoryService {
    List<CourseCategoryTreeDto> queryTreeNodes(String id);
}
