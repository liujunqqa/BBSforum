package cn.edu.guet.controller;

import cn.edu.guet.bean.collectpostbean.post1;
import cn.edu.guet.bean.editor.Post;
import cn.edu.guet.bll.impl.showSCTZserimpl;
import cn.edu.guet.bll.showSCTZseritf;
import cn.edu.guet.mvc.annotaion.Controller;
import cn.edu.guet.mvc.annotaion.RequestMapping;

import java.util.List;
@Controller
public class collectpostController {
    private showSCTZseritf showSCTZseritf;

    public void setshowSCTZserimpl(showSCTZseritf showSCTZseritf) {
        this.showSCTZseritf = showSCTZseritf;
    }

    @RequestMapping("sctz.do")
    public void getSCTZ(){
        System.out.println("mefj");
        List<Post> list=showSCTZseritf.getSCTZ("1");
        System.out.println(list.get(0).getPtitle());

    }
}
