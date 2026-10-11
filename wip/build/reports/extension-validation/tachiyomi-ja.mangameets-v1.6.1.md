# Extension Validation Report

- Extension: tachiyomi-ja.mangameets-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 36
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2561264003659474410
- Source name: MangaMeets
- Source language: ja
- Selected manga input: popular offset 0: 恋の1コマ (恋コマ) (`.../c41e152b-f770-4b49-860b-fd5e59ce193f`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | 恋の1コマ (恋コマ) (`.../c41e152b-f770-4b49-860b-fd5e59ce193f`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 20 | デート (`.../79383f95-ebcb-479f-9c93-fa3725aee9d4`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 20 | まりいゴールド (`.../d6c3bcdb-5de7-4551-b9b8-51a61c25ff73`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 17 | 娼館No.1の男の娘エルフと黒服くんの話。 (`.../72fbb0ee-26c8-49cc-a728-e5c697b2f917`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 20 | 恋の1コマ (恋コマ) (`.../c41e152b-f770-4b49-860b-fd5e59ce193f`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 恋の1コマ (恋コマ) (`.../c41e152b-f770-4b49-860b-fd5e59ce193f`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 21 | Chapter 1 - 独占欲が強すぎる幼なじみ😠 (`.../03c8a166-c3b5-4970-8d2a-0b61f723a564`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 5 |  |  | <1s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=恋の1コマ (恋コマ), URL=`c41e152b-f770-4b49-860b-fd5e59ce193f` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `http://res.cloudinary.com/.../jch71qcxu1ftwcrs7kzg.png` (image/png, 1157729 bytes, 1400x840) |  |  |  |
| details identity | PASS | Details preserved selected URL `c41e152b-f770-4b49-860b-fd5e59ce193f` |  |  |  |
| details thumbnail URL | PASS | `http://res.cloudinary.com/.../jch71qcxu1ftwcrs7kzg.png` |  |  |  |
| details author | PASS | ぽんちゃん亭 |  |  |  |
| details artist | PASS | ぽんちゃん亭 |  |  |  |
| details genres | PASS | 恋愛 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | キュンとする〝恋の1コマ〟を短編で投稿します！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 21 chapters |  |  |  |
| chapter dates | PASS | 21 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | LINT | Page indices are 1-indexed, but should be 0-indexed |  |  |  |
| page URLs | PASS | 5 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://res.cloudinary.com/.../pdywknk1tqug7esyrusg.png` (image/jpeg, 181835 bytes, 1080x1440) |  |  |  |
