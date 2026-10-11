# Extension Validation Report

- Extension: tachiyomi-all.mitaku-v1.6.4
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 30e9bf12769926b1fd7fafc4247779e7a44f2fbf+dirty
- Passed: 31
- Lint: 0
- Warnings: 1
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7541045796029140694
- Source name: Mitaku
- Source language: all
- Selected manga input: popular offset 0: Sayo Momo – Remielle Lingerie (`.../sayo-momo-remielle-lingerie`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 9 | Sayo Momo – Remielle Lingerie (`.../sayo-momo-remielle-lingerie`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 9 | Luna Aoki – 2B (Video) (`.../luna-aoki-2b`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Sayo Momo – Remielle Lingerie (`.../sayo-momo-remielle-lingerie`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Sayo Momo – Remielle Lingerie (`.../sayo-momo-remielle-lingerie`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Gallery (`.../sayo-momo-remielle-lingerie`) |  | <1s |
| pages | `getPageList(chapter)` | success | 99 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Sayo Momo – Remielle Lingerie, URL=`.../sayo-momo-remielle-lingerie` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 19/19 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 19/19 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mitaku.net/.../Sayo-Momo-Remielle-Lingerie-Cover.jpg` (image/jpeg, 251506 bytes, 800x400) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../sayo-momo-remielle-lingerie` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Ero Cosplay, Online Video, Remielle, Sayo Momo, Zenless Zone Zero |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 99 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://mitaku.net/.../1` to `https://mitaku.net/.../ero-cosplay` (1 redirects); popular: `https://mitaku.net/.../2` to `https://mitaku.net/.../2` (1 redirects) |  |  |  |
| page load | PASS | `https://mitaku.net/.../Sayo-Momo-Remielle-Lingerie-1.jpg` (image/jpeg, 164775 bytes, 683x1024) |  |  |  |
