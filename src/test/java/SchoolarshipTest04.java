import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SchoolarshipTest04 {
    SchoolarShip temp = new SchoolarShip();

    //Kiem thu dong du lieu

    @Test
    public void test01(){
        assertEquals(temp.schoolarShip(-1,4.0,100),"Khong hop le");
    }

    @Test
    public void test02(){
        assertEquals(temp.schoolarShip(10,3.5,86),"Khong hoc bong");
    }

    @Test
    public void test03(){
        assertEquals(temp.schoolarShip(20,3.8,100),"Xuat sac");
    }

    @Test
    public void test04(){
        assertEquals(temp.schoolarShip(20,3.4,100),"Gioi");
    }
}
