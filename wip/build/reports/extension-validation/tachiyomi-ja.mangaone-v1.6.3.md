# Extension Validation Report

- Extension: tachiyomi-ja.mangaone-v1.6.3
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 31
- Lint: 2
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7948822981386785924
- Source name: Manga One
- Source language: ja
- Selected manga input: popular offset 0: 最強女師匠たちが育成方針を巡って修羅場 (`.../1749`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 320 | 最強女師匠たちが育成方針を巡って修羅場 (`.../1749`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 22 | 最強女師匠たちが育成方針を巡って修羅場 (`.../1749`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 最強女師匠たちが育成方針を巡って修羅場 (`.../1749`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 最強女師匠たちが育成方針を巡って修羅場 (`.../1749`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 198 | 第1話 - 世界最強たちの悩み (`.../157056`) |  | <1s |
| pages | `getPageList(chapter)` | success | 62 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 320 entries |  |  |  |
| latest listing | PASS | 22 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=最強女師匠たちが育成方針を巡って修羅場, URL=`1749` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 343/343 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 343/343 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://app.manga-one.com/.../3018.webp <redacted query values: hash and expires>` (image/webp (encoding: lossy), 34372 bytes, 640x400) |  |  |  |
| details identity | PASS | Details preserved selected URL `1749` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | 小野洋一郎,赤城大空,タジマ粒子 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 世界最強クラスと称される三人の女傑。 そんな彼女たちでも手に入らないモノ…… それは———理想の男!! 「好みの男がいないなら、自分で育てりゃいいじゃない！」 弟子ーーもとい、未来の旦那候補として彼女たちが目をつけたのは… 才能の欠片もないレベル 0 の少年で——!? 『ブレイブ・ストーリー～新説～』小野洋一郎×『下ネタという概念が存在しない退屈な世界』赤城大空のタッグで描く、レベルUP育成ファンタジー!! |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 101 name, chapter 140 name, chapter 142 name, chapter 144 name, chapter 183 name, chapter 184 name |  |  |  |
| chapters | PASS | 198 chapters |  |  |  |
| chapter dates | PASS | 198 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 62 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://app.manga-one.com/.../1.webp.enc <redacted query values: hash and expires>` (image/webp (encoding: lossy), 36236 bytes, 720x1020; server Content-Type: application/octet-stream) |  |  |  |
