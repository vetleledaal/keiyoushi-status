# Extension Validation Report

- Extension: tachiyomi-th.doujinlc-v1.6.54
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 35
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4360984402391235039
- Source name: Doujin-Lc
- Source language: th
- Selected manga input: popular offset 0: Moby Dick (`.../49601`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Moby Dick (`.../49601`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | My Sister’s Duty (`.../11222`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 25 | Save the World by Hitting it (`.../95427`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | วันเเบบนั้นก็มีอยู่เหมือนกัน [Kurokawa Otogi] (`.../118172`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Moby Dick (`.../49601`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Moby Dick (`.../49601`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 108 | ตอนที่ 1 (`.../%e0%b8%95%e0%b8%ad%e0%b8%99%e0%b8%97%e0%b8%b5%e0%b9%88-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 11 |  |  | 1-10s |

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
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Moby Dick, URL=`49601` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://doujin-lc.net/.../Moby-Dick-175x238.jpg` (image/jpeg, 31839 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `49601` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://doujin-lc.net/.../Moby-Dick.jpg` (image/jpeg, 10800 bytes, 193x278) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | manhwa, มังฮวาภาพสี, โดจินเกาหลี hmanhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | เรื่องย่อ : Moby Dick – อยู่มาวันหนึ่ง ฮุนซังผู้ตายยากจนได้รับนามบัตรที่น่าสงสัย ซึ่งทำให้เขามีชีวิตใหม่ในเมืองใหม่ที่เรียกว่าบันนัมดง เมืองขี้โกง พร้อมเงินก้อนโต “คุณจะเป็น ‘ของขวัญ’ ให้กับวีไอพี มอบความสุขให้พวกเขาอย่างไม่มีวันลืม”<br><br>อ่านเรื่องนี้ก่อนใครได้ที่ DOUJIN-LC.NET เท่านั้น! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 108 chapters |  |  |  |
| chapter dates | PASS | 108 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 11 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://mangaclaw.com/.../uploads-by-doujin-lc-com-1.jpg` (image/jpeg, 2195120 bytes, 1000x26896) |  |  |  |
