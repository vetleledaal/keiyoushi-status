# Extension Validation Report

- Extension: tachiyomi-pt.bryaoi-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 28
- Lint: 3
- Warnings: 1
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3480299458405323329
- Source name: BR Yaoi
- Source language: pt-BR
- Selected manga input: popular offset 0: Auge da escultura (`.../auge-da-escultura-online`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 18 | Auge da escultura (`.../auge-da-escultura-online`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 18 | Late Bloomers (Novel) (`.../late-bloomers-novel-online`) |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Auge da escultura (`.../auge-da-escultura-online`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Auge da escultura (`.../auge-da-escultura-online`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 15 | Capítulo 01 (`.../auge-da-escultura-01-online`) |  | <1s |
| pages | `getPageList(chapter)` | success | 10 |  |  | <1s |

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
| popular listing | PASS | 18 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Auge da escultura, URL=`.../auge-da-escultura-online` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 37/37 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 37/37 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://nameclubpower.xyz/.../auge-da-escultura.webp` (image/webp (encoding: lossy), 98938 bytes, 720x1024) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../auge-da-escultura-online` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://nameclubpower.xyz/.../auge-da-escultura_178.webp` (image/webp (encoding: lossy), 16084 bytes, 232x330) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Adulto, Comédia, Mangás, Manhwa, Romance, Yaois |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | <br>Sung Namgung não consegue manter um emprego e acaba de perder mais um depois de ferir o artista Mintae Kyeon durante uma entrega de rotina. Mas Sung está com sorte— Mintae estava procurando um novo modelo, e Sung tem a combinação perfeita de personalidade sombria e corpo esculpido. Qual é a história por trás de Sung, que acabou revelando todo o seu corpo, do cabelo até a ponta dos pés, para Mintae, que se apresentou como escultor e o convidou para ser seu modelo!? Obra doada pela Meow scan para as Nove Musas. Nome alternativo: The Art Of Sculpture<br> |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 15 chapters |  |  |  |
| chapter dates | LINT | All 15 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=15 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 10 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://nameclubpower.xyz/.../1.webp` (image/webp (encoding: lossy), 102442 bytes, 1600x854) |  |  |  |
