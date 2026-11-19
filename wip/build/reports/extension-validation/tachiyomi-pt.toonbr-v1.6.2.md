# Extension Validation Report

- Extension: tachiyomi-pt.toonbr-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 33
- Lint: 0
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 534693024654050396
- Source name: ToonBr
- Source language: pt-BR
- Selected manga input: popular offset 0: Escola de Guerreiros – Departamento de Ataque às Dungeons (`.../escola-de-guerreiros-departamento-de-ataque-as-dungeons`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 150 | Escola de Guerreiros – Departamento de Ataque às Dungeons (`.../escola-de-guerreiros-departamento-de-ataque-as-dungeons`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 129 | O Mundo Após a Queda (`.../o-mundo-apos-a-queda`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Escola de Guerreiros – Departamento de Ataque às Dungeons (`.../escola-de-guerreiros-departamento-de-ataque-as-dungeons`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Escola de Guerreiros – Departamento de Ataque às Dungeons (`.../escola-de-guerreiros-departamento-de-ataque-as-dungeons`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 45 | Capítulo 1 (`.../d182a36c-320a-4147-8a4d-de68d0918dc8`) |  | <1s |
| pages | `getPageList(chapter)` | success | 24 |  |  | <1s |

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
| popular listing | PASS | 150 entries |  |  |  |
| latest listing | PASS | 129 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Escola de Guerreiros – Departamento de Ataque às Dungeons, URL=`.../escola-de-guerreiros-departamento-de-ataque-as-dungeons` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 280/280 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 280/280 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn2.toonbr.com/.../d5619b92-9756-4952-8955-3440d88fa4f6.webp` (image/webp (encoding: lossy), 149024 bytes, 720x1030) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../escola-de-guerreiros-departamento-de-ataque-as-dungeons` |  |  |  |
| details thumbnail URL | PASS | `https://cdn2.toonbr.com/.../d5619b92-9756-4952-8955-3440d88fa4f6.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Uma Terra no século 21 que se fundiu com outro mundo. Uma era de ‘dungeons’ fervilhando com monstros e os ‘aventureiros’ que os atacam. Além disso, a instalação educacional da maior elite da Coreia do Sul que promove esses aventureiros: ‘Ensino Médio de Guerreiros’. Mesmo que um dia ele tenha sido considerado como um dos maiores aventureiros da Ásia, ele foi falsamente acusado e, enquanto contrabandeava em masmorras para pagar pelo tratamento médico de seu pai doente, Yoo Jaryong cruza com um adolescente. ‘Ei você, entre no Ensino Médio para adolescentes’. Essa é uma história sobre um jovem que perdeu seu sonho e, escondendo sua identidade, se encontra novamente. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 45 chapters |  |  |  |
| chapter dates | PASS | 45 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 24 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn2.toonbr.com/.../f44c2991-1a21-46a8-9147-cacdbd321c9d.jpeg` (image/webp (encoding: lossy), 180512 bytes, 1280x720; server Content-Type: image/jpeg) |  |  |  |
