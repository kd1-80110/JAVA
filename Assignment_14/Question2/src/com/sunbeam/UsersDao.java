package com.sunbeam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class UsersDao implements AutoCloseable {
	private Connection con;

	public UsersDao() throws SQLException {
		con = DbUtil.getConnection();
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		try {
			if (con != null)
				con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	static Date parseDate(String str) {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			Date date = sdf.parse(str);
			return date;
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}

	// add new user
	public int save(String first_name, String last_name, String email, String passwd, String bdate, boolean status,
			String role) throws SQLException {
		String sql = "Insert into users Values(default,?,?,?,?,?,?,?)";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			Date utilDate = parseDate(bdate);
			java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
			stmt.setString(1, first_name);
			stmt.setString(2, last_name);
			stmt.setString(3, email);
			stmt.setString(4, passwd);
			stmt.setDate(5, sqlDate);
			stmt.setBoolean(6, status);
			stmt.setString(7, role);

			int cnt = stmt.executeUpdate();
			return cnt;
		}

	}

	// update name and email
	public int update(String first_name, String last_name, String email, int id) throws SQLException {
		String sql = "UPDATE users SET first_name=?,last_name=?,email=? WHERE id=?";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, first_name);
			stmt.setString(2, last_name);
			stmt.setString(3, email);
			stmt.setInt(4, id);

			int cnt = stmt.executeUpdate();
			return cnt;
		}

	}

	// delete given users
	public int deleteById(int id) throws SQLException {
		String sql = "DELETE FROM users WHERE id=?";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setInt(1, id);
			int cnt = stmt.executeUpdate();
			return cnt;
		}
	}

	// display all users
	public List<Users> findAll() throws SQLException {
		List<Users> list = new ArrayList<>();
		String sql = "Select * from users";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			try (ResultSet rs = stmt.executeQuery()) {
				while (rs.next()) {
					int id = rs.getInt("id");
					String first_name = rs.getString("first_name");
					String last_name = rs.getString("last_name");
					String email = rs.getString("email");
					String password = rs.getString("password");
					String bdate = rs.getString("dob");
					boolean status = rs.getBoolean("status");
					String role = rs.getString("id");

					Users u = new Users(id, first_name, last_name, email, password, bdate, status, role);
					list.add(u);
				}
			}
		}
		return list;

	}
	
	// get all users of given lastname
		public List<Users> findByName(String givenName) throws SQLException {
			List<Users> list = new ArrayList<Users>();
			String sql = "Select * from users Where last_name=?";
			try (PreparedStatement stmt = con.prepareStatement(sql)) {
				stmt.setString(1, givenName);
				try (ResultSet rs = stmt.executeQuery()) {
					while (rs.next()) {
						int id = rs.getInt("id");
						String first_name = rs.getString("first_name");
						String last_name = rs.getString("last_name");
						String email = rs.getString("email");
						String password = rs.getString("password");
						String bdate = rs.getString("dob");
						boolean status = rs.getBoolean("status");
						String role = rs.getString("id");
						Users u = new Users(id, first_name, last_name, email, password, bdate, status, role);
						list.add(u);
					}
				}
			}
			return list;
		}
}
