package cn.itsource.aigou.es;

import cn.itsource.aigou.CommonApplication;
import cn.itsource.aigou.domain.ProductDoc;
import org.apache.commons.math.stat.descriptive.summary.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author solargen
 * @version 1.0
 * @description TODO
 * @date 2019/10/21 10:28
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = CommonApplication.class)
public class ESTest {

    @Autowired
    private ElasticsearchTemplate template;

    @Test
    public void test()throws Exception{

        //删库
        template.deleteIndex(ProductDoc.class);
        //建库
        template.createIndex(ProductDoc.class);
        //映射
        template.putMapping(ProductDoc.class);

    }

}
