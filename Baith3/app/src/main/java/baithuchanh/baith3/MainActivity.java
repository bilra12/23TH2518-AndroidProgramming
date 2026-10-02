package baithuchanh.baith3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Khai báo các thành phần giao diện
    EditText edtHoTen, edtLop, edtMSSV;
    Button btnHienThi, btnXoa;
    TextView tvKetQua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Ánh xạ View
        edtHoTen = findViewById(R.id.edtHoTen);
        edtLop = findViewById(R.id.edtLop);
        edtMSSV = findViewById(R.id.edtMSSV);

        btnHienThi = findViewById(R.id.btnHienThi);
        btnXoa = findViewById(R.id.btnXoa);

        tvKetQua = findViewById(R.id.tvKetQua);

        // Xử lý nút HIỂN THỊ
        btnHienThi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String hoTen = edtHoTen.getText().toString().trim();
                String lop = edtLop.getText().toString().trim();
                String mssv = edtMSSV.getText().toString().trim();

                // Kiểm tra dữ liệu
                if (hoTen.isEmpty() || lop.isEmpty() || mssv.isEmpty()) {

                    Toast.makeText(
                            MainActivity.this,
                            "Vui lòng nhập đầy đủ thông tin!",
                            Toast.LENGTH_SHORT
                    ).show();

                    return;
                }

                // Tạo chuỗi kết quả
                String ketQua =
                        "Họ và tên: " + hoTen +
                                "\nLớp: " + lop +
                                "\nMSSV: " + mssv;

                // Hiển thị kết quả
                tvKetQua.setText(ketQua);
            }
        });

        // Xử lý nút XÓA
        btnXoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                edtHoTen.setText("");
                edtLop.setText("");
                edtMSSV.setText("");

                tvKetQua.setText("Thông tin sẽ hiển thị tại đây");

                // Đưa con trỏ về ô họ tên
                edtHoTen.requestFocus();

                Toast.makeText(
                        MainActivity.this,
                        "Đã xóa dữ liệu",
                        Toast.LENGTH_SHORT
                ).show();
            }
        });
    }
}