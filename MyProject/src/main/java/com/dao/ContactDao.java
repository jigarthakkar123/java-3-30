package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.bean.Contact;
import com.util.UserUtil;

public class ContactDao {

	public static void submitContact(Contact c)
	{
		try {
			Connection connection=UserUtil.createConnection();
			String sql="insert into contact(name,email,subject,remarks) values(?,?,?,?)";
			PreparedStatement pst=connection.prepareStatement(sql);
			pst.setString(1, c.getName());
			pst.setString(2, c.getEmail());
			pst.setString(3, c.getSubject());
			pst.setString(4, c.getRemarks());
			pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
