# Extension Validation Report

- Extension: tachiyomi-ja.comicyours-v1.6.1
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
- Source theme: gigaviewer
- Source ID: 6785510785647577495
- Source name: Comic Y-OURs
- Source language: ja
- Selected manga input: popular offset 0: Vtuber因幡はねる 深夜の配信外食堂 (`.../12207421984152866357`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 64 | Vtuber因幡はねる 深夜の配信外食堂 (`.../12207421984152866357`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 64 | 東醫怪界 (`.../12207421983749430410`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Vtuber因幡はねる 深夜の配信外食堂 (`.../12207421984152866357`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Vtuber因幡はねる 深夜の配信外食堂 (`.../12207421984152866357`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | 第1話 (`.../12207421984161456487`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 16 |  |  | 1-10s |

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
| popular listing | PASS | 64 entries |  |  |  |
| latest listing | PASS | 64 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Vtuber因幡はねる 深夜の配信外食堂, URL=`12207421984152866357` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 129/129 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 129/129 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-img.comic-y-ours.com/.../12207421984152866357-b72a9558bfcb014e73eb9e01510f00d3 <redacted query values: 1790308596>` (image/png, 866979 bytes, 1200x1200) |  |  |  |
| details identity | PASS | Details preserved selected URL `12207421984152866357` |  |  |  |
| details thumbnail URL | PASS | `https://cdn-img.comic-y-ours.com/.../12207421984152866357-b72a9558bfcb014e73eb9e01510f00d3 <redacted query values: 1790308596>` |  |  |  |
| details author | PASS | さいとう二三.../774 inc. |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 人気Vtuber因幡はねるが、ただただ深夜にご飯を作るお料理コメディ！<br>自分で料理をするのが好きな「ななしいんく」所属のライバー・因幡はねるが<br>配信を閉じた深夜に自炊する時短で美味しい料理の数々と、配信外のVtuberのリアルな生態がここに！<br><br>一日の終わりに料理をすれば、今日がちょっと好きになる。<br>画面を閉じたその先にある、深夜のVtuberの食卓…のぞいてみない？ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 16 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn-img.comic-y-ours.com/.../12207421984309428195-7efecaf6e9f393f6c9c066a1b53245c4` (image/jpeg, 336110 bytes, 853x1200) |  |  |  |
