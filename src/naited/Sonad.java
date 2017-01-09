package naited;

public class Sonad {

	public static void main(String[] args) {
		String sona = "sona";
		sona.replace("o", "p");
		
		StringBuffer sb=new StringBuffer("Hello ");  
		sb.append("Java");//now original string is changed  
		sb.insert(1,"Java");//now original string is changed  
		sb.replace(1,3,"Java");
		sb.delete(1,3);  
		sb.reverse();  
		

	}

}
