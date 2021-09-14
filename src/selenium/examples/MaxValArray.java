package selenium.examples;

public class MaxValArray {
    public int maxNum() {
    	
    	int marks[] = {90,89,88,95,97,100};
		int max = marks[0];
		for (int i = 0; i < marks.length; i++) {
			if (marks[i] > max)
			{
				max= marks[i];
			}
		}
		return max;    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    MaxValArray num = new MaxValArray();
	    int Num= num.maxNum();
		System.out.println("Maximum of all marks : "+Num);		
	}

}
