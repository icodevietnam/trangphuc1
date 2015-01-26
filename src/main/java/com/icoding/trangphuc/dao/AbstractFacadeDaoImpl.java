package com.icoding.trangphuc.dao;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Property;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public abstract class AbstractFacadeDaoImpl<T> extends HibernateDaoSupport
		implements AbstracFacadeDao<T> {

	private Class<T> entityClass;

	@Autowired
	private SessionFactory sessionFactory;

	@Autowired
	public void setSession(SessionFactory sessionFactory) {
		this.setSessionFactory(sessionFactory);
	}

	@SuppressWarnings("unchecked")
	public AbstractFacadeDaoImpl() {
		entityClass = (Class<T>) ((ParameterizedType) getClass()
				.getGenericSuperclass()).getActualTypeArguments()[0];
	}

	@Override
	public List<T> getAll() {
		return getHibernateTemplate().loadAll(entityClass);
	}

	@Override
	public boolean save(Object bean) {
		Boolean flag = false;
		try {
			getHibernateTemplate().save(bean);
			flag = true;
		} catch (Exception e) {
			e.printStackTrace();
			flag = false;
		}
		return flag;
	}

	@Override
	public boolean update(Object bean) {
		Boolean flag = false;
		try {
			getHibernateTemplate().update(bean);
			flag = true;
		} catch (Exception e) {
			e.printStackTrace();
			flag = false;
		}
		return flag;
	}

	@Override
	public boolean delete(int id) {
		Boolean flag = false;
		try {
			T t = get(id);
			if (t != null) {
				getHibernateTemplate().delete(t);
				flag = true;
			} else {
				flag = false;
			}
		} catch (Exception e) {
			flag = false;
		}
		return flag;
	}

	@Override
	public T get(int id) {
		T o = (T) getHibernateTemplate().get(entityClass, id);
		return o;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List getListByCriteria(DetachedCriteria detachedCriteria) {
		return (List<T>) getHibernateTemplate()
				.findByCriteria(detachedCriteria);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List getListByCriteria(DetachedCriteria detachedCriteria,
			int offset, int size) {
		return (List<T>) getHibernateTemplate().findByCriteria(
				detachedCriteria, offset, size);
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean checkDuplicate(Class<T> clazz, boolean isEqual,
			String columnName, Object value) {
		Boolean flag = false;
		try {
			List<T> list = null;
			if (isEqual) {
				list = getListByCriteria(DetachedCriteria.forClass(clazz).add(
						Property.forName(columnName).eq(value)));
			} else {
				list = getListByCriteria(DetachedCriteria.forClass(clazz).add(
						Property.forName(columnName).like(value)));
			}
			if (list.size() != 0) {
				flag = true;
			} else {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return flag;
	}

	/**
	 * I will support two kind of operator 1 - Like Operator 2 - Equal Operator
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<T> getListByColumn(Class<T> clazz, boolean isEqual,
			String columnName, Object value) {
		List<T> list = null;
		try {
			if (isEqual) {
				list = getListByCriteria(DetachedCriteria.forClass(clazz).add(
						Property.forName(columnName).eq(value)));
			} else {
				list = getListByCriteria(DetachedCriteria.forClass(clazz).add(
						Property.forName(columnName).like(value)));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

}
