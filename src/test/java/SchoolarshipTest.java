import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SchoolarshipTest {
//    @ParameterizedTest
//    @CsvFileSource(resources = "/Data.csv", numLinesToSkip = 1)
//    void test(int a, double b, double c, String result){
//        SchoolarShip temp = new SchoolarShip();
//        assertEquals(temp.schoolarShip(a,b,c),result);
//    }
    SchoolarShip temp = new SchoolarShip();

    //Kiem thu gia tri bien
    @Test
    public void test01(){
        assertEquals(temp.schoolarShip(1,0.1,1),"Khong hoc bong");
    }

    @Test
    public void test02(){
        assertEquals(temp.schoolarShip(1,0.1,0),"Khong hoc bong");
    }

    @Test
    public void test03(){
        assertEquals(temp.schoolarShip(1,0.1,-1),"Khong hop le");
    }

    @Test
    public void test04(){
        assertEquals(temp.schoolarShip(1,0.1,50),"Khong hoc bong");
    }

    @Test
    public void test05(){
        assertEquals(temp.schoolarShip(1,0.1,99),"Khong hoc bong");
    }

    @Test
    public void test06(){
        assertEquals(temp.schoolarShip(1,0.1,100),"Khong hoc bong");
    }

    @Test
    public void test07(){
        assertEquals(temp.schoolarShip(1,0.1,101),"Khong hop le");
    }

    @Test
    public void test08(){
        assertEquals(temp.schoolarShip(1,0,1),"Khong hoc bong");
    }

    @Test
    public void test09(){
        assertEquals(temp.schoolarShip(1,0,0),"Khong hoc bong");
    }

    @Test
    public void test010(){
        assertEquals(temp.schoolarShip(1,0,-1),"Khong hop le");
    }

    @Test
    public void test011(){
        assertEquals(temp.schoolarShip(1,0,50),"Khong hoc bong");
    }

    @Test
    public void test012(){
        assertEquals(temp.schoolarShip(1,0,99),"Khong hoc bong");
    }

    @Test
    public void test013(){
        assertEquals(temp.schoolarShip(1,0,100),"Khong hoc bong");
    }

    @Test
    public void test014(){
        assertEquals(temp.schoolarShip(1,0,101),"Khong hop le");
    }

    @Test
    public void test015(){
        assertEquals(temp.schoolarShip(1,-0.1,1),"Khong hop le");
    }

    @Test
    public void test016(){
        assertEquals(temp.schoolarShip(1,-0.1,0),"Khong hop le");
    }

    @Test
    public void test017(){
        assertEquals(temp.schoolarShip(1,-0.1,-1),"Khong hop le");
    }

    @Test
    public void test018(){
        assertEquals(temp.schoolarShip(1,-0.1,50),"Khong hop le");
    }

    @Test
    public void test019(){
        assertEquals(temp.schoolarShip(1,-0.1,99),"Khong hop le");
    }

    @Test
    public void test020(){
        assertEquals(temp.schoolarShip(1,-0.1,100),"Khong hop le");
    }

    @Test
    public void test021(){
        assertEquals(temp.schoolarShip(1,-0.1,101),"Khong hop le");
    }

    @Test
    public void test022(){
        assertEquals(temp.schoolarShip(1,2.0,1),"Khong hoc bong");
    }

    @Test
    public void test023(){
        assertEquals(temp.schoolarShip(1,2.0,0),"Khong hoc bong");
    }

    @Test
    public void test024(){
        assertEquals(temp.schoolarShip(1,2.0,-1),"Khong hop le");
    }

    @Test
    public void test025(){
        assertEquals(temp.schoolarShip(1,2.0,50),"Khong hoc bong");
    }

    @Test
    public void test026(){
        assertEquals(temp.schoolarShip(1,2.0,99),"Khong hoc bong");
    }

    @Test
    public void test027(){
        assertEquals(temp.schoolarShip(1,2.0,100),"Khong hoc bong");
    }

    @Test
    public void test028(){
        assertEquals(temp.schoolarShip(1,2.0,101),"Khong hop le");
    }

    @Test
    public void test029(){
        assertEquals(temp.schoolarShip(1,3.9,1),"Khong hoc bong");
    }

    @Test
    public void test030(){
        assertEquals(temp.schoolarShip(1,3.9,0),"Khong hoc bong");
    }

    @Test
    public void test031(){
        assertEquals(temp.schoolarShip(1,3.9,-1),"Khong hop le");
    }

    @Test
    public void test032(){
        assertEquals(temp.schoolarShip(1,3.9,50),"Khong hoc bong");
    }

    @Test
    public void test033(){
        assertEquals(temp.schoolarShip(1,3.9,99),"Khong hoc bong");
    }

    @Test
    public void test034(){
        assertEquals(temp.schoolarShip(1,3.9,100),"Khong hoc bong");
    }

    @Test
    public void test035(){
        assertEquals(temp.schoolarShip(1,3.9,101),"Khong hop le");
    }

    @Test
    public void test036(){
        assertEquals(temp.schoolarShip(1,4,1),"Khong hoc bong");
    }

    @Test
    public void test037(){
        assertEquals(temp.schoolarShip(1,4,0),"Khong hoc bong");
    }

    @Test
    public void test038(){
        assertEquals(temp.schoolarShip(1,4,-1),"Khong hop le");
    }

    @Test
    public void test039(){
        assertEquals(temp.schoolarShip(1,4,50),"Khong hoc bong");
    }

    @Test
    public void test040(){
        assertEquals(temp.schoolarShip(1,4,99),"Khong hoc bong");
    }

    @Test
    public void test041(){
        assertEquals(temp.schoolarShip(1,4,100),"Khong hoc bong");
    }

    @Test
    public void test042(){
        assertEquals(temp.schoolarShip(1,4,101),"Khong hop le");
    }

    @Test
    public void test043(){
        assertEquals(temp.schoolarShip(1,4.1,1),"Khong hop le");
    }

    @Test
    public void test044(){
        assertEquals(temp.schoolarShip(1,4.1,0),"Khong hop le");
    }

    @Test
    public void test045(){
        assertEquals(temp.schoolarShip(1,4.1,-1),"Khong hop le");
    }

    @Test
    public void test046(){
        assertEquals(temp.schoolarShip(1,4.1,50),"Khong hop le");
    }

    @Test
    public void test047(){
        assertEquals(temp.schoolarShip(1,4.1,99),"Khong hop le");
    }

    @Test
    public void test048(){
        assertEquals(temp.schoolarShip(1,4.1,100),"Khong hop le");
    }

    @Test
    public void test049(){
        assertEquals(temp.schoolarShip(1,4.1,101),"Khong hop le");
    }

    @Test
    public void test050(){
        assertEquals(temp.schoolarShip(0,0.1,1),"Khong hoc bong");
    }

    @Test
    public void test051(){
        assertEquals(temp.schoolarShip(0,0.1,0),"Khong hoc bong");
    }

    @Test
    public void test052(){
        assertEquals(temp.schoolarShip(0,0.1,-1),"Khong hop le");
    }

    @Test
    public void test053(){
        assertEquals(temp.schoolarShip(0,0.1,50),"Khong hoc bong");
    }

    @Test
    public void test054(){
        assertEquals(temp.schoolarShip(0,0.1,99),"Khong hoc bong");
    }

    @Test
    public void test055(){
        assertEquals(temp.schoolarShip(0,0.1,100),"Khong hoc bong");
    }

    @Test
    public void test056(){
        assertEquals(temp.schoolarShip(0,0.1,101),"Khong hop le");
    }

    @Test
    public void test057(){
        assertEquals(temp.schoolarShip(0,0,1),"Khong hoc bong");
    }

    @Test
    public void test058(){
        assertEquals(temp.schoolarShip(0,0,0),"Khong hoc bong");
    }

    @Test
    public void test059(){
        assertEquals(temp.schoolarShip(0,0,-1),"Khong hop le");
    }

    @Test
    public void test060(){
        assertEquals(temp.schoolarShip(0,0,50),"Khong hoc bong");
    }

    @Test
    public void test084(){
        assertEquals(temp.schoolarShip(0,0,99),"Khong hoc bong");
    }

    @Test
    public void test061(){
        assertEquals(temp.schoolarShip(0,0,100),"Khong hoc bong");
    }

    @Test
    public void test062(){
        assertEquals(temp.schoolarShip(0,0,101),"Khong hop le");
    }

    @Test
    public void test63(){
        assertEquals(temp.schoolarShip(0,-0.1,1),"Khong hop le");
    }

    @Test
    public void test064(){
        assertEquals(temp.schoolarShip(0,-0.1,0),"Khong hop le");
    }

    @Test
    public void test083(){
        assertEquals(temp.schoolarShip(0,-0.1,-1),"Khong hop le");
    }

    @Test
    public void test065(){
        assertEquals(temp.schoolarShip(0,-0.1,50),"Khong hop le");
    }

    @Test
    public void test066(){
        assertEquals(temp.schoolarShip(0,-0.1,99),"Khong hop le");
    }

    @Test
    public void test067(){
        assertEquals(temp.schoolarShip(0,-0.1,100),"Khong hop le");
    }

    @Test
    public void test068(){
        assertEquals(temp.schoolarShip(0,-0.1,101),"Khong hop le");
    }

    @Test
    public void test069(){
        assertEquals(temp.schoolarShip(0,2.0,1),"Khong hoc bong");
    }

    @Test
    public void test070(){
        assertEquals(temp.schoolarShip(0,2.0,0),"Khong hoc bong");
    }

    @Test
    public void test071(){
        assertEquals(temp.schoolarShip(0,2.0,-1),"Khong hop le");
    }

    @Test
    public void test072(){
        assertEquals(temp.schoolarShip(0,2.0,50),"Khong hoc bong");
    }

    @Test
    public void test073(){
        assertEquals(temp.schoolarShip(0,2.0,99),"Khong hoc bong");
    }

    @Test
    public void test074(){
        assertEquals(temp.schoolarShip(0,2.0,100),"Khong hoc bong");
    }

    @Test
    public void test075(){
        assertEquals(temp.schoolarShip(0,2.0,101),"Khong hop le");
    }

    @Test
    public void test076(){
        assertEquals(temp.schoolarShip(0,3.9,1),"Khong hoc bong");
    }

    @Test
    public void test077(){
        assertEquals(temp.schoolarShip(0,3.9,0),"Khong hoc bong");
    }

    @Test
    public void test078(){
        assertEquals(temp.schoolarShip(0,3.9,-1),"Khong hop le");
    }

    @Test
    public void test079(){
        assertEquals(temp.schoolarShip(0,3.9,50),"Khong hoc bong");
    }

    @Test
    public void test080(){
        assertEquals(temp.schoolarShip(0,3.9,99),"Khong hoc bong");
    }

    @Test
    public void test081(){
        assertEquals(temp.schoolarShip(0,3.9,100),"Khong hoc bong");
    }

    @Test
    public void test082(){
        assertEquals(temp.schoolarShip(0,3.9,101),"Khong hop le");
    }

    @Test
    public void test085(){
        assertEquals(temp.schoolarShip(0,4,1),"Khong hoc bong");
    }

    @Test
    public void test086(){
        assertEquals(temp.schoolarShip(0,4,0),"Khong hoc bong");
    }

    @Test
    public void test087(){
        assertEquals(temp.schoolarShip(0,4,-1),"Khong hop le");
    }

    @Test
    public void test088(){
        assertEquals(temp.schoolarShip(0,4,50),"Khong hoc bong");
    }

    @Test
    public void test089(){
        assertEquals(temp.schoolarShip(0,4,99),"Khong hoc bong");
    }

    @Test
    public void test090(){
        assertEquals(temp.schoolarShip(0,4,100),"Khong hoc bong");
    }

    @Test
    public void test091(){
        assertEquals(temp.schoolarShip(0,4,101),"Khong hop le");
    }

    @Test
    public void test092(){
        assertEquals(temp.schoolarShip(0,4.1,1),"Khong hop le");
    }

    @Test
    public void test093(){
        assertEquals(temp.schoolarShip(0,4.1,0),"Khong hop le");
    }

    @Test
    public void test094(){
        assertEquals(temp.schoolarShip(0,4.1,-1),"Khong hop le");
    }

    @Test
    public void test095(){
        assertEquals(temp.schoolarShip(0,4.1,50),"Khong hop le");
    }

    @Test
    public void test096(){
        assertEquals(temp.schoolarShip(0,4.1,99),"Khong hop le");
    }

    @Test
    public void test097(){
        assertEquals(temp.schoolarShip(0,4.1,100),"Khong hop le");
    }

    @Test
    public void test098(){
        assertEquals(temp.schoolarShip(0,4.1,101),"Khong hop le");
    }

    @Test
    public void test001(){
        assertEquals(temp.schoolarShip(-1,0.1,1),"Khong hop le");
    }

    @Test
    public void test002(){
        assertEquals(temp.schoolarShip(-1,0.1,0),"Khong hop le");
    }

    @Test
    public void test003(){
        assertEquals(temp.schoolarShip(-1,0.1,-1),"Khong hop le");
    }

    @Test
    public void test004(){
        assertEquals(temp.schoolarShip(-1,0.1,50),"Khong hop le");
    }

    @Test
    public void test005(){
        assertEquals(temp.schoolarShip(-1,0.1,99),"Khong hop le");
    }

    @Test
    public void test006(){
        assertEquals(temp.schoolarShip(-1,0.1,100),"Khong hop le");
    }

    @Test
    public void test007(){
        assertEquals(temp.schoolarShip(-1,0.1,101),"Khong hop le");
    }

    @Test
    public void test008(){
        assertEquals(temp.schoolarShip(-1,0,1),"Khong hop le");
    }

    @Test
    public void test009(){
        assertEquals(temp.schoolarShip(-1,0,0),"Khong hop le");
    }

    @Test
    public void test0010(){
        assertEquals(temp.schoolarShip(-1,0,-1),"Khong hop le");
    }

    @Test
    public void test0011(){
        assertEquals(temp.schoolarShip(-1,0,50),"Khong hop le");
    }

    @Test
    public void test0012(){
        assertEquals(temp.schoolarShip(-1,0,99),"Khong hop le");
    }

    @Test
    public void test0013(){
        assertEquals(temp.schoolarShip(-1,0,100),"Khong hop le");
    }

    @Test
    public void test0014(){
        assertEquals(temp.schoolarShip(-1,0,101),"Khong hop le");
    }

    @Test
    public void test0015(){
        assertEquals(temp.schoolarShip(-1,-0.1,1),"Khong hop le");
    }

    @Test
    public void test0016(){
        assertEquals(temp.schoolarShip(-1,-0.1,0),"Khong hop le");
    }

    @Test
    public void test0017(){
        assertEquals(temp.schoolarShip(-1,-0.1,-1),"Khong hop le");
    }

    @Test
    public void test0018(){
        assertEquals(temp.schoolarShip(-1,-0.1,50),"Khong hop le");
    }

    @Test
    public void test0019(){
        assertEquals(temp.schoolarShip(-1,-0.1,99),"Khong hop le");
    }

    @Test
    public void test0020(){
        assertEquals(temp.schoolarShip(-1,-0.1,100),"Khong hop le");
    }

    @Test
    public void test0021(){
        assertEquals(temp.schoolarShip(-1,-0.1,101),"Khong hop le");
    }

    @Test
    public void test0022(){
        assertEquals(temp.schoolarShip(-1,2.0,1),"Khong hop le");
    }

    @Test
    public void test0023(){
        assertEquals(temp.schoolarShip(-1,2.0,0),"Khong hop le");
    }

    @Test
    public void test0024(){
        assertEquals(temp.schoolarShip(-1,2.0,-1),"Khong hop le");
    }

    @Test
    public void test0025(){
        assertEquals(temp.schoolarShip(-1,2.0,50),"Khong hop le");
    }

    @Test
    public void test0026(){
        assertEquals(temp.schoolarShip(-1,2.0,99),"Khong hop le");
    }

    @Test
    public void test0027(){
        assertEquals(temp.schoolarShip(-1,2.0,100),"Khong hop le");
    }

    @Test
    public void test0028(){
        assertEquals(temp.schoolarShip(-1,2.0,101),"Khong hop le");
    }

    @Test
    public void test0029(){
        assertEquals(temp.schoolarShip(-1,3.9,1),"Khong hop le");
    }

    @Test
    public void test0030(){
        assertEquals(temp.schoolarShip(-1,3.9,0),"Khong hop le");
    }

    @Test
    public void test0031(){
        assertEquals(temp.schoolarShip(-1,3.9,-1),"Khong hop le");
    }

    @Test
    public void test0032(){
        assertEquals(temp.schoolarShip(-1,3.9,50),"Khong hop le");
    }

    @Test
    public void test0033(){
        assertEquals(temp.schoolarShip(-1,3.9,99),"Khong hop le");
    }

    @Test
    public void test0034(){
        assertEquals(temp.schoolarShip(-1,3.9,100),"Khong hop le");
    }

    @Test
    public void test0035(){
        assertEquals(temp.schoolarShip(-1,3.9,101),"Khong hop le");
    }

    @Test
    public void test0036(){
        assertEquals(temp.schoolarShip(-1,4,1),"Khong hop le");
    }

    @Test
    public void test0037(){
        assertEquals(temp.schoolarShip(-1,4,0),"Khong hop le");
    }

    @Test
    public void test0038(){
        assertEquals(temp.schoolarShip(-1,4,-1),"Khong hop le");
    }

    @Test
    public void test0039(){
        assertEquals(temp.schoolarShip(-1,4,50),"Khong hop le");
    }

    @Test
    public void test0040(){
        assertEquals(temp.schoolarShip(-1,4,99),"Khong hop le");
    }

    @Test
    public void test0041(){
        assertEquals(temp.schoolarShip(-1,4,100),"Khong hop le");
    }

    @Test
    public void test0042(){
        assertEquals(temp.schoolarShip(-1,4,101),"Khong hop le");
    }

    @Test
    public void test0043(){
        assertEquals(temp.schoolarShip(-1,4.1,1),"Khong hop le");
    }

    @Test
    public void test0044(){
        assertEquals(temp.schoolarShip(-1,4.1,0),"Khong hop le");
    }

    @Test
    public void test0045(){
        assertEquals(temp.schoolarShip(-1,4.1,-1),"Khong hop le");
    }

    @Test
    public void test0046(){
        assertEquals(temp.schoolarShip(-1,4.1,50),"Khong hop le");
    }

    @Test
    public void test0047(){
        assertEquals(temp.schoolarShip(-1,4.1,99),"Khong hop le");
    }

    @Test
    public void test0048(){
        assertEquals(temp.schoolarShip(-1,4.1,100),"Khong hop le");
    }

    @Test
    public void test0049(){
        assertEquals(temp.schoolarShip(-1,4.1,101),"Khong hop le");
    }

    @Test
    public void test0001(){
        assertEquals(temp.schoolarShip(20,0.1,1),"Khong hoc bong");
    }

    @Test
    public void test0002(){
        assertEquals(temp.schoolarShip(20,0.1,0),"Khong hoc bong");
    }

    @Test
    public void test0003(){
        assertEquals(temp.schoolarShip(20,0.1,-1),"Khong hop le");
    }

    @Test
    public void test0004(){
        assertEquals(temp.schoolarShip(20,0.1,50),"Khong hoc bong");
    }

    @Test
    public void test0005(){
        assertEquals(temp.schoolarShip(20,0.1,99),"Khong hoc bong");
    }

    @Test
    public void test0006(){
        assertEquals(temp.schoolarShip(20,0.1,100),"Khong hoc bong");
    }

    @Test
    public void test0007(){
        assertEquals(temp.schoolarShip(20,0.1,101),"Khong hop le");
    }

    @Test
    public void test0008(){
        assertEquals(temp.schoolarShip(20,0,1),"Khong hoc bong");
    }

    @Test
    public void test0009(){
        assertEquals(temp.schoolarShip(20,0,0),"Khong hoc bong");
    }

    @Test
    public void test00010(){
        assertEquals(temp.schoolarShip(20,0,-1),"Khong hop le");
    }

    @Test
    public void test00011(){
        assertEquals(temp.schoolarShip(20,0,50),"Khong hoc bong");
    }

    @Test
    public void test00012(){
        assertEquals(temp.schoolarShip(20,0,99),"Khong hoc bong");
    }

    @Test
    public void test00013(){
        assertEquals(temp.schoolarShip(20,0,100),"Khong hoc bong");
    }

    @Test
    public void test00014(){
        assertEquals(temp.schoolarShip(20,0,101),"Khong hop le");
    }

    @Test
    public void test00015(){
        assertEquals(temp.schoolarShip(20,-0.1,1),"Khong hop le");
    }

    @Test
    public void test00016(){
        assertEquals(temp.schoolarShip(20,-0.1,0),"Khong hop le");
    }

    @Test
    public void test00017(){
        assertEquals(temp.schoolarShip(20,-0.1,-1),"Khong hop le");
    }

    @Test
    public void test00018(){
        assertEquals(temp.schoolarShip(20,-0.1,50),"Khong hop le");
    }

    @Test
    public void test00019(){
        assertEquals(temp.schoolarShip(20,-0.1,99),"Khong hop le");
    }

    @Test
    public void test00020(){
        assertEquals(temp.schoolarShip(20,-0.1,100),"Khong hop le");
    }

    @Test
    public void test00021(){
        assertEquals(temp.schoolarShip(20,-0.1,101),"Khong hop le");
    }

    @Test
    public void test00022(){
        assertEquals(temp.schoolarShip(20,2.0,1),"Khong hoc bong");
    }

    @Test
    public void test00023(){
        assertEquals(temp.schoolarShip(20,2.0,0),"Khong hoc bong");
    }

    @Test
    public void test00024(){
        assertEquals(temp.schoolarShip(20,2.0,-1),"Khong hop le");
    }

    @Test
    public void test00025(){
        assertEquals(temp.schoolarShip(20,2.0,50),"Khong hoc bong");
    }

    @Test
    public void test00026(){
        assertEquals(temp.schoolarShip(20,2.0,99),"Khong hoc bong");
    }

    @Test
    public void test00027(){
        assertEquals(temp.schoolarShip(20,2.0,100),"Khong hoc bong");
    }

    @Test
    public void test00028(){
        assertEquals(temp.schoolarShip(20,2.0,101),"Khong hop le");
    }

    @Test
    public void test00029(){
        assertEquals(temp.schoolarShip(20,3.9,1),"Khong hoc bong");
    }

    @Test
    public void test00030(){
        assertEquals(temp.schoolarShip(20,3.9,0),"Khong hoc bong");
    }

    @Test
    public void test00031(){
        assertEquals(temp.schoolarShip(20,3.9,-1),"Khong hop le");
    }

    @Test
    public void test00032(){
        assertEquals(temp.schoolarShip(20,3.9,50),"Khong hoc bong");
    }

    @Test
    public void test00033(){
        assertEquals(temp.schoolarShip(20,3.9,99),"Xuat sac");
    }

    @Test
    public void test00034(){
        assertEquals(temp.schoolarShip(20,3.9,100),"Xuat sac");
    }

    @Test
    public void test00035(){
        assertEquals(temp.schoolarShip(20,3.9,101),"Khong hop le");
    }

    @Test
    public void test00036(){
        assertEquals(temp.schoolarShip(20,4,1),"Khong hoc bong");
    }

    @Test
    public void test00037(){
        assertEquals(temp.schoolarShip(20,4,0),"Khong hoc bong");
    }

    @Test
    public void test00038(){
        assertEquals(temp.schoolarShip(20,4,-1),"Khong hop le");
    }

    @Test
    public void test00039(){
        assertEquals(temp.schoolarShip(20,4,50),"Khong hoc bong");
    }

    @Test
    public void test00040(){
        assertEquals(temp.schoolarShip(20,4,99),"Xuat sac");
    }

    @Test
    public void test00041(){
        assertEquals(temp.schoolarShip(20,4,100),"Xuat sac");
    }

    @Test
    public void test00042(){
        assertEquals(temp.schoolarShip(20,4,101),"Khong hop le");
    }

    @Test
    public void test00043(){
        assertEquals(temp.schoolarShip(20,4.1,1),"Khong hop le");
    }

    @Test
    public void test00044(){
        assertEquals(temp.schoolarShip(20,4.1,0),"Khong hop le");
    }

    @Test
    public void test00045(){
        assertEquals(temp.schoolarShip(20,4.1,-1),"Khong hop le");
    }

    @Test
    public void test00046(){
        assertEquals(temp.schoolarShip(20,4.1,50),"Khong hop le");
    }

    @Test
    public void test00047(){
        assertEquals(temp.schoolarShip(20,4.1,99),"Khong hop le");
    }

    @Test
    public void test00048(){
        assertEquals(temp.schoolarShip(20,4.1,100),"Khong hop le");
    }

    @Test
    public void test00049(){
        assertEquals(temp.schoolarShip(20,4.1,101),"Khong hop le");
    }

    @Test
    public void test1001(){
        assertEquals(temp.schoolarShip(41,0.1,1),"Khong hop le");
    }

    @Test
    public void test1002(){
        assertEquals(temp.schoolarShip(41,0.1,0),"Khong hop le");
    }

    @Test
    public void test1003(){
        assertEquals(temp.schoolarShip(41,0.1,-1),"Khong hop le");
    }

    @Test
    public void test1004(){
        assertEquals(temp.schoolarShip(41,0.1,50),"Khong hop le");
    }

    @Test
    public void test1005(){
        assertEquals(temp.schoolarShip(41,0.1,99),"Khong hop le");
    }

    @Test
    public void test1006(){
        assertEquals(temp.schoolarShip(41,0.1,100),"Khong hop le");
    }

    @Test
    public void test1007(){
        assertEquals(temp.schoolarShip(41,0.1,101),"Khong hop le");
    }

    @Test
    public void test1008(){
        assertEquals(temp.schoolarShip(41,0,1),"Khong hop le");
    }

    @Test
    public void test1009(){
        assertEquals(temp.schoolarShip(41,0,0),"Khong hop le");
    }

    @Test
    public void test10010(){
        assertEquals(temp.schoolarShip(41,0,-1),"Khong hop le");
    }

    @Test
    public void test10011(){
        assertEquals(temp.schoolarShip(41,0,50),"Khong hop le");
    }

    @Test
    public void test10012(){
        assertEquals(temp.schoolarShip(41,0,99),"Khong hop le");
    }

    @Test
    public void test10013(){
        assertEquals(temp.schoolarShip(41,0,100),"Khong hop le");
    }

    @Test
    public void test10014(){
        assertEquals(temp.schoolarShip(41,0,101),"Khong hop le");
    }

    @Test
    public void test10015(){
        assertEquals(temp.schoolarShip(41,-0.1,1),"Khong hop le");
    }

    @Test
    public void test10016(){
        assertEquals(temp.schoolarShip(41,-0.1,0),"Khong hop le");
    }

    @Test
    public void test10017(){
        assertEquals(temp.schoolarShip(41,-0.1,-1),"Khong hop le");
    }

    @Test
    public void test10018(){
        assertEquals(temp.schoolarShip(41,-0.1,50),"Khong hop le");
    }

    @Test
    public void test10019(){
        assertEquals(temp.schoolarShip(41,-0.1,99),"Khong hop le");
    }

    @Test
    public void test10020(){
        assertEquals(temp.schoolarShip(41,-0.1,100),"Khong hop le");
    }

    @Test
    public void test10021(){
        assertEquals(temp.schoolarShip(41,-0.1,101),"Khong hop le");
    }

    @Test
    public void test10022(){
        assertEquals(temp.schoolarShip(41,2.0,1),"Khong hop le");
    }

    @Test
    public void test10023(){
        assertEquals(temp.schoolarShip(41,2.0,0),"Khong hop le");
    }

    @Test
    public void test10024(){
        assertEquals(temp.schoolarShip(41,2.0,-1),"Khong hop le");
    }

    @Test
    public void test10025(){
        assertEquals(temp.schoolarShip(41,2.0,50),"Khong hop le");
    }

    @Test
    public void test10026(){
        assertEquals(temp.schoolarShip(41,2.0,99),"Khong hop le");
    }

    @Test
    public void test10027(){
        assertEquals(temp.schoolarShip(41,2.0,100),"Khong hop le");
    }

    @Test
    public void test10028(){
        assertEquals(temp.schoolarShip(41,2.0,101),"Khong hop le");
    }

    @Test
    public void test10029(){
        assertEquals(temp.schoolarShip(41,3.9,1),"Khong hop le");
    }

    @Test
    public void test10030(){
        assertEquals(temp.schoolarShip(41,3.9,0),"Khong hop le");
    }

    @Test
    public void test10031(){
        assertEquals(temp.schoolarShip(41,3.9,-1),"Khong hop le");
    }

    @Test
    public void test10032(){
        assertEquals(temp.schoolarShip(41,3.9,50),"Khong hop le");
    }

    @Test
    public void test10033(){
        assertEquals(temp.schoolarShip(41,3.9,99),"Khong hop le");
    }

    @Test
    public void test10034(){
        assertEquals(temp.schoolarShip(41,3.9,100),"Khong hop le");
    }

    @Test
    public void test10035(){
        assertEquals(temp.schoolarShip(41,3.9,101),"Khong hop le");
    }

    @Test
    public void test10036(){
        assertEquals(temp.schoolarShip(41,4,1),"Khong hop le");
    }

    @Test
    public void test10037(){
        assertEquals(temp.schoolarShip(41,4,0),"Khong hop le");
    }

    @Test
    public void test10038(){
        assertEquals(temp.schoolarShip(41,4,-1),"Khong hop le");
    }

    @Test
    public void test10039(){
        assertEquals(temp.schoolarShip(41,4,50),"Khong hop le");
    }

    @Test
    public void test10040(){
        assertEquals(temp.schoolarShip(41,4,99),"Khong hop le");
    }

    @Test
    public void test10041(){
        assertEquals(temp.schoolarShip(41,4,100),"Khong hop le");
    }

    @Test
    public void test10042(){
        assertEquals(temp.schoolarShip(41,4,101),"Khong hop le");
    }

    @Test
    public void test10043(){
        assertEquals(temp.schoolarShip(41,4.1,1),"Khong hop le");
    }

    @Test
    public void test10044(){
        assertEquals(temp.schoolarShip(41,4.1,0),"Khong hop le");
    }

    @Test
    public void test10045(){
        assertEquals(temp.schoolarShip(41,4.1,-1),"Khong hop le");
    }

    @Test
    public void test10046(){
        assertEquals(temp.schoolarShip(41,4.1,50),"Khong hop le");
    }

    @Test
    public void test10047(){
        assertEquals(temp.schoolarShip(41,4.1,99),"Khong hop le");
    }

    @Test
    public void test10048(){
        assertEquals(temp.schoolarShip(41,4.1,100),"Khong hop le");
    }

    @Test
    public void test10049(){
        assertEquals(temp.schoolarShip(41,4.1,101),"Khong hop le");
    }

    @Test
    public void test201(){
        assertEquals(temp.schoolarShip(39,0.1,1),"Khong hoc bong");
    }

    @Test
    public void test202(){
        assertEquals(temp.schoolarShip(39,0.1,0),"Khong hoc bong");
    }

    @Test
    public void test203(){
        assertEquals(temp.schoolarShip(39,0.1,-1),"Khong hop le");
    }

    @Test
    public void test204(){
        assertEquals(temp.schoolarShip(39,0.1,50),"Khong hoc bong");
    }

    @Test
    public void test205(){
        assertEquals(temp.schoolarShip(39,0.1,99),"Khong hoc bong");
    }

    @Test
    public void test206(){
        assertEquals(temp.schoolarShip(39,0.1,100),"Khong hoc bong");
    }

    @Test
    public void test207(){
        assertEquals(temp.schoolarShip(39,0.1,101),"Khong hop le");
    }

    @Test
    public void test208(){
        assertEquals(temp.schoolarShip(39,0,1),"Khong hoc bong");
    }

    @Test
    public void test209(){
        assertEquals(temp.schoolarShip(39,0,0),"Khong hoc bong");
    }

    @Test
    public void test2010(){
        assertEquals(temp.schoolarShip(39,0,-1),"Khong hop le");
    }

    @Test
    public void test2011(){
        assertEquals(temp.schoolarShip(39,0,50),"Khong hoc bong");
    }

    @Test
    public void test2012(){
        assertEquals(temp.schoolarShip(39,0,99),"Khong hoc bong");
    }

    @Test
    public void test2013(){
        assertEquals(temp.schoolarShip(39,0,100),"Khong hoc bong");
    }

    @Test
    public void test2014(){
        assertEquals(temp.schoolarShip(39,0,101),"Khong hop le");
    }

    @Test
    public void test2015(){
        assertEquals(temp.schoolarShip(39,-0.1,1),"Khong hop le");
    }

    @Test
    public void test2016(){
        assertEquals(temp.schoolarShip(39,-0.1,0),"Khong hop le");
    }

    @Test
    public void test2017(){
        assertEquals(temp.schoolarShip(39,-0.1,-1),"Khong hop le");
    }

    @Test
    public void test2018(){
        assertEquals(temp.schoolarShip(39,-0.1,50),"Khong hop le");
    }

    @Test
    public void test2019(){
        assertEquals(temp.schoolarShip(39,-0.1,99),"Khong hop le");
    }

    @Test
    public void test2020(){
        assertEquals(temp.schoolarShip(39,-0.1,100),"Khong hop le");
    }

    @Test
    public void test2021(){
        assertEquals(temp.schoolarShip(39,-0.1,101),"Khong hop le");
    }

    @Test
    public void test2022(){
        assertEquals(temp.schoolarShip(39,2.0,1),"Khong hoc bong");
    }

    @Test
    public void test2023(){
        assertEquals(temp.schoolarShip(39,2.0,0),"Khong hoc bong");
    }

    @Test
    public void test2024(){
        assertEquals(temp.schoolarShip(39,2.0,-1),"Khong hop le");
    }

    @Test
    public void test2025(){
        assertEquals(temp.schoolarShip(39,2.0,50),"Khong hoc bong");
    }

    @Test
    public void test2026(){
        assertEquals(temp.schoolarShip(39,2.0,99),"Khong hoc bong");
    }

    @Test
    public void test2027(){
        assertEquals(temp.schoolarShip(39,2.0,100),"Khong hoc bong");
    }

    @Test
    public void test2028(){
        assertEquals(temp.schoolarShip(39,2.0,101),"Khong hop le");
    }

    @Test
    public void test2029(){
        assertEquals(temp.schoolarShip(39,3.9,1),"Khong hoc bong");
    }

    @Test
    public void test2030(){
        assertEquals(temp.schoolarShip(39,3.9,0),"Khong hoc bong");
    }

    @Test
    public void test2031(){
        assertEquals(temp.schoolarShip(39,3.9,-1),"Khong hop le");
    }

    @Test
    public void test2032(){
        assertEquals(temp.schoolarShip(39,3.9,50),"Khong hoc bong");
    }

    @Test
    public void test2033(){
        assertEquals(temp.schoolarShip(39,3.9,99),"Xuat sac");
    }

    @Test
    public void test2034(){
        assertEquals(temp.schoolarShip(39,3.9,100),"Xuat sac");
    }

    @Test
    public void test2035(){
        assertEquals(temp.schoolarShip(39,3.9,101),"Khong hop le");
    }

    @Test
    public void test2036(){
        assertEquals(temp.schoolarShip(39,4,1),"Khong hoc bong");
    }

    @Test
    public void test2037(){
        assertEquals(temp.schoolarShip(39,4,0),"Khong hoc bong");
    }

    @Test
    public void test2038(){
        assertEquals(temp.schoolarShip(39,4,-1),"Khong hop le");
    }

    @Test
    public void test2039(){
        assertEquals(temp.schoolarShip(39,4,50),"Khong hoc bong");
    }

    @Test
    public void test2040(){
        assertEquals(temp.schoolarShip(39,4,99),"Xuat sac");
    }

    @Test
    public void test2041(){
        assertEquals(temp.schoolarShip(39,4,100),"Xuat sac");
    }

    @Test
    public void test2042(){
        assertEquals(temp.schoolarShip(39,4,101),"Khong hop le");
    }

    @Test
    public void test2043(){
        assertEquals(temp.schoolarShip(39,4.1,1),"Khong hop le");
    }

    @Test
    public void test2044(){
        assertEquals(temp.schoolarShip(39,4.1,0),"Khong hop le");
    }

    @Test
    public void test2045(){
        assertEquals(temp.schoolarShip(39,4.1,-1),"Khong hop le");
    }

    @Test
    public void test2046(){
        assertEquals(temp.schoolarShip(39,4.1,50),"Khong hop le");
    }

    @Test
    public void test2047(){
        assertEquals(temp.schoolarShip(39,4.1,99),"Khong hop le");
    }

    @Test
    public void test2048(){
        assertEquals(temp.schoolarShip(39,4.1,100),"Khong hop le");
    }

    @Test
    public void test2049(){
        assertEquals(temp.schoolarShip(39,4.1,101),"Khong hop le");
    }

    @Test
    public void test301(){
        assertEquals(temp.schoolarShip(40,0.1,1),"Khong hoc bong");
    }

    @Test
    public void test302(){
        assertEquals(temp.schoolarShip(40,0.1,0),"Khong hoc bong");
    }

    @Test
    public void test303(){
        assertEquals(temp.schoolarShip(40,0.1,-1),"Khong hop le");
    }

    @Test
    public void test304(){
        assertEquals(temp.schoolarShip(40,0.1,50),"Khong hoc bong");
    }

    @Test
    public void test305(){
        assertEquals(temp.schoolarShip(40,0.1,99),"Khong hoc bong");
    }

    @Test
    public void test306(){
        assertEquals(temp.schoolarShip(40,0.1,100),"Khong hoc bong");
    }

    @Test
    public void test307(){
        assertEquals(temp.schoolarShip(40,0.1,101),"Khong hop le");
    }

    @Test
    public void test308(){
        assertEquals(temp.schoolarShip(40,0,1),"Khong hoc bong");
    }

    @Test
    public void test309(){
        assertEquals(temp.schoolarShip(40,0,0),"Khong hoc bong");
    }

    @Test
    public void test3010(){
        assertEquals(temp.schoolarShip(40,0,-1),"Khong hop le");
    }

    @Test
    public void test3011(){
        assertEquals(temp.schoolarShip(40,0,50),"Khong hoc bong");
    }

    @Test
    public void test3012(){
        assertEquals(temp.schoolarShip(40,0,99),"Khong hoc bong");
    }

    @Test
    public void test3013(){
        assertEquals(temp.schoolarShip(40,0,100),"Khong hoc bong");
    }

    @Test
    public void test3014(){
        assertEquals(temp.schoolarShip(40,0,101),"Khong hop le");
    }

    @Test
    public void test3015(){
        assertEquals(temp.schoolarShip(40,-0.1,1),"Khong hop le");
    }

    @Test
    public void test3016(){
        assertEquals(temp.schoolarShip(40,-0.1,0),"Khong hop le");
    }

    @Test
    public void test3017(){
        assertEquals(temp.schoolarShip(40,-0.1,-1),"Khong hop le");
    }

    @Test
    public void test3018(){
        assertEquals(temp.schoolarShip(40,-0.1,50),"Khong hop le");
    }

    @Test
    public void test3019(){
        assertEquals(temp.schoolarShip(40,-0.1,99),"Khong hop le");
    }

    @Test
    public void test3020(){
        assertEquals(temp.schoolarShip(40,-0.1,100),"Khong hop le");
    }

    @Test
    public void test3021(){
        assertEquals(temp.schoolarShip(40,-0.1,101),"Khong hop le");
    }

    @Test
    public void test3022(){
        assertEquals(temp.schoolarShip(40,2.0,1),"Khong hoc bong");
    }

    @Test
    public void test3023(){
        assertEquals(temp.schoolarShip(40,2.0,0),"Khong hoc bong");
    }

    @Test
    public void test3024(){
        assertEquals(temp.schoolarShip(40,2.0,-1),"Khong hop le");
    }

    @Test
    public void test3025(){
        assertEquals(temp.schoolarShip(40,2.0,50),"Khong hoc bong");
    }

    @Test
    public void test3026(){
        assertEquals(temp.schoolarShip(40,2.0,99),"Khong hoc bong");
    }

    @Test
    public void test3027(){
        assertEquals(temp.schoolarShip(40,2.0,100),"Khong hoc bong");
    }

    @Test
    public void test3028(){
        assertEquals(temp.schoolarShip(40,2.0,101),"Khong hop le");
    }

    @Test
    public void test3029(){
        assertEquals(temp.schoolarShip(40,3.9,1),"Khong hoc bong");
    }

    @Test
    public void test3030(){
        assertEquals(temp.schoolarShip(40,3.9,0),"Khong hoc bong");
    }

    @Test
    public void test3031(){
        assertEquals(temp.schoolarShip(40,3.9,-1),"Khong hop le");
    }

    @Test
    public void test3032(){
        assertEquals(temp.schoolarShip(40,3.9,50),"Khong hoc bong");
    }

    @Test
    public void test3033(){
        assertEquals(temp.schoolarShip(40,3.9,99),"Xuat sac");
    }

    @Test
    public void test3034(){
        assertEquals(temp.schoolarShip(40,3.9,100),"Xuat sac");
    }

    @Test
    public void test3035(){
        assertEquals(temp.schoolarShip(40,3.9,101),"Khong hop le");
    }

    @Test
    public void test3036(){
        assertEquals(temp.schoolarShip(40,4,1),"Khong hoc bong");
    }

    @Test
    public void test3037(){
        assertEquals(temp.schoolarShip(40,4,0),"Khong hoc bong");
    }

    @Test
    public void test3038(){
        assertEquals(temp.schoolarShip(40,4,-1),"Khong hop le");
    }

    @Test
    public void test3039(){
        assertEquals(temp.schoolarShip(40,4,50),"Khong hoc bong");
    }

    @Test
    public void test3040(){
        assertEquals(temp.schoolarShip(40,4,99),"Xuat sac");
    }

    @Test
    public void test3041(){
        assertEquals(temp.schoolarShip(40,4,100),"Xuat sac");
    }

    @Test
    public void test3042(){
        assertEquals(temp.schoolarShip(40,4,101),"Khong hop le");
    }

    @Test
    public void test3043(){
        assertEquals(temp.schoolarShip(40,4.1,1),"Khong hop le");
    }

    @Test
    public void test3044(){
        assertEquals(temp.schoolarShip(40,4.1,0),"Khong hop le");
    }

    @Test
    public void test3045(){
        assertEquals(temp.schoolarShip(40,4.1,-1),"Khong hop le");
    }

    @Test
    public void test3046(){
        assertEquals(temp.schoolarShip(40,4.1,50),"Khong hop le");
    }

    @Test
    public void test3047(){
        assertEquals(temp.schoolarShip(40,4.1,99),"Khong hop le");
    }

    @Test
    public void test3048(){
        assertEquals(temp.schoolarShip(40,4.1,100),"Khong hop le");
    }

    @Test
    public void test3049(){
        assertEquals(temp.schoolarShip(40,4.1,101),"Khong hop le");
    }
}
