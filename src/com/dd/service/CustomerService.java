package com.dd.service;

import com.dd.po.Customer;
import com.itheima.common.utils.Page;

public interface CustomerService {

	//��ѯ�ͻ��б�
	public Page<Customer> findCustomerList(Integer page,Integer rows,String custName,
			String custSource,String custIndustry,String custLevel);
	
	//�����ͻ�
	public int createCustomer(Customer customer);
	
	//ͨ��id��ѯ�ͻ�
	public Customer getCustomerById(Integer id);
	
	//�޸Ŀͻ�
	public int updateCustomer(Customer customer);
	
	//ɾ���ͻ�
	public int deleteCustomer(Integer id);
}
