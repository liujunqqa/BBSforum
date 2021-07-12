package cn.edu.guet.bll;

import cn.edu.guet.bean.personimf.Users;
import cn.edu.guet.bean.personimf.dgroup;
import cn.edu.guet.bean.personimf.grouppeople;

import java.util.List;

public interface personimfseritf {
    List<dgroup> getdgroup(String gid);
    List<grouppeople>getgrouppeople(grouppeople grouppeople);
    List<grouppeople>getpeopleById(String userid,String username);
    Users getUser(String userid);

}
