package com.tensquare.qa.dao;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @program: tensquare_parent0901
 * @description: tb_problem和tb_label中间表的实体类
 * @author: mint
 * @create: 2019-09-09 22:16
 **/
@Entity
@Table(name="tb_pl")
@Data
public class Pl {

    @Id
    private String problemid;

    @Id
    private String labelid;
}
