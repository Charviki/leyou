package com.leyou.item.api;

import com.leyou.item.poji.Category;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface CategoryApi {
    /**
     * 根据cid查询商品分类
     * @param ids
     * @return
     */
    @GetMapping("category/list/ids")
    public List<Category> queryCategoryByIds(@RequestParam("ids")List<Long> ids);
}
