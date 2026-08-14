package bai10.baith10_viduintentdongian

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var edtDuLieu: EditText
    private lateinit var btnGui: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Ánh xạ View
        edtDuLieu = findViewById(R.id.edtDuLieu)
        btnGui = findViewById(R.id.btnGui)

        // Bắt sự kiện click button
        btnGui.setOnClickListener {
            val noiDung = edtDuLieu.text.toString()

            // Tạo Intent chuyển từ MainActivity sang SubActivity
            val intent = Intent(this, SubActivity::class.java).apply {
                putExtra("dulieu_key", noiDung)
            }

            // Mở SubActivity
            startActivity(intent)
        }
    }
}