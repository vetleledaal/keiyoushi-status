# Extension Validation Report

- Extension: tachiyomi-vi.lavibitwindroom-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
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
- Source ID: 8113403657936436136
- Source name: LavibitWindroom
- Source language: vi
- Selected manga input: popular offset 0: [19+] Lượt Thích Bí Mật (`.../19-luot-thich-bi-mat`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | [19+] Lượt Thích Bí Mật (`.../19-luot-thich-bi-mat`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 5 | [MANGA] Gái Thẳng Bị Người Vợ Đồng Tính NTR (`.../manga-gai-thang-bi-nguoi-vo-dong-tinh-ntr`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | NOVA (`.../nova`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 5 | [19+] Chỉ Học Thôi Sao? (`.../19-chi-hoc-thoi-sao`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | [19+] Lượt Thích Bí Mật (`.../19-luot-thich-bi-mat`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | [19+] Lượt Thích Bí Mật (`.../19-luot-thich-bi-mat`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 7 | Chapter 1 (`.../145`) |  | <1s |
| pages | `getPageList(chapter)` | success | 10 |  |  | 1-10s |

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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=\[19+\] Lượt Thích Bí Mật, URL=`19-luot-thich-bi-mat` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 59/59 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 59/59 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://pub-737ae9ff920b490f98b7316296be64a5.r2.dev/.../1793886326636_jhff6.png` (image/png, 1501893 bytes, 1002x1406) |  |  |  |
| details identity | PASS | Details preserved selected URL `19-luot-thich-bi-mat` |  |  |  |
| details thumbnail URL | PASS | `https://pub-737ae9ff920b490f98b7316296be64a5.r2.dev/.../1793886326636_jhff6.png` |  |  |  |
| details author | PASS | 서랭&온우주 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | GL / Girl Love, Yuri, Học Đường, Adult / 18+, Smut / 19+, Full Color, Webtoon / Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Ha Yoon là một influencer mỹ phẩm luôn tỏa sáng và được mọi người yêu mến. Thế nhưng, có một nơi duy nhất khiến ánh sáng ấy vụt tắt — đó chính là trước mặt một influencer khác, Lee Seo.<br><br>Ngay cả trong buổi gặp mặt đầu năm mà Yoon đã mong chờ, sự xuất hiện của Lee Seo cũng khiến mọi sự chú ý của mọi người đổ dồn về cô ấy.<br><br>Trong lòng Yoon rối bời, đan xen giữa ngưỡng mộ và ghen tị. Thế nhưng, chỉ vì một lời lỡ miệng trong lúc say, cô lại bất ngờ trở thành người có một mối quan hệ đặc biệt với Lee Seo...?<br><br>Vậy thì... chúng ta hẹn hò nhé? Chị cũng thích em.<br> |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 7 chapters |  |  |  |
| chapter dates | PASS | 7 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 10 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://pub-737ae9ff920b490f98b7316296be64a5.r2.dev/.../1791215650719_eph6v.jpg` (image/jpeg, 1604598 bytes, 800x12000) |  |  |  |
