# Extension Validation Report

- Extension: tachiyomi-all.ahottie-v1.6.4
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 29
- Lint: 1
- Warnings: 0
- Skipped: 5
- Failed: 2
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6289731484943315811
- Source name: AHottie
- Source language: all
- Selected manga input: popular offset 0: Emika Shirakami 白上咲花, 写真集 「Blooming」 Set.03 (`.../f660dcb77e09c286aa5f5eef73bdb65b`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 48 | Emika Shirakami 白上咲花, 写真集 「Blooming」 Set.03 (`.../f660dcb77e09c286aa5f5eef73bdb65b`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 48 | Rio Kureha 紅羽りお, Weekly SPA! 2026.03.10 (週刊SPA! 2026年3月10日号) (`.../31ea79cbc0fd2dc8de31f09d529f1d83`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Emika Shirakami 白上咲花, 写真集 「Blooming」 Set.03 (`.../f660dcb77e09c286aa5f5eef73bdb65b`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Emika Shirakami 白上咲花, 写真集 「Blooming」 Set.03 (`.../f660dcb77e09c286aa5f5eef73bdb65b`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | GALLERY (`.../f660dcb77e09c286aa5f5eef73bdb65b`) |  | <1s |
| pages | `getPageList(chapter)` | success | 30 |  |  | 1-10s |

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
| popular listing | PASS | 48 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Emika Shirakami 白上咲花, 写真集 「Blooming」 Set.03, URL=`.../f660dcb77e09c286aa5f5eef73bdb65b` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | FAIL | `https://images2.imgbox.com/.../gjf590ov_o.jpg` (image/jpeg, 8091 bytes, 240x240); known placeholder: imgbox: Thumbnail Temporarily Unavailable | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| details identity | PASS | Details preserved selected URL `.../f660dcb77e09c286aa5f5eef73bdb65b` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Emika Shirakami 白上咲花, ヌード写真集 |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 30 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | FAIL | `https://images2.imgbox.com/.../iBqbQLvz_o.jpg` (image/jpeg, 8091 bytes, 240x240); known placeholder: imgbox: Thumbnail Temporarily Unavailable | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
