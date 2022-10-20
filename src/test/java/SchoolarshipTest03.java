import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SchoolarshipTest03 {
    SchoolarShip temp = new SchoolarShip();

    //Kiem thu dong dieu khien

    @Test
    public void test01(){
        assertEquals(temp.schoolarShip(-1,-1,-1),"Khong hop le");
    }

    @Test
    public void test02(){
        assertEquals(temp.schoolarShip(13,3.0,90),"Khong hoc bong");
    }

    @Test
    public void test03(){
        assertEquals(temp.schoolarShip(16,3.3,80),"Gioi");
    }

    @Test
    public void test04(){
        assertEquals(temp.schoolarShip(16,3.8,95),"Xuat sac");
    }
}
