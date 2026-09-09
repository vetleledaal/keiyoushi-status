# Extension Validation Report

- Extension: tachiyomi-es.mangatv-v1.4.35
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 31
- Lint: 2
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 7214040353404261084
- Source name: Manga  TV
- Source language: es
- Selected manga input: latest offset 0: The daughter of thousand faces (`.../the-daughter-of-thousand-faces`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 25 | The daughter of thousand faces (`.../the-daughter-of-thousand-faces`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 25 | The daughter of thousand faces (`.../the-daughter-of-thousand-faces`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | The daughter of thousand faces (`.../the-daughter-of-thousand-faces`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | The daughter of thousand faces (`.../the-daughter-of-thousand-faces`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 7 | Capítulo 0.10 Meowlzitoos (`.../3df6b1c7d00544`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 35 |  |  | <1s |

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
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The daughter of thousand faces, URL=`.../the-daughter-of-thousand-faces` |  |  |  |
| latest differs from popular | LINT | Latest page 1 exactly matches popular page 1; verify supportsLatest |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 51/51 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 51/51 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://img3.mangatv.net/.../6a541394ef2fa.jpg` (image/jpeg, 64740 bytes, 389x500) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../the-daughter-of-thousand-faces` |  |  |  |
| details thumbnail URL | PASS | `https://img3.mangatv.net/.../6a541394ef2fa.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | La hija de las mil caras, La hija de las mil caras, Comedia, Drama, Fantasía, Demonios, Cultivo |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Shen Yuhua es la decepción de la Gran Secta del Palacio Chaoyang. Sin poderes ni una belleza excepcional, no tiene nada que ofrecer a su padre, un inmortal respetado. Todo cambia el día en que conoce por accidente a Chu Tian, el legendario Demonio de las Mil Caras, archienemigo de su padre... y, sin querer, lo libera de la prisión en la que había permanecido sellado durante décadas. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 7 chapters |  |  |  |
| chapter dates | PASS | 7 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 35 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://img3.mangatv.net/.../1.jpg` (image/jpeg, 192001 bytes, 940x1880) |  |  |  |
