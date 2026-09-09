# Extension Validation Report

- Extension: tachiyomi-zh.hcomic-v1.6.2
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
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
- Selected manga input: popular offset 0: (C104) [狼狽亭 (atahuta)] ごめんね。 (AZKi) [中国翻訳] (`.../1`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | (C104) [狼狽亭 (atahuta)] ごめんね。 (AZKi) [中国翻訳] (`.../1`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 10 | (C104) [狼狽亭 (atahuta)] ごめんね。 (AZKi) [中国翻訳] (`.../1`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 10 | [悶騷的盤子 (悶騷)] 酪酊少女樂隊 (ガールズバンドクライ) [中国語] (`.../1`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 10 | [よもぎ豆太郎] 淫惨の虜 (ANGEL倶楽部 2026年9月号) [中国翻訳] [DL版] (`.../1`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 3 | (C104) [狼狽亭 (atahuta)] ごめんね。 (AZKi) [中国翻訳] (`.../1`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | (C104) [狼狽亭 (atahuta)] ごめんね。 (AZKi) [中国翻訳] (`.../1`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | (C104) [狼狽亭 (atahuta)] ごめんね。 (AZKi) [中国翻訳] (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 37 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=(C104) \[狼狽亭 (atahuta)\] ごめんね。 (AZKi) \[中国翻訳\], URL=`.../1` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | FAIL | Page 2 matches page 1 exactly | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 43/43 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 43/43 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://h-comic.link/.../3036589` (image/jpeg, 28468 bytes, 500x726; server Content-Type: image/jpg) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../1` |  |  |  |
| details thumbnail URL | PASS | `https://h-comic.link/.../3036589` |  |  |  |
| details author | PASS | よろず |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 巨乳, vtuber, extraneous ads |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | **原著：** hololive<br>**角色：** azki<br>**製作組：** 狼狽亭<br>**页数：** 37 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 37 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://h-comic.link/.../1` (image/jpeg, 431910 bytes, 1280x1859; server Content-Type: image/jpg) |  |  |  |
