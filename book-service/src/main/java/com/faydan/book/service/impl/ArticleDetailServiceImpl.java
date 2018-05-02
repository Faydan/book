package com.faydan.book.service.impl;

import com.faydan.book.entity.ArticleDetail;
import com.faydan.book.repository.ArticleDetailRepository;
import com.faydan.book.service.ArticleDetailService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * ArticleDetailServiceImpl created with IntelliJ IDEA.
 * User:  faydan
 * Email: fei321457749@126.com
 * Date:  2018-05-02
 * Time:  19:45
 * <p>
 * Describe:
 */
@Service
public class ArticleDetailServiceImpl implements ArticleDetailService {
    @Resource
    private ArticleDetailRepository articleDetailRepository;

    @Override
    public ArticleDetail findById(Long id) {
        return articleDetailRepository.findById(id).get();
    }
}
