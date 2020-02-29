package com.atguigu.springcloud.service.impl;

import java.util.List;

import com.atguigu.springcloud.entity.Dept;
import org.springframework.stereotype.Service;

import com.atguigu.springcloud.dao.DeptDao;

import com.atguigu.springcloud.service.DeptService;

import javax.annotation.Resource;

@Service
public class DeptServiceImpl implements DeptService
{
	@Resource
	private DeptDao deptDao;
	
	@Override
	public boolean add(Dept dept)
	{
		return deptDao.addDept(dept);
	}

	@Override
	public Dept get(Long id)
	{
		return deptDao.findById(id);
	}

	@Override
	public List<Dept> list()
	{
		return deptDao.findAll();
	}

}
