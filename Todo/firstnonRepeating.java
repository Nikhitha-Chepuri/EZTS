package Todo;

public class firstnonRepeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="geeksforgeeks";
		
		for(int i=0;i<str.length();i++)
				{
			boolean flag=false;
			for(int j=i+1;j<str.length();j++)
			{
				if(i!=j && str.charAt(i)==str.charAt(j))
				{
					flag=true;
					break;
				}
			}
			if(flag==false)
			{
				System.out.print(i);
				break;
			}
				}

	}

}
