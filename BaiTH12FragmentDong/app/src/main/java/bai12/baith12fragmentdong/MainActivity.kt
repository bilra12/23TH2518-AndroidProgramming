package bai12.baith12fragmentdong

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnFrag1 = findViewById<Button>(R.id.btnFrag1)
        val btnFrag2 = findViewById<Button>(R.id.btnFrag2)

        // Hiển thị sẵn Fragment 1 khi vừa mở ứng dụng
        loadFragment(FirstFragment())

        // Bấm nút 1 -> Load FirstFragment
        btnFrag1.setOnClickListener {
            loadFragment(FirstFragment())
        }

        // Bấm nút 2 -> Load SecondFragment
        btnFrag2.setOnClickListener {
            loadFragment(SecondFragment())
        }
    }

    // Hàm dùng chung để thay thế (replace) Fragment vào khung chứa
    private fun loadFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragmentContainer, fragment)
        // transaction.addToBackStack(null) // Bỏ comment nếu muốn bấm nút Back trên điện thoại để quay lại Fragment trước
        transaction.commit()
    }
}