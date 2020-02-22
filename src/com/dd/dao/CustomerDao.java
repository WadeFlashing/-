package com.dd.dao;

import java.util.List;

import com.dd.po.Customer;

public interface CustomerDao {
	//�ͻ��б�ӿ�
	public List<Customer> selectCustomerList(Customer customer);
	
	//�ͻ����ӿ�
	public Integer selectCustomerListCount(Customer customer);
	
	//�����ͻ�
	public int createCustomer(Customer customer);
	
	//ͨ��id��ѯ�ͻ�
	public Customer getCustomerById(Integer id);
	
	//�޸Ŀͻ�
	public int updateCustomer(Customer customer);
	
	//ɾ���ͻ�
	public int deleteCustomer(Integer id);
}
