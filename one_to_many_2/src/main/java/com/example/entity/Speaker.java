package com.example.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="speaker")
public class Speaker
{
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;
        @Column(name="name")
	    private String name;
        private String city;
        @ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
        @JoinColumn(name="event_id")
    	private Event event;
		public Speaker( String name, String city) {
			super();
			
			this.name = name;
			this.city = city;
		}
		public Speaker() {
			super();
			// TODO Auto-generated constructor stub
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
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public Event getEvent() {
			return event;
		}
		public void setEvent(Event event) {
			this.event = event;
		}
		@Override
		public String toString() {
			return "Speaker [id=" + id + ", name=" + name + ", city=" + city + "]";
		}
        

}
