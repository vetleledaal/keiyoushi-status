# Extension Validation Report

- Extension: tachiyomi-ja.gorakuweb-v1.6.4
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 30
- Lint: 2
- Warnings: 1
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8261703368756535165
- Source name: Goraku Web
- Source language: ja
- Selected manga input: latest offset 0: はぐれアイドル地獄変 (`.../4632579990158199795`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | 時先生は着替えたい (`.../4722667705029131308`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 12 | はぐれアイドル地獄変 (`.../4632579990158199795`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | はぐれアイドル地獄変 (`.../4632579990158199795`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | はぐれアイドル地獄変 (`.../4632579990158199795`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 137 | 第1話 The Gate of the HELL (`.../5196698732833371870`) |  | <1s |
| pages | `getPageList(chapter)` | success | 33 |  |  | 1-10s |

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
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=はぐれアイドル地獄変, URL=`4632579990158199795` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 23/23 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 23/23 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://gorakuweb-asset.akamaized.net/.../6645524064155581999.webp` (image/webp (container: extended), 368266 bytes, 3833x2350) |  |  |  |
| details identity | PASS | Details preserved selected URL `4632579990158199795` |  |  |  |
| details thumbnail URL | PASS | `https://gorakuweb-asset.akamaized.net/.../6645524064155581999.webp` |  |  |  |
| details author | PASS | 高遠るい |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 一肌脱ぎます、戦います!!　芸能界の生き残りを賭けて戦うセクシーアイドル伝説、ここに開幕!!　己の肉体を武器に、沖縄少女はどこまでセクシーバイオレンスになれるのか!?笑いあり、お下品満載で贈る超問題作!! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 137 chapters |  |  |  |
| chapter dates | PASS | 137 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | LINT | Page indices are 1-indexed, but should be 0-indexed |  |  |  |
| page URLs | PASS | 33 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://gorakuweb.com` to `https://gorakuweb.com <redacted query values: _rsc>` (1 redirects); popular: `https://gorakuweb.com/.../4632579990158199795` to `https://gorakuweb.com/.../4632579990158199795 <redacted query values: _rsc>` (1 redirects); popular: `https://gorakuweb.com/.../5196698732833371870` to `https://gorakuweb.com/.../5196698732833371870 <redacted query values: _rsc>` (1 redirects) |  |  |  |
| page load | PASS | `https://gorakuweb-content.akamaized.net/.../1 <redacted query values: __token__>` (image/webp (encoding: lossy), 88010 bytes, 844x1200; server Content-Type: application/octet-stream) |  |  |  |
