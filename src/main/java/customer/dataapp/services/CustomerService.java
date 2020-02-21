package customer.dataapp.services;

import java.sql.Connection;
import java.sql.Statement;

import customer.dataapp.database.DbUtility;
import customer.dataapp.models.Customer;

public class CustomerService {
	public Customer addCustomerById(Customer c) throws Exception {
		Connection con = DbUtility.getConnection();

		Statement stmt = con.createStatement();
		String sql = "insert into customerinfo(name,age,email,phoneNumber) values ('" + c.getName() + "','" + c.getAge()
				+ "','" + c.getEmail() + "','" + c.getPhoneNumber() + "')";
		stmt.executeUpdate(sql);
		return c;
	}
}
