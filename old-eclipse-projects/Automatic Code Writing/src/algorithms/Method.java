package algorithms;

public class Method {
	String name = null;
	String access = null;
	boolean isStatic = false;
	int numParams = 0;
	int[] params = null;
	String[] code = null;
	
	public Method(String n, String a, boolean is, int np, int[] p, String[] c) {
		name = n;
		access = a;
		isStatic = is;
		numParams = np;
		params = p;
		code = c;
	}
}