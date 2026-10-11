# Extension Validation Report

- Extension: tachiyomi-ja.ichicomi-v1.6.1
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
- Source ID: 2248461957459826404
- Source name: Ichicomi
- Source language: ja
- Selected manga input: popular offset 0: アークナイツ ロドスキッチン -TIDBITS- (`.../2550912965923184031`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 787 | アークナイツ ロドスキッチン -TIDBITS- (`.../2550912965923184031`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 787 | だから私は殺すことにした (`.../12207421983918924454`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | アークナイツ ロドスキッチン -TIDBITS- (`.../2550912965923184031`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | アークナイツ ロドスキッチン -TIDBITS- (`.../2550912965923184031`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 10 | 第1話 (`.../2550912965923204001`) |  | 1-10s |
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
| popular listing | PASS | 787 entries |  |  |  |
| latest listing | PASS | 787 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=アークナイツ ロドスキッチン -TIDBITS-, URL=`2550912965923184031` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 1575/1575 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 1575/1575 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-img.ichicomi.com/.../2550912965923184031-15b68a4d39215ee46f1b65f8580c6d83 <redacted query values: 1754016787>` (image/png, 1460022 bytes, 770x990) |  |  |  |
| details identity | PASS | Details preserved selected URL `2550912965923184031` |  |  |  |
| details thumbnail URL | PASS | `https://cdn-img.ichicomi.com/.../2550912965923184031-15b68a4d39215ee46f1b65f8580c6d83 <redacted query values: 1754016787>` |  |  |  |
| details author | PASS | 馬かのこ.../HYPERGRYPH |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 大人気ゲーム『アークナイツ』公式スピンオフ――!!　HYPERGRYPHによる書き下ろしストーリーを完全コミカライズ。　ロドスでの「食」を通して、テラに生きる人々の様々な物語が紡がれる。　嬉しいことも悲しいことも、おいしい料理がそっと包み込む。 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 10 chapters |  |  |  |
| chapter dates | PASS | 10 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 33 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn-img.ichicomi.com/.../2550912965923568931-2dc217c727ffb8d53d2826271318deec` (image/jpeg, 8541666 bytes, 4228x6070) |  |  |  |
