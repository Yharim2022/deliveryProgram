package com.sky.service;


import com.sky.dto.CategoryDTO;
import com.sky.dto.CategoryPageQueryDTO;
import com.sky.entity.Category;
import com.sky.result.PageResult;

import java.util.List;

public interface CategoryService {

    void update(CategoryDTO categoryDTO);

    PageResult pageQuery(CategoryPageQueryDTO categoryQueryDTO);

    void startOrStop(Integer status, Long id);

    void save(CategoryDTO categoryDTO);

    void delete(Long id);

    List<Category> list(Integer type);
}
