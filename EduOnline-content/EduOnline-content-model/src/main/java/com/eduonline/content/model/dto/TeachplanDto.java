package com.eduonline.content.model.dto;

import com.eduonline.content.model.po.Teachplan;
import com.eduonline.content.model.po.TeachplanMedia;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @author qsun
 * @version 1.0
 * @description TODO
 * @date 2/22/2023 2:59 PM
 */
@Data
@ToString
public class TeachplanDto extends Teachplan {
    //课程计划关联的媒资信息
    TeachplanMedia teachplanMedia;

    //子结点
    List<TeachplanDto> teachPlanTreeNodes;
}
