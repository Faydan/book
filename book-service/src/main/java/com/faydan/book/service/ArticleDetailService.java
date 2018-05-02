package com.faydan.book.service;

import com.faydan.book.entity.ArticleDetail;

/**
 * ArticleDetailService created with IntelliJ IDEA.
 * User:  faydan
 * Email: fei321457749@126.com
 * Date:  2018-05-02
 * Time:  19:44
 * <p>
 * Describe:
 */
public interface ArticleDetailService {

    ArticleDetail findById(Long id);
}
