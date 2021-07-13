package cn.edu.guet.controller;

import cn.edu.guet.bean.personimf.*;
import cn.edu.guet.bll.impl.personimfserimpl;
import cn.edu.guet.bll.personimfseritf;
import cn.edu.guet.mvc.annotaion.Controller;
import cn.edu.guet.mvc.annotaion.RequestMapping;

import java.util.List;

@Controller
public class personimfController {
    private personimfseritf personimfseritf;

    public void setPersonimfserimpl(personimfseritf personimfseritf) {
        this.personimfseritf = personimfseritf;
    }

    @RequestMapping("html/personimfhtml/organxingxi.do")
    public List<dgroup> getdgroup(String pid){
        List<dgroup>list=personimfseritf.getdgroup(pid);
        return list;
    }
    @RequestMapping("html/personimfhtml/grouppeople.do")
    public List<grouppeople>getgrouppeople(String userid,int page){
        System.out.println(userid);
        System.out.println(page);
        grouppeople grouppeople=new grouppeople();
        grouppeople.setUserid(userid);
        grouppeople.setPage(page);
        List<grouppeople>list=personimfseritf.getgrouppeople(grouppeople);
        return list;
    }
    @RequestMapping("html/personimfhtml/getpeopleById.do")
    public List<grouppeople>getpeopleById(String userid,String username){
        System.out.println(userid);
        System.out.println(username);
        List<grouppeople>list=personimfseritf.getpeopleById(userid,username);
        return list;
    }
    @RequestMapping("html/personimfhtml/getUser.do")
    public Users getUser(String userid){
        System.out.println(userid);
        Users users=personimfseritf.getUser(userid);
        return users;
    }
    @RequestMapping("html/personimfhtml/ChangeUser.do")
    public void ChangeUser(String user){
        System.out.println("eeese");
        String[]arr=user.split(",");
        Users users=new Users();
        users.setAge(arr[0]);
        users.setPhone(arr[1]);
        users.setEmail(arr[2]);
        users.setMname(arr[3]);
        users.setGrade(arr[4]);
        users.setCname(arr[5]);
        users.setUserid(arr[6]);
        personimfseritf.changeUser(users);

    }
    @RequestMapping("html/personimfhtml/getMajor.do")
    public int getMajor(String mname){
        System.out.println(mname);
        Macollege macollege=personimfseritf.getMajor(mname);
        if (macollege==null){
            return 0;
        }
        else {
            return 1;
        }

    }
    @RequestMapping("html/personimfhtml/getCollege.do")
    public int getCollege(String cname){
        System.out.println(cname);
        college college=personimfseritf.getCollege(cname);
        if (college==null){
            return 0;
        }
        else {
            return 1;
        }

    }
    @RequestMapping("html/personimfhtml/getMacollege.do")
    public int getMacollege(String mname,String cname ){
        Macollege macollege=personimfseritf.getMacollege(mname,cname);
        if (macollege==null){
            return 0;
        }
        else {
            return 1;
        }

    }


}
