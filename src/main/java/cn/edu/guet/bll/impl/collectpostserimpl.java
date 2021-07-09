package cn.edu.guet.bll.impl;
import cn.edu.guet.bean.collectpostbean.collectpost;
import cn.edu.guet.bll.collectpostseritf;
import cn.edu.guet.mapper.collectpostmapper.deletecollectpostMapper;
import cn.edu.guet.mapper.collectpostmapper.showcollectpostMapper;
import cn.edu.guet.util.SessionFactory;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class collectpostserimpl implements collectpostseritf {
    private SqlSessionFactory sqlSessionFactory;
    private SqlSession sqlSession;
    @Override
    public List<collectpost> getSCTZ(String userid) {
        sqlSession= SessionFactory.getInstance().getSqlSession();
        showcollectpostMapper showcollectpostMapper=sqlSession.getMapper(showcollectpostMapper.class);
        return showcollectpostMapper.getshowcollectpost(userid);

    }

    @Override
    public void deleteSCTZ(String userid) {
        sqlSession= SessionFactory.getInstance().getSqlSession();
        deletecollectpostMapper deletecollectpostMapper=sqlSession.getMapper(deletecollectpostMapper.class);
        deletecollectpostMapper.deletecollectpost(userid);
        sqlSession.commit();
    }
}
