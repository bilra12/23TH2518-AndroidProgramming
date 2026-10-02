package baithuchanh.baith5;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText edtSo1;
    private EditText edtSo2;

    private Button btnTinhTong;
    private Button btnXoa;

    private TextView tvKetQua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Gắn giao diện activity_main.xml
        setContentView(R.layout.activity_main);

        // Ánh xạ các thành phần giao diện
        edtSo1 = findViewById(R.id.edtSo1);
        edtSo2 = findViewById(R.id.edtSo2);

        btnTinhTong = findViewById(R.id.btnTinhTong);
        btnXoa = findViewById(R.id.btnXoa);

        tvKetQua = findViewById(R.id.tvKetQua);

        // Xử lý sự kiện click nút TÍNH TỔNG
        btnTinhTong.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String soThuNhat = edtSo1.getText().toString().trim();
                String soThuHai = edtSo2.getText().toString().trim();

                // Kiểm tra dữ liệu
                if (soThuNhat.isEmpty()) {

                    Toast.makeText(
                            MainActivity.this,
                            "Vui lòng nhập số thứ nhất!",
                            Toast.LENGTH_SHORT
                    ).show();

                    edtSo1.requestFocus();
                    return;
                }

                if (soThuHai.isEmpty()) {

                    Toast.makeText(
                            MainActivity.this,
                            "Vui lòng nhập số thứ hai!",
                            Toast.LENGTH_SHORT
                    ).show();

                    edtSo2.requestFocus();
                    return;
                }

                try {

                    // Chuyển dữ liệu sang số
                    double so1 = Double.parseDouble(soThuNhat);
                    double so2 = Double.parseDouble(soThuHai);

                    // Tính tổng
                    double tong = so1 + so2;

                    // Hiển thị kết quả
                    tvKetQua.setText("Kết quả: " + tong);

                } catch (NumberFormatException e) {

                    Toast.makeText(
                            MainActivity.this,
                            "Số nhập vào không hợp lệ!",
                            Toast.LENGTH_SHORT
                    ).show();
                }
            }
        });

        // Xử lý sự kiện click nút XÓA
        btnXoa.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                edtSo1.setText("");
                edtSo2.setText("");

                tvKetQua.setText("Kết quả:");

                edtSo1.requestFocus();
            }
        });
    }
}