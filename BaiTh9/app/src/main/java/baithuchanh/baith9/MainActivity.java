package baithuchanh.baith9;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerViewSinhVien;
    private TextView tvKetQua;

    private List<SinhVien> danhSachSinhVien;

    private SinhVienAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        // Ánh xạ View
        recyclerViewSinhVien =
                findViewById(R.id.recyclerViewSinhVien);

        tvKetQua =
                findViewById(R.id.tvKetQua);

        // Tạo danh sách sinh viên
        danhSachSinhVien = new ArrayList<>();

        danhSachSinhVien.add(
                new SinhVien(
                        "Nguyễn Văn An",
                        "CNTT01",
                        "SV001"
                )
        );

        danhSachSinhVien.add(
                new SinhVien(
                        "Trần Thị Bình",
                        "CNTT01",
                        "SV002"
                )
        );

        danhSachSinhVien.add(
                new SinhVien(
                        "Lê Văn Cường",
                        "CNTT02",
                        "SV003"
                )
        );

        danhSachSinhVien.add(
                new SinhVien(
                        "Phạm Thị Dung",
                        "CNTT02",
                        "SV004"
                )
        );

        danhSachSinhVien.add(
                new SinhVien(
                        "Hoàng Văn Em",
                        "CNTT03",
                        "SV005"
                )
        );

        danhSachSinhVien.add(
                new SinhVien(
                        "Đỗ Thị Hoa",
                        "CNTT03",
                        "SV006"
                )
        );

        danhSachSinhVien.add(
                new SinhVien(
                        "Nguyễn Văn Hùng",
                        "CNTT04",
                        "SV007"
                )
        );

        danhSachSinhVien.add(
                new SinhVien(
                        "Trần Văn Nam",
                        "CNTT04",
                        "SV008"
                )
        );

        // Thiết lập LayoutManager
        LinearLayoutManager layoutManager =
                new LinearLayoutManager(this);

        recyclerViewSinhVien.setLayoutManager(layoutManager);

        // Tạo Adapter
        adapter = new SinhVienAdapter(
                danhSachSinhVien,
                new SinhVienAdapter.OnItemClickListener() {

                    @Override
                    public void onItemClick(SinhVien sinhVien) {

                        String thongTin =
                                "Họ tên: " + sinhVien.getHoTen()
                                        + "\nLớp: " + sinhVien.getLop()
                                        + "\nMSSV: " + sinhVien.getMssv();

                        tvKetQua.setText(thongTin);

                        Toast.makeText(
                                MainActivity.this,
                                "Đã chọn: " + sinhVien.getHoTen(),
                                Toast.LENGTH_SHORT
                        ).show();
                    }
                }
        );

        // Gắn Adapter
        recyclerViewSinhVien.setAdapter(adapter);
    }
}