public class Account {
	private static int cnt;
	private static float int_rate;
	private static float min_bal;

	static {
		cnt = 1;
		int_rate = 0.04f;
		min_bal = 20000;
	}

	private String accid;
	private String accName;
	private double accBalance;
	private String accType;

	// Default constructor
	public Account() {
		this.accid = generateCode(null);
		this.accName = null;
		this.accType = null;
		this.accBalance = 0;
		cnt++;
	}

	// Parameterized constructor
	public Account(String accName, double accBalance, String accType) {
		this.accid = generateCode(accName);
		this.accName = accName;
		this.accBalance = accBalance;
		this.accType = accType;
		cnt++;
	}

	// Code generation logic
	public static String generateCode(String name) {
		String code;
		if (name != null && name.length() >= 3) {
			code = name.substring(0, 3) + cnt; // Use first three letters of the name
		} else {
			code = "xxx" + cnt; // Default code
		}
		return code;
	}

	@Override
	public String toString() {
		return "Account [accid=" + accid + ", accName=" + accName + ", accBalance=" + accBalance + ", accType=" + accType + "]";
	}
}
