package com.yjq.blog.service;

import com.yjq.blog.vo.CategoryVo;
import com.yjq.blog.vo.Result;


public interface CategoryService {

    CategoryVo findCategoryById(Long id);

    Result findAll();

    Result findAllDetail();

    Result CategoryDetailById(Long id);
}

