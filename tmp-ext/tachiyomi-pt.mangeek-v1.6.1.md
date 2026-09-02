# Extension Validation Report

- Extension: tachiyomi-pt.mangeek-v1.6.1
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 31
- Lint: 1
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5624034369916310706
- Source name: ManGeek
- Source language: pt-BR
- Selected manga input: popular offset 0: The Return of the Iron-Blood Sword Hound (`.../1687192031`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 129 | The Return of the Iron-Blood Sword Hound (`.../1687192031`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 12 | Go Away Romeo (`.../1686803685`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | The Return of the Iron-Blood Sword Hound (`.../1687192031`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The Return of the Iron-Blood Sword Hound (`.../1687192031`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 186 | Capítulo 0.1 (`.../1698212987`) |  | <1s |
| pages | `getPageList(chapter)` | success | 1 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 129 entries |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Return of the Iron-Blood Sword Hound, URL=`1687192031` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 142/142 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 142/142 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://static.geekstations.com.br/.../the-return-of-the-ironblood-sword-hound-tc052.webp` (image/webp (encoding: lossy), 396214 bytes, 1994x2855) |  |  |  |
| details identity | PASS | Details preserved selected URL `1687192031` |  |  |  |
| details thumbnail URL | PASS | `https://static.geekstations.com.br/.../the-return-of-the-ironblood-sword-hound-tc052.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Ação, Fantasia, Manhwa, Shounen, Sobrenatural, Webtoon |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | O cão de caça da família Baskerville.Ele foi marcado como um traidor e utado, mas agora elevoltou 40 anos para o passado.“Agora, todos serão minhas presas e eu rasgarei todos até a morte.” |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 186 chapters |  |  |  |
| chapter dates | LINT | All 186 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=186 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 1 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://static.geekstations.com.br/.../000-qrvep.webp` (image/webp (encoding: lossy), 816286 bytes, 2908x2022) |  |  |  |
