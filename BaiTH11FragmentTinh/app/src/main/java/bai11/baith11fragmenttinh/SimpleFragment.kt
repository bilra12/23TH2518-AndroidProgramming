package bai11.baith11fragmenttinh

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioGroup
import android.widget.Toast
import androidx.fragment.app.Fragment

class SimpleFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate giao diện cho Fragment
        val view = inflater.inflate(R.layout.fragment_simple, container, false)

        val radioGroup = view.findViewById<RadioGroup>(R.id.radioGroup)

        // Bắt sự kiện chọn RadioButton
        radioGroup.setOnCheckedChangeListener { _, checkedId ->
            when (checkedId) {
                R.id.radioYes -> Toast.makeText(context, "Cảm ơn bạn đã đánh giá Hài lòng!", Toast.LENGTH_SHORT).show()
                R.id.radioNo -> Toast.makeText(context, "Chúng tôi sẽ cải thiện tốt hơn!", Toast.LENGTH_SHORT).show()
            }
        }

        return view
    }

    companion object {
        // Hàm tạo instance mới cho Fragment (Khuyến nghị chuẩn Android)
        fun newInstance(): SimpleFragment {
            return SimpleFragment()
        }
    }
}