package com.yjq.blog.controller;

import com.yjq.blog.service.TagService;
import com.yjq.blog.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("tags")
public class TagsController {
    @Autowired
    private TagService tagService;
    //  /tags/hot
    @GetMapping("hot")
    public Result hot(){
        int limit = 6;
        return tagService.hots(limit);
    }
    @GetMapping
    public Result findAll(){
        return tagService.findAll();
    }
    @GetMapping("detail")
    public Result findAllDetail(){
        return tagService.findAllDetail();
    }
    @GetMapping("detail/{id}")
    public Result findDetailById(@PathVariable("id") Long id){
        /**
         * 查询所有文章标签下所有的文章
         * @return
         */
        return tagService.findDetailById(id);
    }

}
