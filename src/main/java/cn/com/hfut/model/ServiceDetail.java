package cn.com.hfut.model;

import java.util.Date;

public class ServiceDetail{
	
	private int detailId;
	
	private int serviceId;
	
	private String clientHost;
	
	private String osUserName;
	
	private Date loginTime;
	
	private Date logoutTime;
	
	private int duration;
	
	private int cost;

	public int getDetailId() {
		return detailId;
	}

	public void setDetailId(int detailId) {
		this.detailId = detailId;
	}

	public int getServiceId() {
		return serviceId;
	}

	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}

	public String getClientHost() {
		return clientHost;
	}

	public void setClientHost(String clientHost) {
		this.clientHost = clientHost;
	}

	public String getOsUserName() {
		return osUserName;
	}

	public void setOsUserName(String osUserName) {
		this.osUserName = osUserName;
	}

	public Date getLoginTime() {
		return loginTime;
	}

	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}

	public Date getLogoutTime() {
		return logoutTime;
	}

	public void setLogoutTime(Date logoutTime) {
		this.logoutTime = logoutTime;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "ServiceDetail [detailId=" + detailId + ", serviceId=" + serviceId + ", clientHost=" + clientHost
				+ ", osUserName=" + osUserName + ", loginTime=" + loginTime + ", logoutTime=" + logoutTime
				+ ", duration=" + duration + ", cost=" + cost + "]";
	}
	
	
}