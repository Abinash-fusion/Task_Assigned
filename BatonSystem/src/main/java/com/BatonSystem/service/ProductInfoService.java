package com.BatonSystem.service;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response.Status;

import com.BatonSystem.database.DatabaseClass;
import com.BatonSystem.exception.DataNotFoundException;
import com.BatonSystem.model.PartyInfo;
import com.BatonSystem.model.ProductInfo;

public class ProductInfoService {
	
	PartyInfo partyInfo;
	
	private Map<Long,ProductInfo> infoProduct=DatabaseClass.getProductInfo();
	
public ProductInfoService() {
		ProductInfo info=new ProductInfo("IBM",110L,new PartyInfo("Party A","SELL"));
		ProductInfo info1=new ProductInfo("INFY",500L,new PartyInfo("Party A","SELL"));
		ProductInfo info2=new ProductInfo("GOOG",600L,new PartyInfo("Party A","SELL"));
		ProductInfo info3=new ProductInfo("INFY",500L,new PartyInfo("Party B","BUY"));
		ProductInfo info4=new ProductInfo("IBM",110L,new PartyInfo("Party C","BUY"));
		infoProduct.put(1L, info);
		infoProduct.put(2L, info1);
		infoProduct.put(3L, info2);
		infoProduct.put(4L, info3);
		infoProduct.put(5L, info4);
		
	}

// Print on Console to see the data
/*	@Override
	public String toString() {
		getInfoProduct().stream().forEachOrdered((tmp) -> { 
            System.out.println(tmp+"\n");
	});		
	return "";
	}*/
	
public List<ProductInfo> getInfoProduct(){

return new ArrayList<ProductInfo>(infoProduct.values());
}

	public List<ProductInfo> getProductByName(String productName) {
		List<ProductInfo> listByName = new ArrayList<>();
		if(getInfoProduct().size()==0) {
			 throw new DataNotFoundException("No Data found ...Please try after some Time");
			 
//			 throw new WebApplicationException(Status.NOT_FOUND);  //JAX-RS Implemented Exceptin No need to handle
		 }
		for(int i=0;i<getInfoProduct().size();i++){
			 if(getInfoProduct().get(i).getProductName().equals(productName)){
//				 System.out.println("Trade "+getInfoProduct().get(i)+"\n");
				 
				 listByName.add(getInfoProduct().get(i)) ;
			 }
		 }
		return listByName;
		
	}
	public List<ProductInfo> getProductByPrice(String productPrice) {
		List<ProductInfo> listByName = new ArrayList<>();
		for(int i=0;i<getInfoProduct().size();i++){
			 if(getInfoProduct().get(i).getProductPrice().equals(productPrice)){
				 System.out.println("Trade "+getInfoProduct().get(i)+"\n");
				 listByName.add(getInfoProduct().get(i)) ;
			 }
		 }
		return listByName;
		
	}
	
	public List<ProductInfo> getPartyName(String partyName){
		List<ProductInfo> listByPartyName=new ArrayList<>();
		for(int i=0;i<getInfoProduct().size();i++){
			if(getInfoProduct().get(i).getPartyInfo().getPartyName().equals(partyName)) {
				System.out.println("Trade "+getInfoProduct().get(i)+"\n");
				listByPartyName.add(getInfoProduct().get(i)) ;
			}
	
	
		}
		return listByPartyName;
	}
	
}
