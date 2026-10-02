package baithuchanh.baith7;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ListView lvSinhVien;
    private TextView tvKetQua;

    private String[] danhSachSinhVien = {
            "Nguyễn Văn An",
            "Trần Thị Bình",
            "Lê Văn Cường",
            "Phạm Thị Dung",
            "Hoàng Văn Em",
            "Đỗ Thị Hoa",
            "Nguyễn Văn Hùng",
            "Trần Văn Nam",
            "Lê Thị Lan",
            "Phạm Văn Minh"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        // Ánh xạ View
        lvSinhVien = findViewById(R.id.lvSinhVien);
        tvKetQua = findViewById(R.id.tvKetQua);

        // Tạo Adapter cho ListView
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                MainActivity.this,
                android.R.layout.simple_list_item_1,
                danhSachSinhVien
        );

        // Gắn Adapter cho ListView
        lvSinhVien.setAdapter(adapter);

        // Xử lý sự kiện khi chọn một phần tử
        lvSinhVien.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {

                    @Override
                    public void onItemClick(
                            AdapterView<?> parent,
                            View view,
                            int position,
                            long id) {

                        String sinhVien = danhSachSinhVien[position];

                        tvKetQua.setText(
                                "Bạn đã chọn: " + sinhVien
                        );

                        Toast.makeText(
                                MainActivity.this,
                                "Bạn chọn: " + sinhVien,
                                Toast.LENGTH_SHORT
                        ).show();
                    }
                }
        );
    }
}