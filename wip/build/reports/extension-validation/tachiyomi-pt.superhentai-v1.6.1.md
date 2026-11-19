# Extension Validation Report

- Extension: tachiyomi-pt.superhentai-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 29
- Lint: 0
- Warnings: 1
- Skipped: 5
- Failed: 2
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2703205747448973944
- Source name: Super Hentai
- Source language: pt-BR
- Selected manga input: popular offset 0: O Patriarca – Bocetinha Em Live (`.../o-patriarca-bocetinha-em-live`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | O Patriarca – Bocetinha Em Live (`.../o-patriarca-bocetinha-em-live`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 27 | Pegasus Smith – Jennifer and The Short King 3 (`.../pegasus-smith-jennifer-and-the-short-king-3`) |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | O Patriarca – Bocetinha Em Live (`.../o-patriarca-bocetinha-em-live`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Capítulo único (`.../o-patriarca-bocetinha-em-live`) |  | <1s |
| pages | `getPageList(chapter)` | success | 5 |  |  | <1s |

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
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | UNUSUAL | Overlapping manga: title=Minha Vó É Muito Puta, URL=`.../minha-vo-e-muito-puta` at page 1 offset 1 and page 2 offset 15, title=Casa Invadida, URL=`.../casa-invadida` at page 1 offset 2 and page 2 offset 17, title=Halloween Na Vila, URL=`.../halloween-na-vila` at page 1 offsets 3, 28 and page 2 offsets 16, 25, title=Assistindo Pornô Com A Irmãzinha, URL=`.../assistindo-porno-com-a-irmazinha` at page 1 offset 29 and page 2 offset 26 |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | FAIL | Popular page 1 repeats 1 manga entry: title=Halloween Na Vila, URL=`.../halloween-na-vila`; Popular page 2 repeats 1 manga entry: title=Halloween Na Vila, URL=`.../halloween-na-vila` | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| manga title and URL | PASS | 57/57 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 57/57 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://superhentai.blog/.../O-Patriarca-Bocetinha-Em-Live.jpg` (image/jpeg, 55303 bytes, 280x373) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../o-patriarca-bocetinha-em-live` |  |  |  |
| details thumbnail URL | PASS | `https://superhentai.blog/.../O-Patriarca-Bocetinha-Em-Live.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Animes Porno, Cartoon Pornô, Comics Porno, Contos Eroticos, Doujinshi, Hentai 3D, Hentai Brasil, Hentai Gay, Hentai Incesto, Hentai Interracial, HQ de Sexo, HQ Porno, HQs Traição, Manga Hentai, Muito Hentai, Mundo Hentai, Quadrinhos Eroticos |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | HQs 1 – Nem mesmo uma lancha luxuosa consegue acabar com o tédio de Denise. Durante o passeio organizado por Agenor, a caçula decide se divertir de uma maneira bastante ousada e particular. Entretanto, uma descoberta inesperada muda completamente o rumo daquele dia. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 5 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://superhentai.blog/.../000-Capa.jpg` (image/jpeg, 804575 bytes, 1200x1600) |  |  |  |
