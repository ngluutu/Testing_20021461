public class SchoolarShip {
    public static String schoolarShip(int credit, double gpa, double drl) {
        String hocbong = "Khong hoc bong";
        if (credit < 0 || credit > 40 || gpa < 0 || gpa > 4 || drl < 0 || drl > 100) {
            return "Khong hop le";
        }
        if (credit >= 15 && gpa >= 3.2 && drl >= 80) {
            if (gpa >= 3.6 && drl >= 90) {
                hocbong = "Xuat sac";
            }
            else hocbong = "Gioi";
        }
        return hocbong;
    }
}
