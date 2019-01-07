package com.xuecheng.order.dao;

import com.xuecheng.framework.domain.task.XcTask;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;

/**
 * @Describle:
 * @Author:zhangyifei
 * @Date:2019/1/7
 */
public interface XcTaskRepository extends JpaRepository<XcTask, String> {

    /**
     * 查询某个时间之间的前n条任务
     *
     * @param pageable
     * @param updateTime
     * @return
     */
    Page<XcTask> findByUpdateTimeBefore(Pageable pageable, Date updateTime);


    /**
     * 更新updateTime
     *
     * @param id
     * @param updateTime
     * @return
     */
    @Modifying
    @Query("update XcTask t set t.updateTime = :updateTime where t.id = :id")
    int updateTaskTime(@Param(value = "id") String id, @Param(value = "updateTime") Date updateTime);

    /**
     * 乐观锁机制
     *
     * @param id
     * @param version
     * @return
     */
    @Modifying
    @Query("update XcTask t set t.version = :version+1 where t.id = :id and t.version = :version")
    int updateTaskVersion(@Param(value = "id") String id, @Param(value = "version") int version);
}
