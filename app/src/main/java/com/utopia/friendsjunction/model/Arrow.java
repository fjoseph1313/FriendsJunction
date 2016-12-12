package com.utopia.friendsjunction.model;

import java.io.Serializable;
import java.util.Date;

public class Arrow implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private Long id;
	private String arrowText;
	private Date arrowDate;
	private Jumper jumper;
	private Balloon balloon;

	public Arrow(Builder builder){
		setId(builder.id);
		setArrowText(builder.arrowText);
		setArrowDate(builder.arrowDate);
		setJumper(builder.jumper);
		setBalloon(builder.balloon);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getArrowText() {
		return arrowText;
	}

	public void setArrowText(String arrowText) {
		this.arrowText = arrowText;
	}

	public Date getArrowDate() {
		return arrowDate;
	}

	public void setArrowDate(Date arrowDate) {
		this.arrowDate = arrowDate;
	}

	public Jumper getJumper() {
		return jumper;
	}

	public void setJumper(Jumper jumper) {
		this.jumper = jumper;
	}

	public Balloon getBalloon() {
		return balloon;
	}

	public void setBalloon(Balloon balloon) {
		this.balloon = balloon;
	}
	
	//Builder Design pattern for object construction
	public Builder copyBuilder() {
		return new Builder(this);
	}

	public static Builder builder() {
		return new Builder();
	}

	public static final class Builder{
		private Long id;
		private String arrowText;
		private Date arrowDate;
		private Jumper jumper;
		private Balloon balloon;

		public Builder(){}

		public Builder(Arrow arrow){
			id = arrow.id;
			arrowText = arrow.arrowText;
			arrowDate = arrow.arrowDate;
			jumper = arrow.jumper;
			balloon = arrow.balloon;
		}

		public Builder withId(Long id) {
			this.id = id;
			return this;
		}

		public Builder withArrowText(String arrowText){
			this.arrowText = arrowText;
			return this;
		}

		public Builder withArrowDate(Date date){
			this.arrowDate = date;
			return this;
		}

		public Builder withJumper(Jumper jumper){
			this.jumper = jumper;
			return this;
		}

		public Builder withBalloon(Balloon balloon){
			this.balloon = balloon;
			return this;
		}

		public Arrow build(){
			return new Arrow(this);
		}
	}
}
