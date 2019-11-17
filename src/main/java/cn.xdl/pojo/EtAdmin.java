package cn.xdl.pojo;

import java.io.Serializable;





public class EtAdmin implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private String password;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "EtAdmin [id=" + id + ", name=" + name + ", password=" + password + "]";
	}
	public EtAdmin(int id, String name, String password) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
	}
	public EtAdmin() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
