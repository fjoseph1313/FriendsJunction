package com.utopia.friendsjunction.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

public class Cloud implements Serializable{

	private static final long serialVersionUID = 1L;

	private Long id;
	private String cloudName;
	private String cloudStatus;
	private Date cloudCreatedDate;
	private Set<Jumper> jumpers;
	private Set<Balloon> balloons;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCloudName() {
		return cloudName;
	}

	public void setCloudName(String cloudName) {
		this.cloudName = cloudName;
	}

	public String getCloudStatus() {
		return cloudStatus;
	}

	public void setCloudStatus(String cloudStatus) {
		this.cloudStatus = cloudStatus;
	}

	public Date getCloudCreatedDate() {
		return cloudCreatedDate;
	}

	public void setCloudCreatedDate(Date cloudCreatedDate) {
		this.cloudCreatedDate = cloudCreatedDate;
	}

	public Set<Balloon> getBalloons() {
		return balloons;
	}

	public void setBalloons(Set<Balloon> balloons) {
		this.balloons = balloons;
	}

	public Set<Jumper> getJumpers(){
		return jumpers;
	}
	
	public void setJumpers(Set<Jumper> jumpers){
		this.jumpers = jumpers;
	}
}
