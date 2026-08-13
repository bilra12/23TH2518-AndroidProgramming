package bai4.BaiTH4linearlayout_tong2sophan1

import bai4.BaiTH4linearlayout_tong2sophan1.R
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Ánh xạ các View
        val edtA = findViewById<EditText>(R.id.edtA)
        val edtB = findViewById<EditText>(R.id.edtB)
        val edtKetQua = findViewById<EditText>(R.id.edtKetQua)

        val btnCong = findViewById<Button>(R.id.btnCong)
        val btnTru = findViewById<Button>(R.id.btnTru)
        val btnNhan = findViewById<Button>(R.id.btnNhan)
        val btnChia = findViewById<Button>(R.id.btnChia)

        // Hàm hỗ trợ lấy dữ liệu và kiểm tra hợp lệ
        fun layGiaTri(): Pair<Double, Double>? {
            val a = edtA.text.toString().toDoubleOrNull()
            val b = edtB.text.toString().toDoubleOrNull()

            if (a == null || b == null) {
                edtKetQua.setText("Vui lòng nhập đủ 2 số a và b!")
                return null
            }
            return Pair(a, b)
        }

        // Xử lý Phép Cộng (+)
        btnCong.setOnClickListener {
            layGiaTri()?.let { (a, b) ->
                edtKetQua.setText("Kết quả: ${a + b}")
            }
        }

        // Xử lý Phép Trừ (-)
        btnTru.setOnClickListener {
            layGiaTri()?.let { (a, b) ->
                edtKetQua.setText("Kết quả: ${a - b}")
            }
        }

        // Xử lý Phép Nhân (*)
        btnNhan.setOnClickListener {
            layGiaTri()?.let { (a, b) ->
                edtKetQua.setText("Kết quả: ${a * b}")
            }
        }

        // Xử lý Phép Chia (/)
        btnChia.setOnClickListener {
            layGiaTri()?.let { (a, b) ->
                if (b == 0.0) {
                    edtKetQua.setText("Lỗi: Không thể chia cho 0!")
                } else {
                    edtKetQua.setText("Kết quả: ${a / b}")
                }
            }
        }
    }
}