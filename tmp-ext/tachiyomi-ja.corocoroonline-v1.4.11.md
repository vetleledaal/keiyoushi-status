# Extension Validation Report

- Extension: tachiyomi-ja.corocoroonline-v1.4.11
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 32
- Lint: 1
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7153368437486297689
- Source name: Corocoro Online
- Source language: ja
- Selected manga input: latest offset 0: ぷにるはかわいいスライム (`.../38`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 18 | デュエル・マスターズRX (`.../1156`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 11 | ぷにるはかわいいスライム (`.../38`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | ぷにるはかわいいスライム (`.../38`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | ぷにるはかわいいスライム (`.../38`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 216 | 第1話 (`.../1079`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 13 |  |  | <1s |

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
| popular listing | PASS | 18 entries |  |  |  |
| latest listing | PASS | 11 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=ぷにるはかわいいスライム, URL=`38` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 30/30 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 30/30 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://img.www.corocoro.jp/.../38.webp <redacted query values: h and e>` (image/webp (encoding: lossy), 190110 bytes, 1920x1440) |  |  |  |
| details identity | PASS | Details preserved selected URL `38` |  |  |  |
| details thumbnail URL | PASS | `https://img.www.corocoro.jp/.../38.webp <redacted query values: h and e>` |  |  |  |
| details author | PASS | まえだくん |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | コロコロコミック史上初、異色のラブコメまんが！！主人公・コタローが作ったスライムが超絶美少女の姿に大変身！？ぷにるの自由気ままな言動に少年・コタローは振り回されっぱなし。毎日愉快なドキドキ生活だ!! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 216 chapters |  |  |  |
| chapter dates | PASS | 216 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 13 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://img.www.corocoro.jp/.../1.webp.enc <redacted query values: h and e>` (image/webp (encoding: lossy), 236206 bytes, 1414x2048; server Content-Type: application/octet-stream) |  |  |  |
