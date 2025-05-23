create database DIALYVN
USE [DIALYVN]
GO
/****** Object:  Table [dbo].[BIENGIOI]    Script Date: 12/5/2025 4:11:19 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[BIENGIOI](
	[NUOC] [nvarchar](15) NOT NULL,
	[MA_T_TP] [varchar](3) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[NUOC] ASC,
	[MA_T_TP] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[LANGGIENG]    Script Date: 12/5/2025 4:11:19 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[LANGGIENG](
	[MA_T_TP] [varchar](3) NOT NULL,
	[LG] [varchar](3) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[MA_T_TP] ASC,
	[LG] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[TINH_TP]    Script Date: 12/5/2025 4:11:19 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[TINH_TP](
	[MA_T_TP] [varchar](3) NOT NULL,
	[TEN_T_TP] [nvarchar](20) NULL,
	[DT] [float] NULL,
	[DS] [bigint] NULL,
	[MIEN] [nvarchar](10) NULL,
PRIMARY KEY CLUSTERED 
(
	[MA_T_TP] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
INSERT [dbo].[BIENGIOI] ([NUOC], [MA_T_TP]) VALUES (N'CPC', N'AG')
INSERT [dbo].[BIENGIOI] ([NUOC], [MA_T_TP]) VALUES (N'CPC', N'BP')
INSERT [dbo].[BIENGIOI] ([NUOC], [MA_T_TP]) VALUES (N'CPC', N'DL')
INSERT [dbo].[BIENGIOI] ([NUOC], [MA_T_TP]) VALUES (N'CPC', N'DT')
INSERT [dbo].[BIENGIOI] ([NUOC], [MA_T_TP]) VALUES (N'CPC', N'GL')
INSERT [dbo].[BIENGIOI] ([NUOC], [MA_T_TP]) VALUES (N'CPC', N'KG')
INSERT [dbo].[BIENGIOI] ([NUOC], [MA_T_TP]) VALUES (N'CPC', N'LA')
INSERT [dbo].[BIENGIOI] ([NUOC], [MA_T_TP]) VALUES (N'CPC', N'TN')
INSERT [dbo].[BIENGIOI] ([NUOC], [MA_T_TP]) VALUES (N'LAO', N'BT')
INSERT [dbo].[BIENGIOI] ([NUOC], [MA_T_TP]) VALUES (N'LAO', N'GL')
INSERT [dbo].[BIENGIOI] ([NUOC], [MA_T_TP]) VALUES (N'LAO', N'LC')
INSERT [dbo].[BIENGIOI] ([NUOC], [MA_T_TP]) VALUES (N'LAO', N'NT')
INSERT [dbo].[BIENGIOI] ([NUOC], [MA_T_TP]) VALUES (N'TQ', N'CB')
INSERT [dbo].[BIENGIOI] ([NUOC], [MA_T_TP]) VALUES (N'TQ', N'LC')
INSERT [dbo].[LANGGIENG] ([MA_T_TP], [LG]) VALUES (N'AG', N'CT')
INSERT [dbo].[LANGGIENG] ([MA_T_TP], [LG]) VALUES (N'AG', N'DT')
INSERT [dbo].[LANGGIENG] ([MA_T_TP], [LG]) VALUES (N'AG', N'KG')
INSERT [dbo].[LANGGIENG] ([MA_T_TP], [LG]) VALUES (N'BD', N'BP')
INSERT [dbo].[LANGGIENG] ([MA_T_TP], [LG]) VALUES (N'BD', N'DNA')
INSERT [dbo].[LANGGIENG] ([MA_T_TP], [LG]) VALUES (N'BD', N'HCM')
INSERT [dbo].[LANGGIENG] ([MA_T_TP], [LG]) VALUES (N'BD', N'TN')
INSERT [dbo].[LANGGIENG] ([MA_T_TP], [LG]) VALUES (N'BL', N'CM')
INSERT [dbo].[LANGGIENG] ([MA_T_TP], [LG]) VALUES (N'BL', N'CT')
INSERT [dbo].[LANGGIENG] ([MA_T_TP], [LG]) VALUES (N'BL', N'KG')
INSERT [dbo].[LANGGIENG] ([MA_T_TP], [LG]) VALUES (N'BL', N'ST')
INSERT [dbo].[LANGGIENG] ([MA_T_TP], [LG]) VALUES (N'BP', N'BD')
INSERT [dbo].[LANGGIENG] ([MA_T_TP], [LG]) VALUES (N'BP', N'DL')
INSERT [dbo].[LANGGIENG] ([MA_T_TP], [LG]) VALUES (N'BP', N'DNA')
INSERT [dbo].[LANGGIENG] ([MA_T_TP], [LG]) VALUES (N'BP', N'LD')
INSERT [dbo].[LANGGIENG] ([MA_T_TP], [LG]) VALUES (N'BR', N'BTH')
INSERT [dbo].[LANGGIENG] ([MA_T_TP], [LG]) VALUES (N'BR', N'DNA')
INSERT [dbo].[LANGGIENG] ([MA_T_TP], [LG]) VALUES (N'BR', N'HCM')
INSERT [dbo].[LANGGIENG] ([MA_T_TP], [LG]) VALUES (N'BT', N'HCM')
INSERT [dbo].[LANGGIENG] ([MA_T_TP], [LG]) VALUES (N'BT', N'TG')
INSERT [dbo].[LANGGIENG] ([MA_T_TP], [LG]) VALUES (N'BT', N'TV')
INSERT [dbo].[LANGGIENG] ([MA_T_TP], [LG]) VALUES (N'BT', N'VL')
INSERT [dbo].[LANGGIENG] ([MA_T_TP], [LG]) VALUES (N'BTH', N'DNA')
INSERT [dbo].[LANGGIENG] ([MA_T_TP], [LG]) VALUES (N'CM', N'BL')
INSERT [dbo].[LANGGIENG] ([MA_T_TP], [LG]) VALUES (N'CM', N'KG')
INSERT [dbo].[LANGGIENG] ([MA_T_TP], [LG]) VALUES (N'CT', N'AG')
INSERT [dbo].[LANGGIENG] ([MA_T_TP], [LG]) VALUES (N'CT', N'BL')
INSERT [dbo].[LANGGIENG] ([MA_T_TP], [LG]) VALUES (N'CT', N'DT')
INSERT [dbo].[LANGGIENG] ([MA_T_TP], [LG]) VALUES (N'CT', N'KG')
INSERT [dbo].[LANGGIENG] ([MA_T_TP], [LG]) VALUES (N'CT', N'ST')
INSERT [dbo].[LANGGIENG] ([MA_T_TP], [LG]) VALUES (N'CT', N'VL')
INSERT [dbo].[LANGGIENG] ([MA_T_TP], [LG]) VALUES (N'DNA', N'BR')
INSERT [dbo].[LANGGIENG] ([MA_T_TP], [LG]) VALUES (N'DNA', N'BTH')
INSERT [dbo].[LANGGIENG] ([MA_T_TP], [LG]) VALUES (N'DNA', N'HCM')
INSERT [dbo].[LANGGIENG] ([MA_T_TP], [LG]) VALUES (N'DT', N'AG')
INSERT [dbo].[LANGGIENG] ([MA_T_TP], [LG]) VALUES (N'DT', N'LA')
INSERT [dbo].[LANGGIENG] ([MA_T_TP], [LG]) VALUES (N'DT', N'TG')
INSERT [dbo].[LANGGIENG] ([MA_T_TP], [LG]) VALUES (N'HAG', N'BL')
INSERT [dbo].[LANGGIENG] ([MA_T_TP], [LG]) VALUES (N'HAG', N'CT')
INSERT [dbo].[LANGGIENG] ([MA_T_TP], [LG]) VALUES (N'HAG', N'KG')
INSERT [dbo].[LANGGIENG] ([MA_T_TP], [LG]) VALUES (N'HAG', N'ST')
INSERT [dbo].[LANGGIENG] ([MA_T_TP], [LG]) VALUES (N'HAG', N'VL')
INSERT [dbo].[LANGGIENG] ([MA_T_TP], [LG]) VALUES (N'HCM', N'BD')
INSERT [dbo].[LANGGIENG] ([MA_T_TP], [LG]) VALUES (N'HCM', N'BR')
INSERT [dbo].[LANGGIENG] ([MA_T_TP], [LG]) VALUES (N'HCM', N'DNA')
INSERT [dbo].[LANGGIENG] ([MA_T_TP], [LG]) VALUES (N'HCM', N'LA')
INSERT [dbo].[LANGGIENG] ([MA_T_TP], [LG]) VALUES (N'HCM', N'TG')
INSERT [dbo].[LANGGIENG] ([MA_T_TP], [LG]) VALUES (N'HCM', N'TN')
INSERT [dbo].[LANGGIENG] ([MA_T_TP], [LG]) VALUES (N'LA', N'DT')
INSERT [dbo].[LANGGIENG] ([MA_T_TP], [LG]) VALUES (N'LA', N'HCM')
INSERT [dbo].[LANGGIENG] ([MA_T_TP], [LG]) VALUES (N'LA', N'TG')
INSERT [dbo].[LANGGIENG] ([MA_T_TP], [LG]) VALUES (N'LA', N'TN')
INSERT [dbo].[LANGGIENG] ([MA_T_TP], [LG]) VALUES (N'TG', N'BT')
INSERT [dbo].[LANGGIENG] ([MA_T_TP], [LG]) VALUES (N'TG', N'DT')
INSERT [dbo].[LANGGIENG] ([MA_T_TP], [LG]) VALUES (N'TG', N'LA')
INSERT [dbo].[LANGGIENG] ([MA_T_TP], [LG]) VALUES (N'TG', N'VL')
INSERT [dbo].[LANGGIENG] ([MA_T_TP], [LG]) VALUES (N'TN', N'BD')
INSERT [dbo].[LANGGIENG] ([MA_T_TP], [LG]) VALUES (N'TN', N'BP')
INSERT [dbo].[LANGGIENG] ([MA_T_TP], [LG]) VALUES (N'TN', N'HCM')
INSERT [dbo].[LANGGIENG] ([MA_T_TP], [LG]) VALUES (N'TN', N'LA')
INSERT [dbo].[TINH_TP] ([MA_T_TP], [TEN_T_TP], [DT], [DS], [MIEN]) VALUES (N'AG', N'An Giang ', 3406, 2142709, N'Nam')
INSERT [dbo].[TINH_TP] ([MA_T_TP], [TEN_T_TP], [DT], [DS], [MIEN]) VALUES (N'BC', N'Bắc Cạn', 4857, 293826, N'Bắc')
INSERT [dbo].[TINH_TP] ([MA_T_TP], [TEN_T_TP], [DT], [DS], [MIEN]) VALUES (N'BD', N'Bình Dương', 2696, 1481550, N'Nam')
INSERT [dbo].[TINH_TP] ([MA_T_TP], [TEN_T_TP], [DT], [DS], [MIEN]) VALUES (N'BDI', N'Bình Định', 6025, 1486465, N'Trung')
INSERT [dbo].[TINH_TP] ([MA_T_TP], [TEN_T_TP], [DT], [DS], [MIEN]) VALUES (N'BG', N'Bắc Giang', 3823, 1554131, N'Bắc')
INSERT [dbo].[TINH_TP] ([MA_T_TP], [TEN_T_TP], [DT], [DS], [MIEN]) VALUES (N'BL', N'Bạc Liêu', 2526, 856518, N'Nam')
INSERT [dbo].[TINH_TP] ([MA_T_TP], [TEN_T_TP], [DT], [DS], [MIEN]) VALUES (N'BN', N'Bắc Ninh', 808, 1024472, N'Bắc')
INSERT [dbo].[TINH_TP] ([MA_T_TP], [TEN_T_TP], [DT], [DS], [MIEN]) VALUES (N'BP', N'Bình Phước', 6857, 873598, N'Nam')
INSERT [dbo].[TINH_TP] ([MA_T_TP], [TEN_T_TP], [DT], [DS], [MIEN]) VALUES (N'BR', N'Bà Rịa - Vũng Tàu ', 1982, 996682, N'Nam')
INSERT [dbo].[TINH_TP] ([MA_T_TP], [TEN_T_TP], [DT], [DS], [MIEN]) VALUES (N'BT', N'Bến Tre', 2322, 1255946, N'Nam')
INSERT [dbo].[TINH_TP] ([MA_T_TP], [TEN_T_TP], [DT], [DS], [MIEN]) VALUES (N'BTH', N'Bình Thuận', 7828, 1167023, N'Trung')
INSERT [dbo].[TINH_TP] ([MA_T_TP], [TEN_T_TP], [DT], [DS], [MIEN]) VALUES (N'CB', N'Cao Bằng', 6691, 507183, N'Bắc')
INSERT [dbo].[TINH_TP] ([MA_T_TP], [TEN_T_TP], [DT], [DS], [MIEN]) VALUES (N'CM', N'Cà Mau', 5202, 1206938, N'Nam')
INSERT [dbo].[TINH_TP] ([MA_T_TP], [TEN_T_TP], [DT], [DS], [MIEN]) VALUES (N'CT', N'Cần Thơ', 139, 1188435, N'Nam')
INSERT [dbo].[TINH_TP] ([MA_T_TP], [TEN_T_TP], [DT], [DS], [MIEN]) VALUES (N'DB', N'Điện Biên', 956, 490306, N'Bắc')
INSERT [dbo].[TINH_TP] ([MA_T_TP], [TEN_T_TP], [DT], [DS], [MIEN]) VALUES (N'DL', N'Đắc Lắc', 13085, 1733624, N'Trung')
INSERT [dbo].[TINH_TP] ([MA_T_TP], [TEN_T_TP], [DT], [DS], [MIEN]) VALUES (N'DN', N'Đà Nẵng', 1256, 887435, N'Trung')
INSERT [dbo].[TINH_TP] ([MA_T_TP], [TEN_T_TP], [DT], [DS], [MIEN]) VALUES (N'DNA', N'Đồng Nai', 5895, 2486154, N'Nam')
INSERT [dbo].[TINH_TP] ([MA_T_TP], [TEN_T_TP], [DT], [DS], [MIEN]) VALUES (N'DNO', N'Đắc Nông', 6515, 489392, N'Trung')
INSERT [dbo].[TINH_TP] ([MA_T_TP], [TEN_T_TP], [DT], [DS], [MIEN]) VALUES (N'DT', N'Đồng Tháp', 3246, 1666467, N'Nam')
INSERT [dbo].[TINH_TP] ([MA_T_TP], [TEN_T_TP], [DT], [DS], [MIEN]) VALUES (N'GL', N'Gia Lai', 15495, 1274412, N'Trung')
INSERT [dbo].[TINH_TP] ([MA_T_TP], [TEN_T_TP], [DT], [DS], [MIEN]) VALUES (N'HAG', N'Hậu Giang', 1608, 7573, N'Nam')
INSERT [dbo].[TINH_TP] ([MA_T_TP], [TEN_T_TP], [DT], [DS], [MIEN]) VALUES (N'HB', N'Hòa Bình', 4663, 785217, N'Bắc')
INSERT [dbo].[TINH_TP] ([MA_T_TP], [TEN_T_TP], [DT], [DS], [MIEN]) VALUES (N'HCM', N'TP. Hồ Chí Minh', 2095, 7162864, N'Nam')
INSERT [dbo].[TINH_TP] ([MA_T_TP], [TEN_T_TP], [DT], [DS], [MIEN]) VALUES (N'HD', N'Hải Dương', 1648, 1705059, N'Bắc')
INSERT [dbo].[TINH_TP] ([MA_T_TP], [TEN_T_TP], [DT], [DS], [MIEN]) VALUES (N'HG', N'Hà Giang', 7884, 724537, N'Bắc')
INSERT [dbo].[TINH_TP] ([MA_T_TP], [TEN_T_TP], [DT], [DS], [MIEN]) VALUES (N'HN', N'Hà Nội', 333447, 6451909, N'Bắc')
INSERT [dbo].[TINH_TP] ([MA_T_TP], [TEN_T_TP], [DT], [DS], [MIEN]) VALUES (N'HNA', N'Hà Nam', 852, 784045, N'Bắc')
INSERT [dbo].[TINH_TP] ([MA_T_TP], [TEN_T_TP], [DT], [DS], [MIEN]) VALUES (N'HP', N'Hải Phòng', 1526, 1837173, N'Bắc')
INSERT [dbo].[TINH_TP] ([MA_T_TP], [TEN_T_TP], [DT], [DS], [MIEN]) VALUES (N'HT', N'Hà Tây', 2193, 2047000, N'Bắc')
INSERT [dbo].[TINH_TP] ([MA_T_TP], [TEN_T_TP], [DT], [DS], [MIEN]) VALUES (N'HTI', N'Hà Tĩnh', 605570, 1227554, N'Bắc')
INSERT [dbo].[TINH_TP] ([MA_T_TP], [TEN_T_TP], [DT], [DS], [MIEN]) VALUES (N'HY', N'Hưng Yên', 923, 1127903, N'Bắc')
INSERT [dbo].[TINH_TP] ([MA_T_TP], [TEN_T_TP], [DT], [DS], [MIEN]) VALUES (N'KG', N'Kiên Giang', 6268, 1688248, N'Nam')
INSERT [dbo].[TINH_TP] ([MA_T_TP], [TEN_T_TP], [DT], [DS], [MIEN]) VALUES (N'KH', N'Khánh Hòa', 5198, 1157604, N'Trung')
INSERT [dbo].[TINH_TP] ([MA_T_TP], [TEN_T_TP], [DT], [DS], [MIEN]) VALUES (N'KT', N'Kon Tum', 9615, 430133, N'Trung')
INSERT [dbo].[TINH_TP] ([MA_T_TP], [TEN_T_TP], [DT], [DS], [MIEN]) VALUES (N'LA', N'Long An', 4491, 1436066, N'Nam')
INSERT [dbo].[TINH_TP] ([MA_T_TP], [TEN_T_TP], [DT], [DS], [MIEN]) VALUES (N'LC', N'Lai Châu', 9059, 370502, N'Bắc')
INSERT [dbo].[TINH_TP] ([MA_T_TP], [TEN_T_TP], [DT], [DS], [MIEN]) VALUES (N'LCA', N'Lào Cai', 6357, 614595, N'Bắc')
INSERT [dbo].[TINH_TP] ([MA_T_TP], [TEN_T_TP], [DT], [DS], [MIEN]) VALUES (N'LD', N'Lâm Đồng', 9765, 1187574, N'Trung')
INSERT [dbo].[TINH_TP] ([MA_T_TP], [TEN_T_TP], [DT], [DS], [MIEN]) VALUES (N'LS', N'Lạng Sơn', 8305, 732515, N'Bắc')
INSERT [dbo].[TINH_TP] ([MA_T_TP], [TEN_T_TP], [DT], [DS], [MIEN]) VALUES (N'NA', N'Nghệ An', 16487, 3113055, N'Trung')
INSERT [dbo].[TINH_TP] ([MA_T_TP], [TEN_T_TP], [DT], [DS], [MIEN]) VALUES (N'NB', N'Ninh Bình', 1384, 898999, N'Bắc')
INSERT [dbo].[TINH_TP] ([MA_T_TP], [TEN_T_TP], [DT], [DS], [MIEN]) VALUES (N'ND', N'Nam Định', 1641, 1828111, N'Bắc')
INSERT [dbo].[TINH_TP] ([MA_T_TP], [TEN_T_TP], [DT], [DS], [MIEN]) VALUES (N'NT', N'Ninh Thuận', 336, 564993, N'Trung')
INSERT [dbo].[TINH_TP] ([MA_T_TP], [TEN_T_TP], [DT], [DS], [MIEN]) VALUES (N'PT', N'Phú Thọ', 352, 1316389, N'Bắc')
INSERT [dbo].[TINH_TP] ([MA_T_TP], [TEN_T_TP], [DT], [DS], [MIEN]) VALUES (N'PY', N'Phú Yên', 5045, 862231, N'Trung')
INSERT [dbo].[TINH_TP] ([MA_T_TP], [TEN_T_TP], [DT], [DS], [MIEN]) VALUES (N'QB', N'Quảng Bình', 805180, 846924, N'Trung')
INSERT [dbo].[TINH_TP] ([MA_T_TP], [TEN_T_TP], [DT], [DS], [MIEN]) VALUES (N'QN', N'Quảng Nam', 10407, 1422319, N'Trung')
INSERT [dbo].[TINH_TP] ([MA_T_TP], [TEN_T_TP], [DT], [DS], [MIEN]) VALUES (N'QNG', N'Quảng Ngãi', 5138, 1216773, N'Trung')
INSERT [dbo].[TINH_TP] ([MA_T_TP], [TEN_T_TP], [DT], [DS], [MIEN]) VALUES (N'QNI', N'Quảng Ninh', 59, 1144988, N'Bắc')
INSERT [dbo].[TINH_TP] ([MA_T_TP], [TEN_T_TP], [DT], [DS], [MIEN]) VALUES (N'QT', N'Quảng Trị', 474570, 597985, N'Bắc')
INSERT [dbo].[TINH_TP] ([MA_T_TP], [TEN_T_TP], [DT], [DS], [MIEN]) VALUES (N'SL', N'Sơn La', 14055, 1076055, N'Bắc')
INSERT [dbo].[TINH_TP] ([MA_T_TP], [TEN_T_TP], [DT], [DS], [MIEN]) VALUES (N'ST', N'Sóc Trăng', 3223, 1292853, N'Nam')
INSERT [dbo].[TINH_TP] ([MA_T_TP], [TEN_T_TP], [DT], [DS], [MIEN]) VALUES (N'TB', N'Thái Bình', 1545, 1781842, N'Bắc')
INSERT [dbo].[TINH_TP] ([MA_T_TP], [TEN_T_TP], [DT], [DS], [MIEN]) VALUES (N'TG', N'Tiền Giang', 2367, 1672271, N'Nam')
INSERT [dbo].[TINH_TP] ([MA_T_TP], [TEN_T_TP], [DT], [DS], [MIEN]) VALUES (N'TH', N'Thanh Hóa', 11116, 3400595, N'Bắc')
INSERT [dbo].[TINH_TP] ([MA_T_TP], [TEN_T_TP], [DT], [DS], [MIEN]) VALUES (N'TN', N'Tây Ninh', 403, 1066513, N'Nam')
INSERT [dbo].[TINH_TP] ([MA_T_TP], [TEN_T_TP], [DT], [DS], [MIEN]) VALUES (N'TNG', N'Thái Nguyên', 3543, 1123116, N'Bắc')
INSERT [dbo].[TINH_TP] ([MA_T_TP], [TEN_T_TP], [DT], [DS], [MIEN]) VALUES (N'TQ', N'Tuyên Quang', 5868, 724821, N'Bắc')
INSERT [dbo].[TINH_TP] ([MA_T_TP], [TEN_T_TP], [DT], [DS], [MIEN]) VALUES (N'TTH', N'Thừa Thiên Huế', 505399, 1087579, N'Trung')
INSERT [dbo].[TINH_TP] ([MA_T_TP], [TEN_T_TP], [DT], [DS], [MIEN]) VALUES (N'TV', N'Trà Vinh', 2215, 1003012, N'Nam')
INSERT [dbo].[TINH_TP] ([MA_T_TP], [TEN_T_TP], [DT], [DS], [MIEN]) VALUES (N'VL', N'Vĩnh Long', 1475, 1024707, N'Nam')
INSERT [dbo].[TINH_TP] ([MA_T_TP], [TEN_T_TP], [DT], [DS], [MIEN]) VALUES (N'VP', N'Vĩnh Phúc', 1371, 999786, N'Bắc')
INSERT [dbo].[TINH_TP] ([MA_T_TP], [TEN_T_TP], [DT], [DS], [MIEN]) VALUES (N'YB', N'Yên Bái', 6883, 740387, N'Bắc')
ALTER TABLE [dbo].[BIENGIOI]  WITH CHECK ADD FOREIGN KEY([MA_T_TP])
REFERENCES [dbo].[TINH_TP] ([MA_T_TP])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[LANGGIENG]  WITH CHECK ADD FOREIGN KEY([LG])
REFERENCES [dbo].[TINH_TP] ([MA_T_TP])
GO
ALTER TABLE [dbo].[LANGGIENG]  WITH CHECK ADD FOREIGN KEY([MA_T_TP])
REFERENCES [dbo].[TINH_TP] ([MA_T_TP])
GO
ALTER TABLE [dbo].[TINH_TP]  WITH CHECK ADD CHECK  (([MIEN]=N'Bắc' OR [MIEN]='Trung' OR [MIEN]='Nam'))
GO
