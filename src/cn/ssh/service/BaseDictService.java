package cn.ssh.service;

import cn.ssh.domain.BaseDict;

import java.util.List;

public interface BaseDictService {
    //根据数据字典类型字段获得数据字典对象
    public List<BaseDict> getListByTypeCode(String dict_type_code);
}
