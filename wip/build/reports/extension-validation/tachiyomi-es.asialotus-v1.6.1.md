# Extension Validation Report

- Extension: tachiyomi-es.asialotus-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 35
- Lint: 0
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 3655128076360662290
- Source name: Asia Lotus
- Source language: es
- Selected manga input: popular offset 0: Lluvia de Verano (`.../lluvia-de-verano`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Lluvia de Verano (`.../lluvia-de-verano`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 20 | Omega Inverso (`.../omega-inverso`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 20 | Mi ratoncito es un Despertado de rango S (`.../mi-ratoncito-es-un-despertado-de-rango-s`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | ¡¡Ten cuidado con los contratos!! (`.../ten-cuidado-con-los-contratos`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Lluvia de Verano (`.../lluvia-de-verano`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Lluvia de Verano (`.../lluvia-de-verano`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 127 | Chapter 1 (`.../182`) |  | <1s |
| pages | `getPageList(chapter)` | success | 32 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Lluvia de Verano, URL=`.../lluvia-de-verano` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://asialotuss.com/.../newport-225x300.jpg` (image/jpeg, 19498 bytes, 225x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../lluvia-de-verano` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://asialotuss.com/.../newport.jpg` (image/jpeg, 739759 bytes, 1080x1440) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Bl+18, Comedia, Drama, Romance, Supernatural, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | En el camino de regreso después de confesarme a un mayor que me gusta. Han Seo-woo muere en un accidente inesperado. Poco después, debido a la muerte del ángel de la muerte, se convierte en un muerto temporal, ¡y finalmente es monitoreado por el ángel de la muerte…! ¡Una cohabitación con un hombre extramatrimonial (?) que ni siquiera estuvo a la mitad del día está por comenzar! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 127 chapters |  |  |  |
| chapter dates | PASS | 127 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 32 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://asialotuss.com/.../manga <redacted query values: page and order>` to `https://asialotuss.com/.../manga <redacted query values: page and order>` (1 redirects); popular: `https://asialotuss.com/.../manga <redacted query values: page and order>` to `https://asialotuss.com/.../manga <redacted query values: page and order>` (1 redirects); popular: `https://asialotuss.com/.../manga <redacted query values: page and order>` to `https://asialotuss.com/.../manga <redacted query values: page and order>` (1 redirects); popular: `https://asialotuss.com/.../manga <redacted query values: title, page, status, type, and order>` to `https://asialotuss.com/.../manga <redacted query values: title, page, status, type, and order>` (1 redirects); popular: `https://asialotuss.com/.../manga <redacted query values: page and order>` to `https://asialotuss.com/.../manga <redacted query values: page and order>` (1 redirects) |  |  |  |
| page load | PASS | `https://img.gopar.dev/.../9f0819b3b615ccd0b95c564dbb5ce307.jpg` (image/jpeg, 920699 bytes, 1080x3305) |  |  |  |
