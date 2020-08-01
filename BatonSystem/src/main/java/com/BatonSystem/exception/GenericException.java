package com.BatonSystem.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;

import com.BatonSystem.model.ErrorMessage;

public class GenericException implements ExceptionMapper<Throwable>{

	@Override
	public Response toResponse(Throwable exception) {
		ErrorMessage message=new ErrorMessage(exception.getMessage(),"https://www.batonsystems.com/",500);
		return Response.status(Status.INTERNAL_SERVER_ERROR)
				.entity(message)
				.build();
	}

}
