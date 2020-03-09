package com.aaaws.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import com.aaaws.dao.IWhUserTypeDao;
import com.aaaws.model.WhUserType;

@Repository
public class WhUserTypeDaoImpl implements IWhUserTypeDao {

	@Autowired
	private HibernateTemplate ht;
	
	public Integer saveWhUserType(WhUserType obj) {
		return (Integer)ht.save(obj);
	}
	@Override
	public List<WhUserType> getAllWhUserType() {
		return ht.loadAll(WhUserType.class);
	}
	@Override
	public void deleteWhUserTypeById(Integer id) {
		ht.delete(new WhUserType(id));
	}
	@Override
	public WhUserType getWhUserTypeById(Integer id) {
		return ht.get(WhUserType.class, id);
	}
	@Override
	public void updateSelectedId(WhUserType obj) {
		ht.update(obj);
	}

	@SuppressWarnings({ "unchecked", "deprecation" })
	public List<Object[]> getWhUserTypeCount() {
		String sql="select whuserType, count(whuserType) from com.aaaws.model.WhUserType group by whuserType";
		return (List<Object[]>) ht.find(sql);
	}
}
