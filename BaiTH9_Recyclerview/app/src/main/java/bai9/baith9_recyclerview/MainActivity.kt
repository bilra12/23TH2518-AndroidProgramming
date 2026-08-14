package bai9.baith9_recyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rvTinhThanh = findViewById<RecyclerView>(R.id.rvTinhThanh)

        val danhSach = arrayListOf(
            TinhThanh("Hà Nội", "Thủ đô của Việt Nam", R.drawable.hanoi),
            TinhThanh("Hải Phòng", "Thành phố cảng", R.drawable.hai_phong),
            TinhThanh("Đà Nẵng", "Thành phố biển miền Trung", R.drawable.da_nang),
            TinhThanh("Huế", "Cố đô của Việt Nam", R.drawable.hue),
            TinhThanh("Khánh Hòa", "Nổi tiếng với thành phố Nha Trang", R.drawable.khanh_hoa),
            TinhThanh("TP. Hồ Chí Minh", "Thành phố lớn nhất Việt Nam", R.drawable.tphcm),
            TinhThanh("Cần Thơ", "Thành phố trung tâm miền Tây", R.drawable.can_tho)
        )

        // Thiết lập Adapter
        val adapter = TinhThanhAdapter(this, danhSach)
        rvTinhThanh.adapter = adapter

        // Cấu hình Bố cục hiển thị (dạng danh sách dọc)
        rvTinhThanh.layoutManager = LinearLayoutManager(this)

        /* Mẹo bổ sung (Nâng cao): Nếu muốn hiển thị dạng lưới 2 cột như trong clip 2:
           rvTinhThanh.layoutManager = GridLayoutManager(this, 2)
        */
    }
}