package plasea;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * һЩ���÷���������
 * @author ���غ�
 *
 */
public class PlaseaUtil {

	/**
	 * �ж�string�Ƿ�Ϊ�ջ���ַ���
	 * @param string
	 * @return �Ƿ���true������false
	 */
	public static boolean isNullOrNullString(String string){
		if(string == null || string.length() == 0){
			return true;
		}
		return false;
	}
	
	/**
	 * �ж����������Ƿ���ͬһ��
	 * @param d1
	 * @param d2
	 */
	public static boolean isSameDay(Calendar d1,Calendar d2){
		if(d1.get(Calendar.YEAR) == d2.get(Calendar.YEAR)
				&& d1.get(Calendar.MONTH) == d2.get(Calendar.MONTH)
				&& d1.get(Calendar.DATE ) == d2.get(Calendar.DATE )){
			return true;
		}else{
			return false;
		}
	}
	
	/**
	 * �ж����������Ƿ���ͬһ��
	 * @param d1
	 * @param d2
	 */
	public static boolean isSameYear(Calendar d1,Calendar d2){
		if(d1.get(Calendar.YEAR) == d2.get(Calendar.YEAR)){
			return true;
		}else{
			return false;
		}
	}
	
	
	
	public static void main(String[] args) {

		Date d1 = new Date();
		
		try {
			Date d2 = new SimpleDateFormat("yyyy-MM-dd").parse("2016-04-09");
			Calendar c1 = Calendar.getInstance();
			Calendar c2 = Calendar.getInstance();
			c1.setTime(d1);
			c2.setTime(d2);
			System.out.println(isSameDay(c1,c2));
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	

}
