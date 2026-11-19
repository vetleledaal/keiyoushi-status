# Extension Validation Report

- Extension: tachiyomi-zh.hcomic-v1.6.3
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 35
- Lint: 0
- Warnings: 1
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
- Selected manga input: popular offset 0: (COMIC1☆7) [JACK-POT (じゅら)] TEK○EN ～睡眠薬ver～ (鉄拳) [中国翻訳] (`.../1`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | (COMIC1☆7) [JACK-POT (じゅら)] TEK○EN ～睡眠薬ver～ (鉄拳) [中国翻訳] (`.../1`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 10 | (COMIC1☆7) [JACK-POT (じゅら)] TEK○EN ～睡眠薬ver～ (鉄拳) [中国翻訳] (`.../1`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 10 | [馬鈴薯太郎] ヘイズ、ベルを診察する (ダンジョンに出会いを求めるのは間違っているだろうか)  [英訳] (`.../1`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 10 | [Chair] 宝多六花催眠計画 (SSSS.GRIDMAN) (`.../1`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | (COMIC1☆7) [JACK-POT (じゅら)] TEK○EN ～睡眠薬ver～ (鉄拳) [中国翻訳] (`.../1`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | (COMIC1☆7) [JACK-POT (じゅら)] TEK○EN ～睡眠薬ver～ (鉄拳) [中国翻訳] (`.../1`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | (COMIC1☆7) [JACK-POT (じゅら)] TEK○EN ～睡眠薬ver～ (鉄拳) [中国翻訳] (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 27 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=(COMIC1☆7) \[JACK-POT (じゅら)\] TEK○EN ～睡眠薬ver～ (鉄拳) \[中国翻訳\], URL=`.../1` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | FAIL | Page 2 matches page 1 exactly | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 42/42 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 42/42 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://h-comic.link/.../994710` (image/jpeg, 49664 bytes, 250x355; server Content-Type: image/jpg) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../1` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://h-comic.link/.../994436` (image/jpeg, 49664 bytes, 250x355; server Content-Type: image/jpg) |  |  |  |
| details author | PASS | じゅら |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 泳裝, 睡眠, 女學生, 強姦, 藥物, null, 口交, 比基尼, 巨乳, 群交 |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | **原著：** 鉄拳<br>**角色：** lili rochefort、asuka kazama<br>**製作組：** JACK-POT<br>**页数：** 27 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 27 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://h-comic.link/.../1` (image/jpeg, 618591 bytes, 1280x1817; server Content-Type: image/jpg) |  |  |  |
