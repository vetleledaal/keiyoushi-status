# Extension Validation Report

- Extension: tachiyomi-en.manhwalike-v1.4.3
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 32
- Lint: 0
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3472935303493224823
- Source name: Manhwalike
- Source language: en
- Selected manga input: latest offset 0: The NTR Method (`.../manga-the-ntr-method`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 6 | Secret Class (`.../manga-secret-class`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 30 | The NTR Method (`.../manga-the-ntr-method`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | The NTR Method (`.../manga-the-ntr-method`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | The NTR Method (`.../manga-the-ntr-method`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 9 | Chapter 1 (`.../manga-the-ntr-method-chapter-1-ch278118`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 10 |  |  | <1s |

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
| popular listing | PASS | 6 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The NTR Method, URL=`.../manga-the-ntr-method` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 37/37 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 37/37 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://stmedia.manhwalike.com/.../the-ntr-method.jpg` (image/webp (encoding: lossy), 18460 bytes, 247x350; server Content-Type: image/jpeg) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../manga-the-ntr-method` |  |  |  |
| details thumbnail URL | PASS | `https://stmedia.manhwalike.com/.../the-ntr-method.jpg` |  |  |  |
| details author | PASS | Syo Aoi |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Hentai, Adult, Drama, Mature, Seinen |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | In the crowded office, you can hear the quiet wet sounds of love juices… The CEO laughs as he continues to play with my soaked, dripping body…!. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 9 chapters |  |  |  |
| chapter dates | PASS | 9 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 10 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://stcdn.manhwalike.com/.../0.jpg` (image/webp (container: extended), 15976 bytes, 690x747; server Content-Type: image/jpeg) |  |  |  |
