# Extension Validation Report

- Extension: tachiyomi-pt.astratoons-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 34
- Lint: 1
- Warnings: 0
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 551908063793499841
- Source name: Astratoons
- Source language: pt-BR
- Selected manga input: popular offset 0: O Ponto de Vista do Leitor Onisciente (`.../o-ponto-de-vista-do-leitor-onisciente`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | O Ponto de Vista do Leitor Onisciente (`.../o-ponto-de-vista-do-leitor-onisciente`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 10 | Aparências (`.../aparencias`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 10 | Minha Ídola Favorita Pega O Último Trem (`.../minha-idola-favorita-pega-o-ultimo-trem`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | O Ponto de Vista do Leitor Onisciente (`.../o-ponto-de-vista-do-leitor-onisciente`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | O Ponto de Vista do Leitor Onisciente (`.../o-ponto-de-vista-do-leitor-onisciente`) |  | 10s+ |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 312 | Capítulo 0 (`.../0`) |  | <1s |
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
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 10 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=O Ponto de Vista do Leitor Onisciente, URL=`.../o-ponto-de-vista-do-leitor-onisciente` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 31/31 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 31/31 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://new.astratoons.com/.../01KHQ0WJSR68EWYJ93Q318R787.webp` (image/webp (container: extended), 145556 bytes, 1000x1500) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../o-ponto-de-vista-do-leitor-onisciente` |  |  |  |
| details thumbnail URL | PASS | `https://new.astratoons.com/.../01KHQ0WJSR68EWYJ93Q318R787.webp` |  |  |  |
| details author | PASS | N/A |  |  |  |
| details artist | PASS | N/A |  |  |  |
| details genres | PASS | Drama, Ação, Fantasia, Magia, Sobrenatural, shounen, misterio |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Kim Dokja era um trabalhador de escritório comum cujo único interesse era ler seu romance favorito na web, 'Três maneiras de sobreviver ao apocalipse'. Mas quando o romance de repente se torna realidade, ele é a única pessoa que sabe como o mundo vai acabar. Armado com essa percepção, Dokja usa sua compreensão para mudar o curso da história e do mundo como ele o conhece. Nomes Alternativos: |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 312 chapters |  |  |  |
| chapter dates | LINT | All 312 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=312 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 12 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://new.astratoons.com/.../001.webp` (image/webp (encoding: lossy), 112928 bytes, 1920x720) |  |  |  |
