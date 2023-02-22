package com.eduonline.content.service;

import com.eduonline.content.model.dto.SaveTeachplanDto;
import com.eduonline.content.model.dto.TeachplanDto;

import java.util.List;

/**
 * @author qsun
 * @version 1.0
 * @description TODO
 * @date 2/22/2023 4:05 PM
 */
public interface TeachPlanService {
    /**
    * @description 查询课程计划树型结构
    * @param null 
    * @return
    * @author qsun
    * @date 2/22/2023 4:14 PM
    */
    public List<TeachplanDto> findTeachplayTree(long courseId);

    public void saveTeachplan(SaveTeachplanDto teachplanDto);
}
