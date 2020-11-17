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
public class MathUtil {
    public static void main(String[] args) {
        System.out.println("5! = " + MathUtility.getFactoria(5));
        //tui goij hàm tính 5! hy vọng hàm trả về 12
        //lát hồi hàm chạy, cọi thực tế là mấy = ACTUAL
        //tui so sánh với cái tui hy vọng trước khi tính EXPECTED 120
        //ACTUAL == EXPECTED, hàm chạy đúng cho tình huống này, test case này
        System.out.println("0! = " + MathUtility.getFactoria(0));
        //expected!: đập vào mặt ILLEGALAGUMENTEXPECTED
        //cách test kiểu này gọi là Manual vì ta phải nhìn bằng mắt để luận kết quả
        //cách xịn sò, ta dùng màu sắc xanh đỏ để kết luận kết quả đúng sai của hàm
        //các này gọi là TEST AUTOMATION
        //thứ 3 ông giảng tiếp
    }
}
