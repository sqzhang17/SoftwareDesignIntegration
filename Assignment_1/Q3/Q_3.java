public class Q_3{
	public static void main(String[] args){
		//federal taxable income
		int fti = 80000;

		//federal tax
		float ft = (float)fti*28/100;
		
		//state tax base
		float stb = ft-10000;

		//state tax owed
		float sto = stb*15/100;

		System.out.println("State tax owed = "+ sto);
	}
}