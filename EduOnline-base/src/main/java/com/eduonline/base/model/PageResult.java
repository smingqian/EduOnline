package com.eduonline.base.model;

import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @author qsun
 * @version 1.0
 * @description TODO
 * @date 2/17/2023 8:06 PM
 */
@Data
@ToString
public class PageResult<T> {
    // 数据列表
    private List<T> items;

    //总记录数
    private long counts;

    //当前页码
    private long page;

    //每页记录数
    private long pageSize;

    public PageResult(List<T> items, long counts, long page, long pageSize) {
        this.items = items;
        this.counts = counts;
        this.page = page;
        this.pageSize = pageSize;
    }
}