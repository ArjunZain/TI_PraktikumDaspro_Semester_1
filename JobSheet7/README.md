	1. Sebutkan dan tunjukkan masing-masing komponen perulangan FOR pada kode program Percobaan 1!
Inisialisasi: int i = 1

Kondisi: I <= 10

Update: i++
    
	2. Mengapa variabel tertinggi diinisialisasi 0 dan terendah diinisialisasi 100? Apa yang terjadi jika variabel tertinggi diinisialisasi 100 dan terendah diinisialisasi 0?
Variabel tertinggi diinisialisasi dengan nilai 0 dan variabel terendah diinisialisasi dengan nilai 100 karena diasumsikan bahwa rentang nilai mahasiswa yang valid berada antara 0 hingga 100, sehingga setiap nilai yang dimasukkan pasti lebih besar dari 0 dan lebih kecil dari 100. Jika dibalik Program akan selalu menganggap nilai tertinggi sebagai 100 dan nilai terendah sebagai 0. Akibatnya, variabel tertinggi akan tetap bernilai 100 meskipun nilai tertinggi yang sebenarnya lebih rendah. Hal ini tentu menghasilkan output yang tidak sesuai dengan data sebenarnya.

	3. Jelaskan fungsi dan alur kerja dari potongan kode berikut!
if (nilai > tertinggi) {
    tertinggi = nilai;
}
if (nilai < terendah) {
    terendah = nilai;
}
Kode tersebut berfungsi untuk melacak dan memperbarui nilai tertinggi serta nilai terendah dari sekumpulan nilai yang dimasukkan. Ketika sebuah nilai baru diperiksa, program akan membandingkannya dengan nilai tertinggi yang telah dicatat, jika nilai tersebut lebih besar, maka variabel tertinggi diperbarui dan sebaliknya.

	1. Pada potongan kode berikut, tentukan maksud dan kegunaan dari sintaks berikut:
if (nilai < 0 || nilai > 100) {
    System.out.println(x:"Nilai tidak valid. Masukkan lagi nilai yang valid!");
    continue;
}
a. nilai < 0 || nilai > 100 
b. continue
Kondisi nilai < 0 || nilai > 100 digunakan untuk mendeteksi nilai yang tidak valid, yaitu nilai yang bernilai negatif atau lebih dari 100. Jika kondisi tidak valid maka akan menampilkan pesan kesalahan, dan meminta pengguna memasukkan nilai ulang.

	2. Mengapa sintaks i++ dituliskan di akhir perulangan WHILE? Apa yang terjadi jika posisinya dituliskan di awal perulangan WHILE?
Sintaks i++ diletakkan di akhir perulangan agar hanya bertambah setelah nilai dinyatakan valid. Jika nilai tidak valid, continue tidak dieksekusi. Jika i++ diletakkan di awal, pencacah akan bertambah sebelum validasi, akibatnya jumlah mahasiswa yang diproses menjadi kurang.

	3. Apabila jumlah mahasiswa yang dimasukkan adalah 19, berapa kali perulangan WHILE akan berjalan?
Ya, masih berjalan. Dengan kondisi tersebut, perulangan akan berjalan selama nilai i masih kurang dari 19, sehingga total perulangan yang dilakukan adalah 19 kali.

	1. Pada penggunaan DO-WHILE ini, apabila nama pelanggan yang dimasukkan pertama kali adalah "batal", maka berapa kali perulangan dilakukan?
Ketika pengguna langsung memasukkan "batal" maka  perulangan akan langsung dihentikan seketika tanpa melanjutkan pemeriksaan selanjutnya. Akibatnya, perulangan hanya berlangsung satu kali.

	2. Sebutkan kondisi berhenti yang digunakan pada perulangan DO-WHILE tersebut!
Penghentian perulangan dalam program ini bergantung pada perintah break yang dijalankan ketika teredeteksi bahwa masukan nama pelanggan adalah "batal".

	3. Apa fungsi dari penggunaan nilai true pada kondisi DO-WHILE?
Berfungsi untuk membuat perulangan tak terbatas. Tujuannya adalah agar perulangan terus berjalan hingga kondisi penghentian, yaitu Ketika memasukkan kata kunci "batal".

	4. Mengapa perulangan DO-WHILE tersebut tetap berjalan meskipun tidak ada komponen inisialisasi dan update?
Karena perulangan ini tidak dirancang untuk berulang dalam jumlah tertentu, melainkan untuk terus berjalan hingga terdapat perintah penghentian.
