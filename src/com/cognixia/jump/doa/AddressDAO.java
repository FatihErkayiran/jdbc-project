package com.cognixia.jump.doa;

import com.cognixia.jump.models.Address;

public interface AddressDAO {

	public Address getAddressById();
	
	public boolean updateAddress(Address address);
	
	public Address addAddress(Address address);
	
}
