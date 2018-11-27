package dao;

import bean.UserBean;

public class UserDao {

	/*
	 * 功能：注册时向数据库存入用户信息
	 * 开发人：尚一飞
	 * 开发时间：2018.11.27
	 * 
	 * 描述：向数据库存入需要存入的信息
	 * */
	public static void setUser(UserBean use) {
		
		Connection conn = Database.getConnection();
		String sql = "insert into user(user_phone,user_password,user_name,school_id,user_student_num) values(?,?,?,?,?)";
	}
}
