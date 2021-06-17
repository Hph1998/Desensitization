package com.hphlucas.desensitization.utils;

/**
 * 脱敏工具类
 * @author Lucas
 * @version v1.0
 */
public class DesensitizedUtils {

    /**
     * 对字符串进行脱敏操作
     *
     * @param origin          原始字符串
     * @param prefixNoMaskLen 左侧需要保留几位明文字段
     * @param suffixNoMaskLen 右侧需要保留几位明文字段
     * @param maskStr         用于遮罩的字符串, 如'*'
     * @return 脱敏后结果
     */
    public static String desValue(String origin, int prefixNoMaskLen, int suffixNoMaskLen, String maskStr) {
        if (origin == null) {
            return null;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0, n = origin.length(); i < n; i++) {
            if (i < prefixNoMaskLen) {
                sb.append(origin.charAt(i));
                continue;
            }
            if (i > (n - suffixNoMaskLen - 1)) {
                sb.append(origin.charAt(i));
                continue;
            }
            sb.append(maskStr);
        }
        return sb.toString();
    }

    /**
     * 【中文姓名】只显示最后一个汉字，其他隐藏为星号，比如：**梦
     *
     * @param fullName 姓名
     * @return 结果
     */
    public static String chineseName(String fullName) {
        if (fullName == null) {
            return null;
        }
        return desValue(fullName, 1, 0, "*");
    }

    /**
     * 【身份证号】显示前4位, 后2位，其他隐藏。
     *
     * @param id 身份证号码
     * @return 结果
     */
    public static String idCardNum(String id) {
        return desValue(id, 4, 2, "*");
    }

    /**
     * 【手机号码】前三位，后四位，其他隐藏。
     *
     * @param num 手机号码
     * @return 结果
     */
    public static String mobilePhone(String num) {
        return desValue(num, 3, 4, "*");
    }

}
