package classobjectandmethod;

public class typesofmethod {
public int add(int a,int b, int c) {
	int d = a + b + c;
    return d;
}
    public static void main(String[] args) {
	
    	typesofmethod t= new typesofmethod();
    	int result = t.add(33,44,55);
    System.out.println("additon of a and b ,c="+ result);
    }
}
