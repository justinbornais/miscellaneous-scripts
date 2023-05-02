package algorithms;

public class Class {
	int numImports = 0;
	String[] imports = null;
	Method[] methods = null;
	String[] mainCode = null;
	int numVars = 0;
	String[] vars = null;
	
	public Class(int ni, String[] i, Method[] m, String[] mc, int nv, String[] v) {
		numImports = ni;
		imports = i;
		methods = m;
		mainCode = mc;
		numVars = nv;
		vars = v;
	}
}