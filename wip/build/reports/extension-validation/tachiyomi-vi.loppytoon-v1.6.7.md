# Extension Validation Report

- Extension: tachiyomi-vi.loppytoon-v1.6.7
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 36
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6580420139533147522
- Source name: LoppyToon
- Source language: vi
- Selected manga input: popular offset 0: Đóa Hoa Là Mồi Nhử (`.../doa-hoa-la-moi-nhu`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Đóa Hoa Là Mồi Nhử (`.../doa-hoa-la-moi-nhu`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 20 | Sự Tàn Khốc Mang Tên Chuộc Tội (`.../su-tan-khoc-mang-ten-chuoc-toi`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 19 | Hành Tinh Rung Động (`.../hanh-tinh-rung-dong`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | Cạm Bẫy Thỏ Của Tôi (`.../cam-bay-tho-cua-toi`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | [KHÔNG CHE] Đóa Hoa Là Mồi Nhử (`.../khong-che-doa-hoa-la-moi-nhu`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Đóa Hoa Là Mồi Nhử (`.../doa-hoa-la-moi-nhu`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 60 | Chap 1 (`.../chap-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 29 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 19 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 1: title=Đóa Hoa Là Mồi Nhử, URL=`.../doa-hoa-la-moi-nhu` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://loppytoonn.com/.../pE5uZHlKmqo3KpOZbXN68Sf3dhUnqIQVR1QqZSxx.jpg` (image/jpeg, 478194 bytes, 1728x2464) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../doa-hoa-la-moi-nhu` |  |  |  |
| details thumbnail URL | PASS | `https://loppytoonn.com/.../pE5uZHlKmqo3KpOZbXN68Sf3dhUnqIQVR1QqZSxx.jpg` |  |  |  |
| details author | PASS | 고다고 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | LINT | Genres is empty; use null when unknown |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Tên khác: 꽃은 미끼야<br>Truyện “Đóa Hoa Là Mồi Nhử” được việt hóa bởi LoppyToon. Theo dõi fanpage của Loppy để được cập nhật chap mới nhanh nhất nhé!<br><br>※ Nội dung: ‘Đừng tỉnh lại. Làm ơn đừng tỉnh lại.’<br><br>Tại <Bệnh viện Cây Vân Sam> có một ‘bệnh nhân’ hơi đặc biệt. Đó là một người thực vật đã hôn mê suốt 2 năm trời mà So Yi Yeon đang bí mật che giấu...<br><br>Vốn chỉ mơ ước một cuộc sống yên bình, đêm nào Yi Yeon cũng cầu nguyện như thế. Thế nhưng một ngày nọ, người thực vật ấy bừng tỉnh sau giấc ngủ dài.<br><br>“Cô đến để bú c* cho thằng tàn phế này sao?”<br><br>Đứng trước người đàn ông đã mất đi cả ký ức lẫn lẽ thường, Yi Yeon đã lỡ buông ra một lời nói dối không thể cứu vãn. Nói dối với chính tên sát nhân đã chôn sống người khác ở ngọn núi sau nhà và định giết chết cô vào 2 năm trước!<br><br>“Tôi là... v-vợ của anh Kwon Chae Woo.”<br><br>—<br><br>(Manhwa) ✍️ Tác giả: 고다고 🎨 Artist (Minh họa): 고다고 🏠 Studio: 투유드림 (Novel) ✒️ Nguyên tác: 건어물녀 🏠 Nhà sản xuất: 에이블 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 60 chapters |  |  |  |
| chapter dates | PASS | 60 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 29 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://sv1.loppytoonn.com/.../1-1.webp` (image/webp (encoding: lossy), 330132 bytes, 720x5490) |  |  |  |
