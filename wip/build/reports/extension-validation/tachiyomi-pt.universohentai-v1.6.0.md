# Extension Validation Report

- Extension: tachiyomi-pt.universohentai-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 30
- Lint: 0
- Warnings: 2
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: gattsu
- Source ID: 4207492914234184899
- Source name: Universo Hentai
- Source language: pt-BR
- Selected manga input: popular offset 0: Seitaishi 2 ~Watashi no Tsuma o Daitekure~ (`.../seitaishi-2-watashi-no-tsuma-o-daitekure`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 17 | Seitaishi 2 ~Watashi no Tsuma o Daitekure~ (`.../seitaishi-2-watashi-no-tsuma-o-daitekure`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 17 | Anal Sakusei (`.../anal-sakusei`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Seitaishi 2 ~Watashi no Tsuma o Daitekure~ (`.../seitaishi-2-watashi-no-tsuma-o-daitekure`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Seitaishi 2 ~Watashi no Tsuma o Daitekure~ (`.../seitaishi-2-watashi-no-tsuma-o-daitekure`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Capítulo único (`.../galeria <redacted query values: id>`) |  | <1s |
| pages | `getPageList(chapter)` | success | 59 |  |  | 1-10s |

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
| popular listing | PASS | 17 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Seitaishi 2 ~Watashi no Tsuma o Daitekure~, URL=`.../seitaishi-2-watashi-no-tsuma-o-daitekure` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 35/35 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 35/35 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://universohentai.com/.../001-12-371x518.jpg` (image/jpeg, 108858 bytes, 371x518) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../seitaishi-2-watashi-no-tsuma-o-daitekure` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://universohentai.com/.../001-12.jpg` (image/jpeg, 336938 bytes, 1280x1807) |  |  |  |
| details author | PASS | Login |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Boquete, Creampie, Milf, Netorare, Peitões, Pelos Pubianos, Raio-X |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 59 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://universohentai.com/.../2` to `https://universohentai.com/.../2` (1 redirects); popular: `https://universohentai.com/.../galeria <redacted query values: id>` to `https://universohentai.com/.../galeria <redacted query values: id>` (1 redirects) |  |  |  |
| page load | PASS | `https://universohentai.com/.../001-12.jpg` (image/jpeg, 336938 bytes, 1280x1807) |  |  |  |
