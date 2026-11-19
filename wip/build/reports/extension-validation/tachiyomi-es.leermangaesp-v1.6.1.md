# Extension Validation Report

- Extension: tachiyomi-es.leermangaesp-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 32
- Lint: 0
- Warnings: 1
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8196066207928937350
- Source name: LeerMangaEsp
- Source language: es
- Selected manga input: popular offset 0: Mairimashita! Iruma-kun (`.../mairimashita-iruma-kun`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 13 | Mairimashita! Iruma-kun (`.../mairimashita-iruma-kun`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 140 | Mairimashita! Iruma-kun (`.../mairimashita-iruma-kun`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Mairimashita! Iruma-kun (`.../mairimashita-iruma-kun`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Mairimashita! Iruma-kun (`.../mairimashita-iruma-kun`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 509 | Capítulo 1.00 (`.../1.00`) |  | <1s |
| pages | `getPageList(chapter)` | success | 48 |  |  | 1-10s |

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
| popular listing | PASS | 13 entries |  |  |  |
| latest listing | PASS | 140 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Mairimashita! Iruma-kun, URL=`mairimashita-iruma-kun` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 154/154 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 154/154 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://images.mangalect.org/.../Mairimashita_Iruma-kun.webp` (image/webp (encoding: lossy), 50188 bytes, 300x450; server Content-Type: binary/octet-stream) |  |  |  |
| details identity | PASS | Details preserved selected URL `mairimashita-iruma-kun` |  |  |  |
| details thumbnail URL | PASS | `https://images.mangalect.org/.../Mairimashita_Iruma-kun.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Comedia, Magia, Sobrenatural, Demonios, Fantasía, Vida escolar, Romance |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Descubre la sorprendente historia de Suzuki Iruma, un joven vendido a un demonio por sus irresponsables padres a cambio de dinero. Sin previo aviso, Iruma se ve obligado a vivir con su misterioso nuevo "padre" demoníaco y a asistir a una escuela en el Mundo Demoníaco. Acompaña a Iruma-kun en esta extraordinaria aventura escolar, donde lo sobrenatural se mezcla con el día a día en una trama llena de humor, desafíos y giros inesperados. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 509 chapters |  |  |  |
| chapter dates | PASS | 509 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 48 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://mangalect.org/.../latest_chapters_with_dates` to `https://mangalect.org/.../latest_chapters_with_dates` (1 redirects); popular: `https://mangalect.org/.../buscar_mangas <redacted query values: page, page_size, and query>` to `https://mangalect.org/.../buscar_mangas <redacted query values: page, page_size, and query>` (1 redirects); popular: `https://mangalect.org/.../1.00` to `https://mangalect.org/.../1` (1 redirects) |  |  |  |
| page load | PASS | `https://images.mangalect.org/.../pagina_001.webp` (image/webp (encoding: lossy), 166020 bytes, 835x1200) |  |  |  |
