package com.BatonSystem.database;

import java.util.HashMap;
import java.util.Map;

import com.BatonSystem.model.ProductInfo;



public class DatabaseClass {
	private static Map<Long,ProductInfo> productInfo =new HashMap<>();
	public static Map<Long, ProductInfo> getProductInfo() {
		return productInfo;
	}
	public static void setProductInfo(Map<Long, ProductInfo> productInfo) {
		DatabaseClass.productInfo = productInfo;
	}
	public DatabaseClass() {
		
	}

}
