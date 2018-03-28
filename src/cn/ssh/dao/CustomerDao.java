package cn.ssh.dao;

import cn.ssh.domain.Customer;
import org.hibernate.criterion.DetachedCriteria;

import java.util.List;

public interface CustomerDao {
    Integer getTotalCount(DetachedCriteria dc);

    List<Customer> getPageList(DetachedCriteria dc, int start, Integer pageSize);
}
