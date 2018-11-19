package com.sjq.ssm.dao;

import java.util.List;
import java.util.Map;

/**
 * className:EmpDao
 * discriptoin：雇员持久层
 * author:孙家庆
 * createTime:2018-11-07 14:58
 */
public interface EmpDao {

    /**
     * 雇员列表
     * @return
     */
    List<Map> getPage(Map map);

    /**
     * 分页总数量
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
     * 根据ID查数据
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
