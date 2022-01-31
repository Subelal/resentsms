package com.coupon.resent.resentsms.validation;

import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class DataValidatior {
    public static boolean isValidMobileNo(String mobileNo) {
        boolean isValid;
        if ((mobileNo == null) || (mobileNo.equals(""))) {
            isValid = false;
            return isValid;
        }
        Pattern ptrn = Pattern.compile("(0/91)?[1-9][0-9]{9}");
        Matcher match = ptrn.matcher(mobileNo);
        isValid = (match.find() && match.group().equals(mobileNo));
        return isValid;
    }

    public static String getDateString(Date date){
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(date);
    }
    private static String getReqTime(){
        Date date = Calendar.getInstance().getTime();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        String strDate = dateFormat.format(date);
        //System.out.println("Converted String: " + strDate);

        return strDate;
    }

    public static void main(String[] args) {

        String str = getReqTime();
        System.out.println("String Req Time "+str);
        Date date = Calendar.getInstance().getTime();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        String strDate = dateFormat.format(date);
        System.out.println("Converted String: " + strDate);
    }
}
