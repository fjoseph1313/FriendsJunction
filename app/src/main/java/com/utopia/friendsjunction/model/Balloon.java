package com.utopia.friendsjunction.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Balloon implements Serializable{

	private static final long serialVersionUID = 1L;

	private Long id;
	private String balloonName;
	private Date balloonCreatedDate;
	private String balloonStatus;
	private Cloud cloud;
	private List<Arrow> arrows;

	private Balloon(Builder builder){
		setId(builder.id);
		setBalloonName(builder.balloonName);
		setBalloonCreatedDate(builder.balloonCreatedDate);
		setBalloonStatus(builder.balloonStatus);
		setCloud(builder.cloud);
		setArrows(builder.arrows);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBalloonName() {
		return balloonName;
	}

	public void setBalloonName(String balloonName) {
		this.balloonName = balloonName;
	}

	public Date getBalloonCreatedDate() {
		return balloonCreatedDate;
	}

	public void setBalloonCreatedDate(Date balloonCreatedDate) {
		this.balloonCreatedDate = balloonCreatedDate;
	}

	public String getBalloonStatus() {
		return balloonStatus;
	}

	public void setBalloonStatus(String balloonStatus) {
		this.balloonStatus = balloonStatus;
	}

	public Cloud getCloud() {
		return cloud;
	}

	public void setCloud(Cloud cloud) {
		this.cloud = cloud;
	}

	public List<Arrow> getArrows() {
		return arrows;
	}

	public void setArrows(List<Arrow> arrows) {
		this.arrows = arrows;
	}
	
	//Builder design pattern for object construction
	public Builder copyBuilder() {
		return new Builder(this);
	}

	public static Builder builder() {
		return new Builder();
	}

	public static final class Builder {
		private Long id;
		private String balloonName;
		private Date balloonCreatedDate;
		private String balloonStatus;
		private Cloud cloud;
		private List<Arrow> arrows;

		private Builder(){}

		private Builder(Balloon balloon){
			id = balloon.id;
			balloonName = balloon.balloonName;
			balloonCreatedDate = balloon.balloonCreatedDate;
			balloonStatus = balloon.balloonStatus;
			cloud = balloon.cloud;
			arrows =balloon.arrows;
		}

		public Builder withId(Long id){
			this.id = id;
			return this;
		}

		public Builder withBalloonName(String name){
			this.balloonName = name;
			return this;
		}

		public Builder withBalloonCreatedDate(Date date){
			this.balloonCreatedDate = date;
			return this;
		}

		public Builder withBalloonStatus(String status){
			this.balloonStatus = status;
			return this;
		}

		public Builder withCloud(Cloud cloud){
			this.cloud = cloud;
			return this;
		}

		public Builder withArrows(List<Arrow> arrows){
			this.arrows = arrows;
			return this;
		}

		public Balloon build(){
			return new Balloon(this);
		}
	}
}
