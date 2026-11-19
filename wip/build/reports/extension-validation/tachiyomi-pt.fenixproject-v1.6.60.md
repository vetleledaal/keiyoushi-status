# Extension Validation Report

- Extension: tachiyomi-pt.fenixproject-v1.6.60
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 31
- Lint: 1
- Warnings: 0
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8852449878379679769
- Source name: Fenix Project
- Source language: pt-BR
- Selected manga input: popular offset 0: Aí Vem a Colher de Prata! (`.../ai-vem-a-colher-de-prata`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | Aí Vem a Colher de Prata! (`.../ai-vem-a-colher-de-prata`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 10 | Doentia Devoção (`.../doentia-devocao`) |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Aí Vem a Colher de Prata! (`.../ai-vem-a-colher-de-prata`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Aí Vem a Colher de Prata! (`.../ai-vem-a-colher-de-prata`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 83 | Capítulo 01 - Capítulo 01 (`.../capitulo-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 19 |  |  | <1s |

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
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Aí Vem a Colher de Prata!, URL=`ai-vem-a-colher-de-prata` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 21/21 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 21/21 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://fenixproject.website/.../480.webp` (image/webp (encoding: lossy), 36032 bytes, 480x664) |  |  |  |
| details identity | PASS | Details preserved selected URL `ai-vem-a-colher-de-prata` |  |  |  |
| details thumbnail URL | PASS | `https://fenixproject.website/.../480.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Romance, Comédia, Viagem no Tempo, Shoujo, Histórico, Ruby Scan |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Adelaide Sergio nunca conheceu o luxo até renascer como filha de um rico conde. Ela estava prestes a herdar a propriedade da família, mas o noivado repentino de sua irmã arruinou tudo. Com apenas duas semanas para encontrar um marido, Adele recorre ao templo em busca de um cavaleiro sagrado, apenas para descobrir que seu comandante é o homem perfeito! Ele é bonito, respeitável... e completamente desinteressado. Conseguirá Adele conquistar o comandante frio a tempo, ou a colher de prata será arrancada de sua boca? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 83 chapters |  |  |  |
| chapter dates | LINT | 73 of 83 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=73 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 19 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://fenixproject.website/.../01.webp` (image/webp (encoding: lossy), 649766 bytes, 720x4605) |  |  |  |
