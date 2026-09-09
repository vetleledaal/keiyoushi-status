# Extension Validation Report

- Extension: tachiyomi-vi.metruyen18-v1.6.56
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 6662865328420899419
- Source name: MeTruyen18
- Source language: vi
- Selected manga input: popular offset 0: Sextoy kết nối không dây (`.../sextoy-ket-noi-khong-day`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 36 | Sextoy kết nối không dây (`.../sextoy-ket-noi-khong-day`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 36 | Ân huệ trời ban! (`.../an-hue-troi-ban-1`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 36 | Tất Cả Đàn Ông Đâu Hết Rồi (`.../tat-ca-dan-ong-dau-het-roi`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 36 | Sống cùng cô giáo. (`.../song-cung-co-giao`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | Sextoy kết nối không dây (`.../sextoy-ket-noi-khong-day`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Sextoy kết nối không dây (`.../sextoy-ket-noi-khong-day`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 118 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 14 |  |  | 1-10s |

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
| popular listing | PASS | 36 entries |  |  |  |
| latest listing | PASS | 36 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Sextoy kết nối không dây, URL=`.../sextoy-ket-noi-khong-day` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 146/146 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 146/146 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://zs.wtcdn.xyz/.../08480820-bb4b-412c-a696-9fb43f517fef6a73161a67b6a.jpg` (image/jpeg, 61776 bytes, 500x662) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../sextoy-ket-noi-khong-day` |  |  |  |
| details thumbnail URL | PASS | `https://zs.wtcdn.xyz/.../08480820-bb4b-412c-a696-9fb43f517fef6a73161a67b6a.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Drama, Manhwa, Comedy, Ecchi, Fantasy, Milf, Adult, Ahegao, Comic, Harem, Romance, Webtoon |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Park Woojin, sinh viên kỹ thuật, mua nhầm một cái onahole “xịn” có chức năng kết nối không dây với cơ thể phụ nữ gần đó.<br><br>Khi cậu dùng nó, mọi cảm giác sẽ truyền thẳng 100% đến cô gái mà cậu chọn (cô ấy sẽ “cảm nhận” như đang bị làm thật). Ngược lại, phản ứng của cô ấy cũng làm onahole tự cử động theo.<br><br>Câu đầu tiên cậu shock: “Ủa, cái onahole… tự động rồi?!”<br><br>Mục tiêu đầu tiên: Ahyoung – nữ thần xinh đẹp nhất trường. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 118 chapters |  |  |  |
| chapter dates | PASS | 118 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 14 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://dcnvn2.mbpro.vip/.../1.jpg` (image/jpeg, 1471208 bytes, 900x18590) |  |  |  |
