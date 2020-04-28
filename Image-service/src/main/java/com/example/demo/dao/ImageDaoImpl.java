package com.example.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import com.example.demo.entity.Image;
@Repository
public class ImageDaoImpl implements ImageDao
{
	private EntityManager em;
	

	public ImageDaoImpl(EntityManager em) {
		super();
		this.em = em;
	}

	@Override
	public Image add(Image image) 
	{
		Image im=em.merge(image);
		// TODO Auto-generated method stub
		return im;
	}

	@Override
	public List<Image> listall() 
	{
		TypedQuery query = em.createQuery("from Image",Image.class);
		return query.getResultList();
	}

}
