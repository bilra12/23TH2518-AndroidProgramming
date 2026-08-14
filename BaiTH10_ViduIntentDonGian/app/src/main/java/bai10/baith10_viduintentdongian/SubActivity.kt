package bai10.baith10_viduintentdongian

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SubActivity : AppCompatActivity() {

    private lateinit var tvKetQua: TextView
    private lateinit var btnQuayLai: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        // Ánh xạ View
        tvKetQua = findViewById(R.id.tvKetQua)
        btnQuayLai = findViewById(R.id.btnQuayLai)

        // Nhận dữ liệu truyền sang từ Intent
        val receivedData = intent.getStringExtra("dulieu_key")
        if (!receivedData.isNullOrEmpty()) {
            tvKetQua.text = "Dữ liệu nhận được: $receivedData"
        }

        // Xử lý nút quay lại
        btnQuayLai.setOnClickListener {
            finish() // Đóng Activity hiện tại để quay về MainActivity
        }
    }
}