package com.lzy.tps;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

public class Tps {
	
	private BigInteger id;
	
	private String name;
	
	private int age;
	
	private String money;
	
	private BigDecimal userDate;

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMoney() {
		return money;
	}

	public void setMoney(String money) {
		this.money = money;
	}

	public BigDecimal getUserDate() {
		return userDate;
	}

	public void setUserDate(BigDecimal userDate) {
		this.userDate = userDate;
	}

	@Override
	public String toString() {
		return "Tps [id=" + id + ", name=" + name + ", age=" + age + ", money=" + money + ", userDate=" + userDate
				+ "]";
	}

	public Tps(BigInteger id, String name, int age, String money, BigDecimal userDate) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.money = money;
		this.userDate = userDate;
	}

	public Tps() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
}
