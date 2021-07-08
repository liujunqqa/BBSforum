package cn.edu.guet.bll.impl;
import cn.edu.guet.bean.collectpostbean.post1;
import cn.edu.guet.bean.editor.Post;
import cn.edu.guet.bll.showSCTZseritf;
import cn.edu.guet.mapper.collectpostmapper.showcollectpostMapper;
import cn.edu.guet.util.SessionFactory;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class showSCTZserimpl implements showSCTZseritf {
    private SqlSessionFactory sqlSessionFactory;
    private SqlSession sqlSession;
    @Override
    public List<Post> getSCTZ(String userid) {
        sqlSession= SessionFactory.getInstance().getSqlSession();
        showcollectpostMapper showcollectpostMapper=sqlSession.getMapper(showcollectpostMapper.class);
        return showcollectpostMapper.getshowcollectpost(userid);

    }
}
