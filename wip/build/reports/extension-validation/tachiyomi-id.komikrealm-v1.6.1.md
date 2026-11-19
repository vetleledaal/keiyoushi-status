# Extension Validation Report

- Extension: tachiyomi-id.komikrealm-v1.6.1
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
- Source ID: 6398435372809698551
- Source name: KomikRealm
- Source language: id
- Selected manga input: popular offset 0: Secret Class (`.../secret-class`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Secret Class (`.../secret-class`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Wind Breaker (`.../wind-breaker`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | The Demon King’s Channel (`.../the-demon-kings-channel`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Lookism (`.../lookism`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | Secret Class (`.../secret-class`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Secret Class (`.../secret-class`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 324 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 23 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Secret Class, URL=`.../secret-class` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 98/98 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 98/98 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://s3.imgkomik.xyz/.../Secret-Class.jpg` (image/jpeg, 14000 bytes, 193x278; server Content-Type: image/webp) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../secret-class` |  |  |  |
| details thumbnail URL | PASS | `https://s3.imgkomik.xyz/.../Secret-Class.jpg` |  |  |  |
| details author | PASS | Wang Kang-cheol, Wang Kang Cheol |  |  |  |
| details artist | PASS | Wang Kang-cheol, Mina-chan, Wang Kang Cheol |  |  |  |
| details genres | PASS | Manhwa, Drama, Romance, Harem, Adult, Manhwa, Seinen, Full Color, Webtoon |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Komik Manhwa Secret Class (Kelas Rahasia) – Dae Ho, seorang yatim piatu pada usia 13 tahun dan diadopsi oleh teman ayahnya. Namun Dae Ho dimasa dewasa tidak tahu apa-apa tentang hubungan antara pria dan wanita. Bibi dan saudarinya memutuskan untuk memberikan suatu kelas rahasia… |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 324 chapters |  |  |  |
| chapter dates | PASS | 324 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 23 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://s1.imgkomik.xyz/.../1.jpg` (image/webp (encoding: lossy), 57158 bytes, 720x880; server Content-Type: image/jpeg) |  |  |  |
