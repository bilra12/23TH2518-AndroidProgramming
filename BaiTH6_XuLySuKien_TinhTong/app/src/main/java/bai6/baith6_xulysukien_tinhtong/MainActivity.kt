package bai6.baith6_xulysukien_tinhtong


import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val edtSo1 = findViewById<EditText>(R.id.edtSo1)
        val edtSo2 = findViewById<EditText>(R.id.edtSo2)
        val btnTinhTong = findViewById<Button>(R.id.btnTinhTong)
        val txtKetQua = findViewById<TextView>(R.id.txtKetQua)

        // Xử lý sự kiện khi nhấn nút TÍNH TỔNG
        btnTinhTong.setOnClickListener {

            val so1 = edtSo1.text.toString().toDoubleOrNull()
            val so2 = edtSo2.text.toString().toDoubleOrNull()

            if (so1 != null && so2 != null) {

                val tong = so1 + so2

                txtKetQua.text = "Kết quả: $tong"

            } else {

                txtKetQua.text = "Vui lòng nhập đủ 2 số!"
            }
        }
    }
}