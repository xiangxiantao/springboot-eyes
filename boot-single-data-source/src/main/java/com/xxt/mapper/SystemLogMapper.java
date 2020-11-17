package com.xxt.mapper;

import com.xxt.entity.SysLog;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

//@Mapper
public interface SystemLogMapper {

    @Select("select * from sys_log where id = #{id}")
    SysLog selectById(Long id);

}
