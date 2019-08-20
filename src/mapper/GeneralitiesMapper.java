package mapper;

import pojo.Generalities;

import java.util.List;

public interface GeneralitiesMapper {
    /**
     * 查询所有种类的信息
     * @return
     */
     List<Generalities> findAllGeneralities();
}
