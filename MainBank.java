public class MainBank {
    public static void main(String[] args) {
        System.out.println("=== Sistem Informasi Rekening Bank ===");

        RekeningBank rek1 = new RekeningBank("12345", "Diki", 500000);
        RekeningBank rek2 = new RekeningBank("67890", "Hamam", 200000);

        System.out.println("\nSaldo Awal " + rek1.getNamaPemilik() + ": Rp" + rek1.getSaldo());
        System.out.println("Saldo Awal" + rek2.getNamaPemilik() + ": Rp" + rek2.getSaldo());

        rek1.transfer(1000000, rek2);

        rek1.transfer(150000, rek2);

        System.out.println("\n-- Saldo Akhir ---");
        System.out.println("Saldo " + rek1.getNamaPemilik() + ": Rp" + rek1.getSaldo());
        System.out.println("Saldo" + rek2.getNamaPemilik() + ": Rp" + rek2.getSaldo());

        System.out.println("\nTotal Rekening Terdaftar: " + RekeningBank.totalRekening);
    }
}
