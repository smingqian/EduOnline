package com.eduonline.content.api;

import com.eduonline.content.model.dto.SaveTeachplanDto;
import com.eduonline.content.model.dto.TeachplanDto;
import com.eduonline.content.service.TeachPlanService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author qsun
 * @version 1.0
 * @description 课程计划编辑接口
 * @date 2/22/2023 3:00 PM
 */
@RestController
public class TeachplanController {
    @Autowired
    TeachPlanService teachPlanService;

    @ApiOperation("查询课程计划树形结构")
    @ApiImplicitParam(value = "courseId", name = "课程Id", required = true, dataType = "Long", paramType = "path")
    @GetMapping("/teachplan/{courseId}/tree-nodes")
    public List<TeachplanDto> getTreeNodes(@PathVariable Long courseId) {
        return teachPlanService.findTeachplayTree(courseId);
    }

    @ApiOperation("课程计划创建或修改")
    @PostMapping("/teachplan")
    public void saveTeachplan( @RequestBody SaveTeachplanDto teachplan){
        teachPlanService.saveTeachplan(teachplan);
    }
}
