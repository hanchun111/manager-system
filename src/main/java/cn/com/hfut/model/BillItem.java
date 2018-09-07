package cn.com.hfut.model;

public class BillItem{
	
	private int itemId;
	
	private int billId;
	
	private int serviceId;
	
	private int cost;

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public int getBillId() {
		return billId;
	}

	public void setBillId(int billId) {
		this.billId = billId;
	}

	public int getServiceId() {
		return serviceId;
	}

	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "BillItem [itemId=" + itemId + ", billId=" + billId + ", serviceId=" + serviceId + ", cost=" + cost
				+ "]";
	}
	
	
}