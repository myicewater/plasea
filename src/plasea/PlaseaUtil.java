package plasea;
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
	
	
	
	public static void main(String[] args) {

		System.out.println(isNullOrNullString("a"));
	}

}
