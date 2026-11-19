# Extension Validation Report

- Extension: tachiyomi-tr.oblivionscans-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 28
- Lint: 0
- Warnings: 0
- Skipped: 8
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: duckscans
- Source ID: 6347787465770700871
- Source name: Oblivion Scans
- Source language: tr
- Selected manga input: popular offset 0: Çatı Katının Seks Kralı (`.../cati-katinin-seks-krali`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 137 | Çatı Katının Seks Kralı (`.../cati-katinin-seks-krali`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 137 | Olgun Kadınlar Değişim Planı (`.../olgun-kadinlar-degisim-plani`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Çatı Katının Seks Kralı (`.../cati-katinin-seks-krali`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Çatı Katının Seks Kralı (`.../cati-katinin-seks-krali`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 90 | 🔒 Bölüm 1 (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | error | 0 |  | java.lang.Exception: Log in via WebView to read this chapter | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | java.lang.Exception: Log in via WebView to read this chapter | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 137 entries |  |  |  |
| latest listing | PASS | 137 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Çatı Katının Seks Kralı, URL=`.../cati-katinin-seks-krali` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 275/275 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 275/275 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://oblivionscans.com/.../cati-katinin-seks-krali.webp <redacted query values: v>` (image/webp (encoding: lossless), 140834 bytes, 400x560) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../cati-katinin-seks-krali` |  |  |  |
| details thumbnail URL | PASS | `https://oblivionscans.com/.../cati-katinin-seks-krali.webp <redacted query values: v>` |  |  |  |
| details author | PASS | Jimin |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Çatı Katının Seks Kralı HYUNG-SIK'in tek bir sorunu var: Penisinin boyutu. Ancak, boyutunu büyütmeyi vaat eden gizemli bir görev serisi teklif edilince bunu reddedemez. Her görev bir öncekinden daha zor ve daha kışkırtıcı hâle gelirken, acaba sonunda efsane olmayı başarabilecek mi? "Ev sahibinin karısını çıplakken gizlice izle."<br><br>**Alternative Names:**<br>- Rooftop Sex King<br>- King of the Roof<br>- Rooftop Room Yasking<br>- 屋上のハメキング<br>- 顶加套房的春天<br>- 옥탑방 야스킹 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 90 chapters |  |  |  |
| chapter dates | PASS | 90 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | Log in via WebView to read this chapter |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
