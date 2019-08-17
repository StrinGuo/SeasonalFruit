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
}
