	1. Jika pada perulangan for, inisialisasi i=1 diubah menjadi i=0, apa akibatnya? Mengapa bisa demikian?
Akibatnya, program akan menampilkan sebanyak n+1. Hal ini terjadi karena pada awalnya variabel i diinisialisasi dengan nilai 1, sehingga perulangan berjalan sebanyak n kali. Namun, ketika inisialisasi diubah menjadi i = 0, maka perulangan dimulai dari 0 hingga n.
	2. Jika pada perulangan for, kondisi i<=n diubah menjadi i<n, bagaimana bentuk outputnya jika input n=5 ? Mengapa hasilnya berbeda?
Bentuk output ketika n=5 adalah empat bintang. Perbedaan hasil ini terjadi karena kondisi perulangannya diubah, setelah kondisi diubah menjadi i < n, perulangan hanya dijalankan untuk nilai i = 1, 2, 3, dan 4. Ketika i mencapai 5, perulangan berhenti. Akibatnya, jumlah perulangan berkurang menjadi empat kali.
	3. Jika pada perulangan for, kondisi i<=n diubah menjadi i>n, apa akibatnya? Mengapa bisa demikian?
Akibatnya, program tidak menampilkan bintang apa pun. Ketika kondisi perulangan diubah menjadi i > n akan membuat langsung bernilai salah pada pengecekan pertama. Akibatnya, perulangan for tidak dijalankan sama sekali.
	4. Jika pada perulangan for, kondisi step i++ diubah menjadi i--, apa akibatnya? Mengapa bisa demikian?
Akibatnya, program akan mengalami perulangan yang tak terbatas. Hal ini terjadi karena perulangan dimulai dari nilai i = 17, sedangkan kondisi yang digunakan adalah i ≤ n. Dengan demikian, operasi i-- membuat nilai i terus berkurang menjadi 1, 0, -1, -2, dan seterusnya. Karena nilai i selalu lebih kecil, maka kondisi i ≤ n akan selalu bernilai benar. Akibatnya, perulangan tidak pernah berhenti.
	5. Jika pada perulangan for, step i++ diubah menjadi i += 2, bagaimana pola outputnya jika input n=6? Apa yang menyebabkan perubahan tersebut?
Pola output ketika n=6 menghasilkan tiga bintang. Hal ini terjadi karena operasi i += 2 membuat nilai bertambah dua. Dengan inisialisasi i = 1 dan kondisi i ≤ 6, perulangan dijalankan untuk nilai i = 1, 3, dan 5. Ketika nilai i bertambah menjadi 7, kondisi 7 ≤ 6 menjadi salah sehingga perulangan berhenti. Akibatnya, perulangan hanya berlangsung sebanyak tiga kali.
	1. Perhatikan perulangan luar. Jika pada sintaks for, inisialisasi iOuter=1 diubah menjadi iOuter=0, apa yang akibatnya? Mengapa bisa demikian?
Akibatnya, program akan mencetak bintang sebanyak n+1 baris. Pada kondisi awal, ketika inisialisasi ditetapkan pada iOuter = 1 dengan syarat iOuter ≤ n, perulangan berjalan sebanyak n kali. Namun, ketika inisialisasi diubah menjadi iOuter = 0, perulangan berlangsung untuk nilai 0, 1, 2, hingga n, sehingga baris bintang yang dicetak juga bertambah satu dari jumlah semula.
	2. Kembalikan program semula dimana inisialisasi iOuter=1. Kemudian perhatikan perulangan dalam. Jika pada sintaks for, inisialisasi i=1 diubah menjadi i=0, apa yang akibatnya? Mengapa bisa demikian?
Akibatnya, pada setiap baris program akan mencetak bintang sebanyak n+1 kolom. Pada kondisi awal, ketika i diinisialisasi dengan nilai 1 akan dijalankan selama i ≤ n, perulangan hanya berlangsung sebanyak n kali. Namun, setelah inisialisasi diubah menjadi i = 0, perulangan berlangsung untuk nilai 0 hingga n, sehingga pada setiap baris program mencetak satu bintang lebih banyak dibanding kondisi semula.
	3. Apakah perbedaan kegunaan antara perulangan luar dengan perulangan yang berada di dalamnya?
Perulangan Luar
Berfungsi untuk mengatur jumlah perulangan keseluruhan atau menentukan berapa kali perulangan dalam akan dijalankan.
Perulangan Dalam
Berfungsi untuk mengatur tugas yang diulang pada setiap iterasi perulangan luar.
	4. Mengapa perlu ditambahkan sintaks System.out.println(); di bawah perulangan dalam? Apa akibatnya jika sintaks tersebut dihilangkan?
Untuk mencetak bintang tanpa pindah baris, setelah satu baris selesai, System.out.println(); digunakan untuk berpindah ke baris berikutnya agar pola persegi dapat terbentuk.
	1. Perhatikan, apakah output yang dihasilkan dengan nilai n=5 sesuai dengan tampilan berikut?
Tidak sesuai
	2. Jika tidak sesuai, bagian mana saja yang harus diperbaiki/ditambahkan? Jelaskan setiap bagian yang perlu diperbaiki/ditambahkan.
Perlu ditambahkan System.out.println(); setelah inner loop agar pindah ke baris baru setiap kali satu baris bintang selesai dicetak. Selain itu perulangan sebaiknya dimulai dari i = 1 hingga i = n, atau kondisi diubah menjadi i < n.
	4. Jelaskan peran masing-masing variabel i dan j dalam program ini. Mengapa j di-set ulang ke 0 di awal setiap iterasi outer loop? Apa yang akan terjadi jika j tidak di-reset?
Dalam program tersebut, variabel i mengatur jumlah baris dan menentukan banyaknya bintang pada tiap baris, sedangkan variabel j digunakan untuk menghitung jumlah bintang yang dicetak mendatar. Variabel j harus di-reset ke 0 pada setiap perulangan luar agar pencetakan bintang di setiap baris dimulai dari awal. Jika j tidak di-reset, nilainya akan terus bertambah sehingga perulangan dalam hanya berjalan satu kali di tiap baris. Akibatnya, pola segitiga tidak terbentuk.
	1. Jelaskan apa yang terjadi pada variabel totalNilai di setiap iterasi outer loop dan mengapa inisialisasinya (total = 0) berada di dalam outer loop, bukan di luar.
Variabel totalNilai digunakan untuk menjumlahkan lima nilai pada setiap kelompok. Pada awal setiap outer loop, variabel ini di-reset menjadi 0 agar perhitungan dimulai dari awal. Selama inner loop, setiap nilai ditambahkan ke totalNilai dan setelah terkumpul, rata-rata kelompok akan dihitung dan ditampilkan. Inisialisasi totalNilai = 0 harus berada di dalam outer loop karena setiap kelompok membutuhkan perhitungan yang terpisah.

