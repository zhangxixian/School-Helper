package bean;

/*
 * 功能：userBean
 * 开发人：尚一飞
 * 开发时间：2018.11.27
 * 
 * 描述：所有用户信息的有参无参构造函数和get  set 方法
 * 
 * */
public class UserBean {
	private int userId;
	private String userName;
	private String userPassword;
	private int schoolId;
	private String userStudentNum;
	private String userPhone;
	private String image;
	private double userMoney;
	private int userReputationValue;
	private int userTookCount;
	private int userPublishCount;
	
	
	public UserBean(int userId, String userName, String userPassword, int schoolId, String userStudentNum,
			String userPhone, String image, double userMoney, int userReputationValue, int userTookCount,
			int userPublishCount) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPassword = userPassword;
		this.schoolId = schoolId;
		this.userStudentNum = userStudentNum;
		this.userPhone = userPhone;
		this.image = image;
		this.userMoney = userMoney;
		this.userReputationValue = userReputationValue;
		this.userTookCount = userTookCount;
		this.userPublishCount = userPublishCount;
	}


	public UserBean() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getUserPassword() {
		return userPassword;
	}


	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}


	public int getSchoolId() {
		return schoolId;
	}


	public void setSchoolId(int schoolId) {
		this.schoolId = schoolId;
	}


	public String getUserStudentNum() {
		return userStudentNum;
	}


	public void setUserStudentNum(String userStudentNum) {
		this.userStudentNum = userStudentNum;
	}


	public String getUserPhone() {
		return userPhone;
	}


	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}


	public String getImage() {
		return image;
	}


	public void setImage(String image) {
		this.image = image;
	}


	public double getUserMoney() {
		return userMoney;
	}


	public void setUserMoney(double userMoney) {
		this.userMoney = userMoney;
	}


	public int getUserReputationValue() {
		return userReputationValue;
	}


	public void setUserReputationValue(int userReputationValue) {
		this.userReputationValue = userReputationValue;
	}


	public int getUserTookCount() {
		return userTookCount;
	}


	public void setUserTookCount(int userTookCount) {
		this.userTookCount = userTookCount;
	}


	public int getUserPublishCount() {
		return userPublishCount;
	}


	public void setUserPublishCount(int userPublishCount) {
		this.userPublishCount = userPublishCount;
	}
	
	
	
}
