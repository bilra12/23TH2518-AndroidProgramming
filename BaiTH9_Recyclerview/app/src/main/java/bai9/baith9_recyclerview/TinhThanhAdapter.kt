package bai9.baith9_recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class TinhThanhAdapter(
    private val context: Context,
    private val danhSach: ArrayList<TinhThanh>
) : RecyclerView.Adapter<TinhThanhAdapter.TinhThanhViewHolder>() {

    // Inner class ViewHolder đóng vai trò ánh xá View & bắt sự kiện OnClick
    inner class TinhThanhViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener {
        val imgTinhThanh: ImageView = itemView.findViewById(R.id.imgTinhThanh)
        val txtTenTinh: TextView = itemView.findViewById(R.id.txtTenTinh)
        val txtMoTa: TextView = itemView.findViewById(R.id.txtMoTa)

        init {
            itemView.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
            val position = adapterPosition
            if (position != RecyclerView.NO_POSITION) {
                val tinhThanh = danhSach[position]
                Toast.makeText(
                    context,
                    "Bạn chọn: ${tinhThanh.ten}",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TinhThanhViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_tinh_thanh, parent, false)
        return TinhThanhViewHolder(view)
    }

    override fun onBindViewHolder(holder: TinhThanhViewHolder, position: Int) {
        val tinhThanh = danhSach[position]
        holder.txtTenTinh.text = tinhThanh.ten
        holder.txtMoTa.text = tinhThanh.moTa
        holder.imgTinhThanh.setImageResource(tinhThanh.hinhAnh)
    }

    override fun getItemCount(): Int {
        return danhSach.size
    }
}