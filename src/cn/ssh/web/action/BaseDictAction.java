package cn.ssh.web.action;

import cn.ssh.domain.BaseDict;
import cn.ssh.service.BaseDictService;
import com.opensymphony.xwork2.ActionSupport;
import net.sf.json.JSONArray;
import org.apache.struts2.ServletActionContext;

import java.util.List;

public class BaseDictAction extends ActionSupport{

    private String dict_type_code;

    private BaseDictService bds;
    @Override
    public String execute() throws Exception {
        //1，调用service根据typecode获得数据字典对象list
        List<BaseDict> list = bds.getListByTypeCode(dict_type_code);
        //2，将list转换为json格式
        String json = JSONArray.fromObject(list).toString();
        //3，键json发送给浏览器
        ServletActionContext.getResponse().setContentType("application/json;charset=utf-8");
        ServletActionContext.getResponse().getWriter().write(json);
        return null;//告诉struts2不需要进行结果处理
    }

    public String getDict_type_code() {
        return dict_type_code;
    }

    public void setDict_type_code(String dict_type_code) {
        this.dict_type_code = dict_type_code;
    }

    public BaseDictService getBds() {
        return bds;
    }

    public void setBds(BaseDictService bds) {
        this.bds = bds;
    }
}
