# Extension Validation Report

- Extension: tachiyomi-es.ragnarokscanlation-v1.4.55
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 30
- Lint: 1
- Warnings: 2
- Skipped: 3
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madaralegacy
- Source ID: 1348827658894665970
- Source name: Ragnarok Scanlation
- Source language: es
- Selected manga input: latest offset 0: Mokushiroku no Yonkishi (`.../mokushiroku-no-yonkishi`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 12 | Blue Lock (`.../bluelock`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 12 | JJK (ESP) (`.../jjkesp`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 12 | Mokushiroku no Yonkishi (`.../mokushiroku-no-yonkishi`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 12 | El Retorno del Jugador (`.../el-retorno-del-jugador`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Mokushiroku no Yonkishi (`.../mokushiroku-no-yonkishi`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Mokushiroku no Yonkishi (`.../mokushiroku-no-yonkishi`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 1 | Capítulo 252 (`https://ragnarokscanlation.org/.../capitulo-252 <redacted query values: style>`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 0 |  |  | <1s |

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
| popular listing | PASS | 12 entries |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Mokushiroku no Yonkishi, URL=`.../mokushiroku-no-yonkishi` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 49/49 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 49/49 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://ragnarokscanlation.org/.../MNY-350x476.webp` (image/webp (container: extended), 60012 bytes, 350x476) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../mokushiroku-no-yonkishi` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://ragnarokscanlation.org/.../MNY.webp` (image/webp (container: extended), 976146 bytes, 669x1000) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | LINT | Genres is empty; use null when unknown |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Nombres Alternativos: MNY |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | UNUSUAL | All 1 chapter URLs are absolute |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | FAIL | Page list is empty (0 pages) | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
