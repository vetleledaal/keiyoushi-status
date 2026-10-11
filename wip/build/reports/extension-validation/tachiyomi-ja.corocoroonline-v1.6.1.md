# Extension Validation Report

- Extension: tachiyomi-ja.corocoroonline-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 32
- Lint: 1
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7153368437486297689
- Source name: Corocoro Online
- Source language: ja
- Selected manga input: popular offset 0: Duel Masters Pure PLAY'S (`.../1203`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 17 | Duel Masters Pure PLAY'S (`.../1203`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 13 | ブラックチャンネル (`.../188`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 3 | Duel Masters Pure PLAY'S (`.../1203`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Duel Masters Pure PLAY'S (`.../1203`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 4 | 第1話 (`.../52146`) |  | <1s |
| pages | `getPageList(chapter)` | success | 24 |  |  | <1s |

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
| popular listing | PASS | 17 entries |  |  |  |
| latest listing | PASS | 13 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Duel Masters Pure PLAY'S, URL=`1203` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 33/33 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 33/33 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://img.www.corocoro.jp/.../1203.webp <redacted query values: h and e>` (image/webp (encoding: lossy), 184302 bytes, 1920x1440) |  |  |  |
| details identity | PASS | Details preserved selected URL `1203` |  |  |  |
| details thumbnail URL | PASS | `https://img.www.corocoro.jp/.../1203.webp <redacted query values: h and e>` |  |  |  |
| details author | PASS | 【漫画】やよいれき, 【ストーリー原案.../%E7%9B%A3%E4%BF%AE%E3%80%91%E9%87%8E%E5%B3%B6%E5%A4%AE%E5%B7%9E%EF%BC%88%E3%82%BF%E3%82%AB%E3%83%A9%E3%83%88%E3%83%9F%E3%83%BC%EF%BC%89 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 世界中のデュエマ好きが集まる都市「デュエマシティ」。そんなシティに新たな住人・カノンとウェディングがやってきた！<br>2人は、「感情」や人間社会に疎い「ゼニス」であったが、個性豊かな他の住人たちと様々な経験をすることで、次第に「感情」の素晴らしさを実感していく。 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 4 chapters |  |  |  |
| chapter dates | PASS | 4 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 24 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://img.www.corocoro.jp/.../1.webp.enc <redacted query values: h and e>` (image/webp (encoding: lossy), 163086 bytes, 1445x2048; server Content-Type: application/octet-stream) |  |  |  |
