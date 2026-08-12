package tinhtong.baith2_1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {

    private lateinit var edtSo1: EditText
    private lateinit var edtSo2: EditText
    private lateinit var btnTinhTong: Button
    private lateinit var txtKetQua: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Kết nối giao diện XML
        setContentView(R.layout.activity_main)

        // Ánh xạ các thành phần giao diện
        edtSo1 = findViewById(R.id.edtSo1)
        edtSo2 = findViewById(R.id.edtSo2)
        btnTinhTong = findViewById(R.id.btnTinhTong)
        txtKetQua = findViewById(R.id.txtKetQua)

        // Xử lý nút TÍNH TỔNG
        btnTinhTong.setOnClickListener {

            val a = edtSo1.text.toString().toDoubleOrNull()
            val b = edtSo2.text.toString().toDoubleOrNull()

            if (a != null && b != null) {

                val tong = a + b

                txtKetQua.text = "Kết quả: $tong"

            } else {

                txtKetQua.text = "Vui lòng nhập đúng 2 số!"
            }
        }
    }
}