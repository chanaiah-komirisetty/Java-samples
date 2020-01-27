import java.io.IOException;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.List;
import java.lang.reflect.Field;

import org.json.simple.JSONObject;


/**
 * 
 */

/**
 * @author Chanaiah
 *
 */
public class Sample {
	public static void main(String[] args) throws IOException {
		
		System.out.println(""+String.format("Question [id={0}, description={1}, correctAnswer={2}, options={3}]",1, "test", "A", "ABC"));
		
		CompletableFuture.runAsync(() -> {
			System.out.println("###########3");
		});
		
		
		String stt="25.000 RWF";
		String stt2[]=stt.split(" ");
		System.out.println(stt!=null?stt2[0]+""+stt2[1]:null);
	        List<Integer> numbers = new ArrayList<>(0);
	        numbers.add(1);
	        try {
				System.out.println(getCapacity(numbers));
			} catch (Exception e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
	    

	   
		int number1 = 1234;
		String res="652989:0783245003/000400695194591";
		//String resouceArray[]=res.split(":");
		//String finalRes=resouceArray[0]+":25"+resouceArray[1];
	//	System.out.println(finalRes);
		String tem=String.valueOf(number1);
		System.out.println(tem);
		String web="http://68.183.88.243:8090/web/Subscriber.do";
		String webArr[]=web.split("web");
		System.out.println(webArr[0]);
		System.out.println(webArr[1]);
		System.out.println(webArr[0]+"bok"+webArr[1]);
		System.out.println("2509948809250".replace("250", ""));
		String mdn="250784547455";
		if(mdn.startsWith("250"))
		System.out.println(mdn.substring(2, mdn.length()));
System.out.println(String.valueOf(new Date().getTime()).substring(1));
		System.out.println(new Boolean("chandu"));
		System.out.println("1 1991 8 0020122 0 02".replaceAll("\\s+",""));
		BigDecimal no = new BigDecimal(1000000000);
		
		//String str = String.format("%,d", no);
		BigDecimal bd = new BigDecimal(1000);
		DecimalFormat f = new DecimalFormat("###,###");
	     BigDecimal d = new BigDecimal(4567);
	     System.out.println(f.format(d));
		NumberFormat formatter1 = NumberFormat.getInstance(new Locale("en_US"));
String val=formatter1.format(bd.longValue());
System.out.println(val);
		//System.out.println(new BigDecimal(val));
		
		//System.out.println(str);
		BigDecimal bg1, bg2;

	      bg1 = new BigDecimal("100");
	      bg2 = new BigDecimal("20");
	      if(bg1.compareTo(bg2)>0){
	    	  System.out.println("#############3");
	      }
		String s1=MessageFormat.format("Hello {0} answered your question", "placeofm");
		System.out.println(s1);
		try {
			Date test=new SimpleDateFormat("yyyyMMdd").parse("20200111");
			System.out.println("%%%%%%%%%%%%%%"+test);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String custid="655637:250784853715/002570695256047";
		
		String[] sp=custid.split(":");
		System.out.println(sp[0]);
		String[] sp1=sp[1].split("/");
		System.out.println(sp1[0]);
		System.out.println(sp1[1]);
		
		
		BigDecimal number=new BigDecimal("-10.00");
if(number.compareTo(BigDecimal.ZERO) < 0){
	System.out.println("Big");
}
		BigDecimal truncated= number.setScale(0,BigDecimal.ROUND_DOWN);
		System.out.println("###"+truncated);
		String account="3333333333|06|ETETEB";
		
		
		String[] billerIdentifier = account.split("\\|");
		System.out.println(billerIdentifier.length);
		if (billerIdentifier != null && billerIdentifier.length == 3) {
			System.out.println(billerIdentifier[0]);
			System.out.println(billerIdentifier[1]);
			System.out.println(billerIdentifier[2]);
		}
		String tx="Success"+"615eccbd-28f4-4453-9109-775ef8f8a96b";
		System.out.println(tx.contains("Success"));
		String firstname1="99488_R_R_R";
		firstname1 = firstname1.replaceAll("\\d","");
		System.out.println(firstname1);
		System.out.println(new Boolean(false));
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date date = new Date();
		System.out.println("date:::::::"+dateFormat.format(date)); //2016/11/16 12:08:43
		dateFormat.format(date);
		System.out.println(isNumeric("jhhhh"));
		System.out.println(removeMilliSecondsFromDate(new Date()));
		BigDecimal amount=new BigDecimal("10.0000");
		System.out.println(amount);
		final String uuid = UUID.randomUUID().toString();
	    System.out.println("uuid = " + uuid);
	    
		System.out.println(getRndNumber());
		System.out.println("+2509948809443".replace("+250", ""));
		System.out.println("250" + "9948809443".substring(1, "9948809443".length()));
		
		String birthdate="1986-11-29+02:00";
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");
		 
		try {
			System.out.println(formatter.parse(birthdate));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		calendar.set(Calendar.MILLISECOND, 0);
		 calendar.getTime();
	       DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
           System.out.println("Date in dd/MM/yyyy format is: "+df.format(calendar.getTime()));


		System.out.println("TRANSACTION_PIN_NOT_VALID".equalsIgnoreCase("TPIN_NOT_VALID"));
		Map<String, String> myMap = new HashMap<String, String>();
		Map<String, String> myMap1 = new HashMap<String, String>();
		String s = "{TXN_AMOUNT=10 RWF, TRN_LIMIT_002=100.00 RWF, errorMessage=Please provide minimum amount of 10 RWF to proceed with the transaction.}";
		s=s.replaceAll("\\{", " ");
		s=s.replaceAll("\\}", " ");
		//s=s.replaceAll("}", "");
		String[] pairs = s.split(",");
		System.out.println(pairs.length);
		for (int i=0;i<pairs.length;i++) {
		    String pair = pairs[i];
		    System.out.println("##pair:"+pair.contains("="));
		    if(pair.contains("=")){
		    String[] keyValue = pair.split("=");
		    myMap.put(keyValue[0].trim(), (keyValue[1]));
		    }
		}
		System.out.println(myMap);
		myMap1.putAll(myMap);
		System.out.println(myMap1.entrySet().toArray());
		String exceptionService="initiateFTRequest.do";
	   	String[] exceptionServiceList = exceptionService.split(",");
	   	    for (String apiReq : exceptionServiceList) {
	   	    	System.out.println("######apiReq::"+apiReq);
	        if("http://172.16.3.51:8090/web/initiateFTRequest.do".contains(apiReq) ){
	        	System.out.println("^^^^^^^^^");
	        }
	   	 }
		String bracBankCodes="2233,4455,6677";
		if (bracBankCodes.contains("6677")) {
			System.out.println("###################yrssss");
		}
		//System.out.println("######"+"250"+stt.substring(1,stt.length()));
		 BigDecimal roundedAmount=new BigDecimal(12.44);
		/* roundMoney = roundMoney.setScale(2,
                 RoundingMode.DOWN);*/
		 
		/* roundedAmount = roundAmtTo(roundedAmount,
                 new BigDecimal(1.00));*/
// do the set scale here only so that the RoundingMode can be
// used instead at the end.
/*roundedAmount = roundedAmount.setScale(2,
                             RoundingMode.HALF_UP);*/


		 System.out.println("##############"+roundedAmount);
	      
		 String rnd="TRUNCATE";
		 switch (rnd) {
         case "TRUNCATE":
        	 roundedAmount = roundedAmount.setScale(2,
                     RoundingMode.DOWN);
        	 System.out.println("##############"+roundedAmount);
             break;
         case "ROUND_UP":
             roundedAmount = roundAmtUp(roundedAmount,
                                        new BigDecimal(1));
             // do the set scale here only so that the RoundingMode can be
             // used instead at the end.
             roundedAmount = roundedAmount.setScale(2,
                                                    RoundingMode.UP);
             break;
         case "ROUND_DOWN":
             roundedAmount = roundAmtDown(roundedAmount,
                                          new BigDecimal(1));
             // do the set scale here only so that the RoundingMode can be
             // used instead at the end.
             roundedAmount = roundedAmount.setScale(2,
                                                    RoundingMode.DOWN);
             break;
         case "ROUND_HALF_EVEN":
        	 roundedAmount = roundAmtTo(roundedAmount,
                     new BigDecimal(1));
    // do the set scale here only so that the RoundingMode can be
    // used instead at the end.
    roundedAmount = roundedAmount.setScale(2,
                                 RoundingMode.HALF_UP);
    System.out.println("##############"+roundedAmount);
             
		 }
		 BigDecimal amt = new BigDecimal(10.44);
	        if (roundedAmount.compareTo(amt) != 0) {
	        	
	        	System.out.println("##############3");
	        }
		 
		JSONObject obj = new JSONObject();

	      obj.put("status","0");
	      obj.put("response","SUCCEEDED");
	      
	      StringWriter out = new StringWriter();
	      obj.writeJSONString(out);
	      
	      String jsonText = out.toString();
	      System.out.print("json objest:::::::"+jsonText);
	      
		
		String data = false || true ? null : "chandu";
		System.out.println(data);
		
		System.out.println("#######################"+validateMobileNumberRegex("1994880944"));
		
		 String header = "Basic ";       
		    String headerValue = "OXTBYTGHtWJHMaiMvRAeFKsq" + ":" + "joEoXeWHwolPBfGsKVlyutcWpIorXhWxrMDi";
		    String encodedHeaderValue = Base64.getEncoder().encodeToString(headerValue.getBytes());      
		    String headerBasic =  header + encodedHeaderValue;
		    System.out.println("headerBasic:::::"+headerBasic);
		    
		    Object date3 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss").format(new Date());
		    System.out.println(date3);
		
		byte[] decodedBytes = Base64.getDecoder().decode("T1hUQllUR0h0V0pITWFpTXZSQWVGS3NxOlNBVklOR1NfQUNDT1VOVF9PUEVOX1VTRVJfUEFTU1dPUkQ="); 
		System.out.println(new String(decodedBytes) + "\n");
		
		
		String message="An amount of RWF 5.00  has been debited from your pocket at 2019-02-25 16:39:40.048 .Fund Access Code for the transaction is 982812 . Please use this code to with draw funds before  2019-02-25 16:54:51.0 ,your current balance after transaction is 9945.00.";
		String arr[]=message.replaceAll(" ", "").split("FundAccessCodeforthetransactionis");
		System.out.println("###aeeeeee"+arr);
		System.out.println("###aeeeeee"+arr.length);
	if(1<arr.length)
		System.out.println("###aeeeeee"+arr[1]);
		//String arr1[]=arr[1].split("");
		System.out.println("###"+arr[1].substring(0,6));
		for (String string : arr) {
			
			System.out.println("###"+string);
		}
		if("984744422_D".startsWith("984744422")){
			System.out.println("yes");
		}
		String hello = "984744422_D";
		hello = hello.replaceAll("[^\\d]", "");
		System.out.println(hello);
		System.out.println("####"+new Date(432055550));
		String resouce="635783:250782647985/000410772871367";
		String[] resouceArray=resouce.split(":");
		String mdnid[]=resouceArray[1].split("/");
		String mobile=mdnid[0];
		if(mobile.startsWith("25")&&mobile.length()>10) {
			mobile=mobile.substring(mobile.length()-10, mobile.length());
		}
		System.out.println(mobile+"/"+mdnid[1]);
		
	}
	public static boolean validateMobileNumberRegex(String mobileNo) {
		boolean isValid=true;
		//String regex ="^[1-9][0-9]{9}$";
		String regex = "^[0-9][0-9]{9}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(mobileNo);
		if (m.matches())
		{
			isValid=true;
		}
		else{
			isValid=false;
		}
		return isValid;
	}
	 private static BigDecimal roundAmtTo(BigDecimal n1, BigDecimal n2) {

	        BigDecimal returnVal = new BigDecimal(0);
	        if (n2.compareTo(new BigDecimal(0)) == 0) {
	            // if the amount's decimal part is greater than 0.5, we'll do round
	            // up, otherwise round down
	            BigDecimal decimalPart = (n1.remainder(BigDecimal.ONE)).abs();
	            int fractionalDifference = decimalPart.compareTo(new BigDecimal("0.5"));
	            if (fractionalDifference >= 0) {
	                returnVal = roundAmtUp(n1,
	                                       n2);
	            } else {
	                returnVal = roundAmtDown(n1,
	                                         n2);
	            }
	        } else {
	            if ((n1.remainder(n2)).abs()
	                .compareTo(n2.divide(new BigDecimal(2))) == 1) {
	                returnVal = roundAmtUp(n1,
	                                       n2);
	            } else {
	                returnVal = roundAmtDown(n1,
	                                         n2);
	            }
	        }
	        return returnVal;
	    }
	 private static  BigDecimal roundAmtUp(BigDecimal n1, BigDecimal n2) {

	        BigDecimal i = null;
	        BigDecimal n3 = n2;
	        if (n3.equals(new BigDecimal(0))) {
	            n3 = new BigDecimal(1);
	        }
	        i = n1.abs()
	            .remainder(n3);
	        if (i.compareTo(new BigDecimal(0)) == 0) {
	            return n1;
	        } else {
	            return (new BigDecimal(n1.signum())).multiply(n1.abs()
	                .add(n3)
	                .subtract(i));
	        }
	    }
	 private static BigDecimal roundAmtDown(BigDecimal n1, BigDecimal n2) {

	        BigDecimal n3 = n2;
	        if (n3.compareTo(new BigDecimal(0)) == 0) {
	            n3 = new BigDecimal(1);
	        }
	        return (new BigDecimal(n1.signum())).multiply((n1.abs().subtract((n1.abs()).remainder(n3))));
	    }
	 private static int getRndNumber() {
		    Random random=new Random();
		    int randomNumber=0;
		    boolean loop=true;
		    while(loop) {
		        randomNumber=random.nextInt();
		        if(Integer.toString(randomNumber).length()==9 && !Integer.toString(randomNumber).startsWith("-")) {
		            loop=false;
		        }
		        }
		    return randomNumber;
		}
	 private static String removeMilliSecondsFromDate(Date date) {
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(date);
			calendar.set(Calendar.MILLISECOND, 0);
			 calendar.getTime();
		       DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
	        return df.format(calendar.getTime());
		
		}
	 public static boolean isNumeric(String str) {
		  return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
		}
	 static int getCapacity(List al) throws Exception {
	        Field field = ArrayList.class.getDeclaredField("elementData");
	        field.setAccessible(true);
	        return ((Object[]) field.get(al)).length;
	 }
}
