# Extension Validation Report

- Extension: tachiyomi-pt.tankouhentai-v1.6.55
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 34
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 9200419821846585447
- Source name: Tankou Hentai
- Source language: pt-BR
- Selected manga input: popular offset 0: Rankou de Wakarou! (`.../894`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Rankou de Wakarou! (`.../894`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | Hyji – Kinjo (`.../1086`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 25 | Juku Juku (`.../2390`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Boku o Kurau wa Kasshoku Gal (`.../2326`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Rankou de Wakarou! (`.../894`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Rankou de Wakarou! (`.../894`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 6 | Capítulo 01 (`.../capitulo-01`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 41 |  |  | 1-10s |

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
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Rankou de Wakarou!, URL=`894` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://tankouhentai.com/.../capa-rankou-de-wakarou-hentai-manga-ptbr-175x238.jpg` (image/jpeg, 15393 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `894` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://tankouhentai.com/.../capa-rankou-de-wakarou-hentai-manga-ptbr-193x278.jpg` (image/jpeg, 19260 bytes, 193x278) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | Jairou |  |  |  |
| details genres | PASS | Lolicon, Shotacon, Ahegao (M), Anal (M), Arco de História, Bondage (M), Boquete (M), Chupando Bola (M), Colar (M), Dedada (M), Drogas (M), Esguichando, Estupro (M), Exibicionismo (H), Exibicionismo (M), Filmando (H), Filmando (M), Garota Coelho, Garoto Coelho, Gozar Dentro - Creampie (M), Grupal, Lingerie (M), Mangás, Meia Calça (M), Musculoso, Negras, Negros, Óculos (M), Pau Grande, Peitinhos, Peitudas, Penetração Dupla, Penetração Dupla (Vagina), Professora, Roupa Colegial (H), Roupa Colegial (M), Sexo Escondido, Tatuada, Tomgirl, Trava de Perna (M) |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 6 chapters |  |  |  |
| chapter dates | LINT | All 6 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=6 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 41 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://tankouhentai.com/.../Pg_001.webp` (image/webp (encoding: lossy), 129376 bytes, 845x1200) |  |  |  |
