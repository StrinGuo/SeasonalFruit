package mapper;

import pojo.Classify;

import java.util.List;

public interface ClassifyMapper {
    /**
     * 根据大类的id查询小类的全部数据
     * @param generalitiesId 大类id
     * @return 小类全部数据
     */
    List<Classify> findAllByGeneralitiesId(Long generalitiesId);
}
