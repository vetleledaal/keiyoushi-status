# Extension Validation Report

- Extension: tachiyomi-es.lectormonline-v1.6.5
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 36
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4234224579308349686
- Source name: MangoLibreria
- Source language: es
- Selected manga input: popular offset 0: La Doncella Secreta Del Conde (`.../la-doncella-secreta-del-conde`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 15 | La Doncella Secreta Del Conde (`.../la-doncella-secreta-del-conde`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 15 | No me arrepentiré en esta segunda vida (`.../no-me-arrepentire-en-esta-segunda-vida`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 15 | Era del Despertar de Clases: Asciendo a la Divinidad con mi Habilidad de Nigromante (`.../era-del-despertar-de-clases-asciendo-a-la-divinidad-con-mi-habilidad-de-nigromante`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 15 | Reencarné Como La Hermana Menor De La Villana (`.../reencarne-como-la-hermana-menor-de-la-villana`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | La Doncella Secreta Del Conde (`.../la-doncella-secreta-del-conde`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | La Doncella Secreta Del Conde (`.../la-doncella-secreta-del-conde`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 211 | Capítulo 1 (`.../600353`) |  | <1s |
| pages | `getPageList(chapter)` | success | 20 |  |  | 1-10s |

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
| popular listing | PASS | 15 entries |  |  |  |
| latest listing | PASS | 15 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=La Doncella Secreta Del Conde, URL=`.../la-doncella-secreta-del-conde` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 61/61 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 61/61 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://image2.ikigaimangas.cloud/.../czM6Ly9pa2lnYWktY2RuL3Nlcmllcy9jb3ZlcnMvMTAwMDE0MzIwMzQ0MDQ5MjU0Ny94ODRVZXV0ZVhDb0Z2ZkU2cnhWaWhIYlVidUpLeFYtbWV0YVNFcFFSRnBTWldKUlFVRkxia1ZuTG5CdVp3PT0tLndlYnA=.webp` (image/webp (container: extended), 109476 bytes, 350x500) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../la-doncella-secreta-del-conde` |  |  |  |
| details thumbnail URL | FAIL | Differs from selected listing thumbnail; Thumbnail URL `https://wsrv.nl <redacted query values: url, output, q, w, h, fit, and we>` could not be downloaded: eu.kanade.tachiyomi.network.HttpException: HTTP error 400 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Drama, Tragedia, Misterio, Romance, Recuentos de la vida, Acción, Aventura, Romance, Isekai, Fantasía, Comedia |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Paula es una joven nacida en el seno de una familia sumamente humilde, cuya dura realidad marca desde el inicio su difícil andar por la vida. Sin embargo, su destino toma un rumbo inesperado cuando logra conseguir empleo como sirvienta para la prestigiosa y acaudalada familia del Conde Bellunita. Al ingresar a esta imponente residencia, la joven descubre que su labor no será igual a la del resto de las empleadas, ya que le asignan una responsabilidad sumamente íntima y delicada en la mansión. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 211 chapters |  |  |  |
| chapter dates | PASS | 211 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 20 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://image3.ikigaimangas.cloud/.../01.webp` (image/jpeg, 1310471 bytes, 800x10000) |  |  |  |
