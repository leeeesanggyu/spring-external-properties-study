package hello.pay;

import org.springframework.stereotype.Component;

@Component
public class OrderService {

    private final PayClient payClient;

    public OrderService(PayClient payClient) {
        this.payClient = payClient;
    }

    public void process() {
        payClient.pay(5000);
    }
}
