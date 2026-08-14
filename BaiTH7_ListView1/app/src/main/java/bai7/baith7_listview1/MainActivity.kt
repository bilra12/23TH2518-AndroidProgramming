package bai7.baith7_listview1



import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val lvTinhThanh = findViewById<ListView>(R.id.lvTinhThanh)

        val danhSachTinhThanh = arrayOf(
            "Hà Nội",
            "Hải Phòng",
            "Quảng Ninh",
            "Thái Nguyên",
            "Phú Thọ",
            "Bắc Ninh",
            "Hưng Yên",
            "Ninh Bình",
            "Thanh Hóa",
            "Nghệ An",
            "Hà Tĩnh",
            "Quảng Trị",
            "Huế",
            "Đà Nẵng",
            "Quảng Ngãi",
            "Gia Lai",
            "Khánh Hòa",
            "Đắk Lắk",
            "Lâm Đồng",
            "Đồng Nai",
            "Tây Ninh",
            "Thành phố Hồ Chí Minh",
            "Đồng Tháp",
            "Vĩnh Long",
            "Cần Thơ",
            "An Giang",
            "Cà Mau"
        )

        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            danhSachTinhThanh
        )

        lvTinhThanh.adapter = adapter

        lvTinhThanh.setOnItemClickListener { _, _, position, _ ->

            val tinhThanh = danhSachTinhThanh[position]

            Toast.makeText(
                this,
                "Bạn chọn: $tinhThanh",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}