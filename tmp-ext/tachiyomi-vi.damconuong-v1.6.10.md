# Extension Validation Report

- Extension: tachiyomi-vi.damconuong-v1.6.10
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 36
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2680345917627448572
- Source name: DamCoNuong
- Source language: vi
- Selected manga input: popular offset 0: Sextoy kết nối không dây (`.../sextoy-ket-noi-khong-day`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | Sextoy kết nối không dây (`.../sextoy-ket-noi-khong-day`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 30 | Tôi là nam quân nhân duy nhất trong đơn vị (`.../toi-la-nam-quan-nhan-duy-nhat-trong-don-vi`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 30 | Dùng Hack Để Tiếp Cận Nữ Streamer! (`.../dung-hack-de-tiep-can-nu-streamer`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 30 | Bất ngờ ngoài ý muốn khi đi làm thêm (`.../bat-ngo-ngoai-y-muon-khi-di-lam-them`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | Sextoy kết nối không dây (`.../sextoy-ket-noi-khong-day`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Sextoy kết nối không dây (`.../sextoy-ket-noi-khong-day`) |  | 1-10s |
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
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Sextoy kết nối không dây, URL=`.../sextoy-ket-noi-khong-day` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 122/122 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 122/122 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://zs.wtcdn.xyz/.../08480820-bb4b-412c-a696-9fb43f517fef6a73161a67b6a.jpg` (image/jpeg, 61776 bytes, 500x662) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../sextoy-ket-noi-khong-day` |  |  |  |
| details thumbnail URL | PASS | `https://zs.wtcdn.xyz/.../08480820-bb4b-412c-a696-9fb43f517fef6a73161a67b6a.jpg` |  |  |  |
| details author | PASS | Ottogi |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Drama, Manhwa, Comedy, Ecchi, Fantasy, Milf, Adult, Ahegao, Comic, Harem, Romance, Webtoon |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Park Woojin, sinh viên kỹ thuật, mua nhầm một cái onahole “xịn” có chức năng kết nối không dây với cơ thể phụ nữ gần đó. Khi cậu dùng nó, mọi cảm giác sẽ truyền thẳng 100% đến cô gái mà cậu chọn (cô ấy sẽ “cảm nhận” như đang bị làm thật). Ngược lại, phản ứng của cô ấy cũng làm onahole tự cử động theo. Câu đầu tiên cậu shock: “Ủa, cái onahole… tự động rồi?!” Mục tiêu đầu tiên: Ahyoung – nữ thần xinh đẹp nhất trường. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 118 chapters |  |  |  |
| chapter dates | PASS | 118 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 14 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://dcnvn2.mbpro.vip/.../1.jpg` (image/jpeg, 1471208 bytes, 900x18590) |  |  |  |
