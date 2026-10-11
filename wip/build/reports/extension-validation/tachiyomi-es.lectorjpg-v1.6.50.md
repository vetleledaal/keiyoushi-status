# Extension Validation Report

- Extension: tachiyomi-es.lectorjpg-v1.6.50
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 33
- Lint: 1
- Warnings: 1
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4439526602175493484
- Source name: LectorJPG
- Source language: es
- Selected manga input: popular offset 0: A quien intentaba seducir era a la señora (`.../a-quien-intentaba-seducir-era-a-la-senora`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 6 | A quien intentaba seducir era a la señora (`.../a-quien-intentaba-seducir-era-a-la-senora`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 12 | Solo Nuestro (`.../solo-nuestro`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 12 | Amor magnético (`.../amor-magnetico`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | A quien intentaba seducir era a la señora (`.../a-quien-intentaba-seducir-era-a-la-senora`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | A quien intentaba seducir era a la señora (`.../a-quien-intentaba-seducir-era-a-la-senora`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 6 | Capitulo 1 (`.../61986`) |  | <1s |
| pages | `getPageList(chapter)` | success | 12 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 6 entries |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=A quien intentaba seducir era a la señora, URL=`a-quien-intentaba-seducir-era-a-la-senora` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 31/31 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 31/31 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://media.lectorjpg.com/.../67e952f7-1d15-443b-89a0-ee259935f799.webp` (image/webp (container: extended), 60798 bytes, 600x900) |  |  |  |
| details identity | PASS | Details preserved selected URL `a-quien-intentaba-seducir-era-a-la-senora` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://media.lectorjpg.com/.../0de5e9bd-af4a-40c0-98bd-cfb20bc33f65.webp` (image/webp (container: extended), 85974 bytes, 1280x720) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | LINT | Genres is empty; use null when unknown |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Nakha, que cayó en la dinastía Joseon, poseía el cuerpo de un hombre sólido y terso, ni real ni noble. Mientras deambulaba por las calles, se enamoró de una dama de buen corazón y empezó a trabajar como sirviente. Pero intentó convertirse en un hombre guapo por primera vez en su vida para seducir a la dama de buen corazón, que vivía en un ambiente donde ni siquiera podía comer carne, afirmando ser la familia más rica de las ocho provincias de Joseon. Pero ¿por qué este maestro, y no mi esposa, me llama en secreto a la habitación...? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 6 chapters |  |  |  |
| chapter dates | PASS | 6 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 12 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://media.lectorjpg.com/.../041cf0ec-2904-4349-9d12-4c62915f217e.webp` (image/webp (encoding: lossy), 546168 bytes, 720x9690) |  |  |  |
