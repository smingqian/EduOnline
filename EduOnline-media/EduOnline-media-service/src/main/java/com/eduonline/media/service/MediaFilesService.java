package com.eduonline.media.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.eduonline.base.model.PageParams;
import com.eduonline.base.model.PageResult;
import com.eduonline.media.model.dto.QueryMediaParamsDto;
import com.eduonline.media.model.dto.UploadFileParamsDto;
import com.eduonline.media.model.dto.UploadFileResultDto;
import com.eduonline.media.model.po.MediaFiles;

/**
 * <p>
 * 媒资信息 服务类
 * </p>
 *
 * @author qsun
 * @since 2023-02-23
 */
public interface MediaFilesService {
    /**
     * @param pageParams          分页参数
     * @param queryMediaParamsDto 查询条件
     * @return com.eduonline.base.model.PageResult<com.eduonline.media.model.po.MediaFiles>
     * @description 媒资文件查询方法
     * @author Mr.M
     */
    public PageResult<MediaFiles> queryMediaFiels(Long companyId, PageParams pageParams, QueryMediaParamsDto queryMediaParamsDto);


    /**
     * @param companyId           机构id
     * @param uploadFileParamsDto 文件信息
     * @param bytes               文件字节数组
     * @param folder              桶下边的子目录
     * @param objectName          对象名称
     * @return com.eduonline.media.model.dto.UploadFileResultDto
     * @description 上传文件的通用接口
     * @author Mr.M
     */
    public UploadFileResultDto uploadFile(Long companyId, UploadFileParamsDto uploadFileParamsDto, byte[] bytes, String folder, String objectName);

}
