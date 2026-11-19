# Extension Validation Report

- Extension: tachiyomi-ja.kisslove-v1.6.23
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 35
- Lint: 0
- Warnings: 0
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6304246026723672697
- Source name: KissLove
- Source language: ja
- Selected manga input: popular offset 0: DANCE DANCE DANSEUR - RAW (`.../dance-dance-danseur-raw`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | DANCE DANCE DANSEUR - RAW (`.../dance-dance-danseur-raw`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 36 | DANZAI SARERU KOUSHAKU REIJOU, UMAREKAWATTE LAST BOSS NO OUHI-SAMA NO KODOMO NI NARIMASU (`.../danzai-sareru-koushaku-reijou-umarekawatte-last-boss-no-ouhi-sama-no-kodomo-ni-narimasu`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 36 | IMOUTO-CHAN NO IU TOORI NI SHITE ITARA HAOU NI NACCHATTA KEDO, DOU SHIYOU? (`.../imouto-chan-no-iu-toori-ni-shite-itara-haou-ni-nacchatta-kedo-dou-shiyou`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 11 | DANCE DANCE DANSEUR - RAW (`.../dance-dance-danseur-raw`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | DANCE DANCE DANSEUR - RAW (`.../dance-dance-danseur-raw`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 279 | Chapter 1.0 (`.../dance-dance-danseur-raw-chapter-1.0`) |  | <1s |
| pages | `getPageList(chapter)` | success | 55 |  |  | <1s |

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
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 36 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=DANCE DANCE DANSEUR - RAW, URL=`dance-dance-danseur-raw` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 93/93 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 93/93 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://j4.jfimv2.xyz/.../1_5f385f98c66a5.jpg` (image/jpeg, 252729 bytes, 848x1200) |  |  |  |
| details identity | PASS | Details preserved selected URL `dance-dance-danseur-raw` |  |  |  |
| details thumbnail URL | PASS | `https://j4.jfimv2.xyz/.../1_5f385f98c66a5.jpg` |  |  |  |
| details author | PASS | GEORGE Asakura |  |  |  |
| details artist | PASS | GEORGE Asakura |  |  |  |
| details genres | PASS | Drama, Romance, Seinen, Slice of Life, Sports |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Updating<br><br>ダンス・ダンス・ダンスール |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 279 chapters |  |  |  |
| chapter dates | PASS | 279 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 55 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://j2.jfimv2.xyz/.../e416afa00358913e8823e629712537295.jpg` (image/jpeg, 334033 bytes, 848x1200) |  |  |  |
