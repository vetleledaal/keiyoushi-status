# Extension Validation Report

- Extension: tachiyomi-ja.magkan-v1.4.6
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 20
- Lint: 5
- Warnings: 1
- Skipped: 9
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8826192789792786070
- Source name: MagKan
- Source language: ja
- Selected manga input: popular offset 0: MAGKAN漫画賞 (`.../5847788403bdd`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 24 | MAGKAN漫画賞 (`.../5847788403bdd`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 24 | 後宮小説 (`.../4d8d8b62b1bdc`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | MAGKAN漫画賞 (`.../5847788403bdd`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | MAGKAN漫画賞 (`.../5847788403bdd`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 34 | 第1回MAGKAN漫画賞、結果発表！ (`.../4b93daeef088d`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | error | 0 |  | kotlinx.serialization.MissingFieldException: Field 'viewerId' is required for type with serial name 'eu.kanade.tachiyomi.multisrc.comiciviewer.EpisodeContent', but it was missing | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | kotlinx.serialization.MissingFieldException: Field 'viewerId' is required for type with serial name 'eu.kanade.tachiyomi.multisrc.comiciviewer.EpisodeContent', but it was missing | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=MAGKAN漫画賞, URL=`.../5847788403bdd` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 49/49 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 49/49 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-public.comici.jp/.../2026040113065202061C989998328EEB1ECD4DEF69B025BB8-sm.webp` (image/webp (encoding: lossy), 6116 bytes, 320x168; server Content-Type: application/octet-stream) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../5847788403bdd` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn-public.comici.jp/.../2026040113065202061C989998328EEB1ECD4DEF69B025BB8.png` (image/png, 745866 bytes, 2560x1344) |  |  |  |
| details author | LINT | Author is empty; use null when unknown |  |  |  |
| details artist | LINT | Artist is empty; use null when unknown |  |  |  |
| details genres | LINT | Genres is empty; use null when unknown |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | LINT | Description is empty; use null when unknown |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 6 name |  |  |  |
| chapters | PASS | 34 chapters |  |  |  |
| chapter dates | PASS | 34 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | Field 'viewerId' is required for type with serial name 'eu.kanade.tachiyomi.multisrc.comiciviewer.EpisodeContent', but it was missing |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
