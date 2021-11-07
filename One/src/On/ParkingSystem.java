package On;

import java.util.ArrayList;

public class ParkingSystem implements InParking{
	int big,modium,small;
	String[] str;
	public ParkingSystem(int big, int modium, int small) 
	{
		// TODO Auto-generated constructor stub
		this.big=big;
		this.modium=modium;
		this.small=small;
	}
	public int getBig()
	{
		return big;
		
	}
	public int getModium()
	{
		return modium;
	}
	public int getSmall()
	{
		return small;
	}
	public void print() 
	{
		
	}
	public boolean addCar(int carType) 
	{
		if(carType==1&&big!=0)
		{
			big--;
			return true;
		}
		if(carType==2&&modium!=0)
		{
			modium--;
			return true;
		}
		if(carType==3&&small!=0)
		{
			small--;
			return true;
		}
		else
			return false;
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		IParams params = InParking.parse();
		ParkingSystem ps=new ParkingSystem(1,2,3);
		ArrayList<Integer> plan=params.getPlanParking();
		for(int i=0;i<plan.size();i++)
		{
			ps.addCar(plan.get(i));
		}
		ps.print();
	}

}
