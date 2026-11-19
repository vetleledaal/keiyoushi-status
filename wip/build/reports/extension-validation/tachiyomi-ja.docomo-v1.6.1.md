# Extension Validation Report

- Extension: tachiyomi-ja.docomo-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 28
- Lint: 3
- Warnings: 0
- Skipped: 5
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2833994049092509182
- Source name: Docomo
- Source language: ja
- Selected manga input: popular offset 0: キングダム 81 (`.../2000`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 50 | キングダム 81 (`.../2000`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 50 | 写らナイんです（１０） (`.../2000`) |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | キングダム (`.../2000`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | キングダム 81 (`.../2000`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 81 | キングダム 1 (`.../dcbd9ab5665a297bd4ce1a3503bc88f627f16bf6ec697ebd5925280c72212435`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 221 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 50 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | FAIL | No search result matched the selected manga URL or exact title; search result count: 1 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mw-cds.akamaized.net/.../cover.jpg <redacted query values: ivm>` (image/jpeg, 25936 bytes, 205x256) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../2000` |  |  |  |
| details thumbnail URL | PASS | `https://mw-cds.akamaized.net/.../cover.jpg <redacted query values: ivm>` |  |  |  |
| details author | PASS | 原泰久 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 青年マンガ |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 飛信隊壊滅の危機を脱せよ！　紀元前229年　趙完全攻略戦　李牧が敷く堅牢な防衛網により、膠着状態が続く秦趙戦。秦軍は楽華軍・羌カイ軍・飛信隊による三軍連合攻撃を展開し、遂に李信達は趙王都・邯鄲への到達を果たす。しかし、攻城戦を前に、飛信隊は李牧の策略によって趙の大軍勢の襲撃に遭い、絶体絶命の窮地に陥り…!? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 81 chapters |  |  |  |
| chapter dates | LINT | All 81 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=81 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | LINT | Page indices are 1-indexed, but should be 0-indexed |  |  |  |
| page URLs | PASS | 221 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://d21agqkwgk4jud.cloudfront.net/.../10acc7a656bb96436f.jpeg` (image/jpeg, 330293 bytes, 840x1200) |  |  |  |
