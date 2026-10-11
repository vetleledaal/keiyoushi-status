# Extension Validation Report

- Extension: tachiyomi-pt.revistasequadrinhos-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 35
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1455091782657313638
- Source name: Revistas e Quadrinhos
- Source language: pt
- Selected manga input: popular offset 0: Chavitoon 5 – Aviso de Despejo (`.../chavitoon-5-aviso-de-despejo`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Chavitoon 5 – Aviso de Despejo (`.../chavitoon-5-aviso-de-despejo`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 20 | Bubble Butt Princess 8 (PT-BR) [Jab-comix] (`.../bubble-butt-princess-8-pt-br-jab-comix`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 20 | Chavitoon 5 – Aviso de Despejo (`.../chavitoon-5-aviso-de-despejo`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | Lost Family 86 Por Pigking (`.../lost-family-86-por-pigking`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Chavitoon 5 – Aviso de Despejo (`.../chavitoon-5-aviso-de-despejo`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Chavitoon 5 – Aviso de Despejo (`.../chavitoon-5-aviso-de-despejo`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Capítulo Único (`.../chavitoon-5-aviso-de-despejo`) |  | <1s |
| pages | `getPageList(chapter)` | success | 16 |  |  | 1-10s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Chavitoon 5 – Aviso de Despejo, URL=`.../chavitoon-5-aviso-de-despejo` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://revistasequadrinhos.com/.../capa.jpg` (image/jpeg, 45598 bytes, 248x320) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../chavitoon-5-aviso-de-despejo` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Comics, HQ ADULTO, Popular Comics, boquete, Chaves, Chavitoon, Comics Porno, Contos Eróticos, HQ de Sexo, Quadrinhos, sexo anal, sexo oral, Turma do Chaves |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Conheça Chavitoon 05: A vila da putaria e explore suas histórias. Entretenimento e curiosidades para todos os tarados a bordo. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 16 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://revistasequadrinhos.com/.../popular-comics` to `https://revistasequadrinhos.com/.../popular-comics` (1 redirects); popular: `https://revistasequadrinhos.com/.../2` to `https://revistasequadrinhos.com/.../2` (1 redirects); popular: `https://revistasequadrinhos.com/.../2` to `https://revistasequadrinhos.com/.../2` (1 redirects) |  |  |  |
| page load | PASS | `https://revistasequadrinhos.com/.../0001.jpg` (image/jpeg, 393362 bytes, 1440x1920) |  |  |  |
