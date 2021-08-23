package com.xworkz.hibernate.mall;

import java.io.Serializable;

public class MallDTO implements Serializable{
	private int id;
	private String name;
	private String location;
	private int noOFStalls;
	private boolean hasPVR;
	
	MallDTO(){
		
	}

	public MallDTO(int id, String name, String location, int noOFStalls, boolean hasPVR) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.noOFStalls = noOFStalls;
		this.hasPVR = hasPVR;
	}

	@Override
	public String toString() {
		return "MallDTO [id=" + id + ", name=" + name + ", location=" + location + ", noOFStalls=" + noOFStalls
				+ ", hasPVR=" + hasPVR + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (hasPVR ? 1231 : 1237);
		result = prime * result + id;
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + noOFStalls;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MallDTO other = (MallDTO) obj;
		if (hasPVR != other.hasPVR)
			return false;
		if (id != other.id)
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (noOFStalls != other.noOFStalls)
			return false;
		return true;
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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getNoOFStalls() {
		return noOFStalls;
	}

	public void setNoOFStalls(int noOFStalls) {
		this.noOFStalls = noOFStalls;
	}

	public boolean isHasPVR() {
		return hasPVR;
	}

	public void setHasPVR(boolean hasPVR) {
		this.hasPVR = hasPVR;
	}
	

}
