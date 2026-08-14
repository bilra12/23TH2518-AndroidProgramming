package bai11.baith11fragmenttinh



import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var btnToggle: Button
    private var isFragmentDisplayed = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnToggle = findViewById(R.id.btnToggle)

        btnToggle.setOnClickListener {
            if (!isFragmentDisplayed) {
                displayFragment()
            } else {
                closeFragment()
            }
        }
    }

    // Hàm hiển thị Fragment
    private fun displayFragment() {
        val simpleFragment = SimpleFragment.newInstance()

        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.fragmentContainer, simpleFragment)
            .addToBackStack(null)
            .commit()

        btnToggle.text = "Đóng Fragment"
        isFragmentDisplayed = true
    }

    // Hàm đóng Fragment
    private fun closeFragment() {
        val simpleFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainer)

        if (simpleFragment != null) {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.remove(simpleFragment).commit()
        }

        btnToggle.text = "Mở Fragment"
        isFragmentDisplayed = false
    }
}