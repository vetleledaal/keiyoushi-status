# Extension Validation Report

- Extension: tachiyomi-id.shirodoujin-v1.6.5
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 34
- Lint: 2
- Warnings: 0
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: zmanga
- Source ID: 8468586261171749665
- Source name: Shiro Doujin
- Source language: id
- Selected manga input: popular offset 0: A bodyguard can’t protect you from this Bahasa Indonesia (`.../a-bodyguard-cant-protect-you-from-this-bahasa-indonesia`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 16 | A bodyguard can’t protect you from this Bahasa Indonesia (`.../a-bodyguard-cant-protect-you-from-this-bahasa-indonesia`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 16 | Secret Class (`.../secret-class`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 16 | Kanojo no Shinyuu de Do-M na Gal ga Oshikakete Kita Bahasa Indonesia (`.../kanojo-no-shinyuu-de-do-m-na-gal-ga-oshikakete-kita-bahasa-indonesia`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 16 | Single Daddy Bahasa Indonesia (`.../single-daddy-bahasa-indonesia`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | A bodyguard can’t protect you from this Bahasa Indonesia (`.../a-bodyguard-cant-protect-you-from-this-bahasa-indonesia`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter 1 (`.../a-bodyguard-cant-protect-you-from-this-bahasa-indonesia-chapter-1-bahasa-indonesia`) |  | <1s |
| pages | `getPageList(chapter)` | success | 25 |  |  | 1-10s |

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
| popular listing | PASS | 16 entries |  |  |  |
| latest listing | PASS | 16 entries |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 64/64 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 64/64 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://shirodoujin.com/.../1-3.jpg` (image/jpeg, 229283 bytes, 1280x1790) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../a-bodyguard-cant-protect-you-from-this-bahasa-indonesia` |  |  |  |
| details thumbnail URL | PASS | `https://shirodoujin.com/.../1-3.jpg` |  |  |  |
| details author | PASS | mmchair |  |  |  |
| details artist | LINT | Artist is empty; use null when unknown |  |  |  |
| details genres | PASS | big breasts, Blowjob, Blowjob Face, Dilf, Kissing, Muscle, Sole Female, Sole Male, Sweating, Doujinshi |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Seorang bodyguard bernama tamaki yang harus meladeni kliennya dengan ngentot karena kliennya merasa bosan… |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 25 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://link.shirolink.my.id/.../1.webp` (image/webp (encoding: lossy), 229580 bytes, 1440x2099) |  |  |  |
