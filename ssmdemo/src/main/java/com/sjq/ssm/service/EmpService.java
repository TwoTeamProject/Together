package com.sjq.ssm.service;

import java.util.List;
import java.util.Map;

/**
 * className:EmpService
 * discriptoin:雇员服务接口
 * author:孙家庆
 * createTime:2018-11-07 15:10
 */
public interface EmpService {

    /**
     * 分页列表
     * @param map
     * @return
     */
    List<Map> getPage(Map map);

    /**
     * 总数量
     * @param map
     * @return
     */
    int getPageCount(Map map);

    /**
     * 添加雇员
     * @param map
     * @return
     */
    int add(Map map);

    /**
     * 根据id查数据
     * @param EMPNO
     * @return
     */
    Map selectById(int EMPNO);

    /**
     * 更新操作
     * @param map
     * @return
     */
    int update(Map map);

    /**
     * 删除操作
     * @param EMPNO
     * @return
     */
    int delete(int EMPNO);
}
