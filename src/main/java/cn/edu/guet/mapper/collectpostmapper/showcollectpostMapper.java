package cn.edu.guet.mapper.collectpostmapper;


import cn.edu.guet.bean.collectpostbean.post1;
import cn.edu.guet.bean.editor.Post;

import java.util.List;

public interface showcollectpostMapper {
    List<Post> getshowcollectpost(String userid);
}
