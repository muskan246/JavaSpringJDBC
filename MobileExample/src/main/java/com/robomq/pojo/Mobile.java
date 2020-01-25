package com.robomq.pojo;

public class Mobile {
	@Override
	public String toString() {
		return "Mobile [id=" + id + ", name=" + name + ", price=" + price + ", qty=" + qty + ", desc=" + desc + "]";
	}

	private int id;
	private String name;
	private float price;
	private int qty;
	private String desc;
	
	public Mobile() {
	}

	public Mobile(int id, String name, float price, int qty, String desc) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.qty = qty;
		this.desc = desc;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

}
