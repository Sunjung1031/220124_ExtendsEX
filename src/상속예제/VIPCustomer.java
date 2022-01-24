package 상속예제;

public class VIPCustomer extends Customer {
	
	//멤버변수 
	double saleRatio; //할인율
	private int agentID; //담당 상담원 아이디
	
	//생성자
	public VIPCustomer(int customerID, String customerName,int agentID) {
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05; //보너스 적립 5%
		saleRatio = 0.1;  //할인율 10%
		this.agentID = agentID;
		
	}

	//필요한 구현 메소드 
	public int calcPrice(int price){
		bonusPoint += price * bonusRatio;
		return price -(int)(price*saleRatio);//할인율 적용
		}
	
	//agentID 멤버변수의 getter,setter 메소드 ;
	public int getAgentID() {
		return agentID;
	}

	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}

}
