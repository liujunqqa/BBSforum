package cn.edu.guet.bll;

import cn.edu.guet.bean.personimf.dgroup;
import cn.edu.guet.bean.personimf.grouppeople;

import java.util.List;

public interface personimfseritf {
    List<dgroup> getdgroup(String gid);
    List<grouppeople>getgrouppeople(String userid);
    List<grouppeople>getpeopleById(String userid,String username);

}
