package cn.itsource.aigou.vo;

import cn.itsource.aigou.domain.Specification;
import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * @author solargen
 * @version 1.0
 * @description TODO
 * @date 2019/10/20 10:14
 */
@Data
public class SkusVo {

    private List<Specification> skuProperties;

    private List<Map<String,String>> skus;

}
