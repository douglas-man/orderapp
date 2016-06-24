package demo.order;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding
public interface OrderProcess {
    @WebMethod
    String processOrder(Order order);
}

