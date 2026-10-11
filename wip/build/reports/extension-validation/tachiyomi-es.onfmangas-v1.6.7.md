# Extension Validation Report

- Extension: tachiyomi-es.onfmangas-v1.6.7
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 32
- Lint: 1
- Warnings: 1
- Skipped: 2
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 438553037668091848
- Source name: ONF MANGAS
- Source language: es
- Selected manga input: popular offset 0: Koori no Jouheki (`.../koori-no-jouheki`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 33 | Koori no Jouheki (`.../koori-no-jouheki`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 12 | Tensei Shite Inaka De Slow Life Wo Okuritai (`.../tensei-shite-inaka-de-slow-life-wo-okuritai`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 12 | Ai no Senbiki: La historia de cómo conseguí una mamá al buscar una sugar mom (`.../ai-no-senbiki-la-historia-de-como-consegui-una-mama-al-buscar-una-sugar-mom`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | Koori no Jouheki (Book Version) (`.../koori-no-jouheki-book-version`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Koori no Jouheki (`.../koori-no-jouheki`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 94 | Capítulo 1 (`.../koori-no-jouheki-capitulo-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 17 |  |  | <1s |

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
| popular listing | PASS | 33 entries |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 1: title=Koori no Jouheki, URL=`.../koori-no-jouheki` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 59/59 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 59/59 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://onfmangas.com/.../img.webp <redacted query values: u, w, and v>` (image/webp (encoding: lossy), 18246 bytes, 320x400) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../koori-no-jouheki` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://onfmangas.com/.../img.webp <redacted query values: u, w, and v>` (image/webp (encoding: lossy), 25232 bytes, 400x500) |  |  |  |
| details author | PASS | Agasawa Koucha |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Comedia, Drama, Romance, Vida escolar, Recuentos de la vida, Tira larga, A todo color |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Inepta para tratar con la gente, Hikawa Koyuki mantiene un muro entre ella y los demás. Pasa su tiempo en la escuela secundaria alejada de los demás, completamente sola. ¡¿Al menos hasta que se encuentra con Amamiya Minato quien sigue acortando la distancia entre ellos por alguna razón?! El distante Koyuki, la popular Miki, el ilimitado Minato y el amable y tolerante miembro del equipo de baloncesto, Youta. ¡Esta es la historia de estos cuatro algo complicados y de su tentadora y torpe juventud! ¡En su formato webtoon original! ___ **Enlaces adicionales:** - **Alt Oficial Raw:** LINE Manga - Oficial X - Sitio oficial de anime |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 29 name, chapter 31 name |  |  |  |
| chapters | PASS | 94 chapters |  |  |  |
| chapter dates | PASS | 94 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 17 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | FAIL | First page URL `https://cmdxd98sb0x3yprd.mangadex.network/.../1-71f41448e2da33eb5011389302dc2a0d0e005ebccfa6551aee876c3317f71f98.png` could not be downloaded: eu.kanade.tachiyomi.network.HttpException: HTTP error 404 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
