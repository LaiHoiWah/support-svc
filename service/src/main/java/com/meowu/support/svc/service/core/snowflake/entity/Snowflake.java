package com.meowu.support.svc.service.core.snowflake.entity;

import com.meowu.commons.doamin.entity.Creation;
import com.meowu.commons.doamin.entity.Identity;
import com.meowu.commons.doamin.entity.Updatable;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

@Getter
@Setter
@Table(name = "snowflake")
public class Snowflake extends Identity<String> implements Creation, Updatable{

    @Column(name = "application")
    private String application;

    @Column(name = "ip")
    private String ip;

    @Column(name = "port")
    private Integer port;

    @Column(name = "center_id")
    private Integer centerId;

    @Column(name = "worker_id")
    private Integer workerId;

    @Column(name = "time_gen")
    private Long timeGen;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;
}
