package lk.ac.iit.university.controller;

import lk.ac.iit.university.bean.Payment;
import lk.ac.iit.university.service.UniversityService;

import java.util.List;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

//if thre are compilation errors, your grade will be downgraded to zero.

//include the path "payments"

@Path("payments")


public class UniversityController {

    UniversityService paymentService=new UniversityService();
    
    //define GET method and specify APPLICATION_JSON as the MediaType 
    @GET
    @Produces(MediaType.APPLICATION_JSON)

    //Complete "getPayments" method as a List with type Payment
    //Then, inside the method, create a list with a type Payment 
    //and invoke the method in paymentService to get payments list
    
    public List<Payment> getPayments()
    {        
        List<Payment> listOfPayments= paymentService.getAllPayments();
        return listOfPayments;
    }

    //define GET method - This time to get the payments based on id
    //specify id as a path
    //specify the media type as JSON 
    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    
    //complete the method "getPaymentById" using the Payment as a return type
    //define the id as its parameter
    //return the payment object by calling the appropriate method in paymentService
    public Payment getPaymentById(@PathParam("id")  int id)
    {
        return getPaymentById(id);
    }
   
    //Define a POST method 
    //Specify the media type as JSON
    //complete the method using the "Payment" as a return type that accepts the payment as parameter 
    //Please note the payment parameter must be an instance of the Payment class
    //add return statement to invoke addPayment method 
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Payment addPayment(Payment payment)
    {
        return paymentService.addPayment(payment);
    }
    
    //Define a PUT method
    //specify the media type as JSON 
    //complete "updatePayment" method using the "Payment" as a return type
    //so that the method accepts a parameter called payment
    //Please note the payment parameter must be an instance of the Payment class
    //invoke updatePayment method
    @PUT
    @Consumes({MediaType.APPLICATION_JSON})
    public Payment updatePayment(Payment payment)
    {
        return paymentService.updatePayment(payment);
        
    }
    
    //Define a DELETE method 
    //define the id as a parameter for the path 
    //Specify the media type as JSON 
    //create a void method called deletePayment; the method accepts id as a parameter
    //invoke deletePayment method with parameter id 
    @DELETE
    @Path("{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void deletePayment(@PathParam("id") int id)
    {
         paymentService.deletePayment(id);
        
    }
    
}
