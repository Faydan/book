package com.faydan.book.front;

import com.faydan.book.entity.ArticleDetail;
import com.faydan.book.service.ArticleDetailService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * IndexController created with IntelliJ IDEA.
 * User:  faydan
 * Email: fei321457749@126.com
 * Date:  2018-05-02
 * Time:  19:46
 * <p>
 * Describe:
 */
@RestController
public class IndexController {

    @Resource
    private ArticleDetailService articleDetailService;

    @GetMapping("{id}")
    public ArticleDetail findById(@PathVariable Long id) {
        return articleDetailService.findById(id);
    }
}
