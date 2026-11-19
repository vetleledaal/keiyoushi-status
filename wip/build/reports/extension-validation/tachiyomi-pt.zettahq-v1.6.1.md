# Extension Validation Report

- Extension: tachiyomi-pt.zettahq-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 29
- Lint: 1
- Warnings: 2
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4655858297496198897
- Source name: ZettaHQ
- Source language: pt-BR
- Selected manga input: popular offset 0: COWRRUPTED 01 Milky Business Partnership (`.../cowrrupted-01-milky-business-partnership`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | COWRRUPTED 01 Milky Business Partnership (`.../cowrrupted-01-milky-business-partnership`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | A Day At The Beach (`.../a-day-at-the-beach`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | COWRRUPTED 01 Milky Business Partnership (`.../cowrrupted-01-milky-business-partnership`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | COWRRUPTED 01 Milky Business Partnership (`.../cowrrupted-01-milky-business-partnership`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Capítulo Único (`.../cowrrupted-01-milky-business-partnership`) |  | <1s |
| pages | `getPageList(chapter)` | success | 14 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=COWRRUPTED 01 Milky Business Partnership, URL=`.../cowrrupted-01-milky-business-partnership` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 41/41 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 41/41 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://zettahq.com/.../10.jpg-1-550x800.webp` (image/webp (encoding: lossy), 66610 bytes, 550x800) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../cowrrupted-01-milky-business-partnership` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://zettahq.com/.../01.jpg-3.webp` (image/webp (encoding: lossy), 170428 bytes, 1280x2048) |  |  |  |
| details author | PASS | BakaStore |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Chifres, Colorido, Deformação de Estômago, Garota Vaca, Kemonomimi |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 14 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://zettahq.com/.../1` to `https://zettahq.com` (1 redirects); popular: `https://zettahq.com/.../2` to `https://zettahq.com/.../2` (1 redirects) |  |  |  |
| page load | PASS | `https://zettahq.com/.../01.jpg-3.webp` (image/webp (encoding: lossy), 170428 bytes, 1280x2048) |  |  |  |
