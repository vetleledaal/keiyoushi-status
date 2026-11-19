# Extension Validation Report

- Extension: tachiyomi-ja.corocoroonline-v1.6.3
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
- Source ID: 7153368437486297689
- Source name: Corocoro Online
- Source language: ja
- Selected manga input: popular offset 0: ドラゴン娘になりたくないっ！ (`.../906`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 19 | ドラゴン娘になりたくないっ！ (`.../906`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 27 | デュエル・マスターズRX (`.../1156`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | ドラゴン娘になりたくないっ！ (`.../906`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | ドラゴン娘になりたくないっ！ (`.../906`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 38 | 第1話 (`.../42498`) |  | <1s |
| pages | `getPageList(chapter)` | success | 40 |  |  | <1s |

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
| popular listing | PASS | 19 entries |  |  |  |
| latest listing | PASS | 27 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=ドラゴン娘になりたくないっ！, URL=`906` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 48/48 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 48/48 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://img.www.corocoro.jp/.../906.webp <redacted query values: h and e>` (image/webp (encoding: lossy), 266722 bytes, 1920x1440) |  |  |  |
| details identity | PASS | Details preserved selected URL `906` |  |  |  |
| details thumbnail URL | PASS | `https://img.www.corocoro.jp/.../906.webp <redacted query values: h and e>` |  |  |  |
| details author | PASS | 九段そごう |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | フツーの女子高生５人が、ドラゴンに変身できる「ドラゴン娘」に!?　ただ平穏な高校生活を送りたいだけの５人は、無事平穏なJKライフを過ごせるのー!?　総再生回数３億超えの超人気YouTubeアニメ、エモくてかわちぃ初公式コミカライズですっ！<br> |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 38 chapters |  |  |  |
| chapter dates | PASS | 38 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 40 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://img.www.corocoro.jp/.../1.webp.enc <redacted query values: h and e>` (image/webp (encoding: lossy), 239330 bytes, 1414x2048; server Content-Type: application/octet-stream) |  |  |  |
