package com.example.mariffudinhariyansyahuts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val superherolist = listOf<Pahlawan>(
            Pahlawan(
                R.drawable.soekarno,
                namePahlawan = "Ir Soekarno",
                descPahlawan = "Ir. Soekarno atau akrab dipanggil Bung Karno lahir pada 6 Juni 1901 di Surabaya, Jawa Timur dengan nama kecilnya Kusno Sosrodihardjo dan wafat pada 21 Juni 1970 di Jakarta. Bung Karno adalah anak dari pasangan Raden Soekemi Sosrodihardjo dan Ida Ayu Nyoman Rai"
            ),
            Pahlawan(
                R.drawable.hatta,
                namePahlawan = "Drs. H. Mohammad Hatta",
                descPahlawan = "Drs. H. Mohammad Hatta (12 Agustus 1902 – 14 Maret 1980) adalah negarawan dan ekonom Indonesia yang menjabat sebagai Wakil Presiden Indonesia pertama. Ia bersama Soekarno memainkan peranan sentral dalam perjuangan kemerdekaan Indonesia dari penjajahan Belanda sekaligus memproklamirkannya pada 17 Agustus 1945."
            ),
            Pahlawan(
                R.drawable.ahmaddahlan,
                namePahlawan = "KH Ahmad Dahlan",
                descPahlawan = "Kiai Haji Ahmad Dahlan atau Muhammad Darwis  adalah seorang Pahlawan Nasional Indonesia yang merupakan pendiri Muhammadiyah. Dia adalah putra keempat dari tujuh bersaudara dari keluarga K.H. Abu Bakar."
            ),
            Pahlawan(
                R.drawable.cutnyakdien,
                namePahlawan = "Cut Nyak Dhien",
                descPahlawan = "Cut Nyak Dhien (ejaan lama: Tjoet Nja' Dhien, Lampadang, Kerajaan Aceh, 1848 – Sumedang, Jawa Barat, 6 November 1908;[1] dimakamkan di Gunung Puyuh, Sumedang) adalah seorang Pahlawan Nasional Indonesia dari Aceh yang berjuang melawan Belanda pada masa Perang Aceh. Setelah wilayah VI Mukim diserang, ia mengungsi, sementara suaminya Ibrahim Lamnga bertempur melawan Belanda. Tewasnya Ibrahim Lamnga di Gle Tarum pada tanggal 29 Juni 1878 kemudian menyeret Cut Nyak Dhien lebih jauh dalam perlawanannya terhadap Belanda."
            ),
            Pahlawan(
                R.drawable.pangerandiponegoro,
                namePahlawan = "Pangeran Diponegoro",
                descPahlawan = "Pangeran Diponegoro adalah pahlawan nasional yang memperjuangkan kemerdekaan Indonesia. Beliau lahir 11 November 1785 di Yogyakarta, dengan nama asli Raden Mas Ontowiryo. Putra dari Sri Sultan Hamengku Buwono III ini menjadi salah satu pahlawan yang cukup dikenal sebagai pemimpin Perang Diponegoro"
            ),
            Pahlawan(
                R.drawable.sudirman,
                namePahlawan = "Jendral Soedirman",
                descPahlawan = "Jenderal Soedirman memiliki nama asli yakni Raden Soedirman yang lahir pada 24 Januari 1916 di Purbalingga, Provinsi Jawa Tengah. Orang tua Jenderal Soedirman adalah Bapak Karsid Kartawiraji, seorang pekerja pabrik gula di Kalibagor, Banyumas dan Ibu Siyem yang merupakan keturunan Wedana Rembang."
            ),
            Pahlawan(
                R.drawable.patimura,
                namePahlawan = "Pattimura",
                descPahlawan = "Pattimura memiliki asli Thomas Matulessy. Pattimura lahir di Desa Haria, Pulau Saparua, Maluku, 8 Juni 1783. Ayahnya bernama Frans Matulessy dan ibunya bernama Fransina Silahoi. Pattimura merupakan seorang kesatria keturunan Matulessy yang masih ada hubungan saudara dengan raja Maluku."
            ),
            Pahlawan(
                R.drawable.kartini,
                namePahlawan = "Raden Adjeng Kartini",
                descPahlawan = "Raden Adjeng Kartini berasal dari kalangan priyayi atau kelas bangsawan Jawa. Ia merupakan putri dari Raden Mas Adipati Ario Sosroningrat, seorang patih yang diangkat menjadi bupati Jepara segera setelah Kartini lahir. Kartini adalah putri dari istri pertama, tetapi bukan istri utama. Ibunya bernama M.A. Ngasirah, putri dari Nyai Haji Siti Aminah dan Kyai Haji Madirono, seorang guru agama di Telukawur, Jepara. Dari sisi ayahnya, silsilah Kartini dapat dilacak hingga Hamengkubuwana VI"
            ),
            Pahlawan(
                R.drawable.kihajar,
                namePahlawan = "Ki Hadjar Dewantara",
                descPahlawan = "Raden Mas Soewardi Soerjaningrat adalah aktivis pergerakan kemerdekaan Indonesia, kolumnis, politisi, dan pelopor pendidikan bagi kaum pribumi Indonesia dari zaman penjajahan Belanda."
            ),
            Pahlawan(
                R.drawable.tuankuimam,
                namePahlawan = "Tuanku Imam Bonjol",
                descPahlawan = "Tuanku Imam Bonjol adalah salah seorang ulama, pemimpin dan pejuang yang berperang melawan Belanda dalam peperangan yang dikenal dengan nama Perang Padri pada tahun 1803–1838. Tuanku Imam Bonjol diangkat sebagai Pahlawan Nasional"
            ),
            Pahlawan(
                R.drawable.tanmakala,
                namePahlawan = "Tan Malaka",
                descPahlawan = "Tan Malaka atau Ibrahim Gelar Datuk Sutan Malaka adalah seorang pejuang kemerdekaan Indonesia, juga pendiri Partai Murba, dan merupakan salah satu Pahlawan Nasional Indonesia."
            ),
            Pahlawan(
                R.drawable.yamin,
                namePahlawan = "Prof. Mr. Mohamma Yamin",
                descPahlawan = "Prof. Mr. Mohammad Yamin, S.H. adalah sastrawan, sejarawan, budayawan, politikus, dan ahli hukum yang telah dihormati sebagai pahlawan nasional Indonesia."
            ),
            Pahlawan(
                R.drawable.sutomo,
                namePahlawan = "Sutomo",
                descPahlawan = "Sutomo atau lebih dikenal dengan sapaan akrab Bung Tomo adalah pahlawan nasional Indonesia yang terkenal karena peranannya dalam Pertempuran 10 November 1945"
            ),
            Pahlawan(
                R.drawable.cutmutia,
                namePahlawan = "Tjoet Nyak Mutia",
                descPahlawan = "Tjoet Nyak Meutia adalah pahlawan nasional Indonesia dari daerah Aceh. Ia dimakamkan di Alue Kurieng, Aceh. Ia menjadi pahlawan nasional Indonesia berdasarkan Surat Keputusan Presiden Nomor 107/1964 pada tahun 1964"
            ),





        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_food)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = PahlawanAdapter(this,superherolist){
            val intent = Intent ( this, DetailPahlawanActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE,it)
            startActivity(intent)
        }
    }
}