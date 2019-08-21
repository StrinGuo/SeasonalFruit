
import mapper.GeneralitiesMapper;
import org.apache.ibatis.session.SqlSession;
import pojo.Generalities;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtil.getSqlSession();
            GeneralitiesMapper generalitiesMapper = sqlSession.getMapper(GeneralitiesMapper.class);
//            ComposeGood composeGood = new ComposeGood();
//            composeGood.setComposeGoodName("A");
//            composeGood.setComposeGoodStatus(1);
//            List<ComposeGood> composeGoodList = composeGoodMapper.findComposeGoodByComposeGood(composeGood);
//            composeGoodList.forEach(System.out::println);

            Generalities generalities = new Generalities();
            List<Generalities> generalitiesList = generalitiesMapper.findAllGeneralities();
            generalitiesList.forEach(System.out::println);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }


    }
}
