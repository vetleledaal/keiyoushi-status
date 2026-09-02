# Extension Validation Report

- Extension: tachiyomi-vi.teamlanhlung-v1.6.37
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 33
- Lint: 0
- Warnings: 1
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1832370231745386795
- Source name: Team Lạnh Lùng
- Source language: vi
- Selected manga input: popular offset 0: CÔNG CHÚA BÁ ĐẠO TUYỆT SẮC : ÁM VỆ NGÀY NÀO CŨNG MUỐN PHẠM THƯỢNG (`.../cong-chua-ba-dao-tuyet-sac-am-ve-ngay-nao-cung-muon-pham-thuong`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 32 | CÔNG CHÚA BÁ ĐẠO TUYỆT SẮC : ÁM VỆ NGÀY NÀO CŨNG MUỐN PHẠM THƯỢNG (`.../cong-chua-ba-dao-tuyet-sac-am-ve-ngay-nao-cung-muon-pham-thuong`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 32 | Trọng Sinh Chi Ác Phi Nghịch Tập (`.../trong-sinh-chi-ac-phi-nghich-tap`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 32 | Hoàng Thúc Vì Ta Mà Cúi Mình (`.../hoang-thuc-vi-ta-ma-cui-minh`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | CÔNG CHÚA BÁ ĐẠO TUYỆT SẮC : ÁM VỆ NGÀY NÀO CŨNG MUỐN PHẠM THƯỢNG (`.../cong-chua-ba-dao-tuyet-sac-am-ve-ngay-nao-cung-muon-pham-thuong`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | CÔNG CHÚA BÁ ĐẠO TUYỆT SẮC : ÁM VỆ NGÀY NÀO CŨNG MUỐN PHẠM THƯỢNG (`.../cong-chua-ba-dao-tuyet-sac-am-ve-ngay-nao-cung-muon-pham-thuong`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 228 | CHAP 1 (`.../cong-chua-ba-dao-tuyet-sac-am-ve-ngay-nao-cung-muon-pham-thuong-chap-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 8 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 32 entries |  |  |  |
| latest listing | PASS | 32 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=CÔNG CHÚA BÁ ĐẠO TUYỆT SẮC : ÁM VỆ NGÀY NÀO CŨNG MUỐN PHẠM THƯỢNG, URL=`.../cong-chua-ba-dao-tuyet-sac-am-ve-ngay-nao-cung-muon-pham-thuong` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://lanhlungteam3.top/.../0_2-4.jpg` (image/jpeg, 261602 bytes, 1080x1544) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../cong-chua-ba-dao-tuyet-sac-am-ve-ngay-nao-cung-muon-pham-thuong` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://lanhlungteam3.top/.../0_2-4-720x970.jpg` (image/jpeg, 141567 bytes, 720x970) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Cổ Đại, xuyên không, manhua, sủng, phản diện |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 228 chapters |  |  |  |
| chapter dates | PASS | 228 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 8 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://lanhlungteam3.top/.../fcd5b84322aa2039135bd26cdad0d245.jpg` (image/jpeg, 75723 bytes, 884x496) |  |  |  |
