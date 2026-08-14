package bai13.baith13thaydoifragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_first, container, false)

        val btnGoToSecond = view.findViewById<Button>(R.id.btnGoToSecond)

        btnGoToSecond.setOnClickListener {
            // Chuyển sang SecondFragment và truyền dữ liệu
            val secondFragment = SecondFragment.newInstance("Dữ liệu gửi từ Fragment 1")

            parentFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, secondFragment)
                .addToBackStack(null)
                .commit()
        }

        return view
    }
}