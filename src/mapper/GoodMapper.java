package mapper;

import pojo.Good;
import java.util.List;

public interface GoodMapper {
    /**
     * 根据Good中的参数动态查询
     *
     * @param good
     * @return 所有符合查询结果数据
     */
    List<Good> findGoodById(Good good);
}
