package src.com.cognixia.jump.doa;

import com.cognixia.jump.models.Address;

import java.util.List;

public interface AddressDAO {

	public Address getAddressById(int id);

	public boolean updateAddress(Address address);

	public boolean addAddress(Address address);

	public List<Address> getAllAddress();
	
}
