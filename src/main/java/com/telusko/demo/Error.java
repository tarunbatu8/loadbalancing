package com.telusko.demo;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;

/**
 * The Class Error.
 */
public class Error implements Serializable
{

   /** The Constant serialVersionUID. */
   private static final long serialVersionUID = 4623261587707894101L;

   /** The status. */
   private HttpStatus status;

   /** The message. */
   private String message;

   /** The location. */
   private String location;

   /** The errors. */
   private List< String > errors;

   /**
    * Instantiates a new error.
    *
    * @param status the status
    * @param message the message
    * @param location the location
    * @param error the error
    */
   public Error( HttpStatus status, String message, String location, String error )
   {
      this.status = status;
      this.message = message;
      this.location = location;
      this.errors = Arrays.asList( error );
   }

   /**
    * Instantiates a new error.
    *
    * @param status the status
    * @param message the message
    * @param location the location
    * @param errors the errors
    */
   public Error( HttpStatus status, String message, String location, List< String > errors )
   {
      this.status = status;
      this.message = message;
      this.location = location;
      this.errors = errors;
   }

   /**
    * Gets the status.
    *
    * @return the status
    */
   public HttpStatus getStatus()
   {
      return status;
   }

   /**
    * Sets the status.
    *
    * @param status the new status
    */
   public void setStatus( HttpStatus status )
   {
      this.status = status;
   }

   /**
    * Gets the message.
    *
    * @return the message
    */
   public String getMessage()
   {
      return message;
   }

   /**
    * Sets the message.
    *
    * @param message the new message
    */
   public void setMessage( String message )
   {
      this.message = message;
   }

   /**
    * Gets the location.
    *
    * @return the location
    */
   public String getLocation()
   {
      return location;
   }

   /**
    * Sets the location.
    *
    * @param location the new location
    */
   public void setLocation( String location )
   {
      this.location = location;
   }

   /**
    * Gets the errors.
    *
    * @return the errors
    */
   public List< String > getErrors()
   {
      return errors;
   }

   /**
    * Sets the errors.
    *
    * @param errors the new errors
    */
   public void setErrors( List< String > errors )
   {
      this.errors = errors;
   }

}
