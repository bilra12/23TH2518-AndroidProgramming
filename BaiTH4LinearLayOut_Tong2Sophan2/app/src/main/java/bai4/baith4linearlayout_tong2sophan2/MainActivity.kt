package bai4.baith4linearlayout_tong2sophan2


import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    // Khai báo các View bằng kỹ thuật lateinit trong Kotlin
    private lateinit var edtSoA: EditText
    private lateinit var edtSoB: EditText
    private lateinit var tvKetQua: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // MUST BE FIRST!

        // Sau đó mới tới ánh xạ View:
        edtSoA = findViewById(R.id.edtSoA)
        edtSoB = findViewById(R.id.edtSoB)
        tvKetQua = findViewById(R.id.tvKetQua)
    }

    // =========================================================================
    // HÀM BỌC DÙNG CHUNG: Lấy dữ liệu & Kiểm tra tính hợp lệ
    // Kotlin sử dụng kiểu Pair<Double, Double>? cho phép trả về null nếu có lỗi
    // =========================================================================
    private fun layDuLieuDauVao(): Pair<Double, Double>? {
        val strA = edtSoA.text.toString().trim()
        val strB = edtSoB.text.toString().trim()

        // Kiểm tra người dùng có để trống hay không
        if (strA.isEmpty() || strB.isEmpty()) {
            Toast.makeText(this, "Vui lòng nhập đầy đủ 2 số a và b!", Toast.LENGTH_SHORT).show()
            return null
        }

        // Bắt ngoại lệ chuyển đổi kiểu dữ liệu (ép từ String sang Double)
        return try {
            val a = strA.toDouble()
            val b = strB.toDouble()
            Pair(a, b) // Trả về cặp 2 số nếu hợp lệ
        } catch (e: NumberFormatException) {
            Toast.makeText(this, "Dữ liệu nhập vào không đúng định dạng số!", Toast.LENGTH_SHORT).show()
            null
        }
    }

    // =========================================================================
    // CÁC HÀM XỬ LÝ SỰ KIỆN ONCLICK ĐƯỢC GỌI TỪ FILE XML
    // Lưu ý: Trong Kotlin, bắt buộc phải khai báo tham số (view: View)
    // =========================================================================

    // 1. Xử lý phép Cộng
    fun xuLyCong(view: View) {
        val duLieu = layDuLieuDauVao() ?: return // Nếu dữ liệu bị null thì dừng hàm
        val (a, b) = duLieu
        val ketQua = a + b
        tvKetQua.text = "Kết quả: $a + $b = $ketQua"
    }

    // 2. Xử lý phép Trừ
    fun xuLyTru(view: View) {
        val duLieu = layDuLieuDauVao() ?: return
        val (a, b) = duLieu
        val ketQua = a - b
        tvKetQua.text = "Kết quả: $a - $b = $ketQua"
    }

    // 3. Xử lý phép Nhân
    fun xuLyNhan(view: View) {
        val duLieu = layDuLieuDauVao() ?: return
        val (a, b) = duLieu
        val ketQua = a * b
        tvKetQua.text = "Kết quả: $a * $b = $ketQua"
    }

    // 4. Xử lý phép Chia
    fun xuLyChia(view: View) {
        val duLieu = layDuLieuDauVao() ?: return
        val (a, b) = duLieu

        // Bắt lỗi toán học: Mẫu số b = 0
        if (b == 0.0) {
            Toast.makeText(this, "Số bị chia (b) phải khác 0!", Toast.LENGTH_SHORT).show()
            tvKetQua.text = "Kết quả: Không thể chia cho 0"
            return
        }

        val ketQua = a / b
        tvKetQua.text = "Kết quả: $a / $b = $ketQua"
    }
}