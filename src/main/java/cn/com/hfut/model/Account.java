package cn.com.hfut.model;

import java.security.Timestamp;
import java.util.Date;


public class Account{
	
	private int accountId;
	
	private int recommenderId;
	
	private String loginName;
	
	private String password;
	
	private String status;
	
	private Timestamp createDate;
	
	private Date pauseDate;
	
	private Date closeDate;
	
	private String realName;
	
	private String idCardNo;
	
	private Date birthDate;
	
	private String gender;
	
	private String occupation;
	
	private String telephone;
	
	private String email;
	
	private String mailaddress;
	
	private String zipcode;
	
	private String qq;
	
	private Date lastLoginDate;
	
	private String lastLoginIp;

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public int getRecommenderId() {
		return recommenderId;
	}

	public void setRecommenderId(int recommenderId) {
		this.recommenderId = recommenderId;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Timestamp getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

	public Date getPauseDate() {
		return pauseDate;
	}

	public void setPauseDate(Date pauseDate) {
		this.pauseDate = pauseDate;
	}

	public Date getCloseDate() {
		return closeDate;
	}

	public void setCloseDate(Date closeDate) {
		this.closeDate = closeDate;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getIdCardNo() {
		return idCardNo;
	}

	public void setIdCardNo(String idCardNo) {
		this.idCardNo = idCardNo;
	}



	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMailaddress() {
		return mailaddress;
	}

	public void setMailaddress(String mailaddress) {
		this.mailaddress = mailaddress;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public Date getLastLoginDate() {
		return lastLoginDate;
	}

	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}

	public String getLastLoginIp() {
		return lastLoginIp;
	}

	public void setLastLoginIp(String lastLoginIp) {
		this.lastLoginIp = lastLoginIp;
	}

	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", recommenderId=" + recommenderId + ", loginName=" + loginName
				+ ", password=" + password + ", status=" + status + ", createDate=" + createDate + ", pauseDate="
				+ pauseDate + ", closeDate=" + closeDate + ", realName=" + realName + ", idCardNo=" + idCardNo
				+ ", birthDate=" + birthDate + ", gender=" + gender + ", occupation=" + occupation
				+ ", telephone=" + telephone + ", email=" + email + ", mailaddress=" + mailaddress + ", zipcode="
				+ zipcode + ", qq=" + qq + ", lastLoginDate=" + lastLoginDate + ", lastLoginIp=" + lastLoginIp + "]";
	}
	
	
	
}