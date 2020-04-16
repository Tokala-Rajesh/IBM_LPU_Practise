package com.example.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="event1")
public class Event
{
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;
        @Column(name="name")
	    private String name;
        @Column(name="desc")
        private String desc;
//	    @Temporal(TemporalType.DATE)
//	    private Date startDate;
	    @OneToMany(mappedBy = "event", cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH,CascadeType.REFRESH })
		private List<Speaker> speakers;
	    
		public Event() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		public Event(String name, String desc) {
			super();
			this.name = name;
			this.desc = desc;
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
		public String getDesc() {
			return desc;
		}
		public void setDesc(String desc) {
			this.desc = desc;
		}
//		public Date getStartDate() {
//			return startDate;
//		}
//		public void setStartDate(Date startDate) {
//			this.startDate = startDate;
//		}
		public List<Speaker> getSpeakers() {
			return speakers;
		}
		public void setSpeakers(List<Speaker> speakers) {
			this.speakers = speakers;
		}

		public void add(Speaker speakers) {

			this.speakers.add(speakers);
		}

		@Override
		public String toString() {
			return "Event [id=" + id + ", name=" + name + ", desc=" + desc + "]";
		}
		
	    
	    
	

}
