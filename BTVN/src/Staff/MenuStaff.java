package Staff;

public class MenuStaff {
    public static void main(String[] args) {
        // tạo 1 mảng chứa các Staff vs length tương ứng
        ManagerStaff staffManager = new ManagerStaff();

        staffManager.createArrayStaff();

        // lấy ra độ dài mảng StaffArray sau khi tạo
        int staffArrayLength = staffManager.getArrayStaff().length;

        // tạo hết đối tượng trong mảng
        for( int i = 0; i < staffArrayLength; i++) {
            Staff objectStaff = staffManager.createNewStaff();
            staffManager.addStaffInArrayStaff(objectStaff);
        }

        //dùng để hiển thị các object tồn tại trong mảng trc khi xóa
        System.out.println("các staff trước khi xóa ở vị trí index thứ 3: ");
        staffManager.displayAllStaff();

        //xóa Staff tại vị trí nhập vào
        staffManager.deleteStaffbyIndexArray();

        //dùng để hiệu thị các object tồn tại trong mảng sau khi xóa
        System.out.println("các staff sau khi xóa ở vị trí thứu index thứ 3: ");
        staffManager.displayStaffByIndex();

        //hiển thị Staff tại vị trí nhập vaof
        System.out.println("hiển thị Staff theo vị trí index:");
        staffManager.displayStaffByIndex();

        //sửa thông tin của Staff tại vị trí nhập vào
        staffManager.updateStaffByIndex();

        //hiển thị lại sau cập nhập
        System.out.println("hiển thị tất cả Staff: ");
        staffManager.displayAllStaff();
    }
}
