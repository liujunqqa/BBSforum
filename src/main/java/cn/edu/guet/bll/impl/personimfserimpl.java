package cn.edu.guet.bll.impl;

import cn.edu.guet.bean.personimf.Users;
import cn.edu.guet.bean.personimf.dgroup;
import cn.edu.guet.bean.personimf.grouppeople;
import cn.edu.guet.bll.personimfseritf;
import cn.edu.guet.mapper.collectpostmapper.showcollectpostMapper;
import cn.edu.guet.mapper.personimfmapper.getUserMapper;
import cn.edu.guet.mapper.personimfmapper.showgroupMapper;
import cn.edu.guet.mapper.personimfmapper.showgrouppeopleMapper;
import cn.edu.guet.mapper.personimfmapper.showpeopleByIdMapper;
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

    @Override
    public List<grouppeople> getgrouppeople(grouppeople grouppeople) {
        sqlSession= SessionFactory.getInstance().getSqlSession();
        showgrouppeopleMapper showgrouppeopleMapper=sqlSession.getMapper(showgrouppeopleMapper.class);
        return showgrouppeopleMapper.getgrouppeople(grouppeople);
    }

    @Override
    public List<grouppeople> getpeopleById(String userid,String username) {
        sqlSession= SessionFactory.getInstance().getSqlSession();
        showpeopleByIdMapper showpeopleByIdMapper=sqlSession.getMapper(showpeopleByIdMapper.class);
        return showpeopleByIdMapper.getpeopleById(userid,username);
    }

    @Override
    public Users getUser(String userid) {
        sqlSession= SessionFactory.getInstance().getSqlSession();
        getUserMapper getUserMapper=sqlSession.getMapper(getUserMapper.class);
        return getUserMapper.getUser(userid);

    }
}
