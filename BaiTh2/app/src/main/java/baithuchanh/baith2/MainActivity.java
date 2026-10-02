package baithuchanh.baith2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText edtSo1, edtSo2;
    Button btnTinhTong;
    TextView tvKetQua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Ánh xạ các thành phần giao diện
        edtSo1 = findViewById(R.id.edtSo1);
        edtSo2 = findViewById(R.id.edtSo2);
        btnTinhTong = findViewById(R.id.btnTinhTong);
        tvKetQua = findViewById(R.id.tvKetQua);

        // Xử lý sự kiện khi nhấn nút TÍNH TỔNG
        btnTinhTong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Kiểm tra người dùng đã nhập đủ 2 số chưa
                if (edtSo1.getText().toString().trim().isEmpty()
                        || edtSo2.getText().toString().trim().isEmpty()) {

                    Toast.makeText(
                            MainActivity.this,
                            "Vui lòng nhập đầy đủ 2 số!",
                            Toast.LENGTH_SHORT
                    ).show();

                    return;
                }

                // Lấy dữ liệu từ EditText
                double so1 = Double.parseDouble(
                        edtSo1.getText().toString()
                );

                double so2 = Double.parseDouble(
                        edtSo2.getText().toString()
                );

                // Tính tổng
                double tong = so1 + so2;

                // Hiển thị kết quả
                tvKetQua.setText("Kết quả: " + tong);
            }
        });
    }
}