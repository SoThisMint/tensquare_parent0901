package com.tensquare.base.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @program: tensquare_parent0901
 * @description:
 * @author: mint
 * @create: 2019-09-01 16:50
 **/
@Entity
@Table(name = "tb_label")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Label implements Serializable {

    @Id
    private String id;

    //标签名称
    private String labelname;

    //状态
    private String state;

    //使用数量
    private Long count;

    //是否维持
    private String recommend;

    //关注数
    private Long fans;

}
