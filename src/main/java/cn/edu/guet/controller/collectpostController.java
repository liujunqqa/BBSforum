package cn.edu.guet.controller;

import cn.edu.guet.bean.collectpostbean.collectpost;
import cn.edu.guet.bll.collectpostseritf;
import cn.edu.guet.mvc.annotaion.Controller;
import cn.edu.guet.mvc.annotaion.RequestMapping;

import java.util.List;
@Controller
public class collectpostController {
    private collectpostseritf collectpostseritf;

    public void setcollectpostserimpl(collectpostseritf collectpostseritf) {
        this.collectpostseritf = collectpostseritf;
    }

    @RequestMapping("html/collectposthtml/sctz.do")
    public List<collectpost> getSCTZ(String userid){
        System.out.println(userid);
        List<collectpost> list=collectpostseritf.getSCTZ(userid);
        return list;
    }
    @RequestMapping("html/collectposthtml/deletesctz.do")
    public void  deleteAllSCTZ(){
        collectpostseritf.deleteSCTZ("16");
        System.out.println("eode");
    }
}
