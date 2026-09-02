# Extension Validation Report

- Extension: tachiyomi-es.codearc-v1.4.3
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 33
- Lint: 2
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
- Selected manga input: latest offset 0: Kobeni y un Denji que quiere tener sexo (`.../kobeni-y-un-denji-que-quiere-tener-sexo`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 10 | TRIBU FUTANARI (`.../tribu-futanari`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 10 | Old Supreme Kai X Bulma (`.../old-supreme-kai-x-bulma`) |  | 10s+ |
| latest | `fetchLatestUpdates(1)` | success | 15 | Kobeni y un Denji que quiere tener sexo (`.../kobeni-y-un-denji-que-quiere-tener-sexo`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 15 | Mutuos Pervertidos (`.../mutuos-pervertidos`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Kobeni y un Denji que quiere tener sexo (`.../kobeni-y-un-denji-que-quiere-tener-sexo`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Kobeni y un Denji que quiere tener sexo (`.../kobeni-y-un-denji-que-quiere-tener-sexo`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 1 | Chapter 1 (`.../cascade`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 21 |  |  | 10s+ |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Kobeni y un Denji que quiere tener sexo, URL=`.../kobeni-y-un-denji-que-quiere-tener-sexo` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 51/51 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 51/51 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.codearctraducciones.com/.../acefb26a11.w320.webp` (image/webp (encoding: lossy), 26044 bytes, 320x512) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../kobeni-y-un-denji-que-quiere-tener-sexo` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn.codearctraducciones.com/.../acefb26a11.webp` (image/webp (encoding: lossy), 133674 bytes, 1000x1600) |  |  |  |
| details author | PASS | Mark Gavatino |  |  |  |
| details artist | PASS | Mark Gavatino |  |  |  |
| details genres | PASS | Ahegao, A color, Culo grande, Creampie, Besos, Blowjob |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Kobeni y un Denji que quiere tener sexo |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 21 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.codearctraducciones.com/.../001.webp` (image/webp (encoding: lossy), 344108 bytes, 811x1600) |  |  |  |
