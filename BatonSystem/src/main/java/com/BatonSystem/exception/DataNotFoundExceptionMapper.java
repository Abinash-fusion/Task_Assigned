package com.BatonSystem.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.BatonSystem.model.ErrorMessage;

@Provider
public class DataNotFoundExceptionMapper implements ExceptionMapper<DataNotFoundException>{

	@Override
	public Response toResponse(DataNotFoundException exception) {
		
		ErrorMessage message=new ErrorMessage(exception.getMessage(),"https://www.batonsystems.com/",404);
		return Response.status(Status.NOT_FOUND)
				.entity(message)
				.build();
	}

}
