package com.BatonSystem.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PartyInfo {

	private String partyName;
	public static final String PARTYE_SELLER="SELL";
	@Override
	public String toString() {
		return  partyName +", " + partyType ;
				
	}

	public static final String PARTYE_BUYER="BUY";
	private String partyType;
	
	public String getPartyName() {
		return partyName;
	}

	public void setPartyName(String partyName) {
		this.partyName = partyName;
	}

	
	public PartyInfo(String partyName,String partyType) {
	
		this.partyName = partyName;
		this.partyType=partyType;
		
	}

	public static String getPARTYE_SELLER() {
		return PARTYE_SELLER;
	}

//	public static void setPARTYE_SELLER(String pARTYE_SELLER) {
//		PARTYE_SELLER = pARTYE_SELLER;
//	}

	public static String getPARTYE_BUYER() {
		return PARTYE_BUYER;
	}

//	public static void setPARTYE_BUYER(String pARTYE_BUYER) {
//		PARTYE_BUYER = pARTYE_BUYER;
//	}

	public String getPartyType() {
		return partyType;
	}

	public void setPartyType(String partyType) {
		this.partyType = partyType;
	}

	public PartyInfo() {
		
	}

}
