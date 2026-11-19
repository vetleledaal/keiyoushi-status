# Extension Validation Report

- Extension: tachiyomi-tr.golgebahcesi-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
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
- Source ID: 7442439989890509521
- Source name: Gölge Bahçesi
- Source language: tr
- Selected manga input: popular offset 0: Deli Mühendis (`.../deli-muhendis`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Deli Mühendis (`.../deli-muhendis`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Kahramanlar Tarafından Alt Edilen Şeytan Kral (`.../kahramanlar-tarafindan-alt-edilen-seytan-kral`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | Gölge Köle (`.../golge-kole`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | İmparatorluğun Kulu (`.../imparatorlugun-kulu`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Deli Mühendis (`.../deli-muhendis`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Deli Mühendis (`.../deli-muhendis`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 223 | Bölüm 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 14 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Deli Mühendis, URL=`deli-muhendis` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://c3.skycdn.online/.../1791948717_556d40b8d67125c6d60af3a650cd89c1.webp` (image/webp (encoding: lossy), 491036 bytes, 1041x1510) |  |  |  |
| details identity | PASS | Details preserved selected URL `deli-muhendis` |  |  |  |
| details thumbnail URL | PASS | `https://c3.skycdn.online/.../1791948717_556d40b8d67125c6d60af3a650cd89c1.webp` |  |  |  |
| details author | PASS | BK_Moon |  |  |  |
| details artist | PASS | Kim Hyunsoo |  |  |  |
| details genres | PASS | Aksiyon, Macera, Komedi, Fantastik, Manhwa |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | İnşaat mühendisliği öğrencisi Suho Kim, bir fantastik roman okurken uyuyakalır ve kendini kitabın içinde bulur! Suho artık içki düşkünü, tembel bir soylu olan ve ailesi dağ gibi borç altında ezilen Lloyd Frontera'nın bedenindedir. Mühendislik bilgisini kullanan Suho, onu bekleyen korkunç gelecekten kaçınmak için çeşitli icatlar tasarlar. Dev bir hamster, bir şövalye ve dünyanın büyüsünün yardımıyla Suho, yeni ailesini borçtan kurtarıp daha iyi bir gelecek inşa edebilecek mi? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 223 chapters |  |  |  |
| chapter dates | PASS | 223 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 14 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://c3.skycdn.online/.../1.jpg` (image/jpeg, 130210 bytes, 900x1071) |  |  |  |
