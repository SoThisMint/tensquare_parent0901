package com.tensquare.base.service;

import com.tensquare.base.dao.LabelDao;
import com.tensquare.base.pojo.Label;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import util.IdWorker;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;
import java.util.*;

/**
 * @program: tensquare_parent0901
 * @description:
 * @author: mint
 * @create: 2019-09-01 17:04
 **/
@Service
@Transactional
public class LabelService {

    @Autowired
    private LabelDao labelDao;

    @Autowired
    private IdWorker idWorker;

    public List<Label> findAll() {
        return labelDao.findAll();
    }

    public Label findById(String id) {
        Optional<Label> optional = labelDao.findById(id);
        return optional.orElse(null);
    }

    public void save(Label label) {
        label.setId(idWorker.nextId() + "");
        labelDao.save(label);
    }

    public void deleteById(String id) {
        labelDao.deleteById(id);
    }

    public void update(Label label) {
        labelDao.save(label);
    }

    public List<Label> findSearch(Label label) {
        return labelDao.findAll((Specification<Label>) getLabelSpecification(label));
    }

    private Specification<Label> getLabelSpecification(Label label) {
        return (root, criteriaQuery, criteriaBuilder) -> {

            List<Predicate> list = new ArrayList<>();

            if (label.getLabelname() != null && !"".equals(label.getLabelname())) {
                // where labelname like '%$labelname%'
                Predicate predicate = criteriaBuilder.like(root.get("labelname").as(String.class),
                        "%" + label.getLabelname() + "%");
                list.add(predicate);
            }

            if (!StringUtils.isEmpty(label.getState())) {
                Predicate predicate = criteriaBuilder.equal(root.get("state").as(String.class), label.getState());
                list.add(predicate);
            }

            Predicate[] predicates = new Predicate[list.size()];
//            for (int i = 0; i < list.size(); i++) {
//                predicates[i] = list.get(i);
//            }
            list.toArray(predicates);
            return criteriaBuilder.and(predicates);
        };
    }

    public Page<Label> pageQuery(Label label, int page, int size) {

        //封装一个分页对象
        Pageable pageable = PageRequest.of(page - 1, size);
        return labelDao.findAll((Specification<Label>) getLabelSpecification(label), pageable);

    }
}
