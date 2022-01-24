package 상속예제;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customerHong = new Customer(10010, "홍길동");
		customerHong.bonusPoint = 1000;
		System.out.println(customerHong.showCustomerInfo());
		
		
		int priceHong = customerHong.calcPrice(20000);
		System.out.println("상품 결제 금액: " + priceHong);
		
		System.out.println();
		
		VIPCustomer customerSon = new VIPCustomer(10020,"손흥민", 12345);
		customerSon.bonusPoint = 50000;
		System.out.println(customerSon.showCustomerInfo());
		
		int priceSon = customerSon.calcPrice(20000);
		System.out.println("상품 결제 금액: " + priceSon);
		
		int agentID = customerSon.getAgentID();
		System.out.println("VIP고객 담당 상담원 ID : " + agentID);
		

	}

}
