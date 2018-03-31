package cn.ssh.service;

import cn.ssh.domain.Customer;
import cn.ssh.utils.PageBean;
import org.hibernate.criterion.DetachedCriteria;

public interface CustomerService {
    //分页业务方法
    PageBean getPageBean(DetachedCriteria dc, Integer currentPage, Integer pageSize);
    //保存客户方法
    void save(Customer customer);
}
