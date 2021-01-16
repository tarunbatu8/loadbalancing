package com.telusko.demo;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AppController {

	@Autowired
	ProductService service;

	/**
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public synchronized ResponseEntity<?> viewHomePage(HttpServletRequest request, HttpServletResponse response) {
		String message = "Update successfully";
		String errorMessage = "";
		Map<String,Object> map = new HashMap<>();
		Number number = new Number();
		try {
			number =  service.get();
			if( number == null ) {
				number = new Number();
			}
			number.setData(number.getData() + 1);
			boolean updateSuccess = service.updateData( number );
		    map.put("number", number);
		    map.put("updateSuccess", updateSuccess);
			return ResponseHandler.doSuccessResponse(map, HttpStatus.OK, message);
		} catch( Exception e ) {
			errorMessage = "Update failed";
			return ResponseHandler.doErrorResponse(HttpStatus.BAD_REQUEST, e.getMessage(), request.getRequestURI(),
					errorMessage);
		}
	}
}
