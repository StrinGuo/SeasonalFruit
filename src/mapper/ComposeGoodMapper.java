package mapper;

import pojo.ComposeGood;
import java.util.List;

public interface ComposeGoodMapper {
    /**
     * 根据ComposeGood中的参数动态查询
     * @param composeGood
     * @return 所有符合查询结果数据
     */
    List<ComposeGood> findComposeGoodByComposeGood(ComposeGood composeGood);

    /**
     * 根据小分类id查询所有符合的商品
     * @param classifyId 小分类id
     * @return 商品列表
     */
    List<ComposeGood> findAllComposeGoodByClassifyId(Long classifyId);
}
