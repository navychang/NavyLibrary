package navychang.www.netlibrary.utils;

import android.util.Log;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/**
 * 验证工具类
 * @date 2014年11月25日 上午9:21:27
 */
public class ValidateUtil {

	/**
	 * 生成map
	 * @param str	参数 
	 * @return
	 * @author hygao
	 * @date 2014年11月27日 下午3:59:25
	 */
	public static Map<String, String> createMap(String... str)
			throws Exception {

		Map<String, String> map = new HashMap<String, String>(str.length / 2);
		for (int i = 0, length = str.length; i < length;) {
			map.put(str[i], str[i + 1]);
			i += 2;
		}
		return map;
	}
	
	/**
	 * MD5-生成验证码
	 * @param params
	 *            HashMap<String, String>
	 * @param salt
	 *            key
	 * @return
	 * @throws IOException
	 * @author hygao
	 * @date 2014年11月25日 上午9:21:27
	 */
	public static String getSignature(Map<String, Object> params, String salt)
			throws IOException {

		// 先将参数以其参数名的字典序升序进行排序
		Map<String, Object> sortedParams = new TreeMap<String, Object>(params);
		Set<Entry<String, Object>> entrys = sortedParams.entrySet();
		// 遍历排序后的字典，将所有参数按"value"格式拼接在一起
		StringBuilder basestring = new StringBuilder();
		for (Entry<String, Object> param : entrys) {
			if(param.getValue()!=null)basestring.append(param.getValue());
		}
		basestring.append(salt);
		Log.e("agt","token + "+basestring.toString());
		// 使用MD5对待签名串求签
		byte[] bytes = null;
		try {
			MessageDigest md5 = MessageDigest.getInstance("MD5");
			bytes = md5.digest(basestring.toString().getBytes("UTF-8"));
		} catch (GeneralSecurityException ex) {
			throw new IOException(ex);
		}
		// 将MD5输出的二进制结果转换为小写的十六进制
		StringBuilder sign = new StringBuilder();
		for (int i = 0; i < bytes.length; i++) {
			String hex = Integer.toHexString(bytes[i] & 0xFF);
			if (hex.length() == 1) {
				sign.append("0");
			}
			sign.append(hex);
		}
		return sign.toString();
	}


	/**
	 * 验证hash
	 * @param map	参数map
	 * @param hash	哈希码
	 * @return
	 * @throws Exception
	 * @date 2015年1月29日 上午10:16:03
	 */
	public static boolean checkHash(Map<String, Object> map, String hash) throws Exception {
      String key="123456";
		boolean flag = false;
		if (hash != null && !hash.isEmpty()) {
			if (hash.equals(getSignature(map, key))) {
				flag = true;
			}
		}
		return flag;
	}
	
	/**
	 * MD5-加密
	 * @param str		明文
	 * @param salt		扰码
	 * @return
	 * @throws IOException
	 * @author hygao
	 * @date 2015年3月28日 下午2:34:43
	 */
//	public static String getSignature(String str, String salt)
//			throws IOException {
//
//		// 使用MD5对待签名串求签
//		byte[] bytes = null;
//		try {
//			MessageDigest md5 = MessageDigest.getInstance("MD5");
//			bytes = md5.digest(str.concat(salt).getBytes("UTF-8"));
//		} catch (GeneralSecurityException ex) {
//			throw new IOException(ex);
//		}
//
//		// 将MD5输出的二进制结果转换为小写的十六进制
//		StringBuilder sign = new StringBuilder();
//		for (int i = 0; i < bytes.length; i++) {
//			String hex = Integer.toHexString(bytes[i] & 0xFF);
//			if (hex.length() == 1) {
//				sign.append("0");
//			}
//			sign.append(hex);
//		}
//		return sign.toString();
//	}
	
	/**
	 * 验证【手机号码】格式
	 * @author hygao
	 * @param phone 手机号码
	 * @return
	 * @time： 2015年3月19日 下午3:32:37
	 */
	public static boolean checkPhone(String phone){
		return phone.matches("^[1][3|4|5|7|8]+\\d{9}");
	}
	
}
