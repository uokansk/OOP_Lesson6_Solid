package solid;

import solid.lsp.Order;
import solid.lsp.OrderAble;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OrderCalculator implements Iterable<OrderAble> {
    private List<OrderAble> orders = new ArrayList<>();

    public void add(OrderAble order) {
        orders.add(order);
    }

    public int calcAmount() {
        int sum = 0;
        for (OrderAble order : orders) {
            sum += order.getAmount();
        }
        return sum;
    }

    @Override
    public Iterator<OrderAble> iterator() {
        return orders.iterator();
    }
}
