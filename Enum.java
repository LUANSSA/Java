//Order lifecycle : PendingPayment - Processing - Shipped - Delivered 

/*
package entities.enums;
public enum OrderStatus{
PENDING_PAYMENT,
PROCESSING,
SHIIPPED,
DELIVERED;
}
*/
package entities;

import java.util.Date;
import entities.enums.OrderStatus;
public class Order{
  private Integer id;
  private Date moment;
  private OrderStatus status;
  
  public Order(){
  
  }
  public Order(Integer id, Date moment, OrderStatus status){
    this.setId(id);
    this.setDate(moment);
    this.setOrderStatus(status);
  }
  
  public Integer getId(){
    return this.id;
  }
  public void setId(Integer id){
    this.id = id;
  }
  public Date getDate(){
    return this.date;
  }
  public void setDate(Date moment){
    this.moment = moment;
  }
  public OrderStatus getOrderStatus(){
    return this.OrderStatus;
  }
  public void setOrderStatus(OrderStatus status){
    this.OrderStatus = status;
  }
  
  public String toString(){
    return "Order [id="+this.getId()+", moment="+this.getDate()+", status="+this.getOrderStatus()+"]";
  }
}

/*
public static void main(String[] args){
  Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
  System.out.println(order);
  
  OrderStatus os1 = OrderStatus.PAINDING_PAYMENT;
  OrderStatus 0s2 = OrderStatus.valueOf("PAINDING_PAYMENT");
}

*/
