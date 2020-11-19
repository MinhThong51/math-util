/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thong.util.test;

import org.junit.Test;
import static org.junit.Assert.*;
import thong.util.MathUtility;

/**
 *
 * @author Ming
 */
public class MathUtilityTest {
    
    //@Test kí hiệu của JUnit đưa ra, biến hàm ngay sau đây thành
    //public static void main(), app có nhiều main
    //F6 chạy main() mặc định, Shift-F6 là chạy main() ở @Test
    //Đây là 1 trong những cách đặt tên cho hàm test, để test code chính
    
    @Test
    public void getFactorial_Runwell_IfValidArgurment(){
        assertEquals(720, MathUtility.getFactoria(6));
        assertEquals(120, MathUtility.getFactoria(5));
        assertEquals(240, MathUtility.getFactoria(4));
        assertEquals(60, MathUtility.getFactoria(3));
        assertEquals(1, MathUtility.getFactoria(0));
    }
    
    public MathUtilityTest() {
    }
    
    //XANH CHỈ ĐẠT ĐƯỢC NẾU TẤT CẢ ĐỀU XANH, HÀM Ý DÙNG HẾT TẤT CẢ
    //ĐỎ: CHỈ CẦN ÍT NHẤT 1 THẰNG ĐỎ, COI NHƯ ĐỎ TẤT CẢ
    
    //Viết code để test code chính(MathUtility)
    //Viết code dùng thư viện JUnit, NUnit, Jasmine, ... để test
    //Xem code chính chạy ổn không trước khi đem qua bên OC/Khách hàng trải nghiệm
    //Và thư viện này cung cấp cái cơ chế báo đúng sai qua màu sắc xanh đỏ
    //Mắt chỉ nhìn 2 màu là đủ, khỏi cần so sánh expected và actural để kết luận
}
