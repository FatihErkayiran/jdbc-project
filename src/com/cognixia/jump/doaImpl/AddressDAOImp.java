package src.com.cognixia.jump.doaImpl;


import com.cognixia.jump.models.Address;
import src.com.cognixia.jump.doa.AddressDAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AddressDAOImp implements AddressDAO {

	private Connection conn;

	{
		try {
			conn = com.cognixia.jump.connection.ConnectionManager.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Address> getAllAddress() {
		List<Address>addresses=new ArrayList<>();

		try(Statement stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery("select * from address");) {


			while (rs.next()){

				int id =rs.getInt(1);
				String street=rs.getString(2);
				String city=rs.getString(3);
				String state=rs.getString(4);
				String zip=rs.getString(5);

				Address address=new Address(id,street,city,state,zip);

				addresses.add(address);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return addresses;
	}
	@Override
	public Address getAddressById(int id) {

		Address address=null;
		try(PreparedStatement pstmt=conn.prepareStatement("select * from address where address_id = ? ");) {

			pstmt.setInt(1,id);

			ResultSet rs=pstmt.executeQuery();


			if (rs.next()){
				int addressId=rs.getInt(1);
				String street=rs.getString(2);
				String city=rs.getString(3);
				String state=rs.getString(4);
				String zip=rs.getString(5);

				address=new Address(addressId,street,city,state,zip);


			}

		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return address;
	}

	@Override
	public boolean updateAddress(Address address) {

		try(PreparedStatement pstmst=conn.prepareStatement("update address set street = ?, " +
				"city = ? , state = ? , zip_code = ? where  address_id = ? ");) {


			pstmst.setString(1,address.getStreet());
			pstmst.setString(2,address.getCity());
			pstmst.setString(3,address.getState());
			pstmst.setString(4,address.getZip());
			pstmst.setInt(5,address.getId());

			int a=pstmst.executeUpdate();
			if (a>0){
				System.out.println("address updated");
				return true;
			}



		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public boolean addAddress(Address address) {

		try (PreparedStatement stmt = conn.prepareStatement("insert into address values(?,?,?,?,?)");) {

			stmt.setInt(1, address.getId());
			stmt.setString(2, address.getStreet());
			stmt.setString(3, address.getCity());
			stmt.setString(4, address.getState());
			stmt.setString(5, address.getZip());

			int added = stmt.executeUpdate();

			if (added > 0) return true;


		} catch (SQLIntegrityConstraintViolationException e) {
			System.out.println("this address is already exist");


			return false;
		} catch (SQLException e) {
			e.printStackTrace();

		}
		return false;
	}


}
