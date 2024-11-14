import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class HinhChuNhatTest {

    @org.junit.jupiter.api.Test
    @DisplayName("Test case 1: Lấy ra giá trị mặc định của chiều dài = 1.0")
    void getChieuDai() {
        // Tao 1 hinh chu nhat -> lay ra kich thuoc
        HinhChuNhat hcn = new HinhChuNhat();
        // excepted: chap nhan, actual: thuc te
        Assertions.assertEquals(1.0, hcn.getChieuDai());
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Test case 2: nhập chiều dài là số 0 hoặc âm, ném ra exception")
    void setChieuDai() {
        // Bat exception
        Exception exception = Assertions.assertThrows(RuntimeException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                // Co the nem ra exception
                HinhChuNhat hcn = new HinhChuNhat(3, 4);
                hcn.setChieuDai(-5);
            }
        });
        // Kiem tra xem noi dung exception co dung hay khong
        Assertions.assertEquals("Error 101", exception.getMessage());

    }

    @org.junit.jupiter.api.Test
    void getChieuRong() {
    }

    @org.junit.jupiter.api.Test
    void setChieuRong() {
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Test case 3: HCN có chiều dài = 1, chiều rộng = 2 thì chu vi = 6, diện tích = 2")
    void chuVivaDienTich1() {
        HinhChuNhat hcn = new HinhChuNhat(1, 2);
        double cv = hcn.chuVi();
        double dt = hcn.dienTich();
        // Kiem tra cv, dt tinh dc so voi thuc te
        Assertions.assertEquals(6, cv);
        Assertions.assertEquals(2, dt);

    }

    @org.junit.jupiter.api.Test
    @DisplayName("Test case 4: HCN có chiều dài = 1,2345, chiều rộng = 4,456 thì chu vi = 11,38, diện tích = 5,5")
    void chuVivaDienTich2() {
        HinhChuNhat hcn = new HinhChuNhat(1.2345, 4.456);
        double cv = hcn.chuVi();
        double dt = hcn.dienTich();
        // Kiem tra cv, dt tinh dc so voi thuc te
        Assertions.assertEquals(11.38, cv);
        Assertions.assertEquals(5.5, dt);
    }


    @org.junit.jupiter.api.Test
    void dienTich() {
    }

    @org.junit.jupiter.api.Test
    void testToString() {
    }
}