# Extension Validation Report

- Extension: tachiyomi-all.mitaku-v1.4.4
- Input artifact: JAR
- Generated at: 2026-09-09T18:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7
- Passed: 30
- Lint: 1
- Warnings: 1
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7541045796029140694
- Source name: Mitaku
- Source language: all
- Selected manga input: popular offset 0: Alina Becker – Shego (`.../alina-becker-shego`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 9 | Alina Becker – Shego (`.../alina-becker-shego`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 9 | Tokar 浵卡 – Castorice (`.../tokar-castorice`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Alina Becker – Shego (`.../alina-becker-shego`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Alina Becker – Shego (`.../alina-becker-shego`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 1 | Gallery (`.../alina-becker-shego`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 25 |  |  | <1s |

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
| popular listing | PASS | 9 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Alina Becker – Shego, URL=`.../alina-becker-shego` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 19/19 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 19/19 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mitaku.net/.../Alina-Becker-Shego-Cover.jpg` (image/jpeg, 198606 bytes, 800x347) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../alina-becker-shego` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Ero Cosplay, Online Video, Alina Becker, Kim Possible, Shego |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 25 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://mitaku.net/.../1` to `https://mitaku.net/.../ero-cosplay` (1 redirects); popular_next: `https://mitaku.net/.../2` to `https://mitaku.net/.../2` (1 redirects) |  |  |  |
| page load | PASS | `https://mitaku.net/.../Alina-Becker-Shego-1.jpg` (image/jpeg, 265670 bytes, 771x1024) |  |  |  |
