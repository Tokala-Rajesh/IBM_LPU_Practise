package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.EventDao;
import com.example.entity.Event;
@Service
public class EventServiceImpl implements EventService 
{
	private EventDao eventDao;
	
    @Autowired
	public EventServiceImpl(EventDao eventDao) {
		super();
		this.eventDao = eventDao;
	}


	public Event CreateEvent(Event event) {
		// TODO Auto-generated method stub
		return eventDao.CreateEvent(event);
	}

}
