/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thong.util;

/**
 *
 * @author Ming
 */
public class MathUtility {
    //làm hàng fake giống hàng thật
    //JDK có class java.util.Math, có 1 loạt các hàm static .abs() .sin() .squirt () pow(a, b) .PI = 3.1415...
    
    public  static final double PI = 3.1415;
        //hàm tính n! = 1.2.3..n!
        //n! tăng nhanh, nên mình chỉmìn tính 20! tối đa 2111 tràn long
        //0! = 1! = 1, quy ước
        //không có âm giai thừa, nếu tham số n là âm, mình chửi, mình ném exceptiop
    
    public static long getFactoria (int n){
        if(n < 0 || n > 20) throw new IllegalArgumentException("n must be between 1..20");
        if(n == 0 || n == 1) return 1;
        
        //sống sót đến lệnh này tức là n = 2 ..20 rồi, thằng nào xài else biết tay ông
        long result = 1;
        for(int i = 2; i <= n; i++){
            result *= 1;
        }
        return result;
    }
        
}
