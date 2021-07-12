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
    public List<collectpost> getSCTZ(String userid, int page){
        int count=collectpostseritf.getSCTZCount(userid);
        collectpost collectpost=new collectpost();
        collectpost.setUserid(userid);
        collectpost.setPage(page);
        List<collectpost> list=collectpostseritf.getSCTZ(collectpost);
        for (int i=0;i<list.size();i++){
            list.get(i).setCount(count);
        }
        return list;
    }
    //删除收藏贴子
    @RequestMapping("html/collectposthtml/deletesctz.do")
    public String  deleteAllSCTZ(String userid,String deleteArry,int page){
        String index[]=deleteArry.split(",");
        for(int i=0;i<index.length;i++){
            collectpostseritf.deleteSCTZ(userid, index[i]);
        }
        return "forward:sctz.do?userid="+userid+"&page="+page;

    }
}
