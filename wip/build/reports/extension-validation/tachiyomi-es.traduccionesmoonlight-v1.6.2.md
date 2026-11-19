# Extension Validation Report

- Extension: tachiyomi-es.traduccionesmoonlight-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 25
- Lint: 3
- Warnings: 0
- Skipped: 7
- Failed: 2
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: moonlighttl
- Source ID: 4349338377187141550
- Source name: Traducciones Moonlight
- Source language: es
- Selected manga input: popular offset 0: FUI A CONFESARME Y TERMINE SIENDO DEVORADA (`.../fui-a-confesarme-y-termine-siendo-devorada`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 339 | FUI A CONFESARME Y TERMINE SIENDO DEVORADA (`.../fui-a-confesarme-y-termine-siendo-devorada`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 12 | FUI A CONFESARME Y TERMINE SIENDO DEVORADA (`.../fui-a-confesarme-y-termine-siendo-devorada`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | FUI A CONFESARME Y TERMINE SIENDO DEVORADA (`.../fui-a-confesarme-y-termine-siendo-devorada`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | FUI A CONFESARME Y TERMINE SIENDO DEVORADA (`.../fui-a-confesarme-y-termine-siendo-devorada`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 5 | Capítulo 0 (`.../capitulo-00`) |  | <1s |
| pages | `getPageList(chapter)` | success | 0 |  |  | <1s |

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
| popular listing | PASS | 339 entries |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=FUI A CONFESARME Y TERMINE SIENDO DEVORADA, URL=`.../fui-a-confesarme-y-termine-siendo-devorada` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | FAIL | Invalid manga: popular entry 323: title=<blank>, URL=`.../ver` | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| thumbnail URLs | PASS | 352/352 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://media.traduccionesmoonlight.com/.../5066ccf9-809a-4faa-b1d1-3a510a52e9b5.png` (image/png, 8185784 bytes, 1792x2390) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../fui-a-confesarme-y-termine-siendo-devorada` |  |  |  |
| details thumbnail URL | PASS | `https://media.traduccionesmoonlight.com/.../5066ccf9-809a-4faa-b1d1-3a510a52e9b5.png` |  |  |  |
| details author | LINT | Author is empty; use null when unknown |  |  |  |
| details artist | LINT | Artist is empty; use null when unknown |  |  |  |
| details genres | PASS | Adulto, Manga +19, Romance, Smut |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | «¿Acaso un cuerpo profanado no debería ser purificado también?» Enoch Reynolds, el impecable representante de Dios, un hombre sin una sola imperfección. Pero una perturbación desconocida ha irrumpido en su mundo perfectamente incoloro. Railey Everett, la hija del marqués Everett y la joven más hermosa del Imperio. Radiante como la luz del sol, comienza a perturbar la compostura cuidadosamente mantenida de Enoch. Obligada a un matrimonio que no desea, Railey desafía a sus padres por primera vez y huye al Gran Templo, donde reside Enoch, con la esperanza de confesar sus pecados. «Tu cuerpo ya ha sido profanado, mi señora. ¿No dijiste que ese hombre insolente se atrevió a imaginar ponerte las manos encima?» «¡Ah...! ¡E-Enoch...!» Enoch le concede la absolución dejando su propia marca en ella. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 5 chapters |  |  |  |
| chapter dates | PASS | 5 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | FAIL | Page list is empty (0 pages) | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
