# Extension Validation Report

- Extension: tachiyomi-en.sacachispa-v1.4.1
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 30
- Lint: 0
- Warnings: 0
- Skipped: 7
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 388932303664463452
- Source name: SACACHISPA
- Source language: en
- Selected manga input: popular offset 0: Sora o Matotte (`.../sora-o-matotte`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 17 | Sora o Matotte (`.../sora-o-matotte`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Sora o Matotte (`.../sora-o-matotte`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Sora o Matotte (`.../sora-o-matotte`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 27 | Chapter 1 (`.../1`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 45 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 17 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Sora o Matotte, URL=`sora-o-matotte` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 18/18 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 18/18 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://uwu.sacachispa.site/.../5323bc9d-d85a-4bed-bb11-acd1d53e2b4c.jpg` (image/jpeg, 1014497 bytes, 1440x2048) |  |  |  |
| details identity | PASS | Details preserved selected URL `sora-o-matotte` |  |  |  |
| details thumbnail URL | PASS | `https://uwu.sacachispa.site/.../5323bc9d-d85a-4bed-bb11-acd1d53e2b4c.jpg` |  |  |  |
| details author | PASS | Komi Shinya |  |  |  |
| details artist | PASS | Komi Shinya |  |  |  |
| details genres | PASS | Comedy, Drama, School Life, Slice of Life, Gyaru |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | High school student Ogawa Haro is a self-taught oil painter trying to paint the ultimate nude. After an unexpected encounter with an elusive “witch”, he sets his sights on applying to art school… |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 27 chapters |  |  |  |
| chapter dates | PASS | 27 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 45 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://uwu.sacachispa.site/.../6ea531d3-33e1-427a-b172-a49fcd0dd83e.jpg` (image/jpeg, 711870 bytes, 850x1200) |  |  |  |
