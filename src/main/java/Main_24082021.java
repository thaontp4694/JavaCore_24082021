public class Main_24082021 {
    public static void main(String[] args) {
        PhanSo ps1 = new PhanSo(4, 9);
        PhanSo ps2 = new PhanSo(1, 3);
        System.out.print("Phân số A: ");
        ps1.print();
        System.out.format("\nPhân số B: ");
        ps2.print();
        System.out.format("\n----------");

        System.out.print("\nHai phân số sau rút gọn: ");
        System.out.println();
        ps1.rutGonPhanSo().print();
        System.out.println();
        ps2.rutGonPhanSo().print();
        System.out.format("\n----------");

        System.out.print("\nTổng hai phân số: ");
        PhanSo psCong = ps1.congPhanSo(ps2).rutGonPhanSo();
        psCong.print();

        System.out.print("\nHiệu hai phân số:  ");
        PhanSo psHieu = ps1.truPhanSo(ps2).rutGonPhanSo();
        psHieu.print();

        System.out.print("\nTích hai phân số:  ");
        PhanSo psTich = ps1.nhanPhanSo(ps2);
        psTich.print();

        System.out.print("\nThương hai phân số:  ");
        PhanSo psThuong = ps1.chiaPhanSo(ps2).rutGonPhanSo();
        psThuong.print();
        System.out.format("\n----------");

        if (ps1.kiemTraPSToiGian()) {
            System.out.println();
            ps1.print();
            System.out.print(" là phân số đã tối giản");
        } else {
            System.out.println();
            ps1.print();
            System.out.format(" là phân số chưa tối giản");
        }
        if (ps2.kiemTraPSToiGian()) {
            System.out.println();
            ps2.print();
            System.out.print(" là phân số đã tối giản");
        } else {
            System.out.println();
            ps2.print();
            System.out.print(" là phân số chưa tối giản");
        }
        System.out.format("\n----------");


        if (ps1.kiemTraPhanSoAm()) {
            System.out.println();
            ps1.print();
            System.out.print(" là phân số ÂM");
        } else {
            System.out.println();
            ps1.print();
            System.out.print(" là phân số DƯƠNG");
        }
        if (ps2.kiemTraPhanSoAm()) {
            System.out.println();
            ps2.print();
            System.out.print(" là phân số ÂM");
        } else {
            System.out.println();
            ps2.print();
            System.out.print(" là phân số DƯƠNG");
        }
        System.out.format("\n----------\n");
        ps1.isBigger(ps2);
    }
}
