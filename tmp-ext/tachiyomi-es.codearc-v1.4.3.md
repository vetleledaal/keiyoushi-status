# Extension Validation Report

- Extension: tachiyomi-es.codearc-v1.4.3
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 35
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5491278213927672737
- Source name: Code Arc Mangas
- Source language: es
- Selected manga input: latest offset 0: Chica maniática de lo oculto es castigada por verga gigante (`.../chica-maniatica-de-lo-oculto-es-castigada-por-verga-gigante`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 10 | TRIBU FUTANARI (`.../tribu-futanari`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 10 | Old Supreme Kai X Bulma (`.../old-supreme-kai-x-bulma`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 15 | Chica maniática de lo oculto es castigada por verga gigante (`.../chica-maniatica-de-lo-oculto-es-castigada-por-verga-gigante`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 15 | Tsukasa-kun no Tabou na Ichinichi (`.../tsukasa-kun-no-tabou-na-ichinichi`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Chica maniática de lo oculto es castigada por verga gigante (`.../chica-maniatica-de-lo-oculto-es-castigada-por-verga-gigante`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Chica maniática de lo oculto es castigada por verga gigante (`.../chica-maniatica-de-lo-oculto-es-castigada-por-verga-gigante`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 1 | Chapter 1 (`.../cascade`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 8 |  |  | 1-10s |

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
| latest listing | PASS | 15 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Chica maniática de lo oculto es castigada por verga gigante, URL=`.../chica-maniatica-de-lo-oculto-es-castigada-por-verga-gigante` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 51/51 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 51/51 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.codearctraducciones.com/.../ab3f565edf.w320.webp` (image/webp (encoding: lossy), 37070 bytes, 320x512) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../chica-maniatica-de-lo-oculto-es-castigada-por-verga-gigante` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn.codearctraducciones.com/.../ab3f565edf.webp` (image/webp (encoding: lossy), 214844 bytes, 1000x1600) |  |  |  |
| details author | PASS | Shinen |  |  |  |
| details artist | PASS | Shinen |  |  |  |
| details genres | PASS | Ahegao, A color, Pechos grandes, Culo grande, Asfixia, Cara de felación, Orgasmos múltiples, Sin Censura, Solo un hombre |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Entrenador castiga a loca maniática por pensar que se saldría con la suya... |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 8 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.codearctraducciones.com/.../001.webp` (image/webp (encoding: lossy), 439792 bytes, 1536x2048) |  |  |  |
