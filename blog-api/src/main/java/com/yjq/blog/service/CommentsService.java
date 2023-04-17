package com.yjq.blog.service;

import com.yjq.blog.vo.Result;
import com.yjq.blog.vo.params.CommentParam;

public interface CommentsService {
    /**
     * 根据文章id 查询所有评论列表
     * @param id
     * @return
     */
    Result commentsByArticleId(Long id);

    Result comment(CommentParam commentParam);
}
