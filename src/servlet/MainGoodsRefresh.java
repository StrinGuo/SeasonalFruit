package servlet;

import mapper.GeneralitiesMapper;
import net.sf.json.JSONArray;
import org.apache.ibatis.session.SqlSession;
import pojo.Generalities;
import sqlconnection.SqlSessionFactoryUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class MainGoodsRefresh extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        SqlSession sqlSession = null;
        sqlSession = SqlSessionFactoryUtil.getSqlSession();
        GeneralitiesMapper generalitiesMapper = sqlSession.getMapper(GeneralitiesMapper.class);
        List<Generalities> generalitiesList = generalitiesMapper.findAllGeneralities();
        JSONArray json = JSONArray.fromObject(generalitiesList);//将java对象转换为json对象
        String str = json.toString();//将json对象转换为字符串
        response.getWriter().write(str);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
