package bai8.baith8_tuychinhlv

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class TinhThanhAdapter(
    private val context: Context,
    private val danhSach: ArrayList<TinhThanh>
) : BaseAdapter() {

    // 🟢 Dùng ViewHolder để tối ưu bộ nhớ khi lướt danh sách
    private class ViewHolder(view: View) {
        val imgTinhThanh: ImageView = view.findViewById(R.id.imgTinhThanh)
        val txtTenTinh: TextView = view.findViewById(R.id.txtTenTinh)
        val txtMoTa: TextView = view.findViewById(R.id.txtMoTa)
    }

    override fun getCount(): Int = danhSach.size

    override fun getItem(position: Int): TinhThanh = danhSach[position]

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View
        val holder: ViewHolder

        if (convertView == null) {
            view = LayoutInflater.from(context).inflate(R.layout.item_tinh_thanh, parent, false)
            holder = ViewHolder(view)
            view.tag = holder
        } else {
            view = convertView
            holder = view.tag as ViewHolder
        }

        val tinhThanh = getItem(position)

        // 🟢 Nạp hình ảnh trực tiếp từ drawable
        holder.imgTinhThanh.setImageResource(tinhThanh.hinhAnh)
        holder.txtTenTinh.text = tinhThanh.ten
        holder.txtMoTa.text = tinhThanh.moTa

        return view
    }
}