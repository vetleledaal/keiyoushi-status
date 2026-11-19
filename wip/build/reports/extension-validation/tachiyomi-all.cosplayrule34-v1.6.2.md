# Extension Validation Report

- Extension: tachiyomi-all.cosplayrule34-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 36
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8633420017329212941
- Source name: CosplayRule34
- Source language: all
- Selected manga input: popular offset 0: Yuzuki 13 (`.../63830`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | Yuzuki 13 (`.../63830`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 10 | Hannapunzel (`.../91181`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 10 | Kalinka Fox Christina Fink - Wednesday … (`.../103871`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 10 | King Angel - Atago - Azur Lane (`.../103861`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Yuzuki 13 (`.../63830`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Yuzuki 13 (`.../63830`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Gallery (`.../63830`) |  | <1s |
| pages | `getPageList(chapter)` | success | 56 |  |  | 1-10s |

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
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 10 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Yuzuki 13, URL=`63830` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 41/41 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 41/41 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cosplayrule34.com/.../282852958.webp` (image/webp (encoding: lossy), 42086 bytes, 600x898) |  |  |  |
| details identity | PASS | Details preserved selected URL `63830` |  |  |  |
| details thumbnail URL | PASS | `https://cosplayrule34.com/.../282852958.webp` |  |  |  |
| details author | PASS | Yuzuki |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 56 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cosplayrule34.com/.../457262383.webp` (image/webp (encoding: lossy), 65122 bytes, 1280x1917) |  |  |  |
