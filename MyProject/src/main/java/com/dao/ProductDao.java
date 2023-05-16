package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bean.Product;
import com.util.UserUtil;

public class ProductDao {

	public static void addProduct(Product p)
	{
		try {
			Connection connection=UserUtil.createConnection();
			String sql="insert into product(product_category,product_name,product_price,product_desc,product_image,uid) values(?,?,?,?,?,?)";
			PreparedStatement pst=connection.prepareStatement(sql);
			pst.setString(1, p.getProduct_category());
			pst.setString(2, p.getProduct_name());
			pst.setInt(3, p.getProduct_price());
			pst.setString(4, p.getProduct_desc());
			pst.setString(5, p.getProduct_image());
			pst.setInt(6, p.getUid());
			pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void updateProduct(Product p)
	{
		
		try {
			Connection connection=UserUtil.createConnection();
			
			if(p.getProduct_image().equals(""))
			{
				
				System.out.println("if called");
				String sql="update product set product_category=?,product_name=?,product_price=?,product_desc=? where pid=? and uid=?";
				PreparedStatement pst=connection.prepareStatement(sql);
				pst.setString(1, p.getProduct_category());
				pst.setString(2, p.getProduct_name());
				pst.setInt(3, p.getProduct_price());
				pst.setString(4, p.getProduct_desc());
				pst.setInt(5, p.getPid());
				pst.setInt(6, p.getUid());
				pst.executeUpdate();
			}
			else
			{
				System.out.println("else called");
				String sql="update product set product_category=?,product_name=?,product_price=?,product_desc=?,product_image=? where pid=? and uid=?";
				PreparedStatement pst=connection.prepareStatement(sql);
				pst.setString(1, p.getProduct_category());
				pst.setString(2, p.getProduct_name());
				pst.setInt(3, p.getProduct_price());
				pst.setString(4, p.getProduct_desc());
				pst.setString(5, p.getProduct_image());
				pst.setInt(6, p.getPid());
				pst.setInt(7, p.getUid());
				pst.executeUpdate();
			}
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public static void deleteProduct(int pid,int uid)
	{
		
		try {
			Connection connection=UserUtil.createConnection();
			
				
				
				String sql="delete from product where pid=? and uid=?";
				PreparedStatement pst=connection.prepareStatement(sql);
				
				pst.setInt(1, pid);
				pst.setInt(2, uid);
				pst.executeUpdate();
		
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public static List<Product> getAllProduct(int uid)
	{
		List<Product> list=new ArrayList<>();
		try {
			Connection connection=UserUtil.createConnection();
			String sql="select * from product where uid=?";
			PreparedStatement pst=connection.prepareStatement(sql);
			pst.setInt(1, uid);
			ResultSet rs=pst.executeQuery();
			while(rs.next())
			{
				Product p=new Product();
				p.setPid(rs.getInt("pid"));
				p.setUid(rs.getInt("uid"));
				p.setProduct_category(rs.getString("product_category"));
				p.setProduct_name(rs.getString("product_name"));
				p.setProduct_desc(rs.getString("product_desc"));
				p.setProduct_image(rs.getString("product_image"));
				p.setProduct_price(rs.getInt("product_price"));
				list.add(p);
			}
					
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	public static Product getProduct(int pid)
	{
		Product p=null;
		try {
			Connection connection=UserUtil.createConnection();
			String sql="select * from product where pid=?";
			PreparedStatement pst=connection.prepareStatement(sql);
			pst.setInt(1, pid);
			ResultSet rs=pst.executeQuery();
			if(rs.next())
			{
				p=new Product();
				p.setPid(rs.getInt("pid"));
				p.setUid(rs.getInt("uid"));
				p.setProduct_category(rs.getString("product_category"));
				p.setProduct_name(rs.getString("product_name"));
				p.setProduct_desc(rs.getString("product_desc"));
				p.setProduct_image(rs.getString("product_image"));
				p.setProduct_price(rs.getInt("product_price"));
				
			}
					
		} catch (Exception e) {
			e.printStackTrace();
		}
		return p;
	}
	public static Product getProductByUser(int pid,int uid)
	{
		Product p=null;
		try {
			Connection connection=UserUtil.createConnection();
			String sql="select * from product where pid=? and uid=?";
			PreparedStatement pst=connection.prepareStatement(sql);
			pst.setInt(1, pid);
			pst.setInt(2, uid);
			ResultSet rs=pst.executeQuery();
			if(rs.next())
			{
				p=new Product();
				p.setPid(rs.getInt("pid"));
				p.setUid(rs.getInt("uid"));
				p.setProduct_category(rs.getString("product_category"));
				p.setProduct_name(rs.getString("product_name"));
				p.setProduct_desc(rs.getString("product_desc"));
				p.setProduct_image(rs.getString("product_image"));
				p.setProduct_price(rs.getInt("product_price"));
				
			}
					
		} catch (Exception e) {
			e.printStackTrace();
		}
		return p;
	}
	public static List<Product> getAllProduct()
	{
		List<Product> list=new ArrayList<>();
		try {
			Connection connection=UserUtil.createConnection();
			String sql="select * from product";
			PreparedStatement pst=connection.prepareStatement(sql);
			ResultSet rs=pst.executeQuery();
			while(rs.next())
			{
				Product p=new Product();
				p.setPid(rs.getInt("pid"));
				p.setUid(rs.getInt("uid"));
				p.setProduct_category(rs.getString("product_category"));
				p.setProduct_name(rs.getString("product_name"));
				p.setProduct_desc(rs.getString("product_desc"));
				p.setProduct_image(rs.getString("product_image"));
				p.setProduct_price(rs.getInt("product_price"));
				list.add(p);
			}
					
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
