
package dboperation;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author yogendra singh
 */
public class DBOperation
{
    public static int insertStudentRecord(float raw_ammount, int  reciept_no,float  paid_ammount,float cgst,float sgst,Date datee,String... str)
    {
        int a=0;
        try
        {
            Connection con = dbconnection.DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("insert into student_details values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            ps.setInt(1, reciept_no);  
            ps.setFloat(12, sgst);
            ps.setFloat(11, paid_ammount);
            ps.setDate(16, datee);
            ps.setFloat(13, cgst);
            ps.setString(2, str[0]);
            ps.setString(3, str[1]);
            ps.setString(4, str[2]);
            ps.setString(5, str[3]);
            ps.setString(6, str[4]);
            ps.setString(7, str[5]);
            ps.setString(8, str[6]);
            ps.setString(9, str[7]);
            ps.setString(10, str[8]);
            ps.setString(14, str[9]);
            ps.setString(15, str[10]);
            ps.setString(17, str[11]);
            ps.setString(18, str[12]);
            ps.setFloat(19, raw_ammount);
            a = ps.executeUpdate();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return a;
    }
    // toi Print the reciept----------------------------
 public static ResultSet printReciept()
 {
     ResultSet rs = null;
    try
    {
        Connection con = dbconnection.DBConnection.getConnection();
        PreparedStatement ps  = con.prepareStatement("select * from student_details order by reciept_no desc limit 1");
        rs = ps.executeQuery();
    }   
    catch(Exception e)
    {
        e.printStackTrace();
    }  
    return rs;
 }
    public static boolean getUpdate(int receipt,float raw_amt,float cgst,float sgst,float total,Date datee,String...str)
    {
        boolean status = false;
        try
        {
            Connection con = dbconnection.DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("update student_details set raw_ammount=?,cgst=?,sgst=?,paid_ammount=?,"
                    + "datee=?,student_name=?,roll_no=?,mode=?,upi_id=?,bank=?,cv=?,card=?,course_name=?,gst_num=?,ammount_in_words=?,"
                    + "remark=?, year1=?, year2=? where reciept_no=?");
            ps.setFloat(1, raw_amt);
            ps.setFloat(2, cgst);
            ps.setFloat(3, sgst);
            ps.setFloat(4, total);
            ps.setDate(5, datee);
            ps.setString(6, str[0]);
            ps.setString(7, str[1]);
            ps.setString(8, str[2]);
            ps.setString(9, str[3]);
            ps.setString(10, str[4]);
            ps.setString(11, str[5]);
            ps.setString(12, str[6]);
            ps.setString(13, str[7]);
            ps.setString(14, str[8]);
            ps.setString(15, str[9]);
            ps.setString(16, str[10]);
            ps.setString(17, str[11]);
            ps.setString(18, str[12]);
            ps.setInt(19,receipt);
            int a = ps.executeUpdate();
            if(a>0)
            {
                status=true;
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return status;
    }
}
