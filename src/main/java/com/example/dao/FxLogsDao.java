package com.example.dao;

import com.example.domian.FxLogs;
import org.apache.ibatis.annotations.Mapper;

/**
 * 使用@Repository注解，就要在配置类中使用@MapperScan("com.example.dao")注解，扫描dao接口
 * 使用@Mapper注解，会通过***Mapper.xml文件的namespace属性找到对应的dao接口
 *
 */
@Mapper
public interface FxLogsDao {

    FxLogs selectOne();
}
