# Extension Validation Report

- Extension: tachiyomi-zh.hcomic-v1.6.2
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 36
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 984224034780344743
- Source name: H-Comic
- Source language: zh
- Selected manga input: popular offset 0: [ひっさつわざ (ひっさつくん)] 無人駅 lll [中国翻訳] [無修正] [DL版] (`.../1`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | [ひっさつわざ (ひっさつくん)] 無人駅 lll [中国翻訳] [無修正] [DL版] (`.../1`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 10 | [ひっさつわざ (ひっさつくん)] 無人駅 lll [中国翻訳] [無修正] [DL版] (`.../1`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 10 | [circle82 (はづきふたひ)] 僕は幼馴染じゃなくてお母さんが好きなんです！！[中国翻訳] [DL版] (`.../1`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 10 | 青梅竹马是透明人 第06话 (`.../1`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | [ひっさつわざ (ひっさつくん)] 無人駅 lll [中国翻訳] [無修正] [DL版] (`.../1`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | [ひっさつわざ (ひっさつくん)] 無人駅 lll [中国翻訳] [無修正] [DL版] (`.../1`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | [ひっさつわざ (ひっさつくん)] 無人駅 lll [中国翻訳] [無修正] [DL版] (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 31 |  |  | <1s |

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
| latest listing | PASS | 10 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=\[ひっさつわざ (ひっさつくん)\] 無人駅 lll \[中国翻訳\] \[無修正\] \[DL版\], URL=`.../1` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | FAIL | Page 2 matches page 1 exactly | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 41/41 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 41/41 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://h-comic.link/.../2749165` (image/jpeg, 31316 bytes, 500x700; server Content-Type: image/jpg) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../1` |  |  |  |
| details thumbnail URL | PASS | `https://h-comic.link/.../2749165` |  |  |  |
| details author | PASS | ひっさつくん |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 無修正, 兩女一男, 多作品系列, bbm |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | **原著：** 原創<br>**製作組：** ひっさつわざ<br>**页数：** 31 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 31 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://h-comic.link/.../1` (image/jpeg, 413882 bytes, 1280x1791; server Content-Type: image/jpg) |  |  |  |
