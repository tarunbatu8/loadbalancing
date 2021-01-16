package com.telusko.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Number {
	private long data;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	protected Number() {
	}

	/**
	 * @return the data
	 */
	public long getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(long data) {
		this.data = data;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
}