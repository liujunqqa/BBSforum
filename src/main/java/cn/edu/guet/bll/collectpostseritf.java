package cn.edu.guet.bll;


import cn.edu.guet.bean.collectpostbean.collectpost;

import java.util.List;

public interface collectpostseritf {
    List<collectpost> getSCTZ(collectpost collectpost);
    void deleteSCTZ(String userid,String pid);
    int getSCTZCount(String userid);
}
