package com.dd.service;

import java.util.List;

import com.dd.po.BaseDict;

public interface BaseDictService {
	
	//�����������ѯ�����ֵ�
	public List<BaseDict> findBaseDictByTypeCode(String typecode);
	
}
