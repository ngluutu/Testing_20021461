import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SchoolarshipTest02 {
    SchoolarShip temp = new SchoolarShip();

    //Kiem thu phân vùng tương đương

    @Test
    public void test01(){
        assertEquals(temp.schoolarShip(14,3,79),"Khong hoc bong");
    }

    @Test
    public void test02(){
        assertEquals(temp.schoolarShip(14,3,85),"Khong hoc bong");
    }

    @Test
    public void test03(){
        assertEquals(temp.schoolarShip(14,3.0,95),"Khong hoc bong");
    }

    @Test
    public void test04(){
        assertEquals(temp.schoolarShip(14,3,101),"Khong hop le");
    }

    @Test
    public void test05(){
        assertEquals(temp.schoolarShip(14,3.4,79),"Khong hoc bong");
    }

    @Test
    public void test06(){
        assertEquals(temp.schoolarShip(14,3.4,85),"Khong hoc bong");
    }

    @Test
    public void test07(){
        assertEquals(temp.schoolarShip(14,3.4,95),"Khong hoc bong");
    }

    @Test
    public void test08(){
        assertEquals(temp.schoolarShip(14,3.4,101),"Khong hop le");
    }

    @Test
    public void test09(){
        assertEquals(temp.schoolarShip(14,3.8,79),"Khong hoc bong");
    }

    @Test
    public void test010(){
        assertEquals(temp.schoolarShip(14,3.8,85),"Khong hoc bong");
    }

    @Test
    public void test011(){
        assertEquals(temp.schoolarShip(14,3.8,95),"Khong hoc bong");
    }

    @Test
    public void test012(){
        assertEquals(temp.schoolarShip(14,3.8,101),"Khong hop le");
    }

    @Test
    public void test013(){
        assertEquals(temp.schoolarShip(14,4.1,79),"Khong hop le");
    }

    @Test
    public void test014(){
        assertEquals(temp.schoolarShip(14,4.1,85),"Khong hop le");
    }

    @Test
    public void test015(){
        assertEquals(temp.schoolarShip(14,4.1,95),"Khong hop le");
    }

    @Test
    public void test016(){
        assertEquals(temp.schoolarShip(14,4.1,101),"Khong hop le");
    }

    @Test
    public void test11(){
        assertEquals(temp.schoolarShip(16,3,79),"Khong hoc bong");
    }

    @Test
    public void test12(){
        assertEquals(temp.schoolarShip(16,3,85),"Khong hoc bong");
    }

    @Test
    public void test13(){
        assertEquals(temp.schoolarShip(16,3.0,95),"Khong hoc bong");
    }

    @Test
    public void test14(){
        assertEquals(temp.schoolarShip(16,3,101),"Khong hop le");
    }

    @Test
    public void test15(){
        assertEquals(temp.schoolarShip(16,3.4,79),"Khong hoc bong");
    }

    @Test
    public void test16(){
        assertEquals(temp.schoolarShip(16,3.4,85),"Gioi");
    }

    @Test
    public void test17(){
        assertEquals(temp.schoolarShip(16,3.4,95),"Gioi");
    }

    @Test
    public void test18(){
        assertEquals(temp.schoolarShip(16,3.4,101),"Khong hop le");
    }

    @Test
    public void test19(){
        assertEquals(temp.schoolarShip(16,3.8,79),"Khong hoc bong");
    }

    @Test
    public void test110(){
        assertEquals(temp.schoolarShip(16,3.8,85),"Gioi");
    }

    @Test
    public void test111(){
        assertEquals(temp.schoolarShip(16,3.8,95),"Xuat sac");
    }

    @Test
    public void test112(){
        assertEquals(temp.schoolarShip(16,3.8,101),"Khong hop le");
    }

    @Test
    public void test113(){
        assertEquals(temp.schoolarShip(16,4.1,79),"Khong hop le");
    }

    @Test
    public void test114(){
        assertEquals(temp.schoolarShip(16,4.1,85),"Khong hop le");
    }

    @Test
    public void test115(){
        assertEquals(temp.schoolarShip(16,4.1,95),"Khong hop le");
    }

    @Test
    public void test116(){
        assertEquals(temp.schoolarShip(16,4.1,101),"Khong hop le");
    }

    @Test
    public void test21(){
        assertEquals(temp.schoolarShip(50,3,79),"Khong hop le");
    }

    @Test
    public void test22(){
        assertEquals(temp.schoolarShip(50,3,85),"Khong hop le");
    }

    @Test
    public void test23(){
        assertEquals(temp.schoolarShip(50,3.0,95),"Khong hop le");
    }

    @Test
    public void test24(){
        assertEquals(temp.schoolarShip(50,3,101),"Khong hop le");
    }

    @Test
    public void test25(){
        assertEquals(temp.schoolarShip(50,3.4,79),"Khong hop le");
    }

    @Test
    public void test26(){
        assertEquals(temp.schoolarShip(50,3.4,85),"Khong hop le");
    }

    @Test
    public void test27(){
        assertEquals(temp.schoolarShip(50,3.4,95),"Khong hop le");
    }

    @Test
    public void test28(){
        assertEquals(temp.schoolarShip(50,3.4,101),"Khong hop le");
    }

    @Test
    public void test29(){
        assertEquals(temp.schoolarShip(50,3.8,79),"Khong hop le");
    }

    @Test
    public void test210(){
        assertEquals(temp.schoolarShip(50,3.8,85),"Khong hop le");
    }

    @Test
    public void test211(){
        assertEquals(temp.schoolarShip(50,3.8,95),"Khong hop le");
    }

    @Test
    public void test212(){
        assertEquals(temp.schoolarShip(50,3.8,101),"Khong hop le");
    }

    @Test
    public void test213(){
        assertEquals(temp.schoolarShip(50,4.1,79),"Khong hop le");
    }

    @Test
    public void test214(){
        assertEquals(temp.schoolarShip(50,4.1,85),"Khong hop le");
    }

    @Test
    public void test215(){
        assertEquals(temp.schoolarShip(50,4.1,95),"Khong hop le");
    }

    @Test
    public void test216(){
        assertEquals(temp.schoolarShip(50,4.1,101),"Khong hop le");
    }
}
