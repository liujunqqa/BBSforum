package cn.edu.guet.bll.impl;

import cn.edu.guet.bean.personimf.*;
import cn.edu.guet.bll.personimfseritf;
import cn.edu.guet.mapper.collectpostmapper.showcollectpostMapper;
import cn.edu.guet.mapper.personimfmapper.*;
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

    @Override
    public void changeUser(Users user) {
        sqlSession= SessionFactory.getInstance().getSqlSession();
        changeUserMapper changeUserMapper=sqlSession.getMapper(changeUserMapper.class);
        changeUserMapper.changeUser(user);
        sqlSession.commit();
    }

    @Override
    public Macollege getMajor(String mname) {
        sqlSession= SessionFactory.getInstance().getSqlSession();
        getMajorMapper getMajorMapper=sqlSession.getMapper(getMajorMapper.class);
        return  getMajorMapper.getMajor(mname);


    }

    @Override
    public college getCollege(String cname) {
        sqlSession= SessionFactory.getInstance().getSqlSession();
        getCollegeMapper getCollegeMapper=sqlSession.getMapper(getCollegeMapper.class);
        return getCollegeMapper.getCollege(cname);
    }

    @Override
    public Macollege getMacollege(String mname, String cname) {
        sqlSession= SessionFactory.getInstance().getSqlSession();
        getMacollegeMapper getMacollegeMapper=sqlSession.getMapper(getMacollegeMapper.class);
        return getMacollegeMapper.getMacollege(mname,cname);
    }

}
