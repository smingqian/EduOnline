package com.eduonline.content.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.eduonline.content.model.dto.TeachplanDto;
import com.eduonline.content.model.po.Teachplan;

import java.util.List;

/**
 * <p>
 * 课程计划 Mapper 接口
 * </p>
 *
 * @author qsun
 */
public interface TeachplanMapper extends BaseMapper<Teachplan> {
    /**
     * @description 查询某课程的课程计划，组成树型结构
     * @param courseId
     */
    public List<TeachplanDto> selectTreeNodes(long courseId);
}
