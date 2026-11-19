# Extension Validation Report

- Extension: tachiyomi-ja.hakusensha-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 26
- Lint: 2
- Warnings: 0
- Skipped: 8
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3812676510487645204
- Source name: Hakusensha e-net
- Source language: ja
- Selected manga input: popular offset 0: 暁のヨナ (`.../akayona`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 6 | 暁のヨナ (`.../akayona`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 278 | アオハルコンチェルト［1話売り］ (`.../p-aohacnc`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 6 | 暁のヨナ (`.../akayona`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 暁のヨナ (`.../akayona`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 48 | 🔒 1巻 (`.../59219081akayona00111`) |  | <1s |
| pages | `getPageList(chapter)` | error | 0 |  | java.lang.Exception: Log in via WebView and purchase this chapter to read. | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | java.lang.Exception: Log in via WebView and purchase this chapter to read. | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 6 entries |  |  |  |
| latest listing | PASS | 278 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=暁のヨナ, URL=`akayona` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 290/290 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 290/290 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://assets.hakusensha-e.net/.../v-akayona_048_1_1.jpg` (image/jpeg, 4152093 bytes, 1629x2560) |  |  |  |
| details identity | PASS | Details preserved selected URL `akayona` |  |  |  |
| details thumbnail URL | PASS | `https://assets.hakusensha-e.net/.../v-akayona_048_1_1.jpg` |  |  |  |
| details author | PASS | 草凪みずほ |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | ラブ, コメディ, ファンタジー |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 高華王国の姫・ヨナは一人娘のため、優しい父王と幼なじみで護衛のハク達に囲まれ、大切に育てられていた。そして時はヨナ・16歳の誕生日、ヨナは想いを寄せていた従兄のスウォンから簪を贈られ、父へ自分の気持ちを伝えに行く。が、そこには思いも寄らぬ過酷な運命が!? |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 1 name |  |  |  |
| chapters | PASS | 48 chapters |  |  |  |
| chapter dates | PASS | 48 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | Log in via WebView and purchase this chapter to read. |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
