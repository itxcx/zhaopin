package com.demo.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.demo.dao.CollectionDao;
import com.demo.model.*;

@Service
public class CollectionService {

	@Resource
	private CollectionDao cd;
	
	public List<Collection> getCollections(Collection c){
		return cd.getCollections(c);
	}
	
	public boolean deleteCollection(Collection c){
		return cd.deleteCollection(c);
	}
	
	public boolean addCollection(Collection c){
		return cd.addCollection(c);
	}
	
	public int getCollectionLength(Collection c){
		return cd.getCollectionLength(c);
	}
	
	public boolean isStar(Collection c){
		return cd.isStar(c)==1?true:false;
	}
	
	public boolean toggleStar(Collection c,boolean star){
		if(star){
			return cd.addCollection(c);
		}else{
			return cd.unStar(c);
		}
	}
}
