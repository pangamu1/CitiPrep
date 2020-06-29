package Practice;

//import java.util.ArrayList;

public class AlphabetSort {

	public static <E> void main(String[] args) {
		//String[] alpha = {"a","b","c","d","e","f","g","h","i","j","k",
		//		"l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		String alpha1 = "a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z";
		String inString = "Recommendations".toLowerCase();
		String str = "";
;		//ArrayList<E> str = new ArrayList<E>();
		//System.out.println(inString);
		for (int i = 0; i<alpha1.length();i++) {
			System.out.println(str);
			if(!inString.contains(alpha1)) {
				//System.out.println(str);
				if (!str.contains(inString)) {
					str += inString;
				}
			}
		}
		System.out.println(str);
		
	}

}
