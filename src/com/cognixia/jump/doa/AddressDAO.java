package com.cognixia.jump.jdbc.project;

public interface AddressDAO {

	public Address getAddressById();
	
	public boolean updateAddress(Address address);
	
	public Address addAddress(Address address);
	
}
