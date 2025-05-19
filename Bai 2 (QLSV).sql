--Tạo DB
create database QLSV
on
(
--định nghĩa file chứa dữ liệu
name = 'QLSV_Data', --tên luận lý
filename = 'C:\CSDL\QLSV.mdf' --tên vật lý (mdf: primary data file)
)
log on
(
--định nghĩa file nhật ký
name = 'QLSV_Log', --tên luận lý
filename = 'C:\CSDL\QLSV.ldf' --tên vật lý (ldf: transaction log file)
)
--Khai báo CSDL hiện hành
use QLSV
if exists (select * from SYS.sysdatabases where name = 'LOP')
drop database LOP
Go
create table LOP(
MaLop CHAR (7) primary key,
TenLop NVARCHAR (50),
SiSo tinyint check(Siso>0)
)
if exists (select * from SYS.sysdatabases where name = 'MONHOC')
drop database MONHOC
Go
create table MONHOC(
MaMH char (6) primary key,
TenMH nvarchar (50),
TCLT tinyint check(TCLT > 0),
TCTH tinyint check(TCTH >= 0)
)
if exists (select * from SYS.sysdatabases where name = 'SINHVIEN')
drop database SINHVIEN
Go
create table SINHVIEN(
MSSV char(6) primary key,
HoTen nvarchar (50),
NTNS date,
Phai bit default 1,
MaLop char (7),
foreign key (MALOP) references LOP(MALOP)
on update cascade
on delete set null
)
if exists (select * from SYS.sysdatabases where name = 'DIEMSV')
drop database DIEMSV
Go
create table DIEMSV(
    MSSV char (6),
    MaMH char (6),
    primary key (MSSV, MaMH),
    Diem decimal(3,1) check (DIEM between 0 and 10),
    foreign key (MaMH) references MONHOC (MaMH)
        on update cascade
        on delete cascade,
    foreign key (MSSV) references SINHVIEN(MSSV)
        on update cascade
        on delete cascade
)

--Thực hiện các câu hỏi sau bằng ngôn ngữ SQL:
--1- Thêm một dòng mới vào bảng SINHVIEN với giá trị:
--190001 Đào Thị Tuyết Hoa 08/03/2001 0 19DTH02

insert into SINHVIEN values ('190001', N'Đào Thị Tuyết Hoa', '08/03/2001', 0, '19DTH02')

--2- Hãy đổi tên môn học ‘Lý thuyết đồ thị ’thành ‘Toán rời rạc’.

update MONHOC
set TENMH = N'Toán rời rạc'
where TENMH = N'Lý thuyết đồ thị';

--3- Hiển thị tên các môn học không có thực hành.

select TenMH
from MONHOC
where TCTH = 0

--4- Hiển thị tên các môn học vừa có lý thuyết, vừa có thực hành.
select TenMH
from MONHOC
where TCLT and TCTH
--5- In ra tên các môn học có ký tự đầu của tên là chữ ‘C’.
--6- Liệt kê thông tin những sinh viên mà họ chứa chữ ‘Thị’.
--7- In ra 2 lớp có sĩ số đông nhất (bằng nhiều cách). Hiển thị: Mã lớp, Tên lớp, Sĩ số. Nhận xét?
--8- In danh sách SV theo từng lớp: MSSV, Họ tên SV, Năm sinh, Phái (Nam/Nữ).
--9- Cho biết những sinh viên có tuổi ≥ 20, thông tin gồm: Họ tên sinh viên, Ngày sinh, Tuổi.
--10- Liệt kê tên các môn học SV đã dự thi nhưng chưa có điểm.
--11- Liệt kê kết quả học tập của SV có mã số 170001. Hiển thị: MSSV, HoTen, TenMH, Diem.
--12- Liệt kê tên sinh viên và mã môn học mà sv đó đăng ký với điểm trên 7 điểm.
--13- Liệt tên môn học cùng số lượng SV đã học và đã có điểm.
--14- Liệt kê tên SV và điểm trung bình của SV đó.
--15- Liệt kê tên sinh viên đạt điểm cao nhất của môn học ‘Kỹ thuật lập trình’.
--16- Liệt kê tên SV có điểm trung bình cao nhất.
--17- Liệt kê tên SV chưa học môn ‘Toán rời rạc’.
--18- Cho biết sinh viên có năm sinh cùng với sinh viên tên ‘Danh’.
--19- Cho biết tổng sinh viên và tổng số sinh viên nữ.
--20- Cho biết danh sách các sinh viên rớt ít nhất 1 môn.
--21- Cho biết MSSV, Họ tên SV đã học và có điểm ít nhất 3 môn.
--22- In danh sách sinh viên có điểm môn ‘Kỹ thuật lập trình’ cao nhất theo từng lớp.
--23- In danh sách sinh viên có điểm cao nhất theo từng môn, từng lớp.
--24- Cho biết những sinh viên đạt điểm cao nhất của từng môn.
--25- Cho biết MSSV, Họ tên SV chưa đăng ký học môn nào.
--26- Danh sách sinh viên có tất cả các điểm đều 10.
--27- Đếm số sinh viên nam, nữ theo từng lớp.
--28- Cho biết những sinh viên đã học tất cả các môn nhưng không rớt môn nào.
--29- Xoá tất cả những sinh viên chưa dự thi môn nào.
--30- Cho biết những môn đã được tất cả các sinh viên đăng ký học.