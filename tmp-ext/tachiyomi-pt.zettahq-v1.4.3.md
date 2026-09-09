# Extension Validation Report

- Extension: tachiyomi-pt.zettahq-v1.4.3
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 29
- Lint: 1
- Warnings: 2
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4655858297496198897
- Source name: ZettaHQ
- Source language: pt-BR
- Selected manga input: popular offset 0: Eloise Confession (`.../eloise-confession`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Eloise Confession (`.../eloise-confession`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 20 | Treading New Ground (`.../treading-new-ground`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Eloise Confession (`.../eloise-confession`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Eloise Confession (`.../eloise-confession`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 1 | Capítulo Único (`.../eloise-confession`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 9 |  |  | 1-10s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Eloise Confession, URL=`.../eloise-confession` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 41/41 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 41/41 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://zettahq.com/.../06.jpg-8-550x800.webp` (image/webp (encoding: lossy), 78894 bytes, 550x800) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../eloise-confession` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://zettahq.com/.../01.jpg-9.webp` (image/webp (encoding: lossy), 156100 bytes, 1060x1500) |  |  |  |
| details author | PASS | Nikraria |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Boquete, Bundão, Colorido, Corrupção, Dupla Penetração |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 9 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://zettahq.com/.../1` to `https://zettahq.com` (1 redirects); popular_next: `https://zettahq.com/.../2` to `https://zettahq.com/.../2` (1 redirects) |  |  |  |
| page load | PASS | `https://zettahq.com/.../01.jpg-9.webp` (image/webp (encoding: lossy), 156100 bytes, 1060x1500) |  |  |  |
