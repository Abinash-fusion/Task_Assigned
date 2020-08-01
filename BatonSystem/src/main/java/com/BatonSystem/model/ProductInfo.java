package com.BatonSystem.model;

import javax.xml.bind.annotation.XmlRootElement;

//@Entity
//@Table("productInfo")
@XmlRootElement
public class ProductInfo {

	//@Id
	private String productName;
	private Long productPrice;
	@Override
	public String toString() {
		return partyInfo+", "+ productName +", "
				+ productPrice ;
	}
	private PartyInfo partyInfo;
	
	public ProductInfo(String productName, Long productPrice,PartyInfo partyInfo) {
		
		this.productName = productName;
		this.productPrice = productPrice;
		this.partyInfo=partyInfo;
	}
	public PartyInfo getPartyInfo() {
		return partyInfo;
	}
	public void setPartyInfo(PartyInfo partyInfo) {
		this.partyInfo = partyInfo;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Long getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(Long productPrice) {
		this.productPrice = productPrice;
	}
	public ProductInfo() {
		
	}

}
