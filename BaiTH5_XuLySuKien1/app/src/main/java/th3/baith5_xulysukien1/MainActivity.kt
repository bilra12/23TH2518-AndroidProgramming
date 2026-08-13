package th3.baith5_xulysukien1

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    // Khai báo các điều khiển (Views)
    private lateinit var edtA: EditText
    private lateinit var edtB: EditText
    private lateinit var btnCong: Button
    private lateinit var btnTru: Button
    private lateinit var btnNhan: Button
    private lateinit var btnChia: Button
    private lateinit var tvKetQua: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide() // Ẩn thanh tiêu đề đen nếu có
        setContentView(R.layout.activity_main)

        // 1. Ánh xạ View
        edtA = findViewById(R.id.edtA)
        edtB = findViewById(R.id.edtB)
        btnCong = findViewById(R.id.btnCong)
        btnTru = findViewById(R.id.btnTru)
        btnNhan = findViewById(R.id.btnNhan)
        btnChia = findViewById(R.id.btnChia)
        tvKetQua = findViewById(R.id.tvKetQua)

        // 2. Gán sự kiện sử dụng BỘ LẮNG NGHE SỰ KIỆN ẨN DANH (Anonymous Listener)

        // Phép CỘNG
        btnCong.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                xuLyPhepToan('+')
            }
        })

        // Phép TRỪ
        btnTru.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                xuLyPhepToan('-')
            }
        })

        // Phép NHÂN
        btnNhan.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                xuLyPhepToan('*')
            }
        })

        // Phép CHIA
        btnChia.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                xuLyPhepToan('/')
            }
        })
    }

    // Hàm xử lý chung tính toán để code gọn gàng
    private fun xuLyPhepToan(pt: Char) {
        val strA = edtA.text.toString().trim()
        val strB = edtB.text.toString().trim()

        if (strA.isEmpty() || strB.isEmpty()) {
            Toast.makeText(this, "Vui lòng nhập đủ 2 số!", Toast.LENGTH_SHORT).show()
            return
        }

        val a = strA.toDouble()
        val b = strB.toDouble()
        var kq = 0.0

        when (pt) {
            '+' -> kq = a + b
            '-' -> kq = a - b
            '*' -> kq = a * b
            '/' -> {
                if (b == 0.0) {
                    Toast.makeText(this, "Số chia phải khác 0!", Toast.LENGTH_SHORT).show()
                    return
                }
                kq = a / b
            }
        }

        tvKetQua.text = "Kết quả: $kq"
    }
}