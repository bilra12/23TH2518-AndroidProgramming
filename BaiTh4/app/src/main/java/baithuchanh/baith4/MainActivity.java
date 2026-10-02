package baithuchanh.baith4;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Khai báo các thành phần giao diện
    EditText edtSo1;
    EditText edtSo2;

    Button btnTinhTong;
    Button btnXoa;

    TextView tvKetQua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Gắn giao diện XML vào Activity
        setContentView(R.layout.activity_main);

        // Ánh xạ các View
        edtSo1 = findViewById(R.id.edtSo1);
        edtSo2 = findViewById(R.id.edtSo2);

        btnTinhTong = findViewById(R.id.btnTinhTong);
        btnXoa = findViewById(R.id.btnXoa);

        tvKetQua = findViewById(R.id.tvKetQua);

        // Xử lý nút TÍNH TỔNG
        btnTinhTong.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                // Lấy dữ liệu từ EditText
                String strSo1 = edtSo1.getText().toString().trim();
                String strSo2 = edtSo2.getText().toString().trim();

                // Kiểm tra dữ liệu nhập
                if (strSo1.isEmpty() || strSo2.isEmpty()) {

                    Toast.makeText(
                            MainActivity.this,
                            "Vui lòng nhập đầy đủ hai số!",
                            Toast.LENGTH_SHORT
                    ).show();

                    return;
                }

                try {

                    // Chuyển String sang kiểu double
                    double so1 = Double.parseDouble(strSo1);
                    double so2 = Double.parseDouble(strSo2);

                    // Tính tổng
                    double tong = so1 + so2;

                    // Hiển thị kết quả
                    tvKetQua.setText("Kết quả: " + tong);

                } catch (NumberFormatException e) {

                    Toast.makeText(
                            MainActivity.this,
                            "Dữ liệu nhập không hợp lệ!",
                            Toast.LENGTH_SHORT
                    ).show();
                }
            }
        });

        // Xử lý nút XÓA
        btnXoa.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                // Xóa dữ liệu
                edtSo1.setText("");
                edtSo2.setText("");

                // Xóa kết quả
                tvKetQua.setText("Kết quả: ");

                // Đưa con trỏ về ô số thứ nhất
                edtSo1.requestFocus();
            }
        });
    }
}