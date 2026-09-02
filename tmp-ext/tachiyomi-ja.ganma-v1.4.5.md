# Extension Validation Report

- Extension: tachiyomi-ja.ganma-v1.4.5
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 33
- Lint: 0
- Warnings: 1
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8045942616403978870
- Source name: GANMA!
- Source language: ja
- Selected manga input: latest offset 0: きゃたぴランド (`.../kyatapi`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 35 | 子連れバツイチ、最後の恋は沼でした。 (`.../kozurenuma`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 20 | きゃたぴランド (`.../kyatapi`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 17 | 序曲〜ひとりよがりな先輩へ〜 (`.../yomikiri202605_06`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 20 | きゃたぴランド (`.../kyatapi`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | きゃたぴランド (`.../kyatapi`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 155 | 第1話 しんそつ！！ (`.../8c1ab720-60cc-11ee-a11e-86ad1c7f6bc1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 13 |  |  | 1-10s |

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
| popular listing | PASS | 35 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=きゃたぴランド, URL=`kyatapi` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 92/92 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 92/92 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://d1bzi54d5ruxfk.cloudfront.net/.../32788310-6826-11f0-8e03-96e8f2a966e0.jpg <redacted query values: Policy, Signature, and Key-Pair-Id>` (image/jpeg, 1065558 bytes, 1920x1276) |  |  |  |
| details identity | PASS | Details preserved selected URL `kyatapi` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://d1bzi54d5ruxfk.cloudfront.net/.../a70c08d0-633e-11ee-8047-3eceeb260a35.jpg <redacted query values: Policy, Signature, and Key-Pair-Id>` (image/jpeg, 368663 bytes, 1180x1180) |  |  |  |
| details author | PASS | きゃた |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 4コマ, ギャグ, 日常, 少年漫画, 1か月先読み |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | SNSで100万いいね超えの４コマシリーズが連載化！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 155 chapters |  |  |  |
| chapter dates | PASS | 155 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 13 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://d1bzi54d5ruxfk.cloudfront.net/.../1.jpg <redacted query values: Policy, Signature, Key-Pair-Id, and w>` (image/jpeg, 910108 bytes, 1975x2783) |  |  |  |
