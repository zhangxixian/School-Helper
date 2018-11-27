package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.UserBean;
import dao.DataBase;

public class UserDao {

	/*
	 * 功能：setUser  注册时向数据库存入用户信息
	 * 开发人：尚一飞
	 * 开发时间：2018.11.27
	 * 
	 * 描述：传入UserBean类型数据将其存入数据库
	 * */
	public static void setUser(UserBean use) {
		
		Connection conn = DataBase.getConnection();
		String sql = "insert into user(user_phone,user_password,user_name,school_id,user_student_num) values(?,?,?,?,?)";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, use.getUserPhone());
			pstmt.setString(2, use.getUserPassword());
			pstmt.setString(3, use.getUserName());
			pstmt.setInt(4, use.getSchoolId());
			pstmt.setString(5, use.getUserStudentNum());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	/*
	 * 功能：reviseUser 修改数据库用户信息
	 * 开发人：尚一飞
	 * 开发时间：2018.11.27
	 * 
	 * 描述：传入UserBean类型信息，通过userId查到数据库中user信息并将其覆盖
	 * */
	public static void reviseUser(UserBean user) {
		
	}
	
	
	/*
	 * 功能：checkUser 查询数据库该用户信息
	 * 开发人：尚一飞
	 * 开发时间：2018.11.27
	 * 
	 * 描述：通过传入的用户id查找该用户的所有信息
	 * */
	public static UserBean checkUser(int userId) {
		UserBean user = new UserBean();
		Connection conn = DataBase.getConnection();
		String sql = "select user_id,user_name,user_password,school_id,user_student_num,user_phone,user_image,user_money,user_reputation_value,user_took_count,user_publish_count from user where user_id=?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, userId);
			ResultSet rs = pstmt.executeQuery();
				user.setUserId(rs.getInt("user_id"));
				user.setUserName(rs.getString("user_name"));
				user.setUserPassword(rs.getString("user_password"));
				user.setSchoolId(rs.getInt("school_id"));
				user.setUserStudentNum(rs.getString("user_student_num"));
				user.setUserPhone(rs.getString("user_phone"));
				user.setImage(rs.getString("user_image"));
				user.setUserMoney(rs.getShort("user_money"));
				user.setUserReputationValue(rs.getInt("user_reputation_value"));
				user.setUserTookCount(rs.getInt("user_took_count"));
				user.setUserPublishCount(rs.getInt("user_publish_count"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return user;
		
	}
}