package com.eduonline.content.api;

import com.eduonline.content.model.dto.CourseCategoryTreeDto;
import com.eduonline.content.service.CourseCategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author qsun
 * @version 1.0
 * @description TODO
 * @date 2/20/2023 10:50 AM
 */
@Slf4j
@RestController
public class CourseCategoryController {

    @Autowired
    CourseCategoryService courseCategoryService;
    @GetMapping("/course-category/tree-nodes")
    public List<CourseCategoryTreeDto> queryTreeNode(@RequestParam(value = "id",defaultValue = "1") String id){
        return courseCategoryService.queryTreeNodes(id);
    }

}
