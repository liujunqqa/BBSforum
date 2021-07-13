package cn.edu.guet.bll;

import cn.edu.guet.bean.personimf.*;

import java.util.List;

public interface personimfseritf {
    List<dgroup> getdgroup(String gid);
    List<grouppeople>getgrouppeople(grouppeople grouppeople);
    List<grouppeople>getpeopleById(String userid,String username);
    Users getUser(String userid);
    void changeUser(Users user);
    Macollege getMajor(String mname);
    college getCollege(String cname);
    Macollege getMacollege(String mname,String cname);

}
