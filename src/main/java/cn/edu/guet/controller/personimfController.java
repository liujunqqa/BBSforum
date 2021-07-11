package cn.edu.guet.controller;

import cn.edu.guet.bean.personimf.dgroup;
import cn.edu.guet.bean.personimf.grouppeople;
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
    public List<grouppeople>getgrouppeople(String userid){
        List<grouppeople>list=personimfseritf.getgrouppeople(userid);
        return list;
    }
    @RequestMapping("html/personimfhtml/getpeopleById.do")
    public List<grouppeople>getpeopleById(String userid,String username){
        System.out.println(userid);
        System.out.println(username);
        List<grouppeople>list=personimfseritf.getpeopleById(userid,username);
        return list;
    }


}
