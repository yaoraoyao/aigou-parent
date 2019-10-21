package cn.itsource.aigou.controller;

import cn.itsource.aigou.domain.ProductDoc;
import cn.itsource.aigou.repository.ProductDocRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author solargen
 * @version 1.0
 * @description TODO
 * @date 2019/10/21 10:36
 */
@RestController
public class ProductESController {

    @Autowired
    private ProductDocRepository repository;

    /**
     * 批量保存
     * @param productDocList
     */
    @PostMapping("/es/saveBath")
    public void saveBatch(@RequestBody List<ProductDoc> productDocList){
        repository.saveAll(productDocList);
    }

    /**
     * 批量删除
     * @param ids
     */
    @PostMapping("/es/deleteBath")
    public void deleteBatch(@RequestBody List<Long> ids){
        for (Long id : ids) {
            repository.deleteById(id);
        }
    }

}
