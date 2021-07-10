package cn.edu.guet.bll.impl;

import cn.edu.guet.bean.personimf.dgroup;
import cn.edu.guet.bll.personimfseritf;
import cn.edu.guet.mapper.collectpostmapper.showcollectpostMapper;
import cn.edu.guet.mapper.personimfmapper.showgroupMapper;
import cn.edu.guet.util.SessionFactory;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class personimfserimpl implements personimfseritf {
    private SqlSessionFactory sqlSessionFactory;
    private SqlSession sqlSession;
    @Override
    public List<dgroup> getdgroup(String gid) {
        sqlSession= SessionFactory.getInstance().getSqlSession();
        showgroupMapper showgroupMapper=sqlSession.getMapper(showgroupMapper.class);
        return showgroupMapper.getgroup(gid);

    }
}
