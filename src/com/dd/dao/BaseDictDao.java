package com.dd.dao;

import java.util.List;

import com.dd.po.BaseDict;

//�����ֵ�
public interface BaseDictDao {
	//�����������ѯ�����ֵ�
	public List<BaseDict> selectBaseDictByTypeCode(String typecode);
	
	
}
