package com.olympic.cis143.m04.student.tacotruck.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.olympic.cis143.m04.student.tacotruck.Orders;
import com.olympic.cis143.m04.student.tacotruck.TacoImpl;


public class OrdersSetImpl  implements Orders {
	
	Set<TacoImpl> tacoSet = new HashSet<TacoImpl>();
    @Override
    public void addOrder(TacoImpl tacoOrder) {
    this.tacoSet.add(tacoOrder);
    }

    @Override
    public boolean hasNext() {
        return !this.tacoSet.isEmpty();
    }

    @Override
    public TacoImpl closeNextOrder() {
    	  Iterator<TacoImpl> itr = tacoSet.iterator();
          TacoImpl a =itr.next();
         tacoSet.remove(a);
          return a;
    }

    @Override
    public int howManyOrders() {
        return tacoSet.size();
    }

}
