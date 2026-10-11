# Extension Validation Report

- Extension: tachiyomi-ja.gorakuweb-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 30
- Lint: 3
- Warnings: 0
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
- Selected manga input: popular offset 0: 撲殺ピンク～性犯罪者処刑人～ (`.../4286260776059849604`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | 撲殺ピンク～性犯罪者処刑人～ (`.../4286260776059849604`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 5 | 俺たちってどうヤッてたっけ!? (`.../5216055947637884768`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 撲殺ピンク～性犯罪者処刑人～ (`.../4286260776059849604`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 撲殺ピンク～性犯罪者処刑人～ (`.../4286260776059849604`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 294 | 第1話 ルーズソックス① - ① (`.../6069914714483902659`) |  | <1s |
| pages | `getPageList(chapter)` | success | 30 |  |  | 1-10s |

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
| latest listing | PASS | 5 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=撲殺ピンク～性犯罪者処刑人～, URL=`4286260776059849604` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 16/16 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 16/16 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://gorakuweb-asset.akamaized.net/.../8818821698947152258.webp` (image/webp (container: extended), 27016 bytes, 460x282) |  |  |  |
| details identity | PASS | Details preserved selected URL `4286260776059849604` |  |  |  |
| details thumbnail URL | PASS | `https://gorakuweb-asset.akamaized.net/.../8818821698947152258.webp` |  |  |  |
| details author | PASS | 山本晃司 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 人気絶好調!!!各電子書店で話題独占中!!!!!大切な命と引き換えに、手に入れた、小さくて、大きな希望――。ただ、前へ。<br>隆三の想いが、それぞれのココロを強く突き動かす。いま、残された家族が向かう先とは――!? <br>そして立ちはだかる、新たなピンクとは…!?性犯罪者処刑人。その歪な正義と向き合う、刮目の第６集!!! |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 77 name, chapter 78 name, chapter 95 name |  |  |  |
| chapters | PASS | 294 chapters |  |  |  |
| chapter dates | PASS | 294 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | LINT | Page indices are 1-indexed, but should be 0-indexed |  |  |  |
| page URLs | PASS | 30 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://gorakuweb-content.akamaized.net/.../1 <redacted query values: __token__>` (image/webp (encoding: lossy), 142120 bytes, 844x1200; server Content-Type: application/octet-stream) |  |  |  |
