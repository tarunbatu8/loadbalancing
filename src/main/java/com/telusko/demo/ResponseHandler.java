package com.telusko.demo;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponseHandler {
	   /**
	    * Do response.
	    *
	    * @param responseObject the response object
	    * @param httpStatus the http status
	    * @param message the message
	    * @return the response entity
	    */
	   public static ResponseEntity< ? > doSuccessResponse( Object responseObject, HttpStatus httpStatus, String message )
	   {
	    
	      Map< String, Object > map = new HashMap<>();
	      map.put( "timestamp", new Date().getTime() );
	      map.put( "httpStatus", httpStatus.value() );
	      map.put( "data", responseObject );
	      map.put( "isSuccess", true );
	      return new ResponseEntity<>( map, httpStatus );
	   }
	   
	   public static ResponseEntity< ? > doSuccessResponse( Object responseObject, HttpStatus httpStatus, String message,boolean validateToken )
	   {

	      Map< String, Object > map = new HashMap<>();
	      map.put( "timestamp", new Date().getTime() );
	      map.put( "httpStatus", httpStatus.value() );
	      map.put( "data", responseObject );
	      map.put( "isSuccess", validateToken );
	      return new ResponseEntity<>( map, httpStatus );
	   }
	   
	   public static ResponseEntity< ? > doSuccessResponse( String responseObject, HttpStatus httpStatus, String message,boolean validateToken )
	   {

	      Map< String, Object > map = new HashMap<>();
	      map.put( "timestamp", new Date().getTime() );
	      map.put( "httpStatus", httpStatus.value() );
	      map.put( "data", responseObject );
	      map.put( "isSuccess", validateToken );
	      return new ResponseEntity<>( map, httpStatus );
	   }

	   /**
	    * Do error response.
	    *
	    * @param httpStatus the http status
	    * @param message the message
	    * @param location the location
	    * @param errorMessage the error message
	    * @return the response entity
	    */
	   public static ResponseEntity< ? > doErrorResponse( HttpStatus httpStatus, String message, String location, String errorMessage )
	   {

	      Map< String, Object > map = new HashMap<>();
	      map.put( "timestamp", new Date().getTime() );
	      map.put( "httpStatus", httpStatus.value() );
	      map.put( "isSuccess", false );
	      Error error = new Error( httpStatus, message, location, errorMessage );
	      map.put( "error", error );
	      return new ResponseEntity<>( map, httpStatus );
	   }
}
