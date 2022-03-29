package printArgs;

public class PrintArgs {
	//----- mainメソッド -----//
	public static void main(String[] args) {
		for(int i = 0; i < args.length; i++) {
			System.out.println("args[" + i + "] = " + args[i]);
		}
	}
}
