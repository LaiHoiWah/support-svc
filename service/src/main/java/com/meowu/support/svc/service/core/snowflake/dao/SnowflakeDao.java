package com.meowu.support.svc.service.core.snowflake.dao;

import com.meowu.commons.common.utils.UIDUtils;
import com.meowu.support.svc.service.core.snowflake.dao.repository.SnowflakeRepository;
import com.meowu.support.svc.service.core.snowflake.entity.Snowflake;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public class SnowflakeDao{

    @Autowired
    private SnowflakeRepository snowflakeRepository;

    public void save(Snowflake snowflake){
        snowflake.setId(UIDUtils.random());
        snowflake.setCreateTime(new Date());
        snowflakeRepository.save(snowflake);
    }

    public void update(Snowflake snowflake){
        snowflake.setUpdateTime(new Date());
        snowflakeRepository.save(snowflake);
    }
}
