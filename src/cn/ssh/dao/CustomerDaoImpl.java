package cn.ssh.dao;

import cn.ssh.domain.Customer;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Projections;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import java.util.List;

public class CustomerDaoImpl extends HibernateDaoSupport implements CustomerDao{
    @Override
    public Integer getTotalCount(DetachedCriteria dc) {

        //设置查询的聚合函数，总记录数
        dc.setProjection(Projections.rowCount());

        List<Long> list = (List<Long>) getHibernateTemplate().findByCriteria(dc);

        //清空之前设置的聚合函数
        dc.setProjection(null);

        if (list!=null && list.size()>0){
            Long count = list.get(0);
            return count.intValue();
        }else {
            return null;
        }
    }

    @Override
    public List<Customer> getPageList(DetachedCriteria dc, int start, Integer pageSize) {

        List<Customer> list = (List<Customer>) getHibernateTemplate().findByCriteria(dc, start, pageSize);

        return list;
    }
}
