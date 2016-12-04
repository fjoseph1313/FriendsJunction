package com.utopia.friendsjunction.model;

import android.os.Build;
import android.widget.Button;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

public class Jumper implements Serializable{

	private static final long serialVersionUID = 1L;

	private Long id;
	private String jumperName;
	private String firstName;
	private String lastName;
	private Date dateCreated;
	private Date activeSince;
	private String status;
	private Set<Cloud> clouds;
	private List<Arrow> arrows;

	private Jumper(Builder builder){
		setId(builder.id);
		setJumperName(builder.jumperName);
		setFirstName(builder.firstName);
		setLastName(builder.lastName);
		setDateCreated(builder.dateCreated);
		setActiveSince(builder.activeSince);
		setStatus(builder.status);
	}
	
	
	public Set<Cloud> getClouds() {
		return clouds;
	}

	public void setClouds(Set<Cloud> clouds) {
		this.clouds = clouds;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getJumperName() {
		return jumperName;
	}

	public void setJumperName(String jumperName) {
		this.jumperName = jumperName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Date getActiveSince() {
		return activeSince;
	}

	public void setActiveSince(Date activeSince) {
		this.activeSince = activeSince;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<Arrow> getArrows() {
		return arrows;
	}

	public void setArrows(List<Arrow> arrows) {
		this.arrows = arrows;
	}

	public Jumper(){}

	public Jumper(String jumperName, String status){
		this.jumperName = jumperName;
		this.status = status;
	}

	public Builder copyBuilder() {
		return new Builder(this);
	}

	public static Builder builder() {
		return new Builder();
	}

	public static final class Builder {
		private Long id;
		private String jumperName;
		private String firstName;
		private String lastName;
		private Date dateCreated;
		private Date activeSince;
		private String status;
		private Set<Cloud> clouds;
		private List<Arrow> arrows;

		private Builder(){}

		private Builder(Jumper jumper){
			id = jumper.id;
			jumperName = jumper.jumperName;
			firstName = jumper.firstName;
			lastName = jumper.lastName;
			dateCreated = jumper.dateCreated;
			activeSince = jumper.activeSince;
			status = jumper.status;
			clouds = jumper.clouds;
			arrows = jumper.arrows;
		}

		public Builder withId(Long id) {
			this.id = id;
			return this;
		}

		public Builder withJumperName(String jumperName) {
			this.jumperName = jumperName;
			return this;
		}

		public Builder withFirstName(String firstName){
			this.firstName = firstName;
			return this;
		}

		public Builder withLastName(String lastName){
			this.lastName = lastName;
			return this;
		}

		public Builder withStatus(String status){
			this.status = status;
			return this;
		}

		public Builder withDateCreated(Date dateCreated){
			this.dateCreated = dateCreated;
			return this;
		}

		public Builder withActiveSince(Date activeSince){
			this.activeSince = activeSince;
			return this;
		}

		public Jumper build(){
			return new Jumper(this);
		}
	}
	
}
