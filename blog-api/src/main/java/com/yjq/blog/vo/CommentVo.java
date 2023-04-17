package com.yjq.blog.vo;

import lombok.Data;

import java.util.List;

@Data
public class CommentVo  {
    //防止前端精度损失，把id 转为string
    //分布式id 比较长传到前端会有精度损失
    //@JsonSerialize(using = ToStringSerializer.class)
    private String id;

    private UserVo author;

    private String content;

    private List<CommentVo> childrens;

    private String createDate;

    private Integer level;

    private UserVo toUser;
}

