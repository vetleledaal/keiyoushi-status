# Extension Validation Report

- Extension: tachiyomi-all.baobua-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 30e9bf12769926b1fd7fafc4247779e7a44f2fbf+dirty
- Passed: 32
- Lint: 0
- Warnings: 0
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 514187608699312366
- Source name: BaoBua
- Source language: all
- Selected manga input: popular offset 0: Giải bi-a toàn hoa hậu: 'Tiểu tiên nữ' tranh chức vô địch gần 1 tỷ đồng cùng dàn hot girl (`.../YmhkRzZ0c2FKV3llejZoUTNSQnh6Zz09.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Giải bi-a toàn hoa hậu: 'Tiểu tiên nữ' tranh chức vô địch gần 1 tỷ đồng cùng dàn hot girl (`.../YmhkRzZ0c2FKV3llejZoUTNSQnh6Zz09.html`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 24 | Mẹ vợ và 2 con trai Hồ Quang Hiếu gây chú ý (`.../YkNRVHlpSUdsaWFUbnlYWFVkK1Mvdz09.html`) |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 24 | Hoa hậu Hà Trúc Linh đẹp rực rỡ trên thảm đỏ Chung khảo Hoa hậu Việt Nam 2026 (`.../ekNmdFFzNVFweTMrTDlsNVFwQ3BLdz09.html`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Giải bi-a toàn hoa hậu: 'Tiểu tiên nữ' tranh chức vô địch gần 1 tỷ đồng cùng dàn hot girl (`.../YmhkRzZ0c2FKV3llejZoUTNSQnh6Zz09.html`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Gallery (`.../YmhkRzZ0c2FKV3llejZoUTNSQnh6Zz09.html`) |  | <1s |
| pages | `getPageList(chapter)` | success | 14 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 3: title=Giải bi-a toàn hoa hậu: 'Tiểu tiên nữ' tranh chức vô địch gần 1 tỷ đồng cùng dàn hot girl, URL=`.../YmhkRzZ0c2FKV3llejZoUTNSQnh6Zz09.html` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 72/72 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 72/72 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://go.thismore.fun/.../aStvd0pWU2JoOEZRdzVrT3lGSGlpZEdabzZyajhzQVdyNjB5cW5hR1cweHluVzZYY0ZySmtSUFZDV3JqcEtiMHhKNXNTWlY4NE1QNjVDVkNUSVhkdlBNVmVsbCt5VjRyMkM1T2hDelBzRnNrZTdEaHNsOUJtQWdBWmtINGs5eFU-d.jpg` (image/jpeg, 29222 bytes, 740x459) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../YmhkRzZ0c2FKV3llejZoUTNSQnh6Zz09.html` |  |  |  |
| details thumbnail URL | PASS | `https://go.thismore.fun/.../aStvd0pWU2JoOEZRdzVrT3lGSGlpZEdabzZyajhzQVdyNjB5cW5hR1cweHluVzZYY0ZySmtSUFZDV3JqcEtiMHhKNXNTWlY4NE1QNjVDVkNUSVhkdlBNVmVsbCt5VjRyMkM1T2hDelBzRnNrZTdEaHNsOUJtQWdBWmtINGs5eFU-d.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | billiards, tiên nữ, LPBA, cơ thủ |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 14 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://go.thismore.fun/.../aStvd0pWU2JoOEZRdzVrT3lGSGlpZEdabzZyajhzQVdyNjB5cW5hR1cweHluVzZYY0ZySmtSUFZDV3JqcEtiMHhKNXNTWlY4NE1QNjVDVkNUSVhkdkU0NDl4NU9FZldISkRXejdSNDRzRml6U3VOU001WCtIZ2svYlgreGdtdEU-d.jpg` (image/jpeg, 78969 bytes, 740x827) |  |  |  |
