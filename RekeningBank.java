public class RekeningBank {
    private String noRekening;
    private String namaPemilik;
    private double saldo;

    public static int totalRekening = 0;

    public RekeningBank(String noRekening, String namaPemilik, double saldoAwal) {
        this.noRekening = noRekening;
        this.namaPemilik = namaPemilik;

        if (saldoAwal >= 50000) {
            this.saldo = saldoAwal;
        } else {
            System.out.println("Error: Saldo awal untuk " + namaPemilik + " minimal Rp.50.000!");
            this.saldo = 0;
        }

        totalRekening++;
    }

    public String getNoRekening() {
        return this.noRekening;
    }

    public String getNamaPemilik() {
        return this.namaPemilik;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldoBaru) {
        if (saldoBaru >= 0) {
            this.saldo = saldoBaru;
        } else {
            System.out.println("Error: Saldo tidak boleh negatif!");
        }
    }

    public void transfer(double nominal, RekeningBank tujuan) {
        System.out.println("\n--- Proses Transfer dari " + this.namaPemilik + " ke " + tujuan.getNamaPemilik() + "---");

        if (nominal <= 0) {
            System.out.println("Error: Nominal transfer harus lebih besar dari 0!");
        } else if (nominal > this.saldo) {
            System.out.println("Error: Saldo " + this.namaPemilik + " tidak cukup untuk transfer sebesar Rp " + nominal + " (Saldo: Rp" + this.saldo + ")");
        } else {
            this.saldo -= nominal;
            tujuan.saldo += nominal;
            System.out.println("Transfer berhasil sebesar Rp " + nominal);
        }
    }

}
