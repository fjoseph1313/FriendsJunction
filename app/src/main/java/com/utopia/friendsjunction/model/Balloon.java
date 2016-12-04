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
	
	
}
