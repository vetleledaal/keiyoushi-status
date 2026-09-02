# Extension Validation Report

- Extension: tachiyomi-pt.zettahq-v1.4.3
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 28
- Lint: 1
- Warnings: 1
- Skipped: 5
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4655858297496198897
- Source name: ZettaHQ
- Source language: pt-BR
- Selected manga input: popular offset 0: Futaruto – Hinata’s Heartbeat (`.../futaruto-hinatas-heartbeat`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Futaruto – Hinata’s Heartbeat (`.../futaruto-hinatas-heartbeat`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 20 | Starlust: a Christmas Carol (`.../starlust-a-christmas-carol`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 0 |  |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Futaruto – Hinata’s Heartbeat (`.../futaruto-hinatas-heartbeat`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 1 | Capítulo Único (`.../futaruto-hinatas-heartbeat`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 20 |  |  | 1-10s |

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
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 40/40 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 40/40 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://zettahq.com/.../13.jpg-4-550x800.webp` (image/webp (encoding: lossy), 94982 bytes, 550x800) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../futaruto-hinatas-heartbeat` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://zettahq.com/.../01.jpg-10.webp` (image/webp (encoding: lossy), 190886 bytes, 1000x1419) |  |  |  |
| details author | PASS | CriKai |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Bundão, Colorido, Futanari/Trans com Mulher, Futanarização, Peitudas |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 20 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://zettahq.com/.../01.jpg-10.webp` (image/webp (encoding: lossy), 190886 bytes, 1000x1419) |  |  |  |
