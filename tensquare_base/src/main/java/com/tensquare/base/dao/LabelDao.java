package com.tensquare.base.dao;

import com.tensquare.base.pojo.Label;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @program: tensquare_parent0901
 * @description:
 * @author: mint
 * @create: 2019-09-01 17:03
 **/

public interface LabelDao extends JpaRepository<Label, String>, JpaSpecificationExecutor<Label> {

}
