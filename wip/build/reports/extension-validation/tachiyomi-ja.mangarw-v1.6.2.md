# Extension Validation Report

- Extension: tachiyomi-ja.mangarw-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 31
- Lint: 2
- Warnings: 1
- Skipped: 2
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7145934117309913101
- Source name: Manga Rw
- Source language: ja
- Selected manga input: popular offset 0: キングダム Raw Free (`.../348`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 47 | キングダム (`.../348`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 30 | 姿を偽っていた令嬢は、女嫌いな公爵様のお世話係をしているうちに溺愛されていたみたいです (`.../11850`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 30 | 「お相手は一般の方です」 (`.../12537`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 30 | 姿を偽っていた令嬢は、女嫌いな公爵様のお世話係をしているうちに溺愛されていたみたいです (`.../11850`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | キングダム Raw Free (`.../348`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 891 | 第1話 (`.../read <redacted query values: id>`) |  | <1s |
| pages | `getPageList(chapter)` | success | 56 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 47 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | FAIL | No search result matched the selected manga URL or exact title; search result count: 30 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=「お相手は一般の方です」, URL=`.../12537` at page 1 offset 28 and page 2 offset 0 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 137/137 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 137/137 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.mangaraw123.com/.../kingudamu.jpg` (image/webp (encoding: lossy), 95984 bytes, 480x640) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../348` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.mangaraw123.com/.../kingudamu.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Adventure, Business, Comedy, Cooking, Drama, Ecchi, Fantasy, Harem, Historical, Horror, Isekai, Martial Arts, Mature, Mecha, Medical, Military, Music, Mystery, Psychological, Romance, School, Sci-Fi, Seinen, Shoujo, Shounen, Slice of Life, Sports, Supernatural, Thriller, Yaoi, Yuri, Action, Adventure, Business, Comedy, Cooking, Drama, Ecchi, Fantasy, Harem, Historical, Horror, Isekai, Martial Arts, Mature, Mecha, Medical, Military, Music, Mystery, Psychological, Romance, School, Sci-Fi, Seinen, Shoujo, Shounen, Slice of Life, Sports, Supernatural, Thriller, Yaoi, Yuri, Seinen, Historical, Action, Fantasy, 少年漫画 raw, アクション raw, ファンタジー raw, ロマンス raw, 異世界 raw |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 891 chapters |  |  |  |
| chapter dates | LINT | All 891 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=891 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 56 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://storage.mangabuzz.org/.../0.webp` (image/webp (encoding: lossy), 330598 bytes, 835x1200) |  |  |  |
