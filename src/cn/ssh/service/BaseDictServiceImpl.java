package cn.ssh.service;

import cn.ssh.dao.BaseDictDao;
import cn.ssh.domain.BaseDict;

import java.util.List;

public class BaseDictServiceImpl implements BaseDictService {

    private BaseDictDao bdd;

    @Override
    public List<BaseDict> getListByTypeCode(String dict_type_code) {

        return bdd.getListByTypeCode(dict_type_code);
    }

    public BaseDictDao getBdd() {
        return bdd;
    }

    public void setBdd(BaseDictDao bdd) {
        this.bdd = bdd;
    }
}
