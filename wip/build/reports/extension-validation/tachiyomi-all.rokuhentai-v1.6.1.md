# Extension Validation Report

- Extension: tachiyomi-all.rokuhentai-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
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
- Source ID: 6773816792833894188
- Source name: Roku Hentai
- Source language: all
- Selected manga input: popular offset 0: 🇯🇵 おこさまじゃないもん！🔞 (`.../6t5ym1`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | 🇯🇵 おこさまじゃないもん！🔞 (`.../6t5ym1`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | 🇯🇵 マグロ響と甘やかされえっち🔞 (`.../48i42y`) |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 🇯🇵 おこさまじゃないもん！🔞 (`.../6t5ym1`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 🇯🇵 おこさまじゃないもん！🔞 (`.../6t5ym1`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | 🇯🇵 おこさまじゃないもん！🔞 (`.../6t5ym1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 11 |  |  | 1-10s |

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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=🇯🇵 おこさまじゃないもん！🔞, URL=`.../6t5ym1` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 49/49 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 49/49 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://rokuhentai.com/.../6t5ym1.jpg` (image/webp (encoding: lossy), 28268 bytes, 446x640) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../6t5ym1` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; Thumbnail URL `https://rokuhentai.com/.../6t5ym1.jpg` was not downloaded |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | kind: artistcg, language: japanese |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 11 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://rokuhentai.com/.../0.jpg` (image/webp (encoding: lossy), 185244 bytes, 2007x2880) |  |  |  |
