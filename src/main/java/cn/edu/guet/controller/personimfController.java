package cn.edu.guet.controller;

import cn.edu.guet.bean.personimf.dgroup;
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

    @RequestMapping("gg.do")
    public void getdgroup(){
        System.out.println("dwd");
        System.out.println(personimfseritf);
        List<dgroup>list=personimfseritf.getdgroup("1");
        System.out.println(list.get(0).getGname());
    }

}
