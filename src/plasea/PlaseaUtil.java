package plasea;
/**
 * 一些常用方法工具类
 * @author 朱素海
 *
 */
public class PlaseaUtil {

	/**
	 * 判断string是否为空或空字符串
	 * @param string
	 * @return 是返回true，否则false
	 */
	public static boolean isNullOrNullString(String string){
		if(string == null || string.length() == 0){
			return true;
		}
		return false;
	}
	
	
	
	public static void main(String[] args) {

		System.out.println(isNullOrNullString("a"));
	}

}
