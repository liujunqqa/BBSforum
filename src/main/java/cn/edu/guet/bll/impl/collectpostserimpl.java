package cn.edu.guet.bll.impl;
import cn.edu.guet.bean.collectpostbean.collectpost;
import cn.edu.guet.bll.collectpostseritf;
import cn.edu.guet.mapper.collectpostmapper.collectcountMapper;
import cn.edu.guet.mapper.collectpostmapper.deletecollectpostMapper;
import cn.edu.guet.mapper.collectpostmapper.showcollectpostMapper;
import cn.edu.guet.util.SessionFactory;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import java.util.List;
//收藏实现类
public class collectpostserimpl implements collectpostseritf {
    private SqlSessionFactory sqlSessionFactory;
    private SqlSession sqlSession;
    //显示收藏贴子
    @Override
    public List<collectpost> getSCTZ(collectpost collectpost) {
        sqlSession= SessionFactory.getInstance().getSqlSession();
        showcollectpostMapper showcollectpostMapper=sqlSession.getMapper(showcollectpostMapper.class);
        return showcollectpostMapper.getshowcollectpost(collectpost);

    }
    //删除收藏贴子
    @Override
    public void deleteSCTZ(String userid,String pid) {
        sqlSession= SessionFactory.getInstance().getSqlSession();
        deletecollectpostMapper deletecollectpostMapper=sqlSession.getMapper(deletecollectpostMapper.class);
        deletecollectpostMapper.deletecollectpost(userid,pid);
        sqlSession.commit();
    }

    @Override
    public int getSCTZCount(String userid) {
        sqlSession= SessionFactory.getInstance().getSqlSession();
        collectcountMapper collectcountMapper=sqlSession.getMapper(collectcountMapper.class);
        return collectcountMapper.getCollectcount(userid);

    }
}
