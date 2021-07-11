package cn.edu.guet.mapper.personimfmapper;

import cn.edu.guet.bean.personimf.grouppeople;

import java.util.List;

public interface showpeopleByIdMapper {
    List<grouppeople> getpeopleById(String userid,String username);
}
