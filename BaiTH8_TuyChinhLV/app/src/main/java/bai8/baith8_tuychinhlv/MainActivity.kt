package bai8.baith8_tuychinhlv

import android.os.Bundle
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lvTinhThanh = findViewById<ListView>(R.id.lvTinhThanh)

        // 🟢 Đã liên kết đúng tên file ảnh trong thư mục drawable
        val danhSach = arrayListOf(
            TinhThanh(
                "Hà Nội",
                "Thủ đô của Việt Nam",
                R.drawable.hanoi
            ),
            TinhThanh(
                "Hải Phòng",
                "Thành phố cảng",
                R.drawable.hai_phong
            ),
            TinhThanh(
                "Đà Nẵng",
                "Thành phố biển miền Trung",
                R.drawable.da_nang
            ),
            TinhThanh(
                "Huế",
                "Cố đô của Việt Nam",
                R.drawable.hue
            ),
            TinhThanh(
                "Khánh Hòa",
                "Nổi tiếng với thành phố Nha Trang",
                R.drawable.khanh_hoa
            ),
            TinhThanh(
                "TP. Hồ Chí Minh",
                "Thành phố lớn nhất Việt Nam",
                R.drawable.tphcm
            ),
            TinhThanh(
                "Cần Thơ",
                "Thành phố trung tâm miền Tây",
                R.drawable.can_tho
            )
        )

        val adapter = TinhThanhAdapter(this, danhSach)
        lvTinhThanh.adapter = adapter

        lvTinhThanh.setOnItemClickListener { _, _, position, _ ->
            val tinhThanh = danhSach[position]
            Toast.makeText(this, "Bạn chọn: ${tinhThanh.ten}", Toast.LENGTH_SHORT).show()
        }
    }
}