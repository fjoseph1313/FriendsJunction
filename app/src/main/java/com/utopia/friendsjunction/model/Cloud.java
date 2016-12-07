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

	public Cloud(Builder builder){
		setId(builder.id);
		setCloudName(builder.cloudName);
		setCloudStatus(builder.cloudStatus);
		setCloudCreatedDate(builder.cloudCreatedDate);
		setJumpers(builder.jumpers);
		setBalloons(builder.balloons);
	}

	
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

	//Builder Design pattern for easy objects creation
	public Builder copyBuilder() {
		return new Builder(this);
	}

	public static Builder builder() {
		return new Builder();
	}

	public static final class Builder {

		private Long id;
		private String cloudName;
		private String cloudStatus;
		private Date cloudCreatedDate;
		private Set<Jumper> jumpers;
		private Set<Balloon> balloons;

		private Builder(){}

		private Builder(Cloud cloud){
			id = cloud.id;
			cloudName = cloud.cloudName;
			cloudStatus = cloud.cloudStatus;
			cloudCreatedDate = cloud.cloudCreatedDate;
			jumpers = cloud.jumpers;
			balloons = cloud.balloons;
		}

		public Builder withId(Long id){
			this.id = id;
			return this;
		}

		public Builder withCloudName(String cloudName){
			this.cloudName = cloudName;
			return this;
		}

		public Builder withCloudStatus(String status){
			this.cloudStatus = status;
			return this;
		}

		public Builder withCloudCreatedDate(Date date){
			this.cloudCreatedDate = date;
			return this;
		}

		public Builder withJumpers(Set<Jumper> jumpers){
			this.jumpers = jumpers;
			return this;
		}

		public Builder withBalloons(Set<Balloon> balloons){
			this.balloons = balloons;
			return this;
		}

		public Cloud build(){
			return new Cloud(this);
		}
	}
}
