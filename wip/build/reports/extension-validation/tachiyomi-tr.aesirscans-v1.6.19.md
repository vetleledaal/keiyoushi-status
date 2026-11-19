# Extension Validation Report

- Extension: tachiyomi-tr.aesirscans-v1.6.19
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 29
- Lint: 0
- Warnings: 1
- Skipped: 7
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: zeistmanga
- Source ID: 4421049203208952015
- Source name: AesirScans
- Source language: tr
- Selected manga input: popular offset 0: Kaotik Dünyanın Tek Fatihi (`.../kaotik-dunyann-tek-fatihi.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 18 | Kaotik Dünyanın Tek Fatihi (`.../kaotik-dunyann-tek-fatihi.html`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Kaotik Dünyanın Tek Fatihi (`.../kaotik-dunyann-tek-fatihi.html`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Kaotik Dünyanın Tek Fatihi (`.../kaotik-dunyann-tek-fatihi.html`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 10 | Kaotik Dünyanın Tek Fatihi Bölüm 1 (`.../bolum-1.html`) |  | <1s |
| pages | `getPageList(chapter)` | success | 9 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 18 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Kaotik Dünyanın Tek Fatihi, URL=`.../kaotik-dunyann-tek-fatihi.html` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 19/19 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 19/19 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://blogger.googleusercontent.com/.../1000118133.png` (image/png, 905729 bytes, 600x804) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../kaotik-dunyann-tek-fatihi.html` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://blogger.googleusercontent.com/.../1000118133.png` (image/webp (container: extended), 1366080 bytes, 896x1200) |  |  |  |
| details author | PASS | 蔷薇事务所 |  |  |  |
| details artist | PASS | 蔷薇事务所 |  |  |  |
| details genres | PASS | Manhua, Aksiyon, Fantastik, Macera, Sistem |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Kaosla delirmiş bir dünyada nasıl hayatta kalırsın? Basit. Sadece Lin Fan’ın örneğini izle: Yasaya uy, bir iş bul, araba ve ev almak için para biriktir… Ve sonunda, bütün bu karmaşayı tek başına sırtlayabilecek bir vatandaş ol.<br><br>Alternative name(s): Solo Conqueror of the Chaotic World |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 10 chapters |  |  |  |
| chapter dates | PASS | 10 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 9 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://blogger.googleusercontent.com/.../1000141835.png` (image/png, 707547 bytes, 1640x924) |  |  |  |
