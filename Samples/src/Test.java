import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
public static void main(String[] args) {
	if("/app/mfino/config/bok/billers.category".contains("billers.category")){
		System.out.println("#####contain");
	}
	String xmlResponse="";
	xmlResponse = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
			+ "<ns2:FundsTransferResponse xmlns:ns2="
			+ "\""
			+ "http://www.developer.bk.rw/serviceprovider/frontend/client"
			+ "\""
			+ ""
			+ " xmlns:ns5="
			+ "\""
			+ "http://www.w3.org/2001/XMLSchema"
			+ "\""
			+ ""
			+ " xmlns:ns3="
			+ "\""
			+ "urn:iso:std:iso:20022:tech:xsd:pain.002.001.03DB"
			+ "\""
			+ ""
			+ " xmlns:ns1="
			+ "\""
			+ "http://www.fiorano.com/fesb/activity/ISOMessage"
			+ "\""
			+ ""
			+ " xmlns:xsi="
			+ "\""
			+ "http://www.w3.org/2001/XMLSchema-instance"
			+"\""+">"
			+ "<response><transactionNumber>4582858</transactionNumber><referenceNumber>20180605_00040692000034</referenceNumber><responseCode>00</responseCode><responseMessage>Approved or completed Successfully </responseMessage><responseTime>2018-06-05T15:14:36</responseTime><acknowledgeNumber/><amountPaid>35<amountPaid/></response></ns2:FundsTransferResponse>";
	
	System.out.println(xmlResponse);
	
	//System.out.println(calculateDigestPin("008912","008912"));
	//System.out.println(calculateDigestPin1("1f3ae76d3b90b8feeb9c60578254fb40b8ed9912"));
	String ts="Kigali,";
	
	String exceptionService="TransactionInquiryAppServServlet.act,selact.act,getOperatorsList.do";
	  String[] exceptionServiceList = exceptionService.split(",");

     for (String string : exceptionServiceList) {
		System.out.println(string);
		if("http://103.94.52.53:8000/web/search/getOperatorsList.do".contains(string)){
			System.out.println("#####");
		}
		String mdn="994880941";
		String mobileNumberRegx="^[1-9][0-9]{8}$";
		 Pattern p = Pattern.compile(mobileNumberRegx);
 		Matcher m = p.matcher(mdn);
 		if (!m.matches())
 		{
 			System.out.println("not matcged..");
 		}
	}
}


}
