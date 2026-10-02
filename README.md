# Sistem Informasi Rekening Bank (Java OOP)

Repository ini berisi tugas praktikum Pemrograman Berbasis Objek (PBO) yang mengimplementasikan konsep **Enkapsulasi (Data Hiding)** dan **Static Keyword** dalam bahasa pemrogramaan Java.

---

## Fitur Utama

- **Enkapsulasi & Data Hiding**: Menjaga integritas data akun (`noRekening`, `namaPemilik`, `saldo`) dengan modifier `private` dan pengaksesan melalui *getter/setter*.
- **Validasi Saldo Awal**: Mencegah pembuatan rekening dengan saldo awal di bawah batas minimal (Rp 50.000).
- **Validasi Transaksi Transfer**:
  - Mencegah transfer dengan nominal negatif atau `0`.
  - Mencegah transfer jika saldo pengirim tidak mencukupi (overdraft protection).
- **Static Counter**: Menghitung jumlah total rekening yang telah terdaftar secara real-time menggunakan `static variable`.

---

## Struktur Class

### 1. `RekeningBank.java`
Bertindak sebagai *blueprint* / Class data utama:
- **Atribut Private**: `noRekening`, `namaPemilik`, `saldo`
- **Static Attribute**: `public static int totalRekening`
- **Method Bisnis**: `transfer(double nominal, RekeningBank tujuan)`
- **Getter & Setter**: Terkontrol dengan mekanisme validasi.

### 2. `MainBank.java`
Bertindak sebagai *runner class* untuk menguji skenario transaksi:
- Inisialisasi beberapa objek `RekeningBank`.
- Pengujian validasi transfer saat saldo tidak mencukupi.
- Pengujian transfer yang berhasil antar-rekening.
- Menampilkan total statistik rekening yang terdaftar.

---

## Contoh Output Terminal

```text
=== Sistem Informasi Rekening Bank ===

Saldo Awal Diki: Rp 500000.0
Saldo Awal Hamam: Rp 200000.0

--- Proses Transfer dari Diki ke Hamam ---
Error: Saldo Diki tidak cukup untuk transfer sebesar Rp 1000000.0 (Saldo: Rp 500000.0)

--- Proses Transfer dari Diki ke Hamam ---
Transfer berhasil sebesar Rp 150000.0

-- Saldo Akhir --
Saldo Diki: Rp 350000.0
Saldo Hamam: Rp 350000.0

Total Rekening Terdaftar: 2
