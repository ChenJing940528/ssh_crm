package cn.ssh.service;

import cn.ssh.dao.CustomerDao;
import cn.ssh.domain.Customer;
import cn.ssh.utils.PageBean;
import org.hibernate.criterion.DetachedCriteria;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    private CustomerDao cd;

    @Override
    public PageBean getPageBean(DetachedCriteria dc, Integer currentPage, Integer pageSize) {

        //1，调用Dao查询总记录数
        Integer totalcount = cd.getTotalCount(dc);
        //2，创建PageBean对象
        PageBean pb = new PageBean(currentPage,totalcount,pageSize);
        //3，调用Dao查询分页列表数据
        List<Customer> list = cd.getPageList(dc, pb.getStart(), pb.getPageSize());
        //4，列表数据放入PageBean中，并返回
        pb.setList(list);
        return pb;
    }

    public void setCd(CustomerDao cd) {
        this.cd = cd;
    }
}
