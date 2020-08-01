package com.BatonSystem.resource;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.BatonSystem.model.PartyInfo;
import com.BatonSystem.model.ProductInfo;
import com.BatonSystem.service.ProductInfoService;

@Path("/trade")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class TradeResource {
ProductInfoService productService=new ProductInfoService();

@GET
@Path("trade")
public List<ProductInfo> getProductInfo(){
	
	return productService.getInfoProduct();
}

	@GET
	@Path("/{productName}")
	public List<ProductInfo> getProductByName(@PathParam("productName") String productName) {
		System.out.println(productName);
		return productService.getProductByName(productName);
	}
	
	

/*	@GET
	@Path("/{productPrice}")
	public List<ProductInfo> getProductByPrice(@PathParam("productPrice") String productPrice) {
		System.out.println(productPrice);
		return productService.getProductByPrice(productPrice);
	}
	
  @GET
	@Path("/{partyName}")
	public List<ProductInfo> getPartyName(@PathParam("partyName") String partyName) {
		System.out.println(partyName);
	return productService.getPartyName(partyName);
	}*/
//	@POST
	
	
//	@PUT
//	@Path
	
	
//	@DELETE
//	@Path
	
}
