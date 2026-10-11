# Extension Validation Report

- Extension: tachiyomi-ja.drecomics-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 33
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 3
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8766832343449907432
- Source name: DreComi+
- Source language: ja
- Selected manga input: popular offset 0: 魔物使いの娘 (`.../CD00035`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | 魔物使いの娘 (`.../CD00035`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 10 | 成長率100倍チートの転生幼女 (`.../CD00041`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 18 | 悪徳貴族の生存戦略 (`.../CD00006`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 18 | 隠居暮らしのおっさん、女王陛下の剣となる (`.../CD00022`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 魔物使いの娘 (`.../CD00035`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 魔物使いの娘 (`.../CD00035`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 5 | 第1話（1） (`.../CD00035-001-001`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 24 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 18 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=魔物使いの娘, URL=`CD00035` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 57/57 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 57/57 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | FAIL | Thumbnail URL `https://cdn.drecomi-plus.jp/.../7584dfeb31ee01eb.webp` could not be downloaded: java.io.IOException: This service can only be used from Japan. | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| details identity | PASS | Details preserved selected URL `CD00035` |  |  |  |
| details thumbnail URL | FAIL | Differs from selected listing thumbnail; Thumbnail URL `https://cdn.drecomi-plus.jp/.../60203dbebb83cea3.webp` could not be downloaded: java.io.IOException: This service can only be used from Japan. | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| details author | PASS | 佐藤勇, 天都ダム, しらび |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | ファンタジー, チート能力, 異世界, バトル, コメディ, コミカライズ, ドリコムメディア大賞受賞作 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | かつて魔物たちを従えたと呼ばれる伝説の魔女の末裔リーン。そんな彼女に命を助けられた、冒険者ハクラはある事情から護衛として雇われ、一緒に旅をすることに。<br>特別な力を持つ彼女に舞い込んでくるのは、どれも厄介な魔物が関わる事件ばかりだが、実は魔物だけではなく人間にも原因があって……。<br>自信家でわがままで、だけどどこか放っておけない小悪魔なリーンと歩んでいく普通じゃない物語が始まろうとしていた。<br>第2回ドリコムメディア大賞《大賞》受賞作を見事な筆致でコミカライズ!!<br><br>第2・第4金曜日<br><br>更新予定: 2026年10月23日(金) |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 5 chapters |  |  |  |
| chapter dates | PASS | 5 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | LINT | Page indices are 1-indexed, but should be 0-indexed |  |  |  |
| page URLs | PASS | 24 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | FAIL | First page URL `https://cdn.drecomi-plus.jp/.../5434cb84ee11337a_0001.webp.enc` could not be downloaded: java.io.IOException: This service can only be used from Japan. | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
