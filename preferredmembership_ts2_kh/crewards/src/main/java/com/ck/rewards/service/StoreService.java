package com.ck.rewards.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.ck.rewards.dao.StoreDAO;
import com.ck.rewards.entity.State;
import com.ck.rewards.entity.Store;

/**
 * This class is to process store to dynamically load data * 
 * @author Boot Camp Java 11
 *
 */
@Service
public class StoreService {
	
@Autowired
private StoreDAO storedao;

@Transactional
public ArrayList<Store> getStoreListByStateId(String state_Id){
	ArrayList<Store> storesList = (ArrayList<Store>) storedao.getStoresList(state_Id);
	return storesList;
	
}
}
