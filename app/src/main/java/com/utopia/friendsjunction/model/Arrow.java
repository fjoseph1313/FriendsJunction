package com.utopia.friendsjunction.model;

import java.io.Serializable;
import java.util.Date;

public class Arrow implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private Long id;
	private String arrow;
	private Date arrowDate;
	private Jumper jumper;
	private Balloon balloon;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getArrow() {
		return arrow;
	}

	public void setArrow(String arrow) {
		this.arrow = arrow;
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
	
	
}
