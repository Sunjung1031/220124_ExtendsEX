package ��ӿ���;

public class VIPCustomer extends Customer {
	
	//������� 
	double saleRatio; //������
	private int agentID; //��� ���� ���̵�
	
	//������
	public VIPCustomer(int customerID, String customerName,int agentID) {
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05; //���ʽ� ���� 5%
		saleRatio = 0.1;  //������ 10%
		this.agentID = agentID;
		
	}

	//�ʿ��� ���� �޼ҵ� 
	public int calcPrice(int price){
		bonusPoint += price * bonusRatio;
		return price -(int)(price*saleRatio);//������ ����
		}
	
	//agentID ��������� getter,setter �޼ҵ� ;
	public int getAgentID() {
		return agentID;
	}

	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}

}
