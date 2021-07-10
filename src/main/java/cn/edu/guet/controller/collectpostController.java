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
//显示收藏贴子
    @RequestMapping("html/collectposthtml/sctz.do")
    public List<collectpost> getSCTZ(String userid){
        System.out.println(userid);
        List<collectpost> list=collectpostseritf.getSCTZ(userid);
        return list;
    }
    //删除收藏贴子
    @RequestMapping("html/collectposthtml/deletesctz.do")
    public String  deleteAllSCTZ(String userid,String deleteArry){
        String index[]=deleteArry.split(",");
        for(int i=0;i<index.length;i++){
            collectpostseritf.deleteSCTZ(userid, index[i]);
        }
        return "forward:sctz.do";

    }
}
