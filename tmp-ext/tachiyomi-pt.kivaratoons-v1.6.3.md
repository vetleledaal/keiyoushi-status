# Extension Validation Report

- Extension: tachiyomi-pt.kivaratoons-v1.6.3
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 36
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2454581737028097436
- Source name: KivaraToons
- Source language: pt-BR
- Selected manga input: popular offset 0: Nanotecnologia Marcial (`.../245`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Nanotecnologia Marcial (`.../245`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | O Caçador de Destinos Rank F (`.../212`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 24 | Minha esposa é de mil anos atrás (`.../484`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | O Retorno do Ranker Inigualável (`.../331`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Nanotecnologia Marcial (`.../245`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Nanotecnologia Marcial (`.../245`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 327 | Capítulo 1 (`.../4856d804-7bf3-442a-8b11-e7cfc90da18e`) |  | <1s |
| pages | `getPageList(chapter)` | success | 17 |  |  | 1-10s |

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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Nanotecnologia Marcial, URL=`245` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://kivaratoons.com/.../capa <redacted query values: f>` (image/webp (encoding: lossy), 68802 bytes, 520x780) |  |  |  |
| details identity | PASS | Details preserved selected URL `245` |  |  |  |
| details thumbnail URL | PASS | `https://kivaratoons.com/.../capa <redacted query values: f>` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Ação, Fantasia, Artes Marciais |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Depois de ser desprezado e ter sua vida posta em perigo, um órfão do Culto Demoníaco, Cheon Yeo-Woon, recebe a visita inesperada de seu descendente do futuro, que insere uma nano máquina no corpo de Cheon Yeo-Woon, que muda drasticamente Vida de Cheon Yeo-Woon após sua ativação. A história da jornada de Cheon Yeo-Woon de contornar o Culto Demoníaco e se tornar o melhor artista marcial apenas começou. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 327 chapters |  |  |  |
| chapter dates | PASS | 327 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 17 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://kivaratoons.com/.../2277b4acb8ac1ce1148d77ace4ee28088aa7d587.webp` (image/webp (encoding: lossy), 222036 bytes, 700x7000) |  |  |  |
