package com.fengze.ssm.service.impl;

import com.fengze.ssm.service.BaseService;
import com.fengze.ssm.util.MyMapper;
import lombok.Data;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhanglingsi on 2014/12/11.
 */
@Data
@Service
public abstract class BaseServiceImpl<T> implements BaseService<T> {

    @Autowired
    private MyMapper<T> mapper;

    @Override
    public T selectByPrimaryKey(Object key) {
        return mapper.selectByPrimaryKey(key);
    }

    @Override
    public List<T> select(T t) {
        return mapper.select(t);
    }

    @Override
    public List<T> selectAll() {
        return mapper.selectAll();
    }

    @Override
    public T selectOne(T t) {
        return mapper.selectOne(t);
    }

    @Override
    public int selectCount(T t) {
        return mapper.selectCount(t);
    }

    @Override
    public int insert(T t) {
        return mapper.insert(t);
    }

    @Override
    public int insertSelective(T t) {
        return mapper.insertSelective(t);
    }

    @Override
    public int updateByPrimaryKey(T t) {
        return mapper.updateByPrimaryKey(t);
    }

    @Override
    public int updateByPrimaryKeySelective(T t) {
        return mapper.updateByPrimaryKeySelective(t);
    }

    @Override
    public int delete(T t) {
        return mapper.delete(t);
    }

    @Override
    public int deleteByPrimaryKey(Object key) {
        return mapper.deleteByPrimaryKey(key);
    }

    @Override
    public List<T> selectByExample(Object example) {
        return mapper.selectByExample(example);
    }

    @Override
    public int selectCountByExample(Object example) {
        return mapper.selectCountByExample(example);
    }

    @Override
    public int updateByExample(@Param("t") T t, @Param("example") Object example) {
        return mapper.updateByExample(t, example);
    }

    @Override
    public int updateByExampleSelective(@Param("t") T t, @Param("example") Object example) {
        return mapper.updateByExampleSelective(t, example);
    }

    @Override
    public int deleteByExample(Object example) {
        return mapper.deleteByExample(example);
    }

    @Override
    public List<T> selectByRowBounds(T t, RowBounds rowBounds) {
        return mapper.selectByRowBounds(t, rowBounds);
    }

    @Override
    public List<T> selectByExampleAndRowBounds(Object example, RowBounds rowBounds) {
        return mapper.selectByExampleAndRowBounds(example, rowBounds);
    }

    @Override
    public int insertList(List<T> recordList) {
        return mapper.insertList(recordList);
    }

    @Override
    public int insertUseGeneratedKeys(T t) {
        return mapper.insertUseGeneratedKeys(t);
    }

    @Override
    public List<T> selectByIds(String ids) {
        return mapper.selectByIds(ids);
    }

    @Override
    public int deleteByIds(String ids) {
        return mapper.deleteByIds(ids);
    }
}
