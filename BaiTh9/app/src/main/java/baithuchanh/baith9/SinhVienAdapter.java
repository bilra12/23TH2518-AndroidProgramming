package baithuchanh.baith9;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SinhVienAdapter
        extends RecyclerView.Adapter<SinhVienAdapter.SinhVienViewHolder> {

    private List<SinhVien> danhSachSinhVien;
    private OnItemClickListener listener;

    public interface OnItemClickListener {
        void onItemClick(SinhVien sinhVien);
    }

    public SinhVienAdapter(
            List<SinhVien> danhSachSinhVien,
            OnItemClickListener listener) {

        this.danhSachSinhVien = danhSachSinhVien;
        this.listener = listener;
    }

    @NonNull
    @Override
    public SinhVienViewHolder onCreateViewHolder(
            @NonNull ViewGroup parent,
            int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_sinhvien, parent, false);

        return new SinhVienViewHolder(view);
    }

    @Override
    public void onBindViewHolder(
            @NonNull SinhVienViewHolder holder,
            int position) {

        SinhVien sinhVien = danhSachSinhVien.get(position);

        holder.tvHoTen.setText(sinhVien.getHoTen());
        holder.tvLop.setText("Lớp: " + sinhVien.getLop());
        holder.tvMSSV.setText("MSSV: " + sinhVien.getMssv());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (listener != null) {
                    listener.onItemClick(sinhVien);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return danhSachSinhVien.size();
    }

    public static class SinhVienViewHolder
            extends RecyclerView.ViewHolder {

        TextView tvHoTen;
        TextView tvLop;
        TextView tvMSSV;

        public SinhVienViewHolder(@NonNull View itemView) {
            super(itemView);

            tvHoTen = itemView.findViewById(R.id.tvHoTen);
            tvLop = itemView.findViewById(R.id.tvLop);
            tvMSSV = itemView.findViewById(R.id.tvMSSV);
        }
    }
}
