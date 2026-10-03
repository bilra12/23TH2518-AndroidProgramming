
# BaiTH1: HelloWorld Android

## 1. Mục tiêu
Tạo ứng dụng Android đơn giản hiển thị dòng chữ "Hello World" 
và chạy ứng dụng trên máy ảo Android Emulator.

## 2. Công cụ
- Android Studio
- Java
- Android Emulator

## 3. Thực hiện
1. Tạo Project mới với mẫu Empty Views Activity.
2. Chọn ngôn ngữ Java.
3. Thiết kế giao diện bằng `activity_main.xml`.
4. Hiển thị dòng chữ `Hello World` bằng TextView.
5. Tạo máy ảo trong Device Manager.
6. Chạy ứng dụng bằng nút Run.

## 4. Kết quả
Ứng dụng chạy thành công trên máy ảo và hiển thị:

`Hello World`

## 5. Hình ảnh
<img width="356" height="757" alt="image" src="https://github.com/user-attachments/assets/bad90888-6f7a-4443-ab85-4d1365eceadc" />

# BaiTH2_1: Thiết kế giao diện cho Ứng dụng tính tổng 2 số

## 1. Mục tiêu
- Thiết kế giao diện Android cho ứng dụng tính tổng 2 số.
- Cho phép người dùng nhập vào 2 số.
- Tạo nút thực hiện phép tính.
- Hiển thị kết quả trên màn hình.

## 2. Giao diện
Giao diện gồm:
- Tiêu đề: `TÍNH TỔNG 2 SỐ`
- Ô nhập số thứ nhất.
- Ô nhập số thứ hai.
- Nút `TÍNH TỔNG`.
- Ô hiển thị kết quả.

## 3. Kết quả
Đã thiết kế hoàn chỉnh giao diện ứng dụng tính tổng 2 số.

---

# BaiTH2_2: Hoàn thiện Ứng dụng tính tổng 2 số

## 1. Mục tiêu
- Hoàn thiện chức năng tính tổng 2 số.
- Nhận dữ liệu từ hai ô nhập.
- Thực hiện phép cộng.
- Hiển thị kết quả cho người dùng.

## 2. Chức năng
Người dùng nhập:
- Số thứ nhất: `10`
- Số thứ hai: `20`

Sau khi nhấn nút `TÍNH TỔNG`, ứng dụng thực hiện:

`10 + 20 = 30`

Kết quả hiển thị:

`Tổng = 30`

## 3. Xử lý chương trình
- Nhận giá trị từ EditText.
- Chuyển dữ liệu từ String sang số.
- Thực hiện phép cộng.
- Hiển thị kết quả bằng TextView.

## 4. Kết quả
Ứng dụng tính tổng 2 số hoạt động thành công trên Android Emulator.

## 5. Hình ảnh
<img width="400" height="746" alt="Screenshot 2026-10-02 233555" src="https://github.com/user-attachments/assets/d7de96ed-af97-460e-95a6-3bbbad5b0457" />

# BaiTH3_LinearLayOut01

## 1. Mục tiêu

- Làm quen với LinearLayout trong Android.
- Biết cách bố trí các View theo chiều dọc.
- Biết cách bố trí các View theo chiều ngang.
- Sử dụng `layout_weight` để chia đều không gian.
- Xử lý sự kiện Button bằng Java.
- Nhận dữ liệu từ EditText và hiển thị lên TextView.

---

## 2. Công cụ sử dụng

- Android Studio
- Java
- XML
- Android Emulator

---

## 3. Thành phần giao diện

Ứng dụng gồm:

- TextView hiển thị tiêu đề.
- EditText nhập họ và tên.
- EditText nhập lớp.
- EditText nhập mã số sinh viên.
- Button HIỂN THỊ.
- Button XÓA.
- TextView hiển thị kết quả.

---

## 4. LinearLayout theo chiều dọc

LinearLayout chính sử dụng:

```xml
android:orientation="vertical"

```

## 5. Hình
<img width="526" height="776" alt="image" src="https://github.com/user-attachments/assets/b6b09fe1-924e-4084-b408-3286c0363846" />

# BaiTH4: LinearLayOut_Tong2So

## 1. Tên bài

**BaiTH4: LinearLayOut_Tong2So**

Bài thực hành gồm:

- Phần 1: Thiết kế giao diện tính tổng 2 số.
- Phần 2: Lập trình chức năng tính tổng 2 số.

---

## 2. Mục tiêu

- Làm quen với `LinearLayout`.
- Sử dụng LinearLayout theo chiều dọc.
- Sử dụng LinearLayout theo chiều ngang.
- Sử dụng LinearLayout lồng nhau.
- Sử dụng `layout_weight`.
- Nhận dữ liệu từ `EditText`.
- Xử lý sự kiện `Button`.
- Thực hiện phép cộng hai số.
- Hiển thị kết quả bằng `TextView`.

---

# Phần 1: Thiết kế giao diện

## 3. Các thành phần giao diện

Ứng dụng gồm:

- TextView hiển thị tiêu đề.
- TextView và EditText nhập số thứ nhất.
- TextView và EditText nhập số thứ hai.
- Button TÍNH TỔNG.
- Button XÓA.
- TextView hiển thị kết quả.

---

## 4. LinearLayout

LinearLayout chính sử dụng:

```xml
android:orientation="vertical"

```
## 5. Hình ảnh

<img width="398" height="753" alt="image" src="https://github.com/user-attachments/assets/c61526fe-3f76-45f2-a853-21fdb49fd6ab" />

# BaiTH5_XuLySuKien1

## 1. Tên bài

**BaiTH5_XuLySuKien1**

Sinh viên tạo lại dự án mới theo bài TH4 và thực hiện xử lý sự kiện trong Android bằng Java.

---

## 2. Mục tiêu

- Tạo một project Android mới.
- Thiết kế giao diện bằng XML.
- Sử dụng LinearLayout.
- Sử dụng EditText để nhập dữ liệu.
- Sử dụng Button để xử lý sự kiện.
- Sử dụng `setOnClickListener()` để bắt sự kiện click.
- Thực hiện phép tính tổng hai số.
- Hiển thị kết quả bằng TextView.
- Xử lý trường hợp dữ liệu nhập vào bị thiếu hoặc không hợp lệ.

---

## 3. Công cụ

- Android Studio
- Java
- XML
- Android Emulator

---

## 4. Tạo project mới

Tên project:

```text
BaiTH5

```

## 5. Hình ảnh

Tính tổng bình thường

<img width="421" height="444" alt="Screenshot 2026-10-03 001126" src="https://github.com/user-attachments/assets/648d8984-7283-42cb-ac85-17e87caa3fc9" />

Khi không ghi số 

<img width="447" height="681" alt="Screenshot 2026-10-03 001153" src="https://github.com/user-attachments/assets/c2d92c24-5519-4439-84db-3049fbca9b8a" />

Khi tính số âm đâu

<img width="431" height="738" alt="Screenshot 2026-10-03 001209" src="https://github.com/user-attachments/assets/eb1aa7bd-a864-497f-8196-565d313872d6" />







