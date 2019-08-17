
import mapper.ComposeGoodMapper;
import org.apache.ibatis.session.SqlSession;
import pojo.ComposeGood;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtil.getSqlSession();
            ComposeGoodMapper composeGoodMapper = sqlSession.getMapper(ComposeGoodMapper.class);
            ComposeGood composeGood = new ComposeGood();
            composeGood.setComposeGoodName("A");
            composeGood.setComposeGoodStatus(1);
            List<ComposeGood> composeGoodList = composeGoodMapper.findComposeGoodByComposeGood(composeGood);
            composeGoodList.forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }


    }
}
