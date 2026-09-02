# Extension Validation Report

- Extension: tachiyomi-vi.dilib-v1.6.2
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 31
- Lint: 2
- Warnings: 2
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4436086462808946847
- Source name: Dilib
- Source language: vi
- Selected manga input: latest offset 0: Anh Hùng: One-Punch Man (Yusuke Murata) (`.../anh-hung-one-punch-man-14724.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Anh Hùng: One-Punch Man (Yusuke Murata) (`.../anh-hung-one-punch-man-14724.html`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 24 | Shin - Cậu Bé Bút Chì (Usui Yoshito) (`.../shin-cau-be-but-chi-14787.html`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 24 | Anh Hùng: One-Punch Man (Yusuke Murata) (`.../anh-hung-one-punch-man-14724.html`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Shin - Cậu Bé Bút Chì (Usui Yoshito) (`.../shin-cau-be-but-chi-14787.html`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | ANH HÙNG: ONE-PUNCH MAN (`.../anh-hung-one-punch-man-14724.html`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 345 | Chap 1 (`.../anh-hung-one-punch-man-14724-chap-1.html`) |  | <1s |
| pages | `getPageList(chapter)` | success | 21 |  |  | <1s |

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
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | LINT | Latest page 1 exactly matches popular page 1; verify supportsLatest |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 96/96 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 96/96 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://dilib.vn/.../14724-one-punch-man-1.webp <redacted query values: v>` (image/webp (encoding: lossy), 11602 bytes, 240x336) |  |  |  |
| details identity | UNUSUAL | Details changed selected title Anh Hùng: One-Punch Man (Yusuke Murata) to ANH HÙNG: ONE-PUNCH MAN |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://dilib.vn/.../14724-one-punch-man-1.webp <redacted query values: v>` (image/webp (encoding: lossy), 35558 bytes, 540x756) |  |  |  |
| details author | PASS | Tác giả : Yusuke Murata |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Manga, Action, Comedy, Supernatural, Sci-Fi |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Cập nhật lúc: 22:39pm 02/09/2026<br><br>One-Punch Man: Saitama - Người Hùng Với Cú Đấm Quyền Năng Và "Cái Tôi" Độc Đáo<br><br>One-Punch Man là bộ manga và anime đình đám lấy bối cảnh tại Thành phố Z, một phiên bản Nhật Bản giả tưởng nơi quái vật hoành hành, đe dọa sự sống còn của nhân loại. Giữa tình cảnh hỗn loạn đó, xuất hiện một siêu anh hùng đặc biệt: Saitama. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 345 chapters |  |  |  |
| chapter dates | LINT | All 345 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=345 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 21 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://dilib.vn/.../img_00001.webp <redacted query values: v>` (image/webp (encoding: lossy), 71746 bytes, 728x1116) |  |  |  |
