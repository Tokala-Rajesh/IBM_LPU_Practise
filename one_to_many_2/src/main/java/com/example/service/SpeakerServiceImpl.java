package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.SpeakerDao;
import com.example.entity.Speaker;
@Service
public class SpeakerServiceImpl implements SpeakerService
{
	private SpeakerDao dao;
	
    @Autowired
	public SpeakerServiceImpl(SpeakerDao dao) 
	{
		super();
		this.dao = dao;
	}


	public Speaker CreateSpeaker(Speaker speaker) {
		// TODO Auto-generated method stub
		return dao.createSpeaker(speaker);
	}

}
