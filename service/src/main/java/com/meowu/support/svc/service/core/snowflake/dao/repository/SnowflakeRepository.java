package com.meowu.support.svc.service.core.snowflake.dao.repository;

import com.meowu.support.svc.service.core.snowflake.entity.Snowflake;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SnowflakeRepository extends JpaRepository<Snowflake, String>{

}
