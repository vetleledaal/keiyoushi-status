# Extension Validation Report

- Extension: tachiyomi-ja.mangaone-v1.4.3
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 31
- Lint: 2
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7948822981386785924
- Source name: Manga One
- Source language: ja
- Selected manga input: popular offset 0: ケンガンオメガ (`.../659`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 296 | ケンガンオメガ (`.../659`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 12 | ケンガンオメガ (`.../659`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | ケンガンオメガ (`.../659`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | ケンガンオメガ (`.../659`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 411 | 第0話 - プロローグ (`.../66863`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 26 |  |  | 1-10s |

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
| popular listing | PASS | 296 entries |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=ケンガンオメガ, URL=`659` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 309/309 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 309/309 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://app.manga-one.com/.../1220.webp <redacted query values: hash and expires>` (image/webp (encoding: lossy), 18584 bytes, 640x400) |  |  |  |
| details identity | PASS | Details preserved selected URL `659` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | サンドロビッチ・ヤバ子,だろめおん |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 企業同士の争いを、雇った闘技者のタイマン勝負で決着をつける…裏格闘。 “拳願仕合(ケンガンジアイ)”の存在を知った一人の男が、山下商事を訪れる…!! あのトーナメントから2年後…『ケンガンアシュラ』から続くシリーズ最新作、開幕!!! |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 244 name, chapter 283 name |  |  |  |
| chapters | PASS | 411 chapters |  |  |  |
| chapter dates | PASS | 411 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 26 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://app.manga-one.com/.../1.webp.enc <redacted query values: hash and expires>` (image/webp (encoding: lossy), 35234 bytes, 720x1020; server Content-Type: application/octet-stream) |  |  |  |
