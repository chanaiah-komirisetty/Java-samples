/**
 * @author Chanaiah
 *
 * 
 */

/**
 * @author Chanaiah
 *
 */
public class BankParams {
	private String branchCode;
	private String  branchName;
	private String bankCode;
	private String bankName;
public BankParams(){
	super();
}
/**
 * @param branchCode
 * @param branchName
 * @param bankCode
 * @param bankName
 */
public BankParams(String branchCode, String branchName, String bankCode, String bankName) {
	super();
	this.branchCode = branchCode;
	this.branchName = branchName;
	this.bankCode = bankCode;
	this.bankName = bankName;
}
public String getBranchCode() {
	return branchCode;
}
public void setBranchCode(String branchCode) {
	this.branchCode = branchCode;
}
public String getBranchName() {
	return branchName;
}
public void setBranchName(String branchName) {
	this.branchName = branchName;
}
public String getBankCode() {
	return bankCode;
}
public void setBankCode(String bankCode) {
	this.bankCode = bankCode;
}
public String getBankName() {
	return bankName;
}
public void setBankName(String bankName) {
	this.bankName = bankName;
}
@Override
public String toString() {
	return "BankParams [branchCode=" + branchCode + ", branchName=" + branchName + ", bankCode=" + bankCode
			+ ", bankName=" + bankName + "]";
}

}
