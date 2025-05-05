package testexception;

import java.sql.SQLException;
import java.util.Scanner;
import testexception.util.DbUtil;

public class TestException {

    public static void main(String[] args) {
        
        
        int[][] numbers= {{1,99,91,11,44},{0,10,9,9,11}};

//        DbUtil dbUtil=new DbUtil();     
//        dbUtil.getCon();

        Scanner s = new Scanner(System.in);

        try {
            System.out.println("Enter 1st Number ");
            int n1 = s.nextInt();

            System.out.println("Enter 2nd Number ");
            int n2 = s.nextInt();

            int result = n1 / n2;
            System.out.println(result);
        } catch (Exception shimanto) {

            System.out.println(shimanto);
        }

    }

}
