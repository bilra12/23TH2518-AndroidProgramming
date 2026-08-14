package bai13.baith13thaydoifragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment

class SecondFragment : Fragment() {

    private var messageData: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Lấy dữ liệu được truyền sang từ arguments
        arguments?.let {
            messageData = it.getString(ARG_MESSAGE)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_second, container, false)

        val tvReceivedData = view.findViewById<TextView>(R.id.tvReceivedData)
        val btnBack = view.findViewById<Button>(R.id.btnBack)

        // Hiển thị dữ liệu
        tvReceivedData.text = messageData ?: "Không có dữ liệu"

        // Nút Quay lại (Pop Fragment khỏi BackStack)
        btnBack.setOnClickListener {
            parentFragmentManager.popBackStack()
        }

        return view
    }

    companion object {
        private const val ARG_MESSAGE = "arg_message"

        // Hàm hỗ trợ khởi tạo Fragment kèm dữ liệu truyền vào
        fun newInstance(message: String): SecondFragment {
            val fragment = SecondFragment()
            val args = Bundle().apply {
                putString(ARG_MESSAGE, message)
            }
            fragment.arguments = args
            return fragment
        }
    }
}