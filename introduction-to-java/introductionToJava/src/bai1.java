import java.util.Scanner ;

public class bai1 {
    public static void main(String[] args) {
        // khai báo 1 đối tượng Scanner tên là sc vs đầu vào là system.in
        Scanner Sc = new Scanner(System.in);
        // khai báo đầu ra bằng câu lệnh 'system.out.prinrln'
        System.out.println("Enter your name");
        // khai báo đầu vào đối tượng String có tên là mame
        String name = Sc.nextLine();
        System.out.println("Hello: " + name );
    }
}

