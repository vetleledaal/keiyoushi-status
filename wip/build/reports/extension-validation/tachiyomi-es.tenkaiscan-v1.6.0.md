# Extension Validation Report

- Extension: tachiyomi-es.tenkaiscan-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
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
- Source ID: 5992780069311625546
- Source name: Falco Scan
- Source language: es
- Selected manga input: popular offset 0: ¿Tengo que hacerlo con un extraño? (`.../tengo-que-hacerlo-con-un-extrano`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 88 | ¿Tengo que hacerlo con un extraño? (`.../tengo-que-hacerlo-con-un-extrano`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 12 | Amor puro y Perverso (`.../amorperverso`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | ¿Tengo que hacerlo con un extraño? (`.../tengo-que-hacerlo-con-un-extrano`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | ¿Tengo que hacerlo con un extraño? (`.../tengo-que-hacerlo-con-un-extrano`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 22 | Capítulo 01 (`.../capitulo-01`) |  | <1s |
| pages | `getPageList(chapter)` | success | 16 |  |  | <1s |

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
| popular listing | PASS | 88 entries |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=¿Tengo que hacerlo con un extraño?, URL=`.../tengo-que-hacerlo-con-un-extrano` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://falcoscan.net/.../tengo-que-hacerlo-con-un-extrano.jpg` (image/jpeg, 287190 bytes, 1200x1680) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../tengo-que-hacerlo-con-un-extrano` |  |  |  |
| details thumbnail URL | PASS | `https://falcoscan.net/.../tengo-que-hacerlo-con-un-extrano.jpg` |  |  |  |
| details author | PASS | Na Seonhyang |  |  |  |
| details artist | PASS | Hangeul Gongjak |  |  |  |
| details genres | PASS | Adaptación de Novela, Aventuras, Comedia, Drama, Ecchi, Escolar, Fantasía, Harem, MILF, Recuentos de la vida, Romance, Sistemas |  |  |  |
| details status | PASS | CANCELLED (5) |  |  |  |
| details description | PASS | Nam Dohyun, un estudiante universitario que cae en un espacio blanco puro con una mujer que nunca había visto antes. Una hermosa diosa aparece en un espacio lleno de significado, con un espejo lleno de gente gritando. Incapaz de comprender la situación, la diosa que aparece de repente dice a las dos personas: "La gente sólo puede salvarse si ustedes dos tienen sexo. Asique háganlo ahora mismo". |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 22 chapters |  |  |  |
| chapter dates | PASS | 22 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 16 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://falcoscan.net/.../cHJvamVjdHMvdGVuZ28tcXVlLWhhY2VybG8tY29uLXVuLWV4dHJhbm8vMDEvMDEyYWE2MWM2N2E2ZDg1NzhkMThhNjZkNGUxN2MyNmI3My53ZWJw` (image/webp (encoding: lossy), 1112492 bytes, 720x14400) |  |  |  |
